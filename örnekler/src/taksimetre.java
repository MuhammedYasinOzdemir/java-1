import java.util.Scanner;

public class taksimetre
{/*Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir
*/
    public  static void main(String[] args){
        int acılıs=10,km;
        double km_bas=2.2,taksimetre;
        Scanner scn=new Scanner(System.in);
        km=scn.nextInt();
        taksimetre=acılıs+km*km_bas;
        System.out.println("Ucret: "+taksimetre);
    }
}
