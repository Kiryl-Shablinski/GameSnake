package oop;



//Написать класс student с полями фамилия, имя, и массив оценок.
// Написать метод, который вычисляет средний бал студента.
public class Student {
    private String name;
    private String lastName;
    private int[] grades;

    public Student(String name, String lastName, int... grades) {
        this.name = name;
        this.lastName = lastName;
        this.grades = grades;
    }

    public void gradPoint() {
        int sumGrade = 0;
        for (int grade : grades)
            sumGrade += grade;
        double graidPoint = (double) sumGrade / grades.length;
        System.out.println("Grade point average: " + graidPoint);
    }
}
