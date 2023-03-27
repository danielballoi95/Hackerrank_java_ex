/* NOT SOLVED */
/////////////////////////////////////////////

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String m = s.replaceAll("[^a-zA-Z0-9]"," ").trim();
        String arrS[] = m.split("\\s+");
        // Write your code here.

        //  System.out.print(arrS);


        System.out.print(arrS.length + "\n");


        //System.out.println(sEdit);
       /* for(int i = 0; i < arrS.length;i++) {
             arrS[i] = s.replaceAll("[^a-zA-Z0-9]", " ");
        }  */

        for (String string : arrS) {
            if(!string.isEmpty() || string.isBlank())
                System.out.println(string);
            else {
                System.out.println("0");

            }
        }

        //String[] arrOfStr = s.split("[A-Za-z !,?._'@]+");


        scan.close();
    }
}