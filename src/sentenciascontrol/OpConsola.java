/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author USUARIO
 */
public class OpConsola {

    public Double tbByte(double tb) {
        double by;
        by = tb / 9.0949e-13;
        return by;
    }

    public Float division(float div1, float div2) {
        float div;
        div = div1/div2;
        return div;
    }

    /*public void calcPrecio() {
        double p1, p2, p3, p4, piva1, piva2, piva3, piva4, desc, total;
        System.out.println("Ingrese el precio del primer producto $: ");
        p1 = scan.nextInt();
        System.out.println("Ingrese el precio del segundo producto $: ");
        p2 = scan.nextInt();
        System.out.println("Ingrese el precio del tercer producto $: ");
        p3 = scan.nextInt();
        System.out.println("Ingrese el precio del tercer producto $: ");
        p4 = scan.nextInt();

        System.out.println("Precio $: " + p1);
        System.out.println("Precio $: " + p2);
        System.out.println("Precio $: " + p3);
        System.out.println("Precio $: " + p4);

        piva1 = (p1 * 0.15) + p1;
        System.out.println("Precio con IVA $: " + piva1);
        piva2 = (p2 * 0.15) + p2;
        System.out.println("Precio con IVA $: " + piva2);
        piva3 = (p3 * 0.15) + p3;
        desc = piva2 - (piva2 / 10);
        System.out.println("Precio con descuento de 10% por segundo producto $: " + desc);
        System.out.println("Precio con IVA $: " + piva3);
        piva4 = (p4 * 0.15) + p4;
        System.out.println("Precio con IVA $: " + piva4);

        total = piva1 + desc + piva3 + piva4;
        System.out.println("El total a pagar es $: " + total);

    }*/

    public Integer sepNumint(int num1) {
        int c = 0;
        int tam[] = new int[10];
        int r = 0;
        while(num1>0){
            tam[c] = num1%10;
            num1 = num1%10;
            c++;
        }
        
        for (int i = c-1 ; i>=0; i--){
            r = tam[i];
        }
        return r;
    }

    public Double calcRaiz(int num) {
        double r = 0;
        r = Math.sqrt(num);
        return r;
    }

    public String tablaVerdad() {
        boolean x = true;
        boolean y = false;
        boolean b1 = x && x;
        boolean b2 = x & y;
        boolean b3 = y || x;
        boolean b4 = y | y;
        String a1 = "Tabla de verdad" ;
        String a2 = x + " and " + x + " = " + b1;
        String a3 = x + " and " + y + " = " + b2;
        String a4 = x + " or " + y + " = " + b3;
        String a = a1 + "\n" + a2 + "\n" + a3 + "\n" + a4;
        return a;
    }

    public String concat(String c1, String c2,String c3,String c4,String c5, String c6) {
        String cnt ="";
        cnt = c1 + c2 + c3 + c4 + c5 + c6;
        return cnt;
    }

    public String mostrarFecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YY");
        return formatoFecha.format(fecha);
    }
}
