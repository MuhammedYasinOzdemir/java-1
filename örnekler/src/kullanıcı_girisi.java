import java.util.Scanner;

public class kullanıcı_girisi {
    public static void main(String[] args){
        String kadi="cozdemir56.yz@gmail.com",passaword="myasin12345",k,p;
        Scanner scn=new Scanner(System.in);
        while (true){
            System.out.print("Kullanıcı adı:");
            k=scn.nextLine();
            System.out.print("Sifre:");
            p=scn.nextLine();
            if(kadi.equals(k) && passaword.equals(p)) {
                System.out.println("Hosgeldiniz");
                break;
            }
            else if (kadi.equals(k) && !passaword.equals(p)){
                System.out.println("1-şifre değiştir herhangi tus cıkıs:");
                int secim=scn.nextInt();
                if (secim==1) {
                    System.out.print("Yeni şifre giriniz:");
                    p=scn.nextLine();
                    passaword=p;
                    System.out.println("şifre değiştirildi.");
                }
            }
            else
                System.out.println("hatalı kullanıcı adı");
        }
    }
}
