package com.java.oopPractice.studentManagement;

import java.util.ArrayList;

public class StudentManagement extends Student {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }
    public void addStudent(Student infoStudentAdd){
        for(Student studentAdd : studentArrayList){
            if (studentAdd.getId()==infoStudentAdd.getId()){
                System.err.println("Student has exist");
                return;
            }
        }
        studentArrayList.add(infoStudentAdd);
    }
    public void  removeStudent(Student infoStudentRemove){
        studentArrayList.remove(infoStudentRemove);
    }
    public Student searchStudentById(int id){
        for (Student studentSearch : studentArrayList){
            if (studentSearch.getId()==id){
                return studentSearch;
            }
        }
        System.err.println("Id does not exist");
        return null;
    }
    public ArrayList<Student> searchStudentByName(String name){
        ArrayList<Student> listCheckName=new ArrayList<>();
        for (Student studentSearch : studentArrayList)
        {
            if (studentSearch.getName().equalsIgnoreCase(name))
            {
                listCheckName.add(studentSearch);
            }
            if (listCheckName.size()==0)
            {
                System.out.println("Name does not exist");
                return null;
            }

        }
        return listCheckName;


    }
    public ArrayList<Student> searchStudentByMajor(String major){
        ArrayList<Student> listCheckMajor=new ArrayList<>();
        for (Student studentSearch : studentArrayList)
        {
            if (studentSearch.getMajor().equalsIgnoreCase(major))
            {
                listCheckMajor.add(studentSearch);
            }
            if (listCheckMajor.size()==0)
            {
                System.out.println("Name does not exist");
                return null;
            }

        }
        return listCheckMajor;


    }


}
