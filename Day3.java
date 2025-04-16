import java.util.Scanner;

class AllProgram {
    
    void hello() {
        System.out.println("Hello world");
    }

    void swap(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    void add() {
        System.out.println("Addition of 2 numbers is " + (4 + 5));
    }

    void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter the operation (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Addition is: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction is: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication is: " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Division is: " + (a / b));
                else
                    System.out.println("Cannot divide by zero!");
                break;
            case '%':
                System.out.println("Modulo is: " + (a % b));
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }

    void evenOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to check ? : ");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
    }

    void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want factorial of :  "); 
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial is: " + fact);
    }


    void temperature() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int celsius = sc.nextInt();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    void isLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    void isPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number you want to check if it's  Prime or not ? : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    void grade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    void areaCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    void numReverse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reversed number: " + reverse);
    }

    void printStarPyramid() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AllProgram ap = new AllProgram();
        // ap.hello();
        // ap.swap(4, 5);
        // ap.add();
        ap.calculator();
        ap.evenOdd();
        ap.factorial();
        ap.temperature();
        ap.isLeapYear();
        ap.isPrime();
        ap.grade();
        ap.areaCircle();
        ap.numReverse();
        ap.printStarPyramid();
    }
}
//


