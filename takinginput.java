import java.util.Scanner;

public class takinginput {


    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//system.in is used taking the input from userand create object of scanner
        System.out.println("enter the first number");
        int a=sc.nextInt();//2
        System.out.println("enetr the second number");
        int b=sc.nextInt();//3
        int area=a*b;
        System.out.println("the area of rectange is"+area);//
        
    }
}