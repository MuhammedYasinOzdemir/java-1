package bp1_09_12_2021;
public class TestTV {  
  public static void main(String[] args) {
    TV tv1 = new TV(500);
    tv1.turnOn();
    //tv1.channel=500;
    //tv1.setChannel(100);
    tv1.setVolume(3);
    System.out.println("---------------");
    System.out.println("TV1's channel is " + tv1.getChannel()
      + " and volume level is " + tv1.volumeLevel);
    
    System.out.println("---------------");
    TV tv2 = new TV(50,5);
    tv2.turnOn();
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp();
    
    TV tv3 = new TV(20);
    tv3.turnOn();
    tv3.setVolume(4);
    
    TV tv4 = new TV (80,2);
    
    System.out.println("tv1's channel is " + tv1.getChannel()
      + " and volume level is " + tv1.volumeLevel);
    System.out.println("tv2's channel is " + tv2.getChannel()
      + " and volume level is " + tv2.volumeLevel);
    
    System.out.println("tv3's channel is " + tv3.getChannel()
      + " and volume level is " + tv3.volumeLevel);
    
    System.out.println("tv4's channel is " + tv4.getChannel()
      + " and volume level is " + tv4.volumeLevel);
    
     //tv1.tvSayisi=10;
      
      System.out.println("TV1 Sayisi="+tv1.getTvSayisi());
      System.out.println("TV2 Sayisi="+tv2.getTvSayisi());
      System.out.println("TV3 Sayisi="+tv3.getTvSayisi());
      System.out.println("TV4 Sayisi="+tv4.getTvSayisi());
      //System.out.println("TV Sayisi="+TV);
      // Static bir metottan (main) instance (statik olmayan)
      // bir metot çağırılamaz (getTvSayisi)
  }
}
