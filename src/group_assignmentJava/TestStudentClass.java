package group_assignmentJava;


import java.util.ArrayList;
import java.util.Scanner;

public class TestStudentClass {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<StudentClass> base = new ArrayList<StudentClass>();
            to:
            while (true) {

                System.out.println("--------Welcome to the student report file--------");
                System.out.println("1 Student Marks Entry");
                System.out.println("2 Remove Student Entry");
                System.out.println("3 Update Student Entry");
                System.out.println("4 View Student Data");
                System.out.println("5 Exit");

                System.out.println("Please Enter Your Choice:");

                String choice = sc.next();

                switch (choice) {
                    case "1":

                        addStudent(base);
                        break;
                    case "2":

                        deleteStudent(base);
                        break;
                    case "3":

                        updateStudent(base);
                        break;
                    case "4":

                        queryStudents(base);
                        break;
                    case "5":
                        System.out.println("Thank you for your use");
                        break to;

                    default:
                        System.out.println("Input is wrong");
                        break;
                }
            }

        }






        // How to modify students
        public static void updateStudent(ArrayList<StudentClass> base) {
            System.out.println("Student roll number for data updates:");
            Scanner sc = new Scanner(System.in);
            int updateroll = sc.nextInt();

            int index = getIndex(base,updateroll);

            if(index == -1){

                System.out.println("No information, Please re-enter");
            }else{

                System.out.println("Enter new Student Name:");
                String name = sc.next();
                System.out.println("Enter  new Student Roll:");
                int roll = sc.nextInt();
                System.out.println("Enter new School Name:");
                String school = sc.next();
                System.out.println("Enter  new Student Standard:");
                int grade = sc.nextInt();
                System.out.println("Enter  new DOB(YYYY/MM/DD) :");
                String dob = sc.next();
                System.out.println("Gender :");
                char gen = sc.next().charAt(0);
                System.out.println("Enter Science Marks :");
                int sci = sc.nextInt();
                System.out.println("Enter English  Marks :");
                int eng = sc.nextInt();
                System.out.println("Enter Maths Marks :");
                int maths = sc.nextInt();
                System.out.println("Enter Nepali Marks :");
                int nep = sc.nextInt();
                System.out.println("Enter Social Marks :");
                int sos = sc.nextInt();

                int total = nep+eng+maths+sci+sos;



                StudentClass stud1 = new StudentClass(name, roll, grade, sci, maths, eng, nep, sos, total, school, dob, gen);

                base.set(index, stud1);
                System.out.println("Updated successfully!");
                System.out.println(" ");
            }
        }


        // How to delete students
        public static void deleteStudent(ArrayList<StudentClass> base) {

            System.out.println("Student Roll Number  to delete data:");

            Scanner sc = new Scanner(System.in);
            int deleteroll = sc.nextInt();

            int index = getIndex(base,deleteroll);

            if(index == -1){

                System.out.println("No information, Please re-enter");
            }else{

                base.remove(index);
                System.out.println("Successfully deleted!");
                System.out.println(" ");
            }
        }

        // How to view students
        public static void queryStudents(ArrayList<StudentClass> base) {

            if(base.size() == 0){
                System.out.println("Empty, Please add and query again");
                return;
            }


            for (int i = 0; i < base.size(); i++) {
                StudentClass stud1 = base.get(i);
                StudentClass stud =new StudentClass() {
                };
                System.out.println(" ");
                System.out.println("=============================");
                System.out.println("=============================");
                System.out.println("Marksheet of Grade :"+stud1.getGrade()+" , "+stud1.getSchool());
                System.out.println("=============================");
                System.out.println("Roll :"+stud1.getRoll()+"   "+"Name :"+ stud1.getName() );
                System.out.println("Gender :"+stud1.getGen()+"   "+"DOB :"+ stud1.getDob() );
                System.out.println("-----------------------------");
                System.out.println("Subject      Marks");

                System.out.println("-----------------------------");

                System.out.println("Science    :"+stud1.getSci() );
                System.out.println("English    :"+stud1.getEng() );
                System.out.println("Maths      :"+stud1.getMaths() );
                System.out.println("Nepali     :"+stud1.getNep() );
                System.out.println("Social     :"+stud1.getSos() );
                System.out.println("-----------------------------");
                System.out.println("Total :"+stud1.getTotal() );
                System.out.println("=============================");
                System.out.println(" ");


            }
        }

        // How to add students
        public static void addStudent(ArrayList<StudentClass> base) {
            for (int i=0; i<5; i++){
                Scanner sc = new Scanner(System.in);

                int roll;

                while(true){
                    System.out.println("Enter Roll Number:");
                    roll = sc.nextInt();

                    int index = getIndex(base, roll);

                    if(index == -1){

                        break;
                    }
                }

                System.out.println("Name:");
                String name = sc.next();
                System.out.println("School Name:");
                String school = sc.next();

                System.out.println("Student Standard:");
                int grade = sc.nextInt();
                System.out.println("Student DOB(yyyy/mm/dd):");
                String dob = sc.next();
                System.out.println("Student Gender(M/F):");
                char gen = sc.next().charAt(0);
                System.out.println("Enter Science marks :");
                int sci = sc.nextInt();
                System.out.println("Enter English Marks :");
                int eng = sc.nextInt();
                System.out.println("Enter Maths Marks :");
                int maths = sc.nextInt();
                System.out.println("Enter Nepali Marks :");
                int nep = sc.nextInt();
                System.out.println("Enter Social Marks :");
                int sos = sc.nextInt();
                int total= nep+eng+sci+maths+sos;

                StudentClass stud1 = new StudentClass(name, roll, grade, sci, maths, eng, nep, sos, total, school, dob, gen);

                base.add(stud1);

                System.out.println("Added successfully!");
                System.out.println(" ");
                System.out.println(" ");;
            }
        }






        public static int getIndex(ArrayList<StudentClass> base, int roll) {

            int index = -1;

            for (int i = 0; i < base.size(); i++) {
                StudentClass stud1 = base.get(i);

                int id = stud1.getRoll();
                if (id==roll) {

                    index = i;
                }
            }
            return index;
        }


    }


