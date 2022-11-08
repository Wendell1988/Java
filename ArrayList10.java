package uscs10;

import java.util.ArrayList;


public class ArrayList10 {


    public static void main(String[] args) 
    {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        
        for (int i=1;i<11;i++)
            x.add(0,i);
        
        for (int i=1; i<6;i++)
            x.remove(i);
        
        for (int j=0; j<5; j++)
            y.add(j+100);
            
        x.addAll(x.size()/2,y);
        System.out.println(x.toString());
    }    
}
