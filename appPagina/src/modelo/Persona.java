/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 411pc20
 */
public class Persona {
    
    private String id ;
    private String nombre;
    private String clave;
    private String apellido;

    public Persona(String id, String nombre, String clave, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getApellido() {
        return apellido;
    }

    
    
    
    
    
    
    
    
}
