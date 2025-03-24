package arraysDemo;

import java.util.Arrays;

public class MyArray {

//    Declaring the arrays

    public static Color colors = new Color();
    public static RGBcode cCodes = new RGBcode();
    public static Board board = new Board();

    public static void main(String[] args) {


//        Printing an array using an Enhanced for loop

        for (int number : cCodes.numbers) {
            System.out.println(number);
        }

        for (String color : colors.name) {
            System.out.println(color);
        }

//        Printing  combined arrays using a for loop

        for (int i = 0; i < cCodes.numbers.length; i++) {
            System.out.println("Color Code. " + cCodes.numbers[i] + ", is : " + colors.name[i]);
        }

//        Printing a 2D array using enhanced for loop

        for (boolean[] booleans : board.grid) {
            for (boolean aBoolean : booleans) {
                System.out.print(aBoolean + ", ");
            }
            System.out.println();
        }

    }

//    Using ToString method

    public String toString() {
        return "MyArray{" + "colors=" + Arrays.toString(colors.name) + ", numbers=" + Arrays.toString(cCodes.numbers) + '}';
    }
}
