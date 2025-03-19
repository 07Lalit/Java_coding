import java.util.*;
import java.lang.*;

class Account {
    private String accountNo;
    private String name;
    private String address;
    private String phoneNo;
    private String dob;
    private String emailId;
    private double balance;

    public Account(String accountNo, String name, String address, String phoneNo, String dob, String emailId, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.emailId = emailId;
        this.balance = balance;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "\nAccount Number: " + accountNo +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nPhone Number: " + phoneNo +
                "\nDate of Birth: " + dob +
                "\nEmail: " + emailId +
                "\nBalance: " + balance;
    }
}

class SavingAccount extends Account {
    public SavingAccount(String accountNo, String name, String address, String phoneNo, String dob, String emailId, double balance) {
        super(accountNo, name, address, phoneNo, dob, emailId, balance);
			
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("\nDeposit amount: " + amount + ", Total balance: " + getBalance());
    }

    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("\nWithdraw amount: " + amount + ", Total balance: " + getBalance());
        } else {
            System.out.println("\nInsufficient balance to withdraw. Total balance: " + getBalance());
        }
    }
}

//class LoanAccount extends Account {
    // Additional methods specific to //LoanAccount can be added here
//}

public class inherit2 {
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount("420", "Lalit Gour", "Sehore", "6263330665", "06-09-2002", "gourlalit11@gmail.com", 1000.0);
        System.out.println(savings);

		savings.deposit(500.0);
		System.out.println(savings);
		savings.withdraw(1600);
		savings.withdraw(500);
		System.out.println(savings);
    }
}
