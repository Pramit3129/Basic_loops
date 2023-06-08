import java.util.Scanner;

public class reversing_digit_of_a_no {
    public  static void main(String[] args){
        int res=0;
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt();
        while(no !=0){ //repeating until the original number becomes 0
            res=(res*10+(no%10)); //  pattern observed is ( res*10 + last digit) while reversing the number
            no/=10;
        }
        System.out.println("Reversed number: "+res);
    }
}
