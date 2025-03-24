package genericsDemo;

public class Purchase<T, U> {

    T item;
    U amount;

    Purchase(T item, U amount) {
        this.item = item;
        this.amount = amount;
    }

    public T getItem() {
        return this.item;
    }

    public U getAmount() {
        return this.amount;
    }
}
