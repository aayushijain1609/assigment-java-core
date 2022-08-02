package assigment4;
public class account {
  static int balance=1000;
  /**
   * @param debit
   */
  public static void withdraw(int debit)  {
    balance=debit;
  }
}
