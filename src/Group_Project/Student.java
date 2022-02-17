package Group_Project;

import java.util.*;

class Student {

    private int roll_no;
    private String firstName;
    private String lastName;
    private String dob;
    private String standard;
    private ArrayList<SubjectMarks> subjectMarks;
    private int totalMarks;

    public Student() {

    }

    public Student(int roll_no, String firstName, String lastName, String dob, String standard, ArrayList<SubjectMarks> subjectMarks, int totalMarks) {
        this.roll_no = roll_no;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.standard = standard;
        this.subjectMarks = subjectMarks;
        this.totalMarks = totalMarks;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getfName() {
        return firstName;
    }

    public void setfName(String fName) {
        this.firstName = fName;
    }

    public String getlName() {
        return lastName;
    }

    public void setlName(String lName) {
        this.lastName = lName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public ArrayList<SubjectMarks> getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(ArrayList<SubjectMarks> subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}
