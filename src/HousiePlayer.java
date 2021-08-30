import java.util.Scanner;
import javax.swing.*;

public class HousiePlayer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = 0;
        int max = 0;
        try {
            System.out.println("enter min range");
            min = s.nextInt();
            System.out.println("Enter max Range");
            max = s.nextInt();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        if(min < 0 || max < 0 || max < min){
            System.out.println("min and max should be greater than 0 and max should be >= min");
        }
        s.close();
        RandomNumberGenerator generator = new HousieNumberGenerator();
        for(int i=min; i<=max; i++) {
            System.out.println(generator.generateRandomNumber(min, max));
        }
    }
}
