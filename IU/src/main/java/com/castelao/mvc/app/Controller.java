package com.castelao.mvc.app;

import java.io.IOException;

/**
 * En esta versión, no vamos a instanciar la vista y el modelo
 * Vamos a usar todos los métodos staic al igual que los artibutos
 */
public class Controller {

    /**
     * Este es el punto inicial de nuestra aplicación
     * Las tareas iniciales estarían en este método
     * @param args no usadas
     */
    public static void main(String[] args) throws IOException {

        // creamos la ventana
        View.crearVentana();

        System.out.println("fin del main");
    }

    /**
     * Crea un coche y manda mensaje a la vista para el usuario
     * @param modelo del coche a crear
     * @param matricula identificador único del coche
     */
    public static void crearCoche(String modelo, String matricula){
        Coche aux = Model.crearCoche(modelo, matricula);
        if (aux != null) View.mostrarVelocidad(aux.matricula, aux.velocidad);
        // TODO mandar mensaje de error si no fue posible crear el coche
    }
}