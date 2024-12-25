import java.util.Scanner;

public class exersise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sub1 marks: ");
        float sub1=sc.nextFloat();
        System.out.println("enter sub2 marks: ");
        float sub2=sc.nextFloat();
        System.out.println("enter sub3 marks: ");
        float sub3=sc.nextFloat();
        System.out.println("enter sub4 marks: ");
        float sub4=sc.nextFloat();
        System.out.println("enter sub5 marks: ");
        float sub5=sc.nextFloat();
        float persentage=(((sub1+sub2+sub3+sub4+sub5)/500)*100);
        System.out.println(persentage);

    }
    
}
