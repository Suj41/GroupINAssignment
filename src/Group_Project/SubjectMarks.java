package Group_Project;

public class SubjectMarks extends Student {

    private String subjectName;
    private int marks;

    public SubjectMarks(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

}



