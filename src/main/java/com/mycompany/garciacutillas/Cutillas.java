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
    
    public static LocalDate devuelveFechaLocalDate (){
        
        return LocalDate.now();
        
    }
    
    public static int devuelveDiaMes (){
        
        return LocalDate.now().getDayOfMonth();
        
    }
    
}
