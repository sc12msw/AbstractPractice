public abstract class LItem {

    protected LItem rightLink = null;
    protected LItem leftLink = null;

    protected Object value;

    public LItem(Object value) {
        this.value = value;
    }

    abstract LItem next();
    abstract LItem setNext(LItem item);
    abstract LItem prev();
    abstract LItem setPrev(LItem item);

    abstract int compareTo(LItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
