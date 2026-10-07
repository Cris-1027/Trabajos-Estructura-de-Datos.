package com.mycompany.inventoryapp;

/**
 *
 * @author prestamo
 */
public class Product {
    
    private int ID;
    private String name;
    private int existence;
    private double price;
    
public Product(int ID){
   this.ID = ID;
}

    public Product(int ID, String name, int existence, double price) {
        this.ID = ID;
        this.name = name;
        this.existence = existence;
        this.price = price;  
    }
    
public int getID() {
    return ID;
}    
public String getname() {
    return name;
}
public int getExistence() {
    return existence;
}
public double getPrice() {
    return price;
}

public void setID(int ID) {
    this.ID = ID;
}
public void setName(String name) {
    this.name = name;
}
public void setPrice(double price) {
    this.price = price;
}

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return this.ID == other.ID;
    }

    @Override
    public String toString() {
        return "Product{" + "ID=" + ID + ", name=" + name + ", existence=" + existence + ", price=" + price + '}';
    }



}
