/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosfrancisrodriguez;

/**
 *
 * @author Francis
 */
public class Basicosfrancisrodriguez {
    
    public static void main(String[] args) {
    numericos();
   

 
    }
 
     /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {
        
        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;
        elMasPeque= 1;
        chiquitin= 2;
        duplicaEntero= 20;
        grande= (float) 40.7;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
        System.out.println("Valor más pequeño, tiene de rango desde -127 a 127");
        System.out.println(elMasPeque);
        System.out.println("Valor pequeño, tiene de rango -32768 a 32767");
        System.out.println(chiquitin);
        System.out.println("Valor muy grande, duplica al entero");
        System.out.println(duplicaEntero);
        System.out.println("Valor muy grande con decimales");
        System.out.println(grande);
    }
        // TODO code application logic here
    }
    
