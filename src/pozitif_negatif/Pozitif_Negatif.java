
package pozitif_negatif;
import java.util.Scanner;



public class Pozitif_Negatif {

    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz:");
        int sayi = reader.nextInt();
        
        if(sayi>0)
            System.out.println("Sayi pozitif++");
        else if(sayi<0)
            System.out.println("Sayi negatif--");
        else
            System.out.println("Sayiniz sifir00");
    }
    
}