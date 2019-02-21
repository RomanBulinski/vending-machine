import Model.Coin;
import Model.Product;
import VendingMachineControl.VendingMachine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVendingMachine {

    VendingMachine vendingMachine = new VendingMachine();
    Coin coin;


    @Test
    public void testIfNoCoinWasInserted(){
        assertFalse(vendingMachine.checkIfInserted( null ));
    }

    @Test
    public void testifCoinWasInserted(){
        coin = new Coin(45);
        assertTrue(vendingMachine.checkIfInserted( coin ));
    }

    @Test
    public void testifCoinIsValid(){
        coin = new Coin(45);
        assertTrue(vendingMachine.checkIfICoinValid( coin ));
    }

    @Test
    public void testifCoinIsUnvalid(){
        coin = new Coin(5);
        assertFalse(vendingMachine.checkIfICoinValid( coin ));
    }

    @Test
    public void testifReturnUnvalidCoin(){
        coin = new Coin(5);
        assertEquals( coin, vendingMachine.returnUnvalidCoin( coin ));
    }

    @Test
    public void testifReturnNullWhenValialidCoin(){
        coin = new Coin(25);
        assertEquals( null, vendingMachine.returnUnvalidCoin( coin ));
    }

    @Test
    public void testifDisplayCurrentAmountOfMany(){
        List<Coin> coinsBank = new ArrayList<>();
        coinsBank.add(new Coin(22));
        coinsBank.add(new Coin(11));
        assertEquals( "0.15",vendingMachine.displayCurrentAmountOfMany( coinsBank ));
    }

    @Test
    public void testifIfbankIsEmptyDisplayINSERTCOIN(){
        List<Coin> coinsBank = new ArrayList<>();
        assertEquals( "INSERT COIN",vendingMachine.checkIfBankIsEmpty( coinsBank ));
    }

    @Test
    public void testCoinsReturn(){
        Product cola = new Product("cola");
        List<Coin> myCoinsBank = new ArrayList<>();
        myCoinsBank.add( new Coin("quarters"));
        myCoinsBank.add( new Coin("quarters"));
        myCoinsBank.add( new Coin("quarters"));
        myCoinsBank.add( new Coin("dimes"));
        myCoinsBank.add( new Coin("dimes"));
        myCoinsBank.add( new Coin("dimes"));

        String moneyReturn = vendingMachine.displayCurrentAmountOfMany( vendingMachine.coinsReturn( cola, myCoinsBank ) );
        assertEquals( "0.05", moneyReturn );
    }

    @Test
    public void testAvalibilityOfProduct(){
        List<Product> productsinMachine = new ArrayList<>();
        productsinMachine.add( new Product("cola"));
        productsinMachine.add( new Product("chips"));
        Product cola = new Product("cola");
        assertTrue( vendingMachine.checkAvalibilityOfProduct( cola, productsinMachine   ) );
    }

    @Test
    public void testgetPriceOfProduct( ){
        Product product = new Product("cola");
        assertEquals( 1.00, vendingMachine.getPriceOfProduct( product ) );
    }

    @Test
    public void testcheckIfenoughMoneyForToBuy( ){
        Product product = new Product("chips");
//            price of chips = 0.50
        List<Coin> myCoinsInMachine = new ArrayList<>();
        myCoinsInMachine.add( new Coin("quarters"));
        myCoinsInMachine.add( new Coin("dimes"));
        myCoinsInMachine.add( new Coin("dimes"));
        myCoinsInMachine.add( new Coin("dimes"));
        assertTrue( vendingMachine.ifEnoughMoneyInsrtet( product, myCoinsInMachine ) );
    }

    @Test
    public void testIfInsertCoinIntoMachine( ){
        List<Coin> myCoinsInMachine = new ArrayList<>();
        Coin coin = new Coin("quarters");
        myCoinsInMachine.add( coin );
        assertTrue( vendingMachine.insertCoinIntoMachine(  coin, myCoinsInMachine  ) );
    }




}
