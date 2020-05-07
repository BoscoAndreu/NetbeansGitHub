/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticab;

import java.util.Scanner;

/*
 * Desarrollada por Bosco a 4 feb. 2020
 */
public class LogisticsApp {

    public static void main(String[] args) {
        Warehouse x = new Warehouse();
        Scanner key = new Scanner(System.in);
        String data="";
        while (!"salir".equals(data)) {
            System.out.println("¿Va a cargar(S) o descargar(M) mercancía?");
            System.out.println("");
            data = key.nextLine();
            if ("S".equals(data)) {
                if (x.checkgetA() == true) {
                    System.out.println("Diríjase al primer almacén.");
                } else if (x.checkgetB() == true) {
                    System.out.println("Diríjase al segundo almacén.");
                } else if (x.checkgetC() == true) {
                    System.out.println("Diríjase al tercer almacén.");
                } else if(x.checkgetA() == false && x.checkgetB() == false && x.checkgetC() == false){
                    System.out.println("Todos los almacenes están vacios");
                }

            } else if ("M".equals(data)) {
                if (x.checkdropA() == true) {
                    System.out.println("Diríjase al primer almacén.");
                } else if (x.checkdropB() == true) {
                    System.out.println("Diríjase al segundo almacén.");
                } else if (x.checkdropC() == true) {
                    System.out.println("Diríjase al tercer almacén.");
                }else if(x.checkdropA() == false && x.checkdropB() == false && x.checkdropC() == false){
                    System.out.println("Todos los almacenes están llenos");
                }

            } else {
                System.out.println("Introduce una respuesta correcta (S/M)");
            }
        } 
    }
}
