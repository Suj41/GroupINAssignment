package practice;
import Group_Project.SubjectMarks;

import java.util.ArrayList;

import java.util.*;
public class DekhamTA {
    public static void main(String[] args) {

           func();


    }
    public static void func() {
        Scanner sc = new Scanner(System.in);
        String a;
        String b ;




        Bachho stud =new Bachho();
        Bachho stud1 = new Bachho();
        ArrayList <BachhokoMarks> name = new ArrayList<BachhokoMarks>();
        name.add(new BachhokoMarks("sujal", "shrestha"));
        name.add(new BachhokoMarks("suzal", "stha"));
        name.add(new BachhokoMarks("sujjal", "srestha"));

        stud.setName(name);

        System.out.println(stud.getName());
        System.out.println(" ");
        for(BachhokoMarks Name:stud.getName()){
            System.out.println(Name.getFname() + Name.getLname());
        }

    }
}
