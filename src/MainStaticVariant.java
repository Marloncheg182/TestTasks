import java.util.ArrayList;

/**
 * @author Oleg Romanenchuk.
 * @version 1.0 from 12/15/2015.
 */
public class MainStaticVariant {
    public static ArrayList<AccountData> accounts = new ArrayList<>();
    public static void main(String[] args) {
        // Here i've created a simple collection for our AccountData

        accounts.add(new AccountData("Oleg", "2541", 100.12));
        accounts.add(new AccountData("Oleg", "2542", 2.3));
        accounts.add(new AccountData("Denis", "2563", 54.1));
        for (AccountData account : accounts) {
            System.out.println(account);
        }
        AccountData totalAccount = getTotalBallance(accounts.get(0));
        System.out.println("After sum up operation, balance :" + totalAccount);
        AccountData richAccount = getRicher(totalAccount, accounts.get(2));
        System.out.println("The richest bank user is : " + richAccount);
        AccountData poorAccount = getPoorest(totalAccount, accounts.get(2));
        System.out.println("The poorest bank user is : " + poorAccount);

    }


    public static AccountData getTotalBallance(AccountData accountData) {
        AccountData totalAccount = new AccountData(accountData);
        for (AccountData account : accounts) {
            if ((account.getUserName()).equals(totalAccount.getUserName())
                    && !(account.getUserAccount()).equals(totalAccount.getUserAccount())) {
                totalAccount.setCurrentBalance(totalAccount.getCurrentBalance() + account.getCurrentBalance());
            }
        }
        return totalAccount;
    }


    public static AccountData getRicher(AccountData accountData01, AccountData accountData02) {
        return (accountData01.getCurrentBalance() > accountData02.getCurrentBalance() ?
                accountData01 : accountData02);
    }


    public static AccountData getPoorest(AccountData accountData01, AccountData accountData02) {
        return (accountData01.getCurrentBalance() < accountData02.getCurrentBalance() ?
                accountData01 : accountData02);
    }
}
