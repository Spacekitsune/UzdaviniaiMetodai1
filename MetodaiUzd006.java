package UzdaviniaiMetodai1;

//06.	Penkiakampis
//Write a Java method to create the area of a pentagon.
//https://www.calculat.org/lt/plotas-perimetras/daugiakampis.html
//Input the number of sides: 5
//Input the side: 6
//The area of the pentagon is 61.93718642120281
//Pastaba: rezultatą pateikite trijų skaičių po kablelio tikslumu.
public class MetodaiUzd006 {
    public static void main(String[] args) {

        double plotas5 = penkiakampioPlotas(6, 5); //6 krastines ilgis, b krastiniu sk
        System.out.printf("Penkiakampio plotas : %.3f ", plotas5);
    }

    private static double penkiakampioPlotas(double a, double b) {
//		return ( ( Math.sqrt( 25+ (10*Math.sqrt(5))) /4) *Math.pow(a, 2)) ;
        return 0.25 * b * Math.pow(a, 2) * (1 / Math.tan(Math.PI / b));
    }
}
