public class Node extends LItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    LItem next() {
        return this.rightLink;
    }

    @Override
    LItem setNext(LItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    LItem prev() {
        return this.leftLink;
    }

    @Override
    LItem setPrev(LItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(LItem item) {
        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        return -1;
    }

    @Override
    public Object getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Object value) {
        super.setValue(value);
    }
}
