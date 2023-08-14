import java.util.Scanner;

public class odev6 {
    public static void main(String[] args){

        double a, pi=3.14, r, alan, cevre, daireDilimAlani;
        Scanner yariCap=new Scanner(System.in);
        System.out.print("yarıçapını giriniz : ");
        r=yariCap.nextDouble();
        Scanner alfa=new Scanner(System.in);
        System.out.print("merkez açısının ölçüsü: ");
        a=alfa.nextDouble();

        alan=pi*r*r;
        cevre=2*pi*r;
        daireDilimAlani=alan*(a/360);
        System.out.println(" Dairenin alanı : " +alan);
        System.out.println("Dairenin çevresi : " +cevre);
        System.out.print(" daire dilimin alanı: "+daireDilimAlani);

    }

}
