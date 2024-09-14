package Management;

import Model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author THINH
 */
public class Manager {

    List<Product> pList = new ArrayList();

    public void createProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product id:");
        String id = sc.nextLine();
        System.out.println("Enter product name:");
        String name = sc.nextLine();
        System.out.println("Enter brand id:");
        String bId = sc.nextLine();
        System.out.println("Enter category id:");
        String cId = sc.nextLine();
        System.out.println("Enter model year:");
        int modelYear = sc.nextInt();
        System.out.println("Enter price:");
        int price = sc.nextInt();

        pList.add(new Product(id, name, bId, cId, modelYear, price));
        System.out.println("Product created");

    }

    public List<Product> searchProductbyName(String input) {
        //tao 1 array chua cac san pham cung ten
        List<Product> checkResult = new ArrayList();
        
        if (pList == null || pList.isEmpty()) {
            // Kiểm tra danh sách sản phẩm ban đầu có rỗng không
            System.out.println("Initial list has no product");
            return checkResult;  // Trả về danh sách rỗng thay vì null tránh lỗi
        }
        
        for (Product product : pList) {
            if (product.getName().contains(input)) {
                checkResult.add(product);
            }
        }
        if (checkResult.size() == 0) {
            System.out.println("Have no any product");
            return null;
        } else {
            return checkResult;
        }
    }

    public List<Product> searchProductbyId(String input) {
        // Khởi tạo danh sách để lưu kết quả tìm kiếm
        List<Product> checkResult = new ArrayList();

        if (pList == null || pList.isEmpty()) {
            // Kiểm tra danh sách sản phẩm ban đầu có rỗng không
            System.out.println("Initial list has no product");
            return checkResult;  // Trả về danh sách rỗng thay vì null tránh lỗi
        }

        // Tìm sản phẩm theo ID
        for (Product product : pList) {
            if (product.getId().equals(input)) {
                checkResult.add(product);
            }
        }

        // Nếu không tìm thấy sản phẩm nào
        if (checkResult.isEmpty()) {
            System.out.println("No products found with the given ID.");
        }

        return checkResult;  // Trả về danh sách (có thể rỗng)
    }

    public void updateProduct(String input) {
        List<Product> updateProduct = searchProductbyId(input);

        if (updateProduct == null || updateProduct.isEmpty()) {
            System.out.println("Product not found.");
            return;
        }

        Product productToUpdate = updateProduct.get(0);
        System.out.println("Current information: " + productToUpdate.toString());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter new product id (or press Enter to skip):");
        String id = sc.nextLine();
        if (!id.isEmpty()) {
            productToUpdate.setId(id);
            System.out.println("Update successed");
        } else {
            System.out.println("Update failed");
        }

        System.out.println("Enter new product name (or press Enter to skip):");
        String name = sc.nextLine();
        if (!name.isEmpty()) {
            productToUpdate.setName(name);
        }

        System.out.println("Enter new brand id (or press Enter to skip):");
        String bId = sc.nextLine();
        if (!bId.isEmpty()) {
            productToUpdate.setbId(bId);
        }

        System.out.println("Enter new category id (or press Enter to skip):");
        String cId = sc.nextLine();
        if (!cId.isEmpty()) {
            productToUpdate.setcId(cId);
        }

        System.out.println("Enter new model year (or -1 to skip):");
        int modelYear = sc.nextInt();
        if (modelYear != -1) {
            productToUpdate.setModelYear(modelYear);
        }

        System.out.println("Enter new price (or -1 to skip):");
        int price = sc.nextByte();
        if (price != -1) {
            productToUpdate.setPrice(price);
        }
        System.out.println("Product updated successfully.");
        System.out.println("Updated information: " + productToUpdate.toString());

        
    }
   
     public void deleteProductbyId(String input) {
        List<Product> deleteProduct = searchProductbyId(input);

        if (deleteProduct.isEmpty()) {
            System.out.println("Product not found.");
            return;
        }
        
        Product productToDelete = deleteProduct.get(0);
        System.out.println("Deleting current information: " + productToDelete.toString());
        
        if (pList != null && pList.contains(productToDelete)) {
            pList.remove(productToDelete);
            System.out.println("Delete success.");
        } else {
            System.out.println("Product could not be found in the main list.");
        }
    }
}
   
