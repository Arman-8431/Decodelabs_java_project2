import java.util.Scanner;
public class Decodelabs_java_p2 {
    public static void main(String[] args) {
        String[] arr={"java","soft skill","c langauge","py language","maths","data structure"};
        int[] num=new int[6];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        double avg;
        System.out.print("Enter Student name =  ");

        String name = sc.nextLine();
         System.out.println();
        System.out.println("----- - Welcome to (GRADE) Calculator ----- -");
        System.out.println( );
        System.out.println("enter Subject marks between 1 to 100");
        for(int i=0;i<6;i++){
            System.out.print(arr[i] +"=");
            num[i]=sc.nextInt();
            if(num[i]<0 || num[i]>100){
                System.out.println("invalid marks!");
                i--;
            }
        }
        System.out.println("------");
        for(int i=0;i<6;i++){
            sum+=num[i];
        }
        System.out.println("total marks =" + sum);
        avg=(double)sum/6;
        System.out.println("------Percentage section------- ");
        System.out.println("average percentage = " + avg+"%");

        System.out.println("--------Grade section--------");
        if(avg>=80){
            System.out.println("Grade: A");
        }
        else if(avg>=60){
            System.out.println("Grade: B");
        }
        else if(avg>=40){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("fail");
        }
        sc.close();
    }
}
