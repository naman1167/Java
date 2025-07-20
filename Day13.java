class A {
    void Display1() {
        System.out.println("Hello, I am a Base Class !!!");
    }
}

class B extends A {
    void Display2() {
        System.out.println("Hello, I am B class which is Derived.");
    }
}

class C extends B {
    void Display3() {
        System.out.println("Hello, I am C class !!!");
    }
}

class D extends B {
    void Display4() {
        System.out.println("Hello, I am D class !!!");
    }
}

public class Day13 {
    public static void main(String[] args) {
        D dwalaClass = new D();  
        dwalaClass.Display1(); 
        D hello = new D ();
        
 
        hello.Display2(); 

    }
}



