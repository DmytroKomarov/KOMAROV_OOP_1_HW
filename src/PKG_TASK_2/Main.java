package PKG_TASK_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input side 1 of rectangle: ");
        double side1 = sc.nextDouble();

        System.out.println("Input side 2 of rectangle: ");
        double side2 = sc.nextDouble();

        Rectangle myRectangle = new Rectangle(side1,side2);

        System.out.println();
        System.out.println("Rectangle: " + myRectangle.getSide1() + "x" + myRectangle.getSide2());
        System.out.println("Rectangle area: " + myRectangle.areaCalculator());
        System.out.println("Rectangle perimeter: " + myRectangle.perimeterCalculator());

    }
}
