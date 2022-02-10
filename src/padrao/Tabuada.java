package padrao;

/**
 *
 * @author João Enrique
 */
public class Tabuada 
{
    private int contador;
    
    public Tabuada()
    {
    
    }
    
    public int getContador()
    {
        return contador;
    }
    
    public void setContador(int contador)
    {
        this.contador = contador;
    }
    
    void CalcularTabuada(int numero)
    {
        this.setContador(1);
        int result; 
        
        for (int contador = 2; this.getContador() <=10;)
        {
            result = this.getContador() * numero;
            System.out.println(this.getContador() + " X " + numero + " = " + result);
            
            this.setContador(this.getContador() + 1);
        }
    }
}
