package VendingMachineControl;

import Model.Coin;
import Model.Machine;
import Model.Product;
import View.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VendingControl {

    View view;
    Product product;
    Coin coin;
    Machine machine = new Machine();

    List<String> menu = Arrays.asList("Insert coins", "Select product", "Buy productv" );

    public void mainMeny(){

    }

    public VendingControl(){
        view = new View();
    }

    public void controler (){

        Scanner input = new Scanner(System.in);
        int flag = 0;
        while(flag==0) {

            view.printline("");
            view.printline("Choose number :");
            view.printline("");
            view.printArrayList(menu);

            int number = input.nextInt();
            switch (number) {

                case 1:

                    List<String> coins = Arrays.asList( "nickels", "dimes", "quarters", "pennies" );

                    view.printline("You can insert ");
                    view.printline(" ");

                    view.printArrayList(coins);

//                    nickels;dimes;quarters;pennies;

                    break;

                case 2:
                    view.printline("----------2:");

                    break;

                case 3:
                    view.printline("----------3:");

                    break;
                case 4:
                    view.printline("----------4:");
                    break;
            }
        }
    }

}



