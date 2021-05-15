/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05ej02;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author AntDVD
 */
public class T05EJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FramePrincipal framePrincipal = new FramePrincipal();
        framePrincipal.setVisible(true);
        framePrincipal.setResizable(false);
        framePrincipal.setTitle("Tarea 5: Ejercicio 2 - Desarrollo de Interfaces");
    }
      
}
