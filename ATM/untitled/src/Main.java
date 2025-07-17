public class Main {

    public static void main(String[] args) {

        int balance = 2000;
        int choice = 2;
        boolean isRunning = true;


        while (isRunning) {
            System.out.println("\n");
            System.out.println("--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("\n");
            System.out.println("Executing option: " + choice);

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + balance);
                    isRunning = false;
                    break;

                case 2:
                    int depositAmount = 2000;
                    System.out.println("Depositing: " + depositAmount);
                    balance += depositAmount;
                    System.out.println("New Balance: " + balance);
                    isRunning = false;
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
                    isRunning = false;
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