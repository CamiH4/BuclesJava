/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

/**
 *
 * @author USUARIO
 */
public class OpDo {
    
    float prom;
    public Float promedio (int num) {
       int suma;
       int var = 1;
       int i = 0;
       do {
           suma = var + 1;
           i++;
       }
       while(var <= num);
       prom = suma/num;
       return prom;}
}
