import java.util.Scanner;

public class ucakBileti {
    /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     */
    public static void main(String[] args){
        final double km_basi=0.1;
        Scanner scn=new Scanner(System.in);
       while (true){
           System.out.println("secim:");
           int secim=scn.nextInt();
           if(secim==1){
            System.out.println("1-gidis-donus\n2-tek seferlikYolculuk tipi giriniz:");
            int tip=scn.nextInt();
            System.out.println("Yas giriniz");
            int yas=scn.nextInt();
            System.out.println("Km giriniz:");
            int km=scn.nextInt();
            double bilet=km_basi*km;
            if (yas<12){
                bilet-=bilet*0.5;
            }
            else if(yas<24){
                bilet-=bilet*0.1;
            }
            else if (yas>65) {
                bilet-=bilet*0.3;
            }
            if(tip==1)
                bilet-=bilet*0.2;
        System.out.println("Bilet fiyatı:"+bilet+"$");}

           else
               break;
    }

}}
