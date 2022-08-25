package homework3;

import homework1.RectangleArea;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            Division division = new Division();
            division.div(a,b);
        } catch (InputMismatchException e) {
            System.out.println("Input an integer");

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide on 0");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
