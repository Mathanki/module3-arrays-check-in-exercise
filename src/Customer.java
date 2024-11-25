import java.util.Scanner;

public class Customer {
    String firstName, lastName;
    String[] customers = new String[5];


    public void inputCustomerData(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Enter first name for customer " + (i+1) + ": ");
                firstName = scanner.nextLine().trim();
                if (firstName.isEmpty()) {
                    System.out.println("Please enter a valid first name. Please try again.");
                }
            } while (firstName.isEmpty());

            do {
                System.out.print("Enter last name for customer " + (i+1) + ": ");
                lastName = scanner.nextLine().trim();
                if (lastName.isEmpty()) {
                    System.out.println("Please enter a valid first name. Please try again.");
                }
            } while (lastName.isEmpty());

            customers[i] = firstName + " " + lastName;
        }
        scanner.close();
    }

    public void displayCustomerData(){
        for(String fullName : customers){
            System.out.println("Full name " + fullName);
        }
    }


}
