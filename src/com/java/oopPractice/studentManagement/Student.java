package com.java.oopPractice.studentManagement;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String major;
    private float theoryScore;
    private float practiceScore;
    private float averageScore;

    public Student() {
    }


    public Student(int id, String name, String subjects, float theoryScore, float practiceScore, float averageScore) {
        this.id = id;
        this.name = name;
        this.major = subjects;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
        this.averageScore = averageScore;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", theoryScore=" + theoryScore +
                ", practiceScore=" + practiceScore +
                ", averageScore=" + averageScore +
                '}';
    }
    ArrayList<String> listCheckSubjects=new ArrayList<>();
    public ArrayList<String> listCheckSubjects() {
        listCheckSubjects.add("Calculus");
        listCheckSubjects.add("Probability");
        listCheckSubjects.add("Microeconomics");
        listCheckSubjects.add("Macroeconomics");
        listCheckSubjects.add("Philosophy of marxism and Leninism");
        listCheckSubjects.add("History of  Vietnamese communist party");
        listCheckSubjects.add("Ho Chi Minh 's thought");
        listCheckSubjects.add("Computer skill");
        listCheckSubjects.add("Karate");
        listCheckSubjects.add("Football");
        listCheckSubjects.add("Volleyball");
        listCheckSubjects.add("Computer science");
        listCheckSubjects.add("Computer network");
        listCheckSubjects.add("Design website");
        return listCheckSubjects;
    }

    public int getId() {
        return  id;
    }

    public boolean setId(int id) {
        int count = 1;
        int cloneId=id;
        if (id != 0) {
            while (cloneId > 10) {
                cloneId = cloneId / 10;
                count++;
            }
            if (count == 5) {
                this.id = id;
                return true;
            }

        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public boolean setMajor(String majorTest) {
        ArrayList<String> list=listCheckSubjects();
        for (String checkSubject : list) {
            if(checkSubject.equalsIgnoreCase(majorTest))
            {
                this.major = majorTest;
                return true;
            }
        }
        System.err.println("Major including \n" +list);
        return false;
    }

    public float getTheoryScore() {
        return theoryScore;
    }

    public boolean setTheoryScore(float theoryScore) {
       if (theoryScore>=0 && theoryScore <=10){
           this.theoryScore=theoryScore;
           return true;
       }
       return false;
    }

    public float getPracticeScore() {
        return practiceScore;
    }

    public boolean setPracticeScore(float practiceScore) {

       if (practiceScore>=0 && practiceScore <=10){
           this.practiceScore=practiceScore;
           return true;
       }
       return false;

    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
}