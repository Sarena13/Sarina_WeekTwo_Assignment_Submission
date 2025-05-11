/*Manual Car Showroom Inventory Create a Car class with attributes: brand, 
model, price. Create 5 different Car objects with different details. 
Display the cars whose price is greater than 20,00,000 (use if statement).*/
public class Car{
    public String brand;
    public String model;
    public double price;

   public Car(String brand, String model, double price) {
       this.brand = brand;
       this.model = model;
       this.price = price;
   }
   public void displayDetails() {
       System.out.println("Brand: " + brand);
       System.out.println("Model: " + model);
       System.out.println("Price: " + price);
       System.out.println();
   }

   public static void main(String[] args) {
       Car car1 = new Car("Toyota", "Fortuner", 4200000);
       Car car2 = new Car("Hyundai", "i20", 900000);
       Car car3 = new Car("BMW", "X5", 9500000);
       Car car4 = new Car("Maruti", "Swift", 700000);
       Car car5 = new Car("Audi", "A6", 6100000);

       
       Car[] cars = {car1, car2, car3, car4, car5};
       System.out.println("Cars with price greater than ₹20,00,000:");
       for (Car car : cars) {
           if (car.price > 2000000) {
               car.displayDetails();
           }
       }
   }
}

