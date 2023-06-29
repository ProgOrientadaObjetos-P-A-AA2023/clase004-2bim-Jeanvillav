/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Ciudad c1 = new Ciudad ("Loja");
        Ciudad c2 = new Ciudad("Madrid");
        Persona persona1 = new Persona("Rene",39,c1);
        Persona persona2 = new Persona("Santiago",20,c2);
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        
        
        OperacionesEstudiantes op1 = new OperacionesEstudiantes();
        op1.establecerEstudiante(personas);
               
        op1.establecerPromedioEdades();
        op1.establecerListaCiudadesEstudiantes();
        
        
        System.out.printf("Promedio edades: %.2f",op1.obtenerPromedioEdades());
        op1.establecerEdadMinima();
        op1.establecerEdadMaxima();
        
   
         
         
         System.out.printf("\nEdad minima: %d",op1.obtenerEdadMinima());
         System.out.printf("\nEdad maxima: %d",op1.obtenerEdadMaxima());
         System.out.println("");
         
         
         //System.out.printf("\n%s",op1.obtenerListaCiudadesEstudiantes());
    }
}
