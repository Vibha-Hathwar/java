import java.io.*;
import java.util.Scanner;
/*
gedit filename.java
javac filename.java
java filename
*/
// my first java program

//	min value = Integer.MIN_VALUE

//	everything in java is pass by value
//	no pass by reference

//  no default parameters in java

//	primitive datatypes store value
//	non-primitive datatypes store address

//	recursion2
//System.out.printf("%.5f",findGeometricSum(n));

class hello
{
    public static void main(String args[])
    {
        System.out.println("Hi");
        //System.out.print("Hi\n");
        byte b=2;
        short s=10;
        int a = 1;
        long l= 20;
        float f=10.5f;
        double d=10.5;
        char c = 'a';
        boolean b1=true;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Hello Ninja "+name+"!!");
    }
}
