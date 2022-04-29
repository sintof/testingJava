package Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Triangle triangle = new Triangle(inputSidesOfTriangle());
        System.out.print(triangle.getSideA());
    }
    public static int[] inputSidesOfTriangle(){
        int sideA = input("Введите сторону A");
        int sideB = input("Введите сторону B");
        int sideC = input("Введите сторону C");
        return new int[]{sideA,sideB,sideC};
    }
    private static int input(String comment){
        System.out.printf("%s >> ", comment);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
