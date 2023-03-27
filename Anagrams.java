import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String bd = new String(a).toLowerCase();
        String bdc = new String(b).toLowerCase();
        char[] arr1 = bd.toCharArray();
        char[] arr2 = bdc.toCharArray();
        int index = -1;
        int index2 = -1;


        for (int i = 0; i <arr1.length; i++){
            index = i;
            for (int j = i ; j <= arr1.length-1; j++){
                if (arr1[j] < arr1[index]){
                    index = j;
                }
            }
            char temp = arr1[i];
            arr1[i] = arr1[index];
            arr1[index] = temp;
        }

        //arr2
        for (int i = 0; i <arr2.length; i++){
            index2 = i;
            for (int j = i ; j <= arr2.length-1; j++){
                if (arr2[j] < arr2[index2]){
                    index2 = j;
                }
            }
            char temp2 = arr2[i];
            arr2[i] = arr2[index2];
            arr2[index2] = temp2;
        }

        String z = new String(arr1).toLowerCase();
        String m = new String(arr2);

        if (z.equals(m)){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
