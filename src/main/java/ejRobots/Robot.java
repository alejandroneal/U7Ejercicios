/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejRobots;

import java.util.Random;

/**
 *
 * @author alejandro
 */
public class Robot {

    private int id;
    private int vida;

    public Robot(int id) {
        this.id = id;
        this.vida = new Random().nextInt(0,101);
    }

    @Override
    public String toString() {
        return "Robot:" + this.id + " - Vida:" + this.vida;
    }
    
}
