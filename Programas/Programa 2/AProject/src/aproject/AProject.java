/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aproject;

import java.util.Iterator;

 /**
 *
 * @author Julio
 */
public class AProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Automata a= new Automata();
        a.estados.add("q0");
        a.estados.add("q1");
        a.estados.add("q2");
        a.estados.add("q3");
        
        a.estados_finales.add("q1");
        a.estados_finales.add("q2");
        a.estados_finales.add("q3");
        
        Automata b = Automata.complemento(a);
        
        System.out.println("Los estados finales son : ");
        Iterator itr = b.estados_finales.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        
    }
}
