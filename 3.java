import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int m = input.nextInt();
    if(m % 3 == 0 && m % 5 == 0){
        System.out.println("Good Number");
    } 
    else if(m % 3 == 0 && m % 5 != 0){
        System.out.println("Bad Number");
    }
    else if(m % 3 != 0 && m % 5 == 0){
        System.out.println("Bad Number");
    }
    else{
        System.out.println("-1");
    }
  }
}
