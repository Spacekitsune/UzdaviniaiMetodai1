package UzdaviniaiMetodai1;

//02.	Vidurkis
//Write a Java method to compute the average of three numbers.
//Input the first number: 25
//Input the second number: 45
//Input the third number: 65
//The average value is 45.0
public class MetodaiUzd002 {
    public static void main(String[] args) {

        double vidurkis = getAvg(25, 45, 65);
        System.out.printf("Vidurkis: %.1f ", vidurkis);
    }

    private static double getAvg(double d, double e, double f){
        return (d + e + f) / 3;
    }
}
