public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    enum Operation {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
    }
}
