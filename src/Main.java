public class Main {

    public static void main(String [] args){
        MLList list = new MLList(null);
        list.traverse(list.getRoot());
        // Create a string data array to avoid typing loads of addItem instructions
        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data = stringData.split(" ");
        for (String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());
    }
}
