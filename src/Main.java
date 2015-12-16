import java.util.*;

/**
 * @author Oleg Romanenchuk.
 * @version 1.0 from 12/15/2015.
 */

public class Main {
    public static void main(String[] args) {
        // Here i've created a simple collection for our AccountData
        ArrayList<AccountData> accounts = new ArrayList<>();
        accounts.add(new AccountData("Oleg", "2541", 100.12));
        accounts.add(new AccountData("Oleg", "2542", 2.3));
        accounts.add(new AccountData("Denis", "2563", 54.1));
        for (AccountData account : accounts) {
            System.out.println(account);
        }
        AccountData totalAccount = getTotalBallance(accounts.get(0), accounts);
        System.out.println("After sum up operation, balance :" + totalAccount);
        AccountData richAccount = getRicher(totalAccount, accounts.get(2));
        System.out.println("The richest bank user is : " + richAccount);
        AccountData poorAccount = getPoorest(totalAccount, accounts.get(2));
        System.out.println("The poorest bank user is : " + poorAccount);

    }

    /**
     * Method for summerize all balances of User
     *
     * @param accountData new Object wich contains full balance of User`s 2 accounts
     * @param accounts    source container of accounts
     * @return this method will return the total balance of User
     */
    public static AccountData getTotalBallance(AccountData accountData, ArrayList<AccountData> accounts) {
        AccountData totalAccount = new AccountData(accountData);
        for (AccountData account : accounts) {
            if ((account.getUserName()).equals(totalAccount.getUserName())
                    && !(account.getUserAccount()).equals(totalAccount.getUserAccount())) {
                totalAccount.setCurrentBalance(totalAccount.getCurrentBalance() + account.getCurrentBalance());
            }
        }
        return totalAccount;
    }

    /**
     * Method to determine the richest user in the bank system
     *
     * @param accountData01 account to compare
     * @param accountData02 account to compare
     * @return one of the params must be returned after comparing.
     */
    public static AccountData getRicher(AccountData accountData01, AccountData accountData02) {
        return (accountData01.getCurrentBalance() > accountData02.getCurrentBalance() ?
                accountData01 : accountData02);
    }

    /**
     * Method to determine the poorest user in the bank system
     *
     * @param accountData01 account to compare
     * @param accountData02 account to compare
     * @return one of the params must be returned after comparing.
     */
    public static AccountData getPoorest(AccountData accountData01, AccountData accountData02) {
        return (accountData01.getCurrentBalance() < accountData02.getCurrentBalance() ?
                accountData01 : accountData02);
    }
}


