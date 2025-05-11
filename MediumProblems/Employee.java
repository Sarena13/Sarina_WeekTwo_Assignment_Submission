/* Employee Bonus Calculation Create a class Employee with name, salary, 
and yearsOfExperience. Write a method calculateBonus():
If experience > 5 years, bonus = 20% of salary
Otherwise, bonus = 10% of salary Display the bonus amount for each employee.*/
public class Employee{
    
    public String name;
    public double salary;
    public int yearsOfExperience;


    public Employee(String name, double salary, int yearsOfExperience){
       this.name = name;
       this.salary = salary;
       this.yearsOfExperience = yearsOfExperience;
    }
    public double calculateBonus(){
       if(yearsOfExperience > 5){
           return 0.2 * salary;
       }else{
         return 0.1 * salary;
       }
    }
    public void displayBonus(){
       System.out.println("name:" + name);
       System.out.println("salary:" + salary);
       System.out.println("yearOfExperience:" + yearsOfExperience);
       System.out.println("Bonus:" + calculateBonus());
       System.out.println();
    }
    public static void main(String[] args){
       Employee emp1 = new Employee("Sarena Tamang", 20000, 5);
       Employee emp2 = new Employee("Saron Tamang", 23000, 5);
       Employee emp3 = new Employee("Suniva Munikar", 200000, 5);
       Employee emp4 = new Employee("Suman Tamang", 45000, 5);
       Employee emp5 = new Employee("Aakash shrestha", 50000, 5);

       emp1.displayBonus();
       emp2.displayBonus();
       emp3.displayBonus();
       emp4.displayBonus();
       emp5.displayBonus();
    }
}

