import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        String s = "";
        int counter = 1;
        while (scanner.hasNext()) {
            s = scanner.nextLine();
            System.out.println(counter++ + " " + s);
        }



    }
}
