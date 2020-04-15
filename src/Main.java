public class Main {
    private static AccountExample accountExample = new AccountExample();

    public static String[] validAccount = {"thinh123123_", "_abc123", "______", "123456", "abcdefgh"};
    public static String[] inValidAccount = {".@", "        ", "1234_", "Thinh"};

    public static void main(String[] args) {
        for (String account : validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account: " + account + " is valid: " + isValid);
        }

        for (String account: inValidAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account: " + account + " is valid: " + isValid);
        }

    }
}
