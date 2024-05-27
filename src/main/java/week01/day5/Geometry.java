package week01.day5;

public class Geometry {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println("Az A oldal hossza: " + rectangle.getSideA());
        System.out.println("A B oldal hossza: " + rectangle.getSideB());
        System.out.println("A téglalap területe: " + rectangle.calculateArea());
    }
}
