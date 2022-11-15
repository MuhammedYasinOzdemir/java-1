class Hayvan3 {
  public void avYakala() {
	System.out.println("Hayvan avYakala");
  }

    @Override
    public String toString() {
        return "Hayvan";
    }
  
}
 class Kartal extends Hayvan3 {
  public void avYakala() {
	System.out.println("Kartal avYakala");
  }
 @Override
    public String toString() {
        return "Kartal";
    }}
 class Timsah extends Hayvan3{
  public void avYakala() {
	System.out.println("Timsah avYakala");
  }
  @Override
    public String toString() {
        return "Timsah";
    }
 }