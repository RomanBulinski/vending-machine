package View;

import java.util.List;

public class View {

    public void printline(String string){
        System.out.println(string);
    }

    public void printArrayList(List<String> arr){
        for( int i = 0; i<arr.size(); i++  ){
            System.out.println( i +1+" . "+ arr.get(i)  );
        }
    }


}
