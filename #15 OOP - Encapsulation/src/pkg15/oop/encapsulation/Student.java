
package pkg15.oop.encapsulation;


public class Student {
    private String studentName;
    private int studentGrade;
    private int studentYear;
    
    public Student(String studentName, int studentGrade, int studentYear) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentYear = studentYear;
    }
    
    public void studentDetails() {
        System.out.println("Student name " +this.studentName);
        System.out.println("Student grade "+this.studentGrade);
        System.out.println("Student year " +this.studentYear);
    }
    
    //Getter Setter is a method
    
    public String getStudentName() {
        
        return this.studentName;
    }
    
    public int getStudentGrade() {
        return this.studentGrade;
    }
    
    public int getStudentYear() {
        return this.studentYear;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
        
    }
    
    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }
}
