package com.mycompany.proxectoparidade;


import java.util.Scanner;

/**
 * Comproba a paridade dun número enteiro
 * @author Manuel
 */
public class ParMain {
    
    private static final String O_NUMERO_E_IMPAR = "O número é impar";
    private static final String O_NUMERO_E_PAR = "O número é par";
    
    /**
     * Le un número da entrada estándar e comproba a súa paridade
     * Comproba a paridade dun número enteiro
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeroProba=lerNumero(entrada);
        System.out.println(comprobarParidade(numeroProba));
    }
    
    /**
     * Indica se o numeroProba é par ou impar
     * @param numeroProba número enteiro a comprobar
     * @return cadea indicando a paridade
     */
    static String comprobarParidade(int numeroProba) {
        String resultado;
        if (verificaPar(numeroProba)){
            resultado=O_NUMERO_E_PAR;
        }else{
            resultado=O_NUMERO_E_IMPAR;
        }
        return resultado;
    }
    
    /**
     * Verifica se numeroProba é par
     * @param numeroProba número enteiro a comprobar
     * @return boolean con valor true se o número é par
     */ 
    static boolean verificaPar(int numeroProba) {
        return numeroProba%2==0;
    }

    /**
     * Le número da entrada estándar
     * @param in representa a entrada estándar
     * @return enteiro inserido polo usuario
     */
    private static int lerNumero(Scanner in) {
        System.out.println("Introduce un número: ");
        return in.nextInt();
    }
}
