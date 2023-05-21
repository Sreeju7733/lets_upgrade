import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int reversedNumber = 0;
    
    while(number>0){
        int digit = number % 10;
        reversedNumber = reversedNumber * 10 + digit;
        number /= 10;
    }
    if (reversedNumber == number){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
  }
}
