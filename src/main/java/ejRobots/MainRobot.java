/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejRobots;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class MainRobot {
    public static void main(String[] args) {
        List<Robot> lista = new ArrayList<>();
        lista.add(new Robot(1));
        lista.add(new Robot(2));
        lista.add(new Robot(3));
        lista.add(new Robot(4));
        lista.add(new Robot(5));
        
        lista.forEach(System.out::println);
        
        //EXPRESIÓN REGULAR
        //^Robot:(\\d+) - Vida:(100|[0-9][0-9])$
        
        escribirLista(lista);
        
        System.out.println("============================================");
        
        leerFichero();
    }
    
    public static void escribirLista(List<Robot> listaRobot){
        
        List<String> lista = new ArrayList<>();
        for (Robot robot : listaRobot) {
            lista.add(robot.toString());
        }
        
        try {
            Files.write(Paths.get("escribirRobot.txt"),lista, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (Exception e) {
            System.out.println("Error creando el fichero");
        }
    }
    
    // Tiene que leer el fichero y pasarlo a una lista de Robot
    public static void leerFichero(){
        List<String> lineas = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get("escribirRobot.txt"),
                     StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println("Error leyendo el fichero");
        }
        for (String linea : lineas) {
            System.out.println(linea);
        }
    }
}
