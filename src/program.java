public class program {



    public static void main(String[] args) throws Exception {
        Account bank = new Account();
        bank.deposit(100);
        System.out.println("Balance after deposit:");
        System.out.println(bank.getAccount_balance());
        bank.withdraw(99);
        System.out.println("Balance after withdraw:");
        System.out.println(bank.getAccount_balance());
    }

}
