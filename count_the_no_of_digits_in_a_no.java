import java.util.Scanner;
public class count_the_no_of_digits_in_a_no {
    public static void main(String[] args){
        int cnt=0;
        Scanner sc = new Scanner(System.in);
         int no= sc.nextInt();
        while(no !=0){
            no/=10;
            cnt+=1;
        }
        System.out.println("Total digits in the number: "+cnt);
    }
}
