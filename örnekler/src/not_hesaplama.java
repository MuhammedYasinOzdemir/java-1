import java.util.Scanner;

public class not_hesaplama {
    //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını
    // hesaplayıp ekrana bastırılan programı yazın.
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        double mat,fiz,kim,tur,tar,muz,ortalama;
        System.out.print("Matematik dersi not giriniz:");
        mat= scn.nextDouble();
        System.out.print("Fizik giriniz:");
        fiz= scn.nextDouble();
        System.out.print("Kimya giriniz:");
        kim= scn.nextDouble();
        System.out.print("Türkçe giriniz:");
        tur= scn.nextDouble();
        System.out.print("Tarih giriniz:");
        tar= scn.nextDouble();
        System.out.print("Muzik giriniz:");
        muz= scn.nextDouble();
        ortalama=(mat+fiz+kim+tur+tar+muz)/6.0;
        System.out.println("Ortalama: "+ortalama);
        System.out.println((ortalama>60)?"Gecti":"Kaldı");

    }
}
