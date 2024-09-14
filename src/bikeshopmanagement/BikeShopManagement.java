package bikeshopmanagement;

import Management.Manager;
import Model.Product;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author THINH
 */
public class BikeShopManagement {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean cont = false;

        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);

        do {
            Menu.printMenu();

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.createProduct();
                    cont = Menu.askToGoBack();
                    break;
                case 2:
                    System.out.print("Enter product name to search: ");
                    sc.nextLine();
                    String searchName = sc.nextLine();
                    List<Product> nameResults = manager.searchProductbyName(searchName);
                    if (nameResults != null) {
                        System.out.println("Result: " + nameResults.toString());
                    }
                    cont = Menu.askToGoBack();
                    break;

                case 3:

                    System.out.print("Enter product ID to update: ");
                    sc.nextLine();
                    
                    String updateId = sc.nextLine();
                    manager.updateProduct(updateId);
                    cont = Menu.askToGoBack();
                    break;
                case 4:
                    System.out.print("Enter product ID to delete: ");

                    sc.nextLine();
                    String deleteId = sc.nextLine();
                    manager.deleteProductbyId(deleteId);
                    cont = Menu.askToGoBack();
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (cont);
    }
}
