package com.java.oopPractice.studentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StudentManagement studentManagement = new StudentManagement();

    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = studentManagement.getStudentArrayList();
        showMenu();
        while (true) {
            System.out.println("Please choose an action!");
            int orderNumber = sc.nextInt();

            switch (orderNumber) {
                case 1:
                    Student studentAdd = inputStudent();
                    studentManagement.addStudent(studentAdd);
                    break;

                case 2:
                    System.out.print("Enter id of student want delete:");
                    int idDelete = sc.nextInt();
                    Student studentDelete = studentManagement.searchStudentById(idDelete);
                    if (studentDelete == null) {
                        break;
                    }
                    studentManagement.removeStudent(studentDelete);
                    break;
                case 3:
                    System.out.println("Are you want search by id or name ? ,please choose\n1.Id\n2.Name\n3.Major");
                    int choose = sc.nextInt();
                    sc.nextLine();
                    if (choose == 1) {
                        System.out.print("Enter id of student want find: ");
                        int idSearchById = sc.nextInt();
                        Student studentSearch = studentManagement.searchStudentById(idSearchById);
                        if (studentSearch == null) {
                            break;
                        }
                        System.out.println(studentSearch);
                    }
                    if (choose == 2) {
                        System.out.print("Enter name of student want find: ");
                        String SearchByName = sc.nextLine();
                        ArrayList<Student> listSearchByName = studentManagement.searchStudentByName(SearchByName);
                        if (listSearchByName == null) {
                            break;
                        }
                        display(listSearchByName);
                    }
                    if (choose == 3) {
                        System.out.print("Enter major of student want find: ");
                        String SearchByMajor = sc.nextLine();
                        ArrayList<Student> listSearchByMajor = studentManagement.searchStudentByMajor(SearchByMajor);
                        if (listSearchByMajor == null) {
                            break;
                        }
                        display(listSearchByMajor);
                    }
                    if (choose !=1 && choose!=2 && choose!=3){
                        System.out.println("The choose does not exist !");
                        break;
                    }
                    break;
                case 4:
                    display(studentArrayList);
                    if (studentArrayList.size() == 0) {
                        System.out.println("Array list empty");
                    }
                    break;
                case 5:
                    showMenu();
                    break;
                default:
                    System.out.println("Enter 1 to 6");
                    break;
                case 6:
                    return;


            }
        }
    }

    public static void showMenu() {
        System.out.println("Hello, how can i help you !");
        System.out.println("You can choose an action below.");
        System.out.println("1.Add info student.");
        System.out.println("2.Remove info student.");
        System.out.println("3.Search student.");
        System.out.println("4.Show all student.");
        System.out.println("5.Show menu.");
        System.out.println("6.Exit.");
    }


    public static Student inputStudent() {
        Student studentInput = new Student();
        System.out.print("Enter ID , id including 5 number: ");
        boolean check;
        while (true) {
            int id = sc.nextInt();
            check = studentInput.setId(id);
            if (check) {
                break;
            } else {
                System.err.println("Id including 5 number,please retype !");
            }
        }
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        studentInput.setName(name);
        System.out.print("Enter major: ");
        while (true) {
            String major = sc.nextLine();
            check = studentInput.setMajor(major);
            if (check) {
                break;
            } else {
                System.err.println("please retype !");
            }
        }
        System.out.print("Enter theory score: ");
        while (true) {
            float theoryScore = sc.nextFloat();
            check = studentInput.setTheoryScore(theoryScore);
            if (check) {
                break;
            } else {
                System.err.println("Theory score must be [0 - 10],please retype !");
            }
        }
        System.out.println("Enter practice score: ");
        while (true) {
            float practiceScore = sc.nextFloat();
            check = studentInput.setPracticeScore(practiceScore);
            if (check) {
                break;
            } else {
                System.err.println("Practice score must be [0 - 10],please retype !");
            }
        }
        studentInput.setAverageScore((studentInput.getTheoryScore() + studentInput.getPracticeScore()) / 2);
        return studentInput;
    }

    public static void display(ArrayList<Student> studentArrayList) {
        for (Student student : studentArrayList) {
            System.out.println(student.toString());
        }
    }
}
