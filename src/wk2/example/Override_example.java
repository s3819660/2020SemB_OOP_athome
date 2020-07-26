package wk2.example;

class A {
    public void overrideMethod() {
        System.out.println("Class A");
    }
}

class B extends A {

}

class C extends B {
    @Override
    public void overrideMethod() {
        System.out.println("Overridden: Class C");
    }
}

public class Override_example {
    public static void main(StringCompare[] args) {
        A a = new A();
        a.overrideMethod();
        C c = new C();
        c.overrideMethod();
    }
}
