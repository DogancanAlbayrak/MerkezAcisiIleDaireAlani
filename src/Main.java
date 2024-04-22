import java.util.Scanner;
public class Main {
public static void main(String[] args) {

    int r;
    double pi = 3.14;
    double merkezacisi;

Scanner inp = new Scanner(System.in);
    System.out.print("Dairenin yarı çapını giriniz : ");
    r = inp.nextInt();

    Scanner input = new Scanner(System.in);
    System.out.print("Dairenin merkez açısını giriniz : ");
    merkezacisi = input.nextInt();


    double alan = (pi * (r * r) * merkezacisi) / 360;


    System.out.println("Dairenin alanı : " + alan);
}
}