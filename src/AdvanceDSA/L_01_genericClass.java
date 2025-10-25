package AdvanceDSA;
// ==> Syntax of generic class

// class ClassName<T> {
//    // T means "Type" (you can name it anything)
//}

// ==> Syntax of generic method

//<T> ReturnType methodName(T param) {
//    // method body
//}
//-----------------------

class Box<T> {
    // 'T' is a placeholder for any type (Integer, String, etc.)
    private T value;

    // Constructor
    Box(T value) {
        this.value = value;
    }

    // Getter method
    public T getValue() {
        return value;
    }

    // Setter method
    public void setValue(T value) {
        this.value = value;
    }

    // 🔹 Generic method syntax: <T> ReturnType methodName(T param)
    public <E> void display(E item) {
        System.out.println("Display item: " + item);
    }
}

public class L_01_genericClass {
    public static void main(String[] args) {
        // ✅ Create Box object for Integer
        Box<Integer> intBox = new Box<>(100);
        System.out.println("Integer value: " + intBox.getValue());

        // ✅ Create Box object for String
        Box<String> strBox = new Box<>("Abhi");
        System.out.println("String value: " + strBox.getValue());

        // ✅ Using generic method
        intBox.display("This is generic method");
        strBox.display(500);
    }
}
