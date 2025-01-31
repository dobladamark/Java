package pkg16.oop.inheritance;


public class Educ extends Student{
    
    public Educ(String studName, int studGrade) {
        super(studName, studGrade);
    }
    
    public void displaySection() {
        System.out.println("Your section is educ");
    }
    
}
