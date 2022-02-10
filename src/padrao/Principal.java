package padrao;

import java.util.Scanner;
/**
 *
 * @author João Enrique
 */
public class Principal 
{
    public static Scanner teclado = new Scanner(System.in);
    public static int numero = 0;
    public static Tabuada tabuada = new Tabuada();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Tabuada");
        System.out.print("Informe um número para a tabuada: ");
        numero = teclado.nextInt();
        
        tabuada.CalcularTabuada(numero);
        // TODO code application logic here
    }
    
}
