/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package funciones;

/**
 *
 * @author juliocesar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          long[] array = new long[2];
          Main.funcion( 10 , array );
          for( int i=0 ; i<array.length; i++ )
          {
            System.out.println(array[i]);
          }
    }

    public static void funcion(long n, long[] array ) // N -> NxN
    // array debe ser un arreglo vacio.
    {
        String string = Long.toString( n );
        string = new StringBuffer( string ).reverse().toString();

        long digitos[] = new long[string.length()];
        int dimension = array.length;
        int exponente = -1;

        for(int i = 0 ; i < digitos.length ; i++ )
        {
           digitos[i] = Integer.valueOf(string.charAt(i)) - 48;

           if(i % dimension == 0)
           {
               exponente++;
           }

           array[i%dimension] += digitos[i] * Math.pow(10, exponente);

        }

    }
    
    public static void funcion(long[] array, long n)
    {
        
    }

}
