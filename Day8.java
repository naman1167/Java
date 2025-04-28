import java.util.Scanner;

public class Day8 {

    // 1. Calculator (Addition, Subtraction, Multiplication, Division)
    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + ((b != 0) ? (a / b) : "Cannot divide by zero"));
    }

    // 2. Check if a number is even or odd
    public static void checkEvenOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    // 3. Factorial of a number
    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    // 4. Swap two numbers
    public static void swapNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // 5. Sum of integers
    public static void sumOfIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        System.out.println("Sum of integers: " + sum);
    }

    // 6. Check if a number is prime
    public static void checkPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // 7. Square of a number
    public static void squareNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its square: ");
        int num = sc.nextInt();
        System.out.println("Square of " + num + " is: " + (num * num));
    }

    // 8. Check if a year is a leap year
    public static void checkLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // 9. Pyramid pattern
    public static void pyramidPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 10. Largest among three numbers
    public static void largestAmongThree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The largest number among " + a + ", " + b + ", and " + c + " is: " + largest);
    }

    // 11. Pointer demonstration
    public static void pointerDemo() {
        int[] numbers = new int[1];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        numbers[0] = sc.nextInt();
        System.out.println("Original value: " + numbers[0]);
        modifyValue(numbers);
        System.out.println("Modified value: " + numbers[0]);
    }

    // Helper function for pointerDemo
    private static void modifyValue(int[] nums) {
        nums[0] += 10; // Adds 10 to the original value
    }

    // 12. Simple interest calculation
    public static void calculateSimpleInterest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        int time = sc.nextInt();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }

    // 13. 

    public static void main(String[] args) {
        System.out.println("--- Calculator ---");
        calculator();

        System.out.println("\n--- Even or Odd ---");
        checkEvenOdd();

        System.out.println("\n--- Factorial ---");
        factorial();

        System.out.println("\n--- Swap Numbers ---");
        swapNumbers();

        System.out.println("\n--- Sum of Integers ---");
        sumOfIntegers();

        System.out.println("\n--- Prime Number ---");
        checkPrime();

        System.out.println("\n--- Square of a Number ---");
        squareNumber();

        System.out.println("\n--- Leap Year Check ---");
        checkLeapYear();

        System.out.println("\n--- Pyramid Pattern ---");
        pyramidPattern();

        System.out.println("\n--- Largest Among Three Numbers ---");
        largestAmongThree();

        System.out.println("\n--- Pointer Demo ---");
        pointerDemo();

        System.out.println("\n--- Simple Interest Calculation ---");
        calculateSimpleInterest();
    }
}