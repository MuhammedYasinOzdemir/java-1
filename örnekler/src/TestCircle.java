package bp1_09_12_2021;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c2.radius=6;
        c1.radius=5;
        System.out.println("C1 Yaricap:"+c1.radius);
        System.out.println("C1 Alan:"+c1.getArea());
        System.out.println("---------------------");
        System.out.println("C2 Yaricap:"+c2.radius);
        System.out.println("C2 Alan:"+c2.getArea());
        
        if(c1.equals(c2)){
            System.out.println("C1==C2");
        }
        else{
            System.out.println("C1!=C2");
        }
    }
}
