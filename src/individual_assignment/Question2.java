package individual_assignment;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        if(a==b){
            System.out.println(0);
        }
         else{
            if(b%7==0){
                System.out.println(Math.min(a,b));
            } else{
                System.out.println(Math.max(a,b));
            }
        }
    }
}
