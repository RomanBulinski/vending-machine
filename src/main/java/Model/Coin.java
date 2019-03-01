package Model;

public class Coin {

        String type;
    //     nickels;dimes;quarters;pennies;
        boolean valid;
        int weight;
        double value;
    //      0 < weight < 50 ;

    public Coin(int weight) {
        this.weight = weight;
        if( 40 < weight  ){
            type = "quarters";
            value = 0.25;
            valid =true;
        }
        if( 20 < weight  && weight <= 30  ){
            type = "dimes";
            value = 0.10;
            valid =true;
        }
        if( 10 < weight  && weight <= 20  ){
            type = "nickels";
            value = 0.05;
            valid =true;
        }
        if( weight <= 10 ){
            type = "pennies";
            valid =false;
        }
    }

    public Coin( String type ) {
        this.type = type;
        if( type == "quarters"){
            value = 0.25;
        }
        if( type == "dimes" ){
            value = 0.10;
        }
        if( type == "nickels" ){
            value = 0.05;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }




}
