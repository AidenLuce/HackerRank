import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void q1(){
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    public static void q2() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void q3(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if(N%2==1){
            System.out.println("Weird");
        } else if(N%2==0 && N>=2 && N<=5){
            System.out.println("Not Weird");
        } else if(N%2==0 && N>=6 && N<=20){
            System.out.println("Weird");
        } else if(N%2==0 && N>20){
            System.out.println("Not Weird");
        }
    }

    public static void main(String[] args) {
        q1();
        q2();
        q3();
    }
}
