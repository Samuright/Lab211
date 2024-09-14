/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshopmanagement;

import java.util.Scanner;

/**
 *
 * @author THINH
 */
public class Menu {
    
    public static void printMenu(){
        System.out.println("1. Add a product.");
        System.out.println("2. Search product by product name, return a list of all products that same name.");
        System.out.println("3. Update product.");
        System.out.println("4. Delete product.");
        System.out.println("5. Save products to file");
        System.out.println("6. Print list products from the file");
        System.out.println("7. Quit.");
        }
    public static boolean askToGoBack(){
        
        boolean check = false;
        String choice;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Go back to menu ? [Y/N]");
        choice = sc.nextLine();
        if(choice.trim().equalsIgnoreCase("Y")||choice.trim().equalsIgnoreCase("N")){
            check = true;
        }else {
            System.out.println("Invalid choice");
        }
        }while (!check);
        return choice.equalsIgnoreCase("y");
    }
    
}
