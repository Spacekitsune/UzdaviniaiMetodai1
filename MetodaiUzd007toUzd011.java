package UzdaviniaiMetodai1;

//07.	printStarts()
//Create a method printStars() that prints the given amount of stars.
//printStars(5);
//printStars(3);
//printStars(9);
//The program output:
//*****
//***
//*********
//
//08.	printSquare()
//Create a method printSquare(sideSize) that prints a square using our previous method printStars().
//The method call printSquare(4), for example, prints the following:
//The program output:
//****
//****
//****
//****
//
//09.	printRectangle()
//Create a method printRectangle(width, height) that prints a rectangle using  the printStars() method .
//The call printRectangle(17,3), for example, has the following output:
//The program output:
//*****************
//*****************
//*****************
//
//10.	printTriangle()
//Create the method printTriangle(size) that prints a triangle using the printStars() method.
//The method call printTriangle(4), for example, has the following output:
//The program output:
//*
//**
//***
//****
//
//11.	xmasTree()
//Create the method xmasTree(int height) that prints a Christmas tree using the mehtods printWhitespaces and printStars.
//A Christmas tree consists of a triangle of  given height and a stand.
//The stand is two stars tall and three stars wide and it is located in  the center of the bottom of the triangle.
//The method call xmasTree(4), for example, has the following output:
//   *
//  ***
// *****
//*******
//  ***
//  ***
public class MetodaiUzd007toUzd011 {
    public static void main(String[] args) {

        printTriangle(4);
    }

    private static void printStar(int s) { // 7Uzd
        for (int i = 0; i < s; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printSquare(int d) { // 8 Uzd
        for (int j = 0; j < d; j++) {
            printStar(d);
            System.out.println();
        }
    }

    private static void printRectangle(int e, int f) { // 9Uzd
        for (int i = 0; i < f; i++) {
            printStar(e);
            System.out.println();
        }
    }

    private static void printTriangle(int g) { // 10Uzd
        for (int j = 1; j <= g; j++) {
            printWhiteSpace(g - j);
            printStar(j);


        }
    }


    private static void printWhiteSpace(int number) { // 11Ud
        for (int i = 1; i <= number; i++) {
            System.out.print((" "));
        }
    }

}
