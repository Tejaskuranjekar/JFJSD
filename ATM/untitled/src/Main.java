public class Main {

    public static void main(String[] args) {

        int balance = 5000;
        int choice = 3;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("--------------------");
            System.out.println("Executing option: " + choice);
            System.out.println("--------------------");

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    int depositAmount = 2000;
                    System.out.println("Depositing: " + depositAmount);
                    balance += depositAmount;
                    System.out.println("New Balance: " + balance);
                    break;

                case 3:
                    int withdrawAmount = 1500;
                    System.out.println("Withdrawing: " + withdrawAmount);

                    if (balance >= withdrawAmount) {
                        balance -= withdrawAmount;
                        System.out.println("Remaining Balance: " + balance);
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    isRunning = false;
                    break;

                default:
                    isRunning = false;
                    break;
            }

            choice++;
            System.out.println("\n");
        }
    }
}