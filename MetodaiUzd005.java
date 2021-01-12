package UzdaviniaiMetodai1;

//05.	Trikampis
//Write Java methods to calculate the area of a triangle.
//http://www.mat.lt/matematikos-formules/figuru-plotai/trikampio-plotas-pagal-krastines.html
//Input Side-1: 10
//Input Side-2: 15
//Input Side-3: 20
//The area of the triangle is 72.6184377413890
//Pastaba: rezultatą pateikite dviejų skaičių po kablelio tikslumu.
public class MetodaiUzd005 {
    public static void main(String[] args) {

        double plotaS = trikampioPlotas(10, 15, 20, 22.5);
        System.out.printf("Trikampio plotas : %.2f ", plotaS);
    }

    private static double trikampioPlotas(int a, int b, int c, double p) {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

}

