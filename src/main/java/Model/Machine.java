package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Machine {

    List<Coin> coinsInMachine = new ArrayList<>();
    List<Product> productsinMachine = new ArrayList<>();


    public Machine()  {
        List<Product> products = Arrays.asList( new Product("cola"), new Product("chips"), new Product("candy") );

        List<Coin> coins = Arrays.asList( new Coin("nickels"), new Coin("dimes"), new Coin("quarters"),
                new Coin( "nickels"), new Coin("dimes"), new Coin("quarters"),
                new Coin("nickels"), new Coin("dimes"), new Coin("quarters"));

        setCoinsInMachine(coins );
        setProductsinMachine( products );
    }


    public List<Coin> getUserCOins() {
        return userCOins;
    }

    public void setUserCOins(List<Coin> userCOins) {
        this.userCOins = userCOins;
    }

    List<Coin> userCOins = new ArrayList<>();

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
