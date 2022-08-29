/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.updatingvariable;

/**
 *
 * @author maryuri
 */
public class Updatingvariable {

    public static void main(String[] args) {
        // Actualizar datos numericos :
        int salary = 1000;
        salary = salary + 200;
        System.out.println(salary); // 1200
        
        salary += 300;
        System.out.println(salary); // 1500
        
        salary = salary+(30*2)-50-40;
         System.out.println(salary);
                
        // Actualizar variables de tipo String:
        String employeeName = "Anahi";
        employeeName = employeeName + "Salgado";
        System.out.println(salary); // Anahi Salgado
        
        employeeName += "Diaz de la vega";
        System.out.println(employeeName); // Anahi Salgado Diaz de la Vega 
        
        employeeName = "Irene" + employeeName;
        System.out.println(employeeName); // Irene Anahi Salgado Diaz de la Vega
    }
}
