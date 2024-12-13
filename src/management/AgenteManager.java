package management;

import entities.Agente;
import utils.ConsoleUtils;

import java.util.ArrayList;

public class AgenteManager {
    private ArrayList<Agente> agentes;

    public AgenteManager() {
        this.agentes = new ArrayList<>();
    }

    public void registrarAgente() {
        int id = ConsoleUtils.leerEntero("Ingrese el ID del agente: ");

        String nombre = ConsoleUtils.leerTexto("Ingrese el nombre del agente: ");
        String habilidad = ConsoleUtils.leerTexto("Ingrese la habilidad especial del agente: ");

        Agente nuevoAgente = new Agente(id, nombre, habilidad);
        agentes.add(nuevoAgente);
        System.out.println("Agente registrado con éxito.");
    }

    public void mostrarAgentes() {
        if (agentes.isEmpty()) {
            System.out.println("No hay agentes registrados.");
            return;
        }
        System.out.println("=== Lista de Agentes ===");
        for (Agente agente : agentes) {
            System.out.println(agente);
        }
    }

    // Nuevo método para incrementar nivel
    public void incrementarNivelAgente() {
        if (agentes.isEmpty()) {
            System.out.println("No hay agentes registrados.");
            return;
        }

        System.out.println("=== Agentes Disponibles ===");
        for (int i = 0; i < agentes.size(); i++) {
            System.out.println(i + ") " + agentes.get(i));
        }

        int indice = ConsoleUtils.leerEntero("Seleccione el número del agente a incrementar nivel: ");
        ConsoleUtils.limpiarBuffer();

        if (indice >= 0 && indice < agentes.size()) {
            Agente agente = agentes.get(indice);
            agente.incrementarNivel();
            System.out.println("Información actualizada del agente:");
            System.out.println(agente);
        } else {
            System.out.println("Índice de agente no válido.");
        }
    }

    public void mostrarMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menú Agentes ===");
            System.out.println("1. Registrar Agente");
            System.out.println("2. Mostrar Agentes");
            System.out.println("3. Incrementar Nivel de Agente");
            System.out.println("4. Salir");
            int opcion = ConsoleUtils.leerEntero("Seleccione una opción: ");
            ConsoleUtils.limpiarBuffer();

            switch (opcion) {
                case 1: 
                    registrarAgente();
                    break;
                case 2: 
                    mostrarAgentes();
                    break;
                case 3: 
                    incrementarNivelAgente();
                    break;
                case 4: 
                    continuar = false;
                    break;
                default: 
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
