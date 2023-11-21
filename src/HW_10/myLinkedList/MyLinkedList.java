package HW_10.myLinkedList;

public class MyLinkedList {
    private int size;
    private int index;
    private String value;
    private MyLinkedList next;
    private MyLinkedList prev;

    public MyLinkedList() {
    }

    public MyLinkedList(String value) {
        setValue(value);
    }

    public MyLinkedList(int size, String value, MyLinkedList next, MyLinkedList prev) {
        setSize(size);
        setNext(next);
        setPrev(prev);
        setValue(value);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MyLinkedList getNext() {
        return next;
    }

    public void setNext(MyLinkedList next) {
        this.next = next;
    }

    public MyLinkedList getPrev() {
        return prev;
    }

    public void setPrev(MyLinkedList prev) {
        this.prev = prev;
    }

    public void add(String s) {
        if (getValue() == null) {
            setValue(s);
        } else if (getValue() != null && getNext() == null) {
            MyLinkedList list = new MyLinkedList(s);
            list.setIndex(getIndex() + 1);
            list.setPrev(this);
            setNext(list);
        } else if (getValue() != null && getNext() != null) {
            getNext().add(s);
        }
        setSize(getSize() + 1);
    }

    public void get() {

    }

    public void remove() {
        setSize(getSize() - 1);
    }

    public int size() {
        return getSize();
    }

    @Override
    public String toString() {
        return "[" + value + ", " + getNext().getValue() + "]";
    }
}
