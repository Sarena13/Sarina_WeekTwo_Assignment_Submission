/*Simple arithmetic operations Write a Java program that declares two integers and
 prints their sum, difference, product, and quotient.*/
public class ArithmeticOperation {
    public static void main(String [] args){
        int a = 5; 
        int b = 10;
        int sum = a + b;
        int difference = a - b;
        int product = a*b;
        float Quotient = a/b;

        System.out.println("Number 1 :" + a);
        System.out.println("Number 2 :" + b);
        System.out.println("Sum :" + sum);
        System.out.println("Diffrence :" + difference);
        System.out.println("Product :" + product);
        System.out.println("Quotient :" + Quotient);

    }

}
