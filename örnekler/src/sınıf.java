public class sınıf {
    protected String Marka,Model,Renk;
    int fiyat;
    public sınıf(String Marka,String Model,String Renk,int fiyat){
        this.Marka=Marka;
        this.Model=Model;
        this.Renk=Renk;
        this.fiyat=fiyat;
    }
    public sınıf(){
        this("Bilgi yok","Bilgi yok","Bilgi yok",0);
    }
    public sınıf(String Marka,String Model,int fiyat){
        this(Marka,Model,"Bilgi yok",fiyat);
    }

    public String getMarka() {
        return Marka;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getRenk() {
        return Renk;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getModel() {
        return Model;
    }

     void setRenk(String renk) {
        Renk = renk;
    }
}
