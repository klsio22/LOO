package teste;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class teste {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        boolean check = number % 2 == 0;

        if(number >= 1 && number <= 100 ){

            if(number % 2 != 0){
                System.out.println("Weird");
            }

            if(check && number < 6){
                System.out.println("Not Weird");
            }

            if(check && number >= 6 && number <= 20){
                System.out.println("Weird");
            }

            if(check && number > 20){
                System.out.println("Not Weird");
            }

        }

        scanner.close();
    }

}
