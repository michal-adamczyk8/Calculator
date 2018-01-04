package calculator.demo;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int addAtoB(){
        return a+b;
    }

    public int substractAfromB() {
        return a-b;
    }
    public substractBFromA(){
        return b-a;
    }
}
