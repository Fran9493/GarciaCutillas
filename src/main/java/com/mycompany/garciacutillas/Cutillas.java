package com.mycompany.garciacutillas;

import java.time.LocalDate;

/**
 *
 * @author Fran
 */
public class Cutillas {
    
    public static void muestraPantalla (){
        
        System.out.println("Ejemplo de texto por pantalla");
        
    }
    
    public static String devuelveCadena (){
        
        return "Cadena de prueba";
        
    }
    
    public static String devuelveFecha (){
        
        return LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonthValue() + "/" +
                LocalDate.now().getYear();
        
    }
    
}
