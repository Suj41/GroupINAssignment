package group_assignmentJava;

public class StudentClass {
    private String name;
    private int roll;
    private int grade;
    private int sci;
    private int maths;
    private int eng;
    private int nep;
    private int sos;
    private int total;
    private String school;
    private String dob;
    private char gen;


    public StudentClass() {

    }

    public StudentClass(String name, int roll, int grade, int sci, int maths, int eng, int nep, int sos, int total, String school, String dob, char gen) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
        this.sci = sci;
        this.maths = maths;
        this.eng = eng;
        this.nep = nep;
        this.sos = sos;
        this.total= total;
        this.school=school;
        this.dob=dob;
        this.gen=gen;

    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school){
        this.school=school;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;

    }

    public int getSci() {
        return sci;
    }

    public String getDob() {
        return dob;
    }
public char getGen() {
        return gen;
    }
    public int getSos() {
        return sos;
    }

    public int getMaths() {
        return maths;
    }

    public int getGrade() {
        return grade;
    }

    public int getEng() {
        return eng;
    }

    public int getNep() {
        return nep;
    }

    public int getTotal() {
        return total;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setSci(int sci) {
        this.sci = sci;

    }

    public void setMaths(int maths) {
        this.maths = maths;

    }

    public void setRoll(int roll) {
        this.roll = roll;

    } public void setSos(int sos) {
        this.sos = sos;

    }

    public void setEng(int eng) {
        this.eng = eng;

    }

    public void setNep(int nep) {
        this.nep = nep;

    }

    public void setGrade(int grade) {
        this.grade = grade;


    }

    public void setTotal(int total) {
        this.total = total;


    }public void setDob(String dob) {
        this.dob = dob;


    }public void setGen(char gen) {
        this.gen = gen;


    }


}
