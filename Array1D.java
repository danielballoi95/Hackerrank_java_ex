import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int [] a = new int[n];
        int x;
        for(int i = 0; i < n; i++) {
            x = scan.nextInt();
            a[i] = x;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}