/* Constants Usage Example Create a Circle class with an attribute radius.
 Use a final constant PI = 3.14159. Write a method calculateCircumference()
  and calculateArea() using PI. Create two Circle objects and display their
   area and circumference.*/
   public class Circle {
   
    public static final double PI = 3.14159;
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateCircumference() {
        return 2 * PI * radius;
    }
    public double calculateArea() {
        return PI * radius * radius;
    }
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + calculateCircumference());
        System.out.println("Area: " + calculateArea());
        System.out.println();
    }


    public static void main(String[] args) {
       
        Circle  Circle1 = new Circle (5.0);
        Circle  Circle2 = new Circle (7.5);

        Circle1.displayDetails();
        Circle2.displayDetails();
    }
    }

   
