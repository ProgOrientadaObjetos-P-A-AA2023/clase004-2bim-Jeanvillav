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
public class OperacionesEstudiantes {

    private ArrayList estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;
    // Una Persona, tiene un atributo ciudad de tipo Ciudad
    // Una Ciudad, tiene un atributo nombre de tipo String

    

    public void establecerListaCiudadesEstudiantes() {
        listaCiudadesEstudiantes = obtenerEstudiante().get(0).obtenerCiudad().obtenerNombre();
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.printf("%s\n",estudiantes.get(i));

        }
    }

    public void establecerEdadMinima() {
        edadminima = obtenerEstudiante().get(0).obtenerEdad();
        for (int i = 0; i < estudiantes.size(); i++) {

            if (obtenerEstudiante().get(i).obtenerEdad() < edadminima) {
                edadminima = obtenerEstudiante().get(i).obtenerEdad();
            }
        }
    }

    public void establecerEdadMaxima() {
        edadmaxima = obtenerEstudiante().get(0).obtenerEdad();
        for (int i = 0; i < estudiantes.size(); i++) {

            if (obtenerEstudiante().get(i).obtenerEdad() > edadmaxima) {
                edadmaxima = obtenerEstudiante().get(i).obtenerEdad();
            }
        }
    }

    public int obtenerEdadMinima() {
        return edadminima;
    }

    public int obtenerEdadMaxima() {
        return edadmaxima;
    }

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma += e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }
    public String obtenerListaCiudadesEstudiantes() {
        return listaCiudadesEstudiantes;
    }

}
