
package pkg14.oop.constructor;


public class Student {
    private String name;
    private int grade;
    
    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(int grade) {
        this.grade = grade;
    }
    
    public void displayName() {
        
        System.out.println("Your name is " + this.name);
        
    }
    
    public void displayGrade() {
        System.out.println("Your grade is " + this.grade);
    }
}
