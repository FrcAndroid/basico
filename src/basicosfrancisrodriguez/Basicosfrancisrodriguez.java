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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        logicos();
        // TODO code application logic here
    }
    public static void logicos() {
    
        int x=4;
    boolean and= (3<x && x>2);
    boolean or= 5<x || x>3;
    boolean not= !(5<x || x>3);
    boolean lessthan= x<5;
    boolean morethan= x>5;
    boolean equals= x==4;
    boolean notequals= (x!=4);
    boolean lessorequal= x<=4;
    boolean moreorequal= x>=5;
    
    System.out.println("Las expresiones lógicas tienen dos valores: true cuando se cumplen y false cuando no se cumplen, usaremos x=4 para todas las ecuaciones de aquí en adelante.");
    System.out.println("La expresión AND (&&) solo se cumple cuando ambos operandos son ciertos. Ej: (3<x && x>2) ");
    System.out.println(and);
    System.out.println("La expresión OR (||) se cumple si al menos uno de los operandos son ciertos. Ej: (5<x || x>3)");
    System.out.println(or);
    System.out.println("La expresión NOT (!) hace que el resultado final de los operandos cambie de true a false o viceversa, no afecta nada más, solo el resultado final Ej: !(5<x || x>3) -> Aquí la variable lógica OR dice que, aunque 4 no es mayor a 5, si es mayor a 3, por lo que la condición es true, NOT hace que el resultado final pase a ser FALSE");
    System.out.println(not);
    System.out.println("La expresión < compara ambos operandos y se cumple solo si el operando de la derecha es mayor que el de la izquierda Ej:x<5");
    System.out.println(lessthan);
    System.out.println("La expresión > compara ambos operandos y se cumple solo si el operando de la izquierda es mayor que el de la derecha Ej:x>5");
    System.out.println(morethan);
    System.out.println("La expresion EQUALS == es una variable booleana que se cumple cuando el operando de la izquierda tiene el mismo valor que el de la derecha");
    System.out.println(equals);
    System.out.println("La expresión NOTEQUALS != se cumple cuando el operando de la izquierda no tiene el mismo valor que la derecha Ej: x!=4 ");
    System.out.println(notequals);
    System.out.println("La expresión LESSOREQUAL <= se cumple cuando el operando de la izquierda es menor o igual al operando de la derecha Ej: x<=4 ");
    System.out.println(lessorequal);
    System.out.println("La expresión MOREOREQUAL >= se cumple cuando el operando de la izquierda es menor o igual al operando de la derecha Ej: x>=5 ");
    System.out.println(moreorequal);
    
   
    
}   
}
