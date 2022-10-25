public class test  extends sınıf{
    public static  void  main (String[] args ){
        sınıf a=new sınıf();
        sınıf b=new sınıf("Ford","Focus",150);
        sınıf c=new sınıf("Ford","Focus","Beyaz",200);
        System.out.print(a.getFiyat());
        System.out.print(a.getMarka());
        System.out.print(a.getRenk());
        System.out.println(a.getModel());
        System.out.print(b.getFiyat());
        System.out.print(b.getMarka());
        System.out.print(b.getRenk());
        System.out.println(b.getModel());
        System.out.print(c.getFiyat());
        System.out.print(c.getMarka());
        System.out.print(c.getRenk());
        System.out.println(c.getModel());
        System.out.println(a.Renk);
    }
}
