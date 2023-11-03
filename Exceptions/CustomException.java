import java.util.Scanner;

class InsufficientFundException extends Exception {
  InsufficientFundException(String msg) {
    super(msg);
  }
}

class Bank {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the choice \n1.Deposit the money \n2.Withdraw the money\n3.Check the balance");
    int choice = sc.nextInt();
int balance=0;
    switch (choice) {
      case 1:
        System.out.println("Enter the Money to deposit");
        int dep = sc.nextInt();
        balance=balance+dep;
        System.out.println("Deposited successfully");
        break;
      case 2:
        try {
          System.out.println("Enter the withdraw balance");
          int b = sc.nextInt();
          if (balance < b) {
            throw new InsufficientFundException("Insufficient balance");
          } else {
            System.out.println("Eligible to withdraw");
          }
        } catch (InsufficientFundException e) {
          System.out.println("Exception caught :" + e.getMessage());
        }
         break;
      case 3:
         System.out.println("Total balance is :"+balance);
         break;
      default:
        System.out.println("Enter the correct input");
    }
  }
}
