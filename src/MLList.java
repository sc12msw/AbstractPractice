public class MLList implements NList {

    private LItem root = null;

    public MLList(LItem root) {
        this.root = root;
    }

    public MLList() {
        super();
    }


    @Override
    public LItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(LItem item) {
        if(this.root == null){
            // List was empty, so this item becomes the head of the list
            this.root = item;
            return true;
        }

        LItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if (comparison <0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    // There us no next, so insert at the end of the list
                    currentItem.setNext(item).setPrev(currentItem);
                    return true;
                }
            }else if (comparison >0){
                if(currentItem.prev() != null){
                    currentItem.prev().setNext(item).setPrev(currentItem.prev());
                    item.setNext((currentItem)).setPrev(item);

                }else{
                    // There us no prev, so insert at the end of the list
                    item.setNext(this.root).setPrev(item);
                    this.root = item;

                }
                return true;
            } else {
                System.out.println(item.getValue() + " is already present, not added");
                return false;
            }
        }

        return  false;
    }

    @Override
    public boolean removeItem(LItem item) {
        if (item != null){
            System.out.println("Deleting item" + item.getValue());
        }
        LItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);

            if(comparison == 0){
                // found the item to delete
                if(currentItem == this.root){
                    this.root = currentItem.next();
                }else{
                    currentItem.prev().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrev(currentItem.prev());
                    }
                }
                return true;

            } else if (comparison<0){
                currentItem = currentItem.next();

            } else {
                //comparison > 0
                // We are at an item greater than the one to be deleted.
                // So the item is not in the list
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(LItem root) {
        if (root == null){
            System.out.println("List is empty");
        }else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
