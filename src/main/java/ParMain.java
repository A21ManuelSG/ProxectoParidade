
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
        int numeroProba=lerNumero(in);
        System.out.println(comprobarParidade(numeroProba));
    }

    static String comprobarParidade(int numeroProba) {
        String resultado;
        if (numeroProba%2==0){
            resultado=O_NUMERO_E_PAR;
        }else{
            resultado=O_NUMERO_E_IMPAR;
        }
        return resultado;
    }
    private static final String O_NUMERO_E_IMPAR = "O número é impar";
    private static final String O_NUMERO_E_PAR = "O número é par";

    private static int lerNumero(Scanner in) {
        System.out.println("Introduce un número: ");
        int numeroProba=in.nextInt();
        return numeroProba;
    }
}
