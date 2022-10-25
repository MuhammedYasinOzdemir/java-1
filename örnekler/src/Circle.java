package bp1_09_12_2021;

public class Circle {
    double radius=1.0;

    @Override
    public boolean equals(Object o) {
    if (o instanceof Circle) {
    return radius == ((Circle)o).radius;
  }
  else
    return false;

    }
    
    Circle (){
        
    }
    
    Circle (double newRadius){
        radius=newRadius;
    }
    
    double getArea(){
        return radius*radius*3.14;
    }
}
