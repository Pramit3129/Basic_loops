import java.util.Scanner;

public class sum_of_digits_of_a_given_no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("The sum of the digits of the number is: "+sum);
    }
}
