/**
 * @author  Oleg Romanenchuk.
 * @version 1.0 from 12/15/2015.
 */
public class AccountData {
    private String userName;
    private String userAccount;
    private double currentBalance;
    public AccountData() {
    }
    public AccountData(String userName, String userAccount, double currentBalance) {
        this.userName = userName;
        this.userAccount = userAccount;
        this.currentBalance = currentBalance;
    }
    public AccountData(AccountData account) {
        this.userName = account.userName;
        this.userAccount = account.userAccount;
        this.currentBalance = account.currentBalance;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserAccount() {
        return userAccount;
    }
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }
    public double getCurrentBalance() {
        return currentBalance;
    }
    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
    @Override
    public String toString() {
        return "userName= " + userName +
                ", userAccount= " + userAccount +
                ", currentBalance= " + currentBalance;
    }
}