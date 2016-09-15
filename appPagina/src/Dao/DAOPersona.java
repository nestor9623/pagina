/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.ArrayList;
import java.util.logging.Logger;
import modelo.Persona;

/**
 *
 * @author 411pc20
 */
public class DAOPersona {
    
   private ArrayList<Persona> arregloPersonas;

    public ArrayList<Persona> getArregloPersonas() {
        return arregloPersonas;
    }

    public DAOPersona() {
        this.arregloPersonas = new ArrayList<>();
    }
    
    
    public boolean adicionarPersona(Persona p){
        
        boolean estado = this.arregloPersonas.add(p);
        return estado;
    }
   
   public int obtenerCantidad(){
       
       return this.arregloPersonas.size();
       
   }
    
    
}
