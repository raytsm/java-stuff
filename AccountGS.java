public class AccountGS {
    static void main() {
        Account acc = new Account();

        acc.setId(100);
        acc.setCode("908379800");
        acc.setBalance(500);
        acc.setEnabled(true);

        System.out.println(acc.getId());
        System.out.println(acc.getCode());
        System.out.println(acc.getBalance());
        System.out.println(acc.isEnabled());
    }
}

class Account {
    private long id;
    private String code;
    private long balance;
    private boolean enabled;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}