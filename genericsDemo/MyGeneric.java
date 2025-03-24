package genericsDemo;

public class MyGeneric {

    public static void main(String[] args) {


//          Create a generic PaperBag class instance of type integer
        PaperBag<Integer> numbers = new PaperBag<>();
        numbers.setItem(3);

        System.out.println(numbers.getItem());

//          Create a generic PaperBag class instance of type string
        PaperBag<String> fruits = new PaperBag<>();
        fruits.setItem("orange");

        System.out.println(fruits.getItem());


//          Create a generic Purchase class instance of type string and integer
        Purchase<String, Integer> purchase = new Purchase<>("apple", 3);

        System.out.println(purchase.getItem() + " : " + purchase.getAmount());
        System.out.println();

    }
}
