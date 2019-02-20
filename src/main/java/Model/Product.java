package Model;

public class Product {

//    cola for $1.00, chips for $0.50, and candy for $0.65

    String name = "";
    double price = 0;

    public Product(String name) {
        this.name = name;
        if ( name == "cola"){
            price = 1.00;
        }
        if ( name == "chips"){
            price = 0.50;
        }
        if ( name == "candy"){
            price = 0.65;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
