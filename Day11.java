class Employee { 
    void display() {
        System.out.println("Hello World !!!");
    }
}

class Bonus extends Employee { 
    void display1() {
        System.out.println("Hello, it is a Derived Class!");
    }
    public static void main(String[] args) { 
        Employee emp = new Employee(); 
        emp.display();

        Bonus bonus = new Bonus(); 
        bonus.display1();
}
}

