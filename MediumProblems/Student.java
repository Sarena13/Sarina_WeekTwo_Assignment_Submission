/* Student Grading (Switch Statement) Create a Student class with name and marks. 
Write a method calculateGrade() that assigns a grade (A, B, C, D, F) based on marks
 using a switch or if-else ladder. Create 3 students and display their grades. */

public class Student{
    private String name;
    private float marks;

    public Student( String name, float marks){
       this.name = name;
       this.marks = marks;
    }
    
     public char calculateGrade() {
       if (marks >= 90) {
           return 'A';
       } else if (marks >= 80) {
           return 'B';
       } else if (marks >= 70) {
           return 'C';
       } else if (marks >= 60) {
           return 'D';
       } else {
           return 'F';
       }
     }
   public void showDetails() {
       System.out.println("studentName: " + name);
       System.out.println("studentMarks: " + marks);
       System.out.println("Grade: " + calculateGrade());
       System.out.println();
   }

   public static void main (String[] args){
       Student st1 = new Student ("Sarena Tamang", 45);
       Student st2 = new Student ("Trishna Magar", 90);
       Student st3 = new Student ("Tommy Thapa", 50);
        
        st1.showDetails();
        st2.showDetails();
        st3.showDetails();
   }
}