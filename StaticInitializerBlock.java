import java.io.*;
import java.util.*;

public class Solution {

    static Scanner scan = new Scanner(System.in);

    static int h;
    static int b;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        h = scan.nextInt();
        b = scan.nextInt();

        if(b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            System.out.println(b*h);
        }
    }
}
