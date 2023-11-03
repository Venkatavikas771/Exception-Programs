import java.util.*;

class InvalidScoreException {
  InvalidScoreException(String s) {
    super(s);
  }
}

class InvalidScoreException {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your score to check eligibility: ");
    int sc = sc.nextInt();
    try {
      if (sc < 70) {
        throw new InvalidScoreException();
      } else {
        System.out.println("Great, you are eligible to join in bitLabs.");
      }

    } catch (InvalidScoreException e) {
      e.getMessage();
    }
  }
}
