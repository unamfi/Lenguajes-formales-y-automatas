/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aproject;

/**
 *
 * @author Julio
 */


import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Automata extends Object implements Cloneable
{
    
    HashSet<String> estados, alfabeto, estados_finales ;
    String estado_inicial;
    String funcion[][];
    
    
    
    public Automata()
    {
        estados = new HashSet(); 
        alfabeto = new HashSet();
        estados_finales = new HashSet();
    }
    
    public static Automata complemento(Automata automata) 
    {
        
        Automata _automata = null;
        Automata _automataModificable = null;
        
        try 
        {
            
            _automata = (Automata) automata.clone();
            _automataModificable = (Automata) automata.clone();
            
        } catch (CloneNotSupportedException ex) 
        {
            
           Logger.getLogger(Automata.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        _automataModificable.estados.removeAll(_automataModificable.estados_finales);
        
        _automata.estados_finales = _automataModificable.estados;
        
        return _automata;
    }
    
}


