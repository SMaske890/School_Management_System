package Student_Management_System;

import java.util.List;

/*
 * Many teachers, many students.
 * Implements teachers and student
 * using an ArrayList.
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    /*
     * new school object is created.
     * teachers :- list of teachers in the school.
     * students :- list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /*
     * the list of teachers in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /*
     * Adds a teacher to the school.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /*
     * the list of students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /*
     * Adds a student to the school
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /*
     * the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /*
     * Adds the total money earned by the school.
     * MoneyEarned :- money that is supposed to be  added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /*
     * the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /*
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
}