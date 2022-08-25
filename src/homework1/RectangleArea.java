package homework1;


import java.io.IOException;

public class RectangleArea {
    private int a;
    private int b;

    public RectangleArea() {

    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    int squareRectangle(int a, int b) {
        try {
            if (a <= 0 || b <= 0) {
                throw new Exception("The number has to be bigger than 0");
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        return a * b;
    }
}
