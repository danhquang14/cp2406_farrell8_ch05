import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num=scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num1=scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num2=scanner.nextInt();
        if(num>num1&&num>num2){
            if (num1>num2){
                System.out.printf("Ascending order %d, %d, %d",num2,num1,num);
                System.out.println();
                System.out.printf("Descending order %d, %d, %d",num,num1,num2);
            }
            else {
                System.out.printf("Ascending order %d, %d, %d",num1,num2,num);
                System.out.println();
                System.out.printf("Descending order %d, %d, %d",num,num2,num1);
            }
        }
        if(num1>num&&num1>num2){
            if (num>num2){
                System.out.printf("Ascending order %d, %d, %d",num2,num,num1);
                System.out.println();
                System.out.printf("Descending order %d, %d, %d",num1,num,num2);
            }
            else {
                System.out.printf("Ascending order %d, %d, %d",num,num2,num1);
                System.out.println();
                System.out.printf("Descending order %d, %d, %d",num1,num2,num);
            }
        }
        if(num2>num1&&num2>num){
            if (num1>num){
                System.out.printf("Ascending order %d, %d, %d",num2,num1,num);
                System.out.println();
                System.out.printf("Descending order %d, %d, %d",num2,num1,num);
            }
            else {
                System.out.printf("Ascending order %d, %d, %d",num2,num,num1);
                System.out.println();
                System.out.printf("Descending order %d, %d, %d",num1,num,num2);
            }
        }
    }
}
