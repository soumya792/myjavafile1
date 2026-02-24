import java.util.Scanner;

class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Check: ");
        int n = sc.nextInt();

        int temp = n; 
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = (reverse * 10) + digit;
            temp = temp / 10;
        }
            System.out.println("reversed num:"+ reverse );
        
        sc.close();
    }
}