package AdvanceDSA;
//Bounded type ka matlab hota hai:
//hum generic type ko restrict kar dete hain —
//jaise “sirf Number ke type allow hain”,
//taki code me galat type (jaise String) pass na ho. ✅

// 🔹 Generic class with bounded type
// 'T extends Number' => matlab ye class sirf Number ke subclasses ke liye chalegi
class Calculator<T extends Number> {

    private T num1;
    private T num2;

    // Constructor
    Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to add two numbers
    double add() {
        // Number class ke paas doubleValue() hota hai, isliye sabko double me convert kar sakte hain
        return num1.doubleValue() + num2.doubleValue();
    }

    // Generic method with its own bound
    public <E extends Number> void showDouble(E value) {
        System.out.println("Double value: " + value.doubleValue());
    }
}


public class L_03_BoundedGeneric {
    public static void main(String[] args) {
        // ✅ Works with Integer (Integer extends Number)
        Calculator<Integer> c1 = new Calculator<>(10, 20);
        System.out.println("Sum (Integer): " + c1.add());
        c1.showDouble(5); // integer allowed

        System.out.println("---------------------");

        // ✅ Works with Double (Double extends Number)
        Calculator<Double> c2 = new Calculator<>(10.5, 20.5);
        System.out.println("Sum (Double): " + c2.add());
        c2.showDouble(12.34); // double allowed

        // ❌ Error: String is not a subclass of Number
        // Calculator<String> c3 = new Calculator<>("A", "B");
    }

}
