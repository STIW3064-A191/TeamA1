import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        int num,reverse=0,remainder,temp;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        num=sc.nextInt();

        temp=num;
        while(temp!=0){
            remainder=temp%10;
            reverse =reverse*10+remainder;
            temp=temp/10;
        }
        if (num == reverse) // checking whether num is equal to reverse       
            System.out.printf("%d is a palindrome.", num);    
            else       
                System.out.printf("%d is not a palindrome.", num);
    }
}