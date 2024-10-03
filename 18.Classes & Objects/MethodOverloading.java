public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(12, 23));
        System.out.println(calc.sum(12, 23, 34));
        System.out.println(calc.sum(12.3f, 23.7f));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }
}