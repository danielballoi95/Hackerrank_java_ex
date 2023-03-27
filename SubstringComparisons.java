/*     NOT SOLVED     */
//////////////////////////////////////////

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++){
            arr[i] =  s.substring(i, Math.min(s.length(), i + k));
        }
        for(int i = 0; i<arr.length-1; i++)
        {
            for (int j = i+1; j<arr.length; j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        smallest = arr[1];
        largest = arr[arr.length -1];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}