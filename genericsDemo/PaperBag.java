package genericsDemo;

public class PaperBag<T> {

    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
