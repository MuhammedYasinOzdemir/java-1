import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        String[] isimler={"Ahmet","Mehmet","Salih","Zeynep","Yeşim","Selin","Murat"};
        Random rnd=new Random();
        Scanner scn=new Scanner(System.in);
        Okul[] ogrenciler=new Okul[10];
        for(int i=0;i<ogrenciler.length;i++){
            ogrenciler[i]= new Okul();
            ogrenciler[i].setIsim(isimler[rnd.nextInt(isimler.length)]);
            ogrenciler[i].setYas(rnd.nextInt(100));
            ogrenciler[i].setNumara(10000000+ rnd.nextInt(10000000));
            ogrenciler[i].setTc(10000000000+ rnd.nextLong(10000000000));
        }
        while (true){
            System.out.print("secim:");
            String secim=scn.nextLine();
            if (secim.equals("0"))
                break;
            else if (secim.equals("1")) {

            }
        }
    }

}
