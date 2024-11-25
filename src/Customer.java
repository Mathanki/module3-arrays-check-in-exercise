import java.util.Scanner;

public class Customer {
    String firstName, lastName;
    String[] customers = new String[5];
    Scanner scanner = new Scanner(System.in);

    public void inputCustomerData(){
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Enter first name for customer " + (i+1) + ": ");
                firstName = scanner.nextLine();
            } while (firstName.isEmpty());

            do {
                System.out.print("Enter last name for customer " + (i+1) + ": ");
                lastName = scanner.nextLine();
            } while (lastName.isEmpty());

            customers[i] = firstName + " " + lastName;
        }

    }

    public void displayCustomerData(){
        for(String fullName : customers){
            System.out.println("Full name " + fullName);
        }
    }
}
