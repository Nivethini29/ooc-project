
import java.util.*;
public class Sorting_pro {

    public static void main(String[] args) {
            
        int[] data=new int[]{3423,4,3,42,3,6,4,8,3,2,3,2,34,2,348,8,234,2,2,3,54,7,56,85,35,4,5};
        Arrays.sort(data);
        System.out.println("Asc order");
        for(int i=0;i<data.length;i++){
        System.out.print(" "+data[i]+",");
        }
        
        System.out.println("\nDesc order");
        for(int i=data.length-1;i>=0;i--){
        System.out.print(" "+data[i]+",");
        }

    }
    
}
