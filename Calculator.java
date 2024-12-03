public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    // Mètode divide amb gestió de divisió per zero
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;  // Retorna 0 en cas de divisió per zero
        }
        return a / b;
    }
}

