/* Product Discount Calculator Create a class Product with productName,
 price, and discountPercentage. Write a method calculateFinalPrice() 
 which returns price after discount. Create 3 different products and 
 print their final prices.*/
 public class Product {

  
    public String productName;
    public double productPrice;
    public double discountPercentage;

  
    public Product(String name, double price, double disc){
        this.productName = name;
        this.productPrice = price;
        this.discountPercentage = disc;
    }
    public double calculateFinalPrice(){
      
        return productPrice =(productPrice * discountPercentage / 100);
    }
      
    
    public void displayFinalPrice(){
      System.out.println("productName:" + productName);
      System.out.println("productPrice:" + productPrice);
      System.out.println("discountPercentage" + discountPercentage);
      System.out.println("Final Price:" + calculateFinalPrice());
      System.out.println();
    }
    public static void main(String[] args){
      Product p1 = new Product("Laptop", 150000, 10);
      Product p2 = new Product ("Lamborgini", 200000, 15);
      Product p3 = new Product ("Speaker", 12500, 10);

      p1.displayFinalPrice();
      p2.displayFinalPrice();
      p3.displayFinalPrice();
    
    }
  }
