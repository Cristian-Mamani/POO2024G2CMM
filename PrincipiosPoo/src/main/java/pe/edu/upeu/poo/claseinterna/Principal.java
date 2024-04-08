/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.claseinterna;

/**
 *
 * @author Datos
 */
public class Principal {
    public static void main(String[] args) {
        Mama Ma=new Mama();
        System.out.println("La mama provee "+Ma.alimento);
        Mama.Bebe bb=Ma.new Bebe();
        System.out.println("Su bebe tiene un peso "+bb.peso+"Kg");
        
    }
    
}
