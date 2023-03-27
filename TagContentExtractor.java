import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

/*Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();

            String regex = "<(.+)>([^<>]+)</(\\1)>";
			Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);

             boolean b = m.matches();

             if (b){
                                 System.out.println(m.group(2));

            //System.out.println(line);

             } else {
             System.out.println("None");

             }


			testCases--;
		}
	}

    */

        String regex = "<(.+)>([^<>]+)</(\\1)>";
        Pattern p = Pattern.compile(regex);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

//Da chiedere spiegazioni sull'utilizzo dei metodi del matcher

        while (testCases-- > 0) {
            String line = in.nextLine();
            Matcher m = p.matcher(line);

//?? perchè find + reset?

            if (m.find()) {
                m.reset();
                while (m.find()) {
                    System.out.println(m.group(2));
                }
            } else {
                System.out.println("None");
            }
        }

        in.close();
    }
}
