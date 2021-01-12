package UzdaviniaiMetodai1;
//03.	Skaitmenų suma
//Write a Java method to compute the sum of the digits in an integer.
//Input an integer: 25
//The sum is 7.
//Pastaba: galite patobulinti uždavinį, kad rastų ne tik dviženklio, bet ir n-ženklio skaičiaus skaitmenų sumą.
public class MetodaiUzd003 {
    public static void main(String[] args) {

        int n = 999;

        System.out.println(getSum(n));
    }

    static int getSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}
