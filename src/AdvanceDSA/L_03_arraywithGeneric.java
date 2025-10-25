package AdvanceDSA;

class MyArray<T> {

    // yaha 'T' ka matlab hai koi bhi data type (Integer, String, etc.)
    private T[] arr;

    // Constructor - array ko initialize karne ke liye
    MyArray(T[] arr) {
        this.arr = arr;
    }

    // Method to print all elements
    public void printArray() {
        System.out.println("Array elements:");
        for (T element : arr) {
            System.out.print(element+", ");
        }
    }

    // Generic method (alag <E> type use kar sakte hain)
    public <E> void showItem(E item) {
        System.out.println("Showing item: " + item);
    }
}

public class L_03_arraywithGeneric {
    public static void main(String[] args) {
        // 🔸 Integer type array
        Integer[] numArray = {1, 2, 3, 4, 5};
        MyArray<Integer> intObj = new MyArray<>(numArray);
        intObj.printArray();  // integer array print karega
        intObj.showItem("Abhi");  // generic method alag type se bhi kaam karega

        System.out.println("----------------------");

        // 🔸 String type array
        String[] nameArray = {"Abhi", "Raj", "Aman"};
        MyArray<String> strObj = new MyArray<>(nameArray);
        strObj.printArray();  // string array print karega
        strObj.showItem(2025); // generic method me number bhi pass kar sakte hain
    }
}
