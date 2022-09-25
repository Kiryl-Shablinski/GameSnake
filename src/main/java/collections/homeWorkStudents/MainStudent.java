package collections.homeWorkStudents;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
   private static ArrayList<Student>  journal = new ArrayList<>();

    public static void main(String[] args) {
        enterJournal();

        for (Student student : journal){
            System.out.println(student);
        }

        for (int i = 0; i < journal.size(); i++){
            Student student = journal.get(i);
            if (average(student.getGrades()) < 3){
                journal.remove(student);
                i--;
            }else{
                student.setCourse(student.getCourse() + 1);
            }
        }
        System.out.println();
       printStudents(journal, 3);


    }

    public static  void enterJournal(){
        journal.add(new Student("Victor", "Java", 2, 3, 7, 4, 2, 4, 6, 3));
        journal.add(new Student("Maria", "Java", 2, 3, 7, 4, 2, 4, 6, 3));
        journal.add(new Student("Irina", "Python", 4, 3, 7, 8, 8, 7, 9, 9));
        journal.add(new Student("Ivan", "Java", 2, 3, 2, 3, 2, 2, 2));
        journal.add(new Student("Kiryl", "Java", 3, 8, 8, 8, 9, 9));
    }
   //метод для нахождения среднего балла
    private static double average(int[] grades){
        double sum = 0;
        for (Integer grade : grades)
            sum += grade;

        return sum / grades.length;
    }

    public static void printStudents(List<Student> students, int course){
        for (Student student : students){
            if (student.getCourse() == course)
                System.out.println(student.getName() + " is studying in " + course + " course");
        }
    }

}
