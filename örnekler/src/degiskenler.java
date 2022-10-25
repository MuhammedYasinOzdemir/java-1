import java.util.Scanner;

public class degiskenler {

    public static void main(String[] args){
        int a=1,b,c;
        b=4;
        c=5;
        System.out.println(a+" "+b+" "+c);
        double pi; // ilk başta double türünde bir değişken tanımladık
        pi = 3.14; // Daha sonra bu değişkene bir değer atadık
        boolean x = true; // a isminde bir değişken tanımlanmış ve varsayılan bir değer verilmiş
        x = false; // a değişkeninin değeri değiştirilmiş
        float number1 = 3.14F;//float boyle tanımlanır
        char letter = 'u';//karekter  taınımlanır
        boolean logic1 = true;
        boolean logic2 = false;
        String words = "Hello World";//String boyle tanımlanabilir

        //Kullanıcıdan Veri Alma
        Scanner scn=new Scanner(System.in);
        int k= scn.nextInt();
        System.out.println(k);
        double y=scn.nextDouble();
        System.out.println(y);
        String word=scn.next();//bosluğa kadar okur
        System.out.println(word);
        String nes=scn.nextLine();//\n kadar okur
        System.out.println(nes);

    }
}
