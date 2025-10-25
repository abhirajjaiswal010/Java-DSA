package AdvanceDSA;
//==> syntax for multiple parameter of generic class

//class ClassName<T, U> {
//    // T and U can be any types (Integer, String, etc.)
//}


// 🔹 Generic class with multiple parameters
class Pair<T, U> {
    // T and U are type parameters
    private T first;
    private U second;

    // Constructor
    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getter methods
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    // 🔹 Generic method (with its own type <X, Y>)
    public <X, Y> void showTypes(X x, Y y) {
        System.out.println("X: " + x + " (" + x.getClass().getSimpleName() + ")");
        System.out.println("Y: " + y + " (" + y.getClass().getSimpleName() + ")");
    }
}
public class L_02_multipleParameterGeneric {
    public static void main(String[] args) {
        // ✅ Creating Pair of different types
        Pair<String, Integer> student = new Pair<>("Abhi", 101);
        System.out.println("Name: " + student.getFirst());
        System.out.println("Roll No: " + student.getSecond());

        // ✅ Another example: Pair of Double and String
        Pair<Double, String> priceTag = new Pair<>(99.99, "Rupees");
        System.out.println("Price: " + priceTag.getFirst() + " " + priceTag.getSecond());

        // ✅ Using the generic method
        student.<String, Integer>showTypes("Java", 2025);}
}
