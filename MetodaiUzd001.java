package UzdaviniaiMetodai1;
//01.	Mažiausias skaičius
//Write a Java method to find the smallest number among three numbers.
//Input 1: 25
//Input 2: 37
//Input 3: 29
//The smallest value is 25

public class MetodaiUzd001 {
    public static void main(String[] args) {

        double minSk = getMin(25, 26, 26);
        System.out.println("Maziausias: "+minSk );

    }

    private static double getMin(double d, double e, double f) {
        double ats;
        if ((d < e) && (d < f)) {
            ats=d;
        } else if ((e < d) && (e < f)) {
            ats=e;
        } else {
            ats=f;
        }
        return ats;
    }

}
