//import jeliot.io.*;

public class MyClass1 {
    public static void main(String[]args) {
        // Your algorithm goes here.
A1 a1 = new A1();
B1 b1 = new B1();
B1 b2 = new B1(b1);
a1.methodA(1, 1);
b1.methodA(1, 2);
b2.methodB(3, 2);

    }
}