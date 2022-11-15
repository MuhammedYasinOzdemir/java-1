public class ConstructorChaining{
public static void main(String args[]) {
        Derived sub = new Derived("Test");
    }
}
class Base{
    protected String name;
    public Base(){
        this("Çıktı 1"); 
        System.out.println("Çıktı 2");
    }
    public Base(String name){
        this.name = name;
        System.out.println("Çıktı 3");
    }
}
class Derived extends Base{
   public Derived(){
       System.err.println("Çıktı 4");
   }
    public Derived(String name){
       super(name); 
       System.out.println("Çıktı 5"); 
    }}
