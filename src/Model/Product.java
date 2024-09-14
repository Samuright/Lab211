/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author THINH
 */
public class Product {
    private String id;
    private String name;
    private String bId;
    private String cId;
    private int modelYear;
    private int price;

    
    public Product(String id, String name, String bId, String cId, int modelYear,int price) {
        this.id = id;
        this.name = name;
        this.bId = bId;
        this.cId = cId;
        this.modelYear = modelYear;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", bId=" + bId + ", cId=" + cId + ", modelYear=" + modelYear + '}';
    }
    
    
    
    
}
