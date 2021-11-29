import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * Given a base- 10integer,n , convert it to binary (base-2).
     * Then find and print the base- integer denoting the maximum number of consecutive 1's
     * in n's binary representation. When working with different bases, it is common to show
     * the base as a subscript.
     * Example
     * N=125
     * The binary representation of 125 10 is 1111101 2. In base 10,
     * there are 5  and 1  consecutive ones in two groups.
     * Print the maximum, 5.**/
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        int consec1=0;
        String strBinary = Integer.toString(n, 2);
        // above is binary of given in in string
        String[] strparts = strBinary.split("0");
        //above we get all strings of ones, below find max from them
        for(int i=0;i<strparts.length;i++ ){
            if (consec1 < strparts[i].length()) {consec1 = strparts[i].length();}
        }
        System.out.println(consec1);


    }
}
