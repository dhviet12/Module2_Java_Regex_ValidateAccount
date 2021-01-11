public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.validate("123abc_"));
        System.out.println(account.validate("_abc123"));
        System.out.println(account.validate("______"));
        System.out.println(account.validate("abcdef"));
        System.out.println(account.validate("123456"));
        System.out.println("------------------");
        System.out.println(account.validate(".@"));
        System.out.println(account.validate("12345"));
        System.out.println(account.validate("1234_"));
        System.out.println(account.validate("abcd"));
    }
}
