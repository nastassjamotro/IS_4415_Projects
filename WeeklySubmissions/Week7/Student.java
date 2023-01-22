public class Student {
  char grade;
  int points;
  
  public void assignGrade(char grades) {
    grade = grades;
  }
  
  public void assignPoints(int point) {
    points = point;
  }
  
  public void showGrade() {
    System.out.println("Your grade is a " + grade);
    System.out.println("Your total points are " + points);
  }
}
