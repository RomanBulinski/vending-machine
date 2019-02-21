package VendingMachineControl;

import Model.Coin;
import Model.Machine;
import Model.Product;
import View.View;

import java.util.Scanner;

public class VendingControl {

    View view;
    Product product;
    Coin coin;
    Machine machine = new Machine();

    public VendingControl(){
        view = new View();
    }

    public void controler (){

        Scanner input = new Scanner(System.in);
        int flag = 0;
        while(flag==0) {

            view.printline("Choose number 1-4 :");

            int number = input.nextInt();
            switch (number) {

                case 1:
                    view.printline("----------1:");


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



