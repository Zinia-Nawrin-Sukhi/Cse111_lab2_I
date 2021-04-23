public class MyClass2 {
    public static void main(String[]args) {

A2 a1 = new A2();
B2 b1 = new B2();
B2 b2 = new B2(b1);
a1.methodA(1, 1);
b1.methodA(1, 2);
b2.methodB(3, 2); 
    }
}