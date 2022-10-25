import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args){
        int islem ;
        Scanner scn=new Scanner(System.in);
        System.out.print("1:+\n2:-\n3:*\n4:/\n5:%\nislem: ");
        islem=scn.nextInt();
        System.out.println("İki sayı giriniz:");
        double a= scn.nextDouble(),b=scn.nextDouble();
        switch (islem) {
            case 1:
                System.out.println("Sonuc: " + (a + b));
                break;
            case 2:
                System.out.println("Sonuc: " + (a - b));
                break;
            case 3:
                System.out.println("Sonuc: " + (a * b));
                break;
            case 4:
                System.out.println("Sonuc: " + (a / b));
                break;
            case 5:
                System.out.println("Sonuc: " + (a % b));
                break;
            default:
                System.out.println("Hatal");
        }
        }
        }



