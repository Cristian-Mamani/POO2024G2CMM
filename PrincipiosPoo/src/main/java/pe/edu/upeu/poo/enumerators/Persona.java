/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.enumerators;

/**
 *
 * @author Datos
 */
enum GENERO{FEMENINO, MASCULINO}
enum ESTADO_CIVIL{CASADO, DIVORCIADO, SOLTERO}
public class Persona {
    
    public static void main(String[] args) {
        System.out.println("Gnero:"+GENERO.MASCULINO);
        for (ESTADO_CIVIL ec: ESTADO_CIVIL.values()){
        System.out.println(ec);
        }
        
    }

    
}
