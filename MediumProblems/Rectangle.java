/* Rectangle and Area Calculation Create a class Rectangle with 
length and width. Initialize using a constructor. Create a method 
calculateArea() that returns the area. Create 3 rectangles of different 
dimensions and display their areas*/
public class Rectangle{
   
    public float length;
    public float width;
    public double calculateArea(){
        return length * width;
    }

public Rectangle ( float length, float width){
    this.length = length;
    this.width = width;
} 

public void showDetails(){
    System.out.println("length: " + length);
    System.out.println("width:" + width);
    System.out.println("Area: " + calculateArea());
    System.out.println();
}
public static void main (String[] args){
    Rectangle rect1 = new Rectangle (23, 12);
    Rectangle rect2 = new Rectangle (20, 10);
    Rectangle rect3 = new Rectangle (12, 10);

    rect1.showDetails();
    rect2.showDetails();
    rect3.showDetails();
}
}
