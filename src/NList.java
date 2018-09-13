public interface NList {
    LItem getRoot();
    boolean addItem(LItem item);
    boolean removeItem(LItem item);
    void traverse(LItem root);
}
