package aplicacao;
import java.util.Scanner;


public class UXHelper {
    private Scanner sc;


    public UXHelper() {
        sc = new Scanner(System.in);
    }

    public void print(String message){
        System.out.println(message);
    }
    
    public Integer getInt(){
        return sc.nextInt();
    }

    Double getDouble(){
        return sc.nextDouble();
    }

    String getString(){
        return sc.nextLine();
    }
}
