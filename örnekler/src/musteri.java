import java.util.Scanner;

public class musteri {
    private String isim,Durum;
    int yas,para;
    Scanner scn=new Scanner(System.in);
    public musteri(String isim,String Durum,int yas,int para){
        this.isim=isim;
        this.Durum=Durum;
        this.yas=yas;
        this.para=para;
        add();
    }
    public musteri(){
        this("Bilgi yok","Bilgi yok",0,0);
    }
    public void add(){
        System.out.println("Musteri eklendi");
    }

   public void para_ekle(){
       System.out.print("Miktar giriniz:");
       double a=scn.nextDouble();
       this.para+=a;
       System.out.println("Para eklendi...");
   }
   public void Durum_degis(){
       System.out.println("Durum giriniz:");
       String D=scn.nextLine();
       setDurum(D);
   }
    public int getPara() {
        return para;
    }
    public void hosgeldiniz(){
        System.out.println("Hosgeldin"+" "+this.isim );
    }

    public String getDurum() {
        return Durum;
    }

    public int getYas() {
        return yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setDurum(String durum) {
        Durum = durum;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setPara(int para) {
        this.para = para;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
