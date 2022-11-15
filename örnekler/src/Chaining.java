
public class Chaining
{
    public Chaining()
    {
        System.out.println("Default constructor");
    }
    public Chaining(int i)
    {
        this();
        System.out.println("Single parameter "
                + "constructor: " + i);
    }
    public Chaining(int i, int j)
    {
        this(j);
        System.out.println("Double parameter "
                + "constructor: " + i + ", " + j);
    }
    public static void main(String a[])
    {
        Chaining ch = new Chaining(0, 2);
    }
}
