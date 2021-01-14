package UzdaviniaiMetodai1;

//04.	Keliamieji metai
//Write a Java method to check whether a year (integer) entered by the user is a leap year  or not.
//Input a year: 2017
//Result: false
public class MetodaiUzd004 {
    public static void main(String[] args) {

        int n = 2017;

        System.out.println(metai(n));
    }

    static boolean metai(int n) {

        boolean ats;
        if ((n % 4 == 0) && (n % 100) == (n % 400)) {
            ats = true;
        } else {
            ats = false;
        }
        return ats;
    }
}
