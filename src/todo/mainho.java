package todo;

public class mainho extends Marks {

    private String name;
    private int roll;
    // private int age;
    private int grade;
    private int sci;
    private int maths;
    private int m1;
    private int m2;
    private int total;
    private String school;

    public mainho() {

    }

    public mainho(String name, int roll, int grade, int sci, int maths, int m1, int m2, int total, String school) {
        this.name = name;
        this.roll = roll;
        // this.age = age;
        this.grade = grade;
        this.sci = sci;
        this.maths = maths;
        this.m1 = m1;
        this.m2 = m2;
        this.total= total;
        this.school=school;

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

    public int getMaths() {
        return maths;
    }

    public int getGrade() {
        return grade;
    }

    public int getM1() {
        return m1;
    }

    public int getM2() {
        return m2;
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

    }

    public void setM1(int m1) {
        this.m1 = m1;

    }

    public void setM2(int m2) {
        this.m2 = m2;

    }

    public void setGrade(int grade) {
        this.grade = grade;


    }

    public void setTotal(int total) {
        this.total = total;


    }


    @Override
    public int sum() {
        return m1+m2+maths+sci;
    }
}





