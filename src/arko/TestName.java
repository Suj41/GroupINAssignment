package arko;
import java.util.ArrayList;
import java.util.Scanner;

public class TestName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a collection container object
        ArrayList<Name> list = new ArrayList<>();

        to:
        while (true) {
            // 1. Build the main interface menu
            System.out.println("--------Welcome to the student management system--------");
            System.out.println("1 Add students");
            System.out.println("2 Delete students");
            System.out.println("3 Revise students");
            System.out.println("4 View students");
            System.out.println("5 sign out");
            System.out.println("Please enter your choice:");

            String choice = sc.next();

            switch (choice) {
                case "1":
                    //System.out.println("add student");
                    addStudent(list);
                    break;
                case "2":
                    //System.out.println("delete student");
                    deleteStudent(list);
                    break;
                case "3":
                    //System.out.println (the "revised student");
                    updateStudent(list);
                    break;
                case "4":
                    // System.out.println("view students");
                    queryStudents(list);
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
    public static void updateStudent(ArrayList<Name> list) {
        System.out.println("Please input the student number you want to modify:");
        Scanner sc = new Scanner(System.in);
        String updateSid = sc.next();
        // 3. Call getIndex method to find the index position of the student number in the collection
        int index = getIndex(list,updateSid);
        // 4. Judge whether the student number exists in the set according to the index
        if(index == -1){
            // Does not exist: prompt
            System.out.println("No information, Please re-enter");
        }else{
            // Presence: receiving new student information
            System.out.println("Please enter a new student name:");
            String name = sc.next();
            System.out.println("Please enter the new student age:");
            int age = sc.nextInt();
            System.out.println("Please enter a new student's birthday:");
            String birthday = sc.next();
            // Encapsulate as a new student object
            Name stu = new Name(updateSid, name, age, birthday);
            // Call the set method of the collection to complete the modification
            list.set(index, stu);
            System.out.println("Modified successfully!");
        }
    }

    // How to delete students
    public static void deleteStudent(ArrayList<Name> list) {
        // 1. Give prompt information (please input the student number you want to delete)
        System.out.println("Please enter the student number you want to delete:");
        // 2. The keyboard receives the student number to be deleted
        Scanner sc = new Scanner(System.in);
        String deleteSid = sc.next();
        // 3. Call getIndex method to find the index position of the student number in the collection
        int index = getIndex(list,deleteSid);
        // 4. Judge whether the student number exists in the set according to the index
        if(index == -1){
            // Does not exist: prompt
            System.out.println("No information, Please re-enter");
        }else{
            // Existing: delete
            list.remove(index);
            System.out.println("Successfully deleted!");
        }
    }

    // How to view students
    public static void queryStudents(ArrayList<Name> list) {
        // 1. Judge whether there is data in the set, if not, give a prompt directly
        if(list.size() == 0){
            System.out.println("no message, Please add and query again");
            return;
        }
        // 2. Presence: displays the header data
        System.out.println("Student number\t\t full name\t Age\t birthday");
        // 3. Traverse the collection, get the information of each student object, and print it on the console
        for (int i = 0; i < list.size(); i++) {
            Name stu = list.get(i);
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
        }
    }

    // How to add students
    public static void addStudent(ArrayList<Name> list) {
        Scanner sc = new Scanner(System.in);
        // 1. Give the input prompt information

        String sid;

        while(true){
            System.out.println("Please input student number:");
            sid = sc.next();

            int index = getIndex(list, sid);

            if(index == -1){
                // sid does not exist, student number can be used
                break;
            }
        }

        System.out.println("Please enter your name:");
        String name = sc.next();
        System.out.println("Please enter age:");
        int age = sc.nextInt();
        System.out.println("Please enter your birthday:");
        String birthday = sc.next();
        // 2. Encapsulate the information entered by the keyboard as the student object
        Name stu = new Name(sid,name,age,birthday);
        // 3. Add the encapsulated Student object to the collection container
        list.add(stu);
        // 4. Give the message of adding success
        System.out.println("Added successfully!");
    }

    /*
        getIndex : Receive a collection object, receive a student number

        Find the index position of the student number in the collection
     */
    public static int getIndex(ArrayList<Name> list, String sid){
        // 1. Suppose the incoming student number does not exist in the set
        int index = -1;
        // 2. Traverse the collection, get each student object, ready to search
        for (int i = 0; i < list.size(); i++) {
            Name stu = list.get(i);
            // 3. Get the student number of each student
            String id = stu.getSid();
            // 4. Use the obtained student number to compare with the incoming student number
            if(id.equals(sid)){
                // Existence: let the index variable record the correct index position
                index = i;
            }
        }

        return index;
    }
}


