import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(A.length() -1 -i) != A.charAt(i)){
                System.out.println("No");
                break;
            }
            System.out.println("Yes");
            break;
        }

    }
}
