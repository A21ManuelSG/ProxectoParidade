
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class ParMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numeroProba=in.nextInt();
        if (numeroProba%2==0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
    }
}
