public class Okul
{
    String isim;
    int numara,yas;
    long tc;
    public Okul(){
        this.isim="Bilgi yok";
        this.tc=0;
        this.numara=0;
        this.yas=yas;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public String getIsim() {
        return isim;
    }

    public long getTc() {
        return tc;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public void setTc(long tc) {
        this.tc = tc;
    }
}
