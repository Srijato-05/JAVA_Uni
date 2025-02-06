package Upes;

import java.util.Scanner;

public class Lab2
{

    public static double operatorResult(String operator, double num1, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }

    public static float calculateArea(float base, float height) {
        return base*height;
    }

    public static double calculateArea(double radius) {
        return 3.14*radius*radius;
    }

    public static int calculateArea(int side) {
        return side*side;
    }

    public static double calculateArea(double base, double height) {
        return 0.5*base*height;
    }

    public static int electricityBill(int units) {
        if (units<1) {
            return 0;
        }
        if (units <= 100) {
            return units * 5;
        } else if (units <= 200) {
            return 100 * 5 + (units - 100) * 7;
        } else if (units <= 300) {
            return 100 * 5 + 100 * 7 + (units - 200) * 10;
        } else {
            return 100 * 5 + 100 * 7 + 100 * 10 + (units - 300) * 15;
        }
    }

        public static void pattern (int n)
        {
            for (int i = 0; i < n; i++) {
                // Print leading spaces
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n - i; j++) {
                    System.out.print("*");
                }
                // Move to the next line
                System.out.println();
            }
        }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            //Answer 1
            System.out.println("Answer 1");
            System.out.print("Enter the limit: ");
            int n= scanner.nextInt();
            pattern(n);

            // Answer 2
            System.out.println("Answer 2");
            System.out.print("Enter the units consumed: ");
            int units = scanner.nextInt();
            System.out.println("Bill amount: " + electricityBill(units));

            // Answer 3
            System.out.println("Answer 3");
            System.out.print("Enter the shape for which you want to find the area: ");
            String shape = scanner.next();
            shape = shape.toLowerCase();
            switch (shape) {
                case "square":
                    System.out.print("Enter the side: ");
                    int side = scanner.nextInt();
                    System.out.println("Area: " + calculateArea(side));
                    break;

                case "rectangle":
                    System.out.print("Enter the length: ");
                    int length = scanner.nextInt();
                    System.out.print("Enter the breadth: ");
                    int breadth = scanner.nextInt();
                    System.out.println("Area: " + calculateArea(length, breadth));
                    break;

                case "circle":
                    System.out.print("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area: " + calculateArea(radius));
                    break;

                case "triangle":
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Area: " + calculateArea(base, height));
                    break;

                default:
                    System.out.println("Invalid shape");
                    break;
            }

            // Answer 4
            System.out.println("Answer 4");
            System.out.println("Enter the operator: ");
            String operator = scanner.next();
            System.out.println("Enter the operands: ");
            float num1 = scanner.nextFloat();
            float num2 = scanner.nextFloat();
            System.out.println("Result: " + operatorResult(operator, num1, num2));

            scanner.close();
        }
}
