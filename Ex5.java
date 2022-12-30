import java.util.Scanner;
public class Ex5 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three number: ");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        System.out.println("Three numbers are: "+num1+","+num2+","+num3);
        {
            if(num1>num2 && num1>num3)
            {
                System.out.print("Max is: "+num1);
            }
            else if(num2> num3 && num2>num1)
            {
                System.out.print("Max is: "+num2);
            }
            else if(num3> num1 && num3>num2)
            {
                System.out.print("Max is: "+num3);
            }
            else
            {
                System.out.print("ERROR");
            }
        }
    }
    
}
