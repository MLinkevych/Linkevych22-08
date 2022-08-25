package homework1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            RectangleArea rect = new RectangleArea();
            rect.squareRectangle(a,b);
        } catch (InputMismatchException e) {
            System.out.println("Input an integer");
        }



    }
}
