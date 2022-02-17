package yoho;
import java.util.*;
public class Chhoro{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<baau> nati = new ArrayList<baau>();

       lo:
       while (true){
            System.out.println(" 1");
            System.out.println("2 ");
            System.out.println(" 3");
            System.out.println(" 4");
            System.out.println("5 ");
            System.out.println("6 ");
            System.out.println(" ");
            int value= sc.nextInt();
            switch (value){
                case 1:
                    funcadd(nati);
                    break;
                case 2:
                    funcview(nati);
                    break;
                case 3:
                    funcupd(nati);
                    break;
                case 4:
                    fundel(nati);
                    break;
                case 5:
                    break lo;
                default:
                    System.out.println("value chhaina");
                    break;
            }
        }


    }
    public static void fundel(ArrayList<baau> nati){
        Scanner sc= new Scanner(System.in);
        System.out.println("roll");
        int uprol= sc.nextInt();
        int index= getIndex(nati,uprol);
        if (index==-1) {
            System.out.println("value haal");

        }
        else{
            nati.remove(index);
        }
    }

    public static void funcupd(ArrayList<baau> nati){

        Scanner sc= new Scanner(System.in);
        System.out.println("roll");
        int delrol= sc.nextInt();
        int index = getIndex(nati,delrol);
        if(index==-1){
            System.out.println("value hal");
        }else{
            System.out.println("Name");
            String name= sc.next();
            baau ghar = new baau(name, delrol);
            nati.set(index, ghar);
        }
    }
    public static void funcview(ArrayList<baau> nati){
        Scanner sc= new Scanner(System.in);
        if (nati.size()==0){
            System.out.println("value haal");
            return;

        }
   for (int i= 0; i< nati.size(); i++){
       baau ghar = nati.get(i);
       System.out.println("Name "+ghar.getName());
       System.out.println(" Roll "+ghar.getRoll());
   }
    }
    public static void funcadd(ArrayList<baau> nati){
        Scanner sc= new Scanner(System.in);
        System.out.println("roll");
       int  roll= sc.nextInt();
        int index = getIndex(nati, roll);
        while (true){

            if (index==-1){
                break;
            }
        }
        System.out.println("name");
        String name = sc.next();
        baau ghar = new baau(name, roll);
        nati.add(ghar);

    }
    public static int getIndex(ArrayList<baau> nati, int roll){
        Scanner sc= new Scanner(System.in);
        int index=-1;
        for (int i=0; i<nati.size(); i++)
        {
            baau ghar = nati.get(i);
            int id= ghar.getRoll();
            if(id==roll){
                index=1;
            }
        }
        return index;
    }
}