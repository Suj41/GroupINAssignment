package todo;
import arko.Name;

import  java.util.*;
public class Testhai {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     ArrayList<mainho> base = new ArrayList<mainho>();
        to:
        while (true) {
            // 1. Build the main interface menu
            System.out.println("--------Welcome to the student management system--------");
            System.out.println("1 Add student data");
            System.out.println("2 Delete student data");
            System.out.println("3 Update student data");
            System.out.println("4 View student data");
            System.out.println("5 sign out");

            System.out.println("Please enter your choice:");

            String choice = sc.next();

            switch (choice) {
                case "1":
                    //System.out.println("add student");
                    addStudent(base);
                    break;
                case "2":
                    //System.out.println("delete student");
                    deleteStudent(base);
                    break;
                case "3":
                    //System.out.println (the "revised student");
                    updateStudent(base);
                    break;
                case "4":
                    // System.out.println("view students");
                    queryStudents(base);
                    break;
                case "5":
                    System.out.println("Thank you for your use");
                    break to;

                default:
                    System.out.println("Your input is wrong");
                    break;
            }
        }

    }






    // How to modify students
    public static void updateStudent(ArrayList<mainho> base) {
        System.out.println("Please input the student number you want to modify:");
        Scanner sc = new Scanner(System.in);
        int updateroll = sc.nextInt();
        // 3. Call getIndex method to find the index position of the student number in the collection
        int index = getIndex(base,updateroll);
        // 4. Judge whether the student number exists in the set according to the index
        if(index == -1){
            // Does not exist: prompt
            System.out.println("No information, Please re-enter");
        }else{
            // Presence: receiving new student information
            System.out.println("Enter new student name:");
            String name = sc.next();
            System.out.println("Enter  new student roll:");
            int roll = sc.nextInt();
            System.out.println("Enter new School Name:");
            String school = sc.next();
            System.out.println("Enter  new student's grade:");
            int grade = sc.nextInt();
            System.out.println("Enter Science Marks :");
            int sci = sc.nextInt();
            System.out.println("Enter English  Marks :");
            int m1 = sc.nextInt();
            System.out.println("Enter Maths Marks :");
            int maths = sc.nextInt();
            System.out.println("Enter Nepali Marks :");
            int m2 = sc.nextInt();

            int total = m1+m2+maths+sci;

            // Encapsulate as a new student object

            mainho stud1 = new mainho(name, roll, grade, sci, maths, m1, m2, total, school);
            // Call the set method of the collection to complete the modification
            base.set(index, stud1);
            System.out.println("Modified successfully!");
        }
    }


    // How to delete students
    public static void deleteStudent(ArrayList<mainho> base) {
        // 1. Give prompt information (please input the student number you want to delete)
        System.out.println("Please enter the student number you want to delete:");
        // 2. The keyboard receives the student number to be deleted
        Scanner sc = new Scanner(System.in);
        int deleteroll = sc.nextInt();
        // 3. Call getIndex method to find the index position of the student number in the collection
        int index = getIndex(base,deleteroll);
        // 4. Judge whether the student number exists in the set according to the index
        if(index == -1){
            // Does not exist: prompt
            System.out.println("No information, Please re-enter");
        }else{
            // Existing: delete
            base.remove(index);
            System.out.println("Successfully deleted!");
        }
    }

    // How to view students
    public static void queryStudents(ArrayList<mainho> base) {
        // 1. Judge whether there is data in the set, if not, give a prompt directly
        if(base.size() == 0){
            System.out.println("no message, Please add and query again");
            return;
        }

        // 3. Traverse the collection, get the information of each student object, and print it on the console
        for (int i = 0; i < base.size(); i++) {
            mainho stud1 = base.get(i);
         //mainho stud =new mainho() {
         //   };
            System.out.println("=============================");
            System.out.println("=============================");
            System.out.println("Marksheet of Grade :"+stud1.getGrade()+" , "+stud1.getSchool());
            System.out.println("=============================");
            System.out.println("Roll :"+stud1.getRoll()+"   "+"Name :"+ stud1.getName() );
            System.out.println("-----------------------------");
            System.out.println("Subject      Marks");

            System.out.println("-----------------------------");

            System.out.println("Science    :"+stud1.getSci() );
            System.out.println("English    :"+stud1.getM1() );
            System.out.println("Maths      :"+stud1.getMaths() );
            System.out.println("Nepali     :"+stud1.getM2() );
            System.out.println("-----------------------------");
            System.out.println("Total :"+stud1.getTotal() );
            System.out.println("=============================");


        }
    }

    // How to add students
    public static void addStudent(ArrayList<mainho> base) {
       for (int i=0; i<5; i++){
           Scanner sc = new Scanner(System.in);
           // 1. Give the input prompt information

           int roll;

           while(true){
               System.out.println("Enter Roll Number:");
               roll = sc.nextInt();

               int index = getIndex(base, roll);

               if(index == -1){
                   // sid does not exist, student number can be used
                   break;
               }
           }

           System.out.println("Name:");
           String name = sc.next();
           System.out.println("School Name:");
           String school = sc.next();

           System.out.println("Student's grade:");
           int grade = sc.nextInt();
           System.out.println("Enter Science marks :");
           int sci = sc.nextInt();
           System.out.println("Enter English Marks :");
           int m1 = sc.nextInt();
           System.out.println("Enter Maths Marks :");
           int maths = sc.nextInt();
           System.out.println("Enter Nepali Marks :");
           int m2 = sc.nextInt();
            int total=m2+m1+sci+maths;
           // 2. Encapsulate the information entered by the keyboard as the student object
           mainho stud1 = new mainho(name, roll, grade, sci, maths, m1, m2, total, school);
           // 3. Add the encapsulated Student object to the collection container
           base.add(stud1);
           // 4. Give the message of adding success
           System.out.println("Added successfully!");
       }
    }






    public static int getIndex(ArrayList<mainho> base, int roll) {
        // 1. Suppose the incoming student number does not exist in the set
        int index = -1;
        // 2. Traverse the collection, get each student object, ready to search
        for (int i = 0; i < base.size(); i++) {
            mainho stud1 = base.get(i);
            // 3. Get the student number of each student
            int id = stud1.getRoll();
            // 4. Use the obtained student number to compare with the incoming student number
            if (id==roll) {
                // Existence: let the index variable record the correct index position
                index = i;
            }
        }
        return index;
    }


    }
