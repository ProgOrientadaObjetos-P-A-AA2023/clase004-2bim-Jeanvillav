/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;


import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Persona {
    private String nombre;
    private int edad;
    private Ciudad ciudad;
    
    public Persona(String n, int e, Ciudad c){
        nombre = n;
        edad = e;
        ciudad = c;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
     public void establecerCiudad(Ciudad n){
        ciudad = n;
    }
    
    public void establecerEdad(int n){
        edad = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerEdad(){
        return edad;
    }
    

    @Override
    public String toString() {
      String cadena= String.format("%s %d %s",nombre, edad,ciudad.obtenerNombre());
      return cadena;
    }
    
}
