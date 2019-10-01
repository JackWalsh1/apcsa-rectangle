import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle. ");
        double length = in.nextDouble();
        in.nextLine();

        System.out.print("Enter the height of the rectangle. ");
        double height = in.nextDouble();
        in.nextLine();

        double area = (length * height);

        System.out.printf("%s %.1f %s %.1f %s %.1f %s", "The area of a", height, "- by -", length, "rectangle is", area, ".");

        in.close();
    }
}
