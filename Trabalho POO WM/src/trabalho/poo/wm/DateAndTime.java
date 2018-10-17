/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo.wm;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
/**
 *
 * @author wilsonmielke
 */
public class DateAndTime{
    
    public static String DateTime() {    
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now));
        return dtf.format(now);
    } 
}
