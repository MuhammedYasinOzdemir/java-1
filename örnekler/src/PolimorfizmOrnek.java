public class PolimorfizmOrnek {
   public static Hayvan3 rasgeleSec() {
	int sec = ( (int) (Math.random() *3) ) ;
	Hayvan3 h = null ;
	if (sec == 0) h = new Hayvan3();
	if (sec == 1) h = new Kartal();
        if (sec == 2) h = new Timsah();
	return h;   
   }
  public static void main(String args[]) {
	Hayvan3[] h = new Hayvan3[3];
	for (int i = 0 ; i < 3 ; i++) 
              h[i] = rasgeleSec(); 	//Yukarı Çevrim
	for (int j = 0 ; j < 3 ; j++){
            System.out.println(h[j].toString()); 
            h[j].avYakala();
        } 
               		// !Dikkat!
	} 
        //Hayvan3 h1 = new Timsah();//Upcast
        //Timsah t1 = (Timsah) new Hayvan3(); // DownCast
}  

