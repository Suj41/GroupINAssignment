package practice;



import java.util.ArrayList;
import java.util.*;
public class Bachho {

    private ArrayList<BachhokoMarks> name;
   // private ArrayList<SubjectMarks> subjectMarks;


    public Bachho() {

    }

    public Bachho( ArrayList<BachhokoMarks> name) {

        this.name = name;
      //  this.subjectMarks = subjectMarks;

    }



    public ArrayList<BachhokoMarks> getName(){
        return name;
    }
    public void setName(ArrayList<BachhokoMarks> name){
        this.name = name;
    }


}
