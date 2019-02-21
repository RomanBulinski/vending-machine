package VendingMachineControl;

import Model.Coin;
import Model.Machine;
import Model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VendingMachineMethods {

//    List<Coin> myCoinsInMachine = new ArrayList<>();
//    List<Coin> coinsInMachine = new ArrayList<>();
//    List<Product> productsinMachine = new ArrayList<>();

    private double quartersValue = 0.25;
    private double dimesValue = 0.10;
    private double nickelsValue = 0.05;

    public boolean checkIfInserted( Coin coin ){
        if( coin==null ) {
            return  false;
        }
        return  true;
    }

    public boolean checkIfICoinValid( Coin coin ){
        if( coin.getType()!= "pennies" ) {
            return  true;
        }
        return  false;
    }

    public Coin returnUnvalidCoin( Coin coin ){
        Coin result = null;
        if( !checkIfICoinValid( coin ) ){
            result = coin;
        }
        return result;
    }

     public String displayCurrentAmountOfMany( List<Coin> coinsBank ){
        double sumOfCoins = 0;
        for( Coin coin : coinsBank ){
            String type = coin.getType();
                if( type =="quarters" ){
                    sumOfCoins = sumOfCoins + quartersValue;
                }
                if( type =="dimes" ){
                    sumOfCoins = sumOfCoins + dimesValue;
                }
                if( type =="nickels" ){
                    sumOfCoins = sumOfCoins + nickelsValue;
                }
        }
        sumOfCoins=new BigDecimal(sumOfCoins).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return Double.toString(sumOfCoins);
     }


    public String checkIfBankIsEmpty( List<Coin> coinsBank ){
        String result = "";
        if(coinsBank.size()==0){
            result = "INSERT COIN";
        }
        return result;
    }

    public List<Coin> coinsReturn ( Product product, List<Coin> myCoinsBank ){
        int returnAmountOfquarters = 0;
        int returnAmountOfdimes = 0;
        int returnAmountOfnickels = 0;
        double moneyBack = 0.0;
        List<Coin> coinsReturn = new ArrayList<>();
        double price = product.getPrice();
        double moneyInBank = Double.valueOf(  displayCurrentAmountOfMany( myCoinsBank ) );

        if( price < moneyInBank  ){
            moneyBack = moneyInBank - price;
        }
        if ( moneyBack > quartersValue ){
            returnAmountOfquarters = (int)(moneyBack/quartersValue);
            for(int i =0; i < returnAmountOfquarters; i++){
                coinsReturn.add( new Coin( "quarters" ) );
            }
            moneyInBank = moneyInBank- (returnAmountOfquarters*quartersValue);
        }
        if ( moneyInBank > dimesValue ){
            returnAmountOfdimes = (int)(moneyBack/dimesValue);
            for(int i =0; i < returnAmountOfdimes; i++){
                coinsReturn.add( new Coin("dimes") );
            }
            moneyInBank = moneyInBank -(returnAmountOfdimes*dimesValue);
        }
        if ( moneyInBank > nickelsValue ){
            returnAmountOfnickels = (int)(moneyBack/nickelsValue);
            for(int i =0; i < returnAmountOfnickels; i++){
                coinsReturn.add( new Coin("nickels") );
            }
//            moneyInBank = moneyInBank- (amountOfnickels*dimesValue);
        }
        return coinsReturn;
    }

    public boolean checkAvalibilityOfProduct( Product product, List<Product> productsinMachine  ){
        for(int i =0 ; i<productsinMachine.size(); i++ ){
            if( productsinMachine.get(i).getName().equals( product.getName() ) ){
                return true;
            }
        }
        return false;
    }

    public double getPriceOfProduct( Product product){
        return product.getPrice();
    }

    public boolean ifEnoughMoneyInsrtet( Product product, List<Coin> coinsBank ){
        double price = product.getPrice();
        double myMoney = Double.valueOf( displayCurrentAmountOfMany( coinsBank ));
        if( myMoney > price ){
            return true;
        }
        return false;
    }


    public boolean insertCoinIntoMachine( Coin coin, List<Coin> myCoinsInMachine  ){
        int startsize = myCoinsInMachine.size();
        if( checkIfICoinValid( coin ) ){
            myCoinsInMachine.add(coin);
        }
        int endsize = myCoinsInMachine.size();
        if( endsize==startsize+1){
            return true;
        }
        return false;
    }




//    public List<Coin> getProduct ( Product product, List<Coin> myCoinsBank ) {
//
//    }





//    There are three products: cola for $1.00, chips for $0.50, and candy for $0.65.
//    When the respective button is pressed and enough money has been inserted,
//    the product is dispensed and the machine displays THANK YOU.
//    If the display is checked again, it will display INSERT COIN and the current amount
//    will be set to $0.00. If there is not enough money inserted then
//    the machine displays PRICE and the price of the item and subsequent checks of the display
//    will display either INSERT COIN or the current amount as appropriate.







}
