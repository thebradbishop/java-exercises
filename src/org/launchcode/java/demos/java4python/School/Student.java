package org.launchcode.java.demos.java4python.School;

/**
 * Created by brad on 3/12/17.
 */
public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public final void setStudentId(int aStudentID) {
        studentId = aStudentID;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    private void setGpa(double aGpa) {
        gpa = aGpa;
    }
}