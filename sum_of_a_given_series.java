import java.util.Scanner;

public class sum_of_a_given_series {
    public static void main(String[] args){
        //the series is 1-2+3-4+5-6+7-8....n
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Upto which number do you want to continue the series?");
        int n = sc.nextInt();
        System.out.println("The series went like: ");
        for(int i=1;i<=n;i++){
            if((i%2)==0) {
                sum -= i;
                System.out.print("-"+i);
            }
            else{
                sum+=i;
                System.out.print("+"+i);
            }
        }
        System.out.println(" ");
        System.out.println("The sum of the series is : "+sum);
    }
}
