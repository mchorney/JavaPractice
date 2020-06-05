package l15;

import java.util.Arrays;

public class Student implements Person{
    private String name;
    private int[] score;
    private String[] classes;

    public Student(String name, int[] score, String[] classes) {
        this.name = name;
        this.score = score;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    @Override
    public void Info() {
        System.out.println("Student name:" + getName());
        System.out.println("Student's score: " + Arrays.toString(getScore()));
        if(getScore() != null) System.out.println("Average score:" + AverageScore());
    }

    @Override
    public int AverageScore() {
        int sum = 0;
        int result = 0;
        int[] scores = getScore();
        for (int value : scores) {
            sum+= value;
            result = sum/(scores.length);
        }


        return result;
    }
}
