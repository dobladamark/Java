
package pkg16.oop.inheritance;


public class Student {
    protected String studName;
    private int studGrade;
    
    public Student (String studName, int studGrade){
        this.studName = studName;
        this.studGrade = studGrade;
    }
    
    public void displayStudName() {
        System.out.println("STUDENT CLASS");
        System.out.println("Student name : "+ this.studName);
       
    }
    
    public void displayStudGrade(){
        System.out.println("STUDENT CLASS");
        System.out.println("Student grade : "+this.studGrade);
    }
    
}
