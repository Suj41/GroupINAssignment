package Group_Project;

import java.util.*;

class TestStudent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casE;
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("Welcome to Student data");
            System.out.println("1 ko imput");
            System.out.println("2 ko view");
            System.out.println("3 ko update");
            System.out.println("4 ko delete");
            System.out.println("5 ko exit");
            casE = sc.nextInt();
            switch (casE) {
                case 1:
                    top();
                    break;
                case 2:
                    System.out.println("view");
                    break;
                case 3:
                    System.out.println("update");
                    break;
                case 4:
                    System.out.println("delete");
                    break;
                case 5:
                    System.out.println("exit");
                default:
                    System.out.println("invalid");
                    break;
            }
        }


    }
        public static void top(){
            int n=0;
            do {
                funct();
                n++; }
            while(n<5);


        }
    public static void funct(){
        // Insert Details for student 1
        Student student1 = new Student();
        student1.setRoll_no(1);
        student1.setfName("John");
        student1.setlName("Doe");
        student1.setDob("01/01/2000");
        student1.setStandard("10");

        // Insert marks
        ArrayList<SubjectMarks> studentMarks = new ArrayList<SubjectMarks>();
        studentMarks.add(new SubjectMarks("Maths", 80));
        studentMarks.add(new SubjectMarks("Science", 90));
        studentMarks.add(new SubjectMarks("English", 70));
        studentMarks.add(new SubjectMarks("Nepali", 60));
        student1.setSubjectMarks(studentMarks);

        // Calculate total marks
        int totalMarks = 0;
        for(SubjectMarks subjectMarks : studentMarks){
            totalMarks += subjectMarks.getMarks();
        }
        student1.setTotalMarks(totalMarks);

        // Displaying student 1 details
        System.out.println("-------Student 1 Details-------");
        System.out.println();
        System.out.println("Roll No: " + student1.getRoll_no());
        System.out.println("First Name: " + student1.getfName());
        System.out.println("Last Name: " + student1.getlName());
        System.out.println("DOB: " + student1.getDob());
        System.out.println("Standard: " + student1.getStandard());
        System.out.println("-------Student 1 Marks-------");
        for(SubjectMarks subjectMarks : student1.getSubjectMarks()){
            System.out.println("Subject Name: " + subjectMarks.getSubjectName() + " Marks: " + subjectMarks.getMarks());
        }
        System.out.println("-------Student 1 Total Marks and percentage-------");
        System.out.println("Total Marks: " + student1.getTotalMarks());
    }
        }

