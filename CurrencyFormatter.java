import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        //AMERICA
        Locale locale1 = new Locale("en", "US");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale1);
        //china
        Locale locale2 = new Locale("zh", "CN");
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(locale2);
        //india
        Locale locale3 = new Locale("en", "IN");
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(locale3);

        //francia
        Locale locale4 = new Locale("fr", "FR");
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance (locale4);

        String india = numberFormat2.format(payment);
        String china = numberFormat1.format(payment);
        String france = numberFormat4.format(payment);
        String  us= numberFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}