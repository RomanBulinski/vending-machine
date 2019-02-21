package Model;

import java.util.ArrayList;
import java.util.List;

public class Machine {

    List<Coin> coinsInMachine = new ArrayList<>();
    List<Product> productsinMachine = new ArrayList<>();

    public List<Coin> getCoinsInMachine() {
        return coinsInMachine;
    }

    public void setCoinsInMachine(List<Coin> coinsInMachine) {
        this.coinsInMachine = coinsInMachine;
    }

    public List<Product> getProductsinMachine() {
        return productsinMachine;
    }

    public void setProductsinMachine(List<Product> productsinMachine) {
        this.productsinMachine = productsinMachine;
    }
}
