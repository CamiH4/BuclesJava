/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

/**
 *
 * @author USUARIO
 */
public class OpIfElse {

    String v = "";

    public String vEdad(int num) {

        if (num >= 21 && num <= 150) {
            v = "Mayor";
        } else if (num >= 0 && num < 21) {
            v = "Menor";
        } else {
            v = "Error";
        }
        return v;
    }

    String r = "";

    public String calValida(double n) {

        if (n >= 0 && n <= 100) {
            r = "Válido";
        } else {
            r = "No válido";
        }
        return r;
    }

    String a = "";

    public String vCal(double cal) {

        if (cal >= 60 && cal <= 100) {
            a = "Aprobado";
        } else if (cal >= 0 && cal < 60) {
            a = "Reprobado";
        } else {
            a = "Error";
        }
        return a;
    }

    String resp = "";

    public String aBisiesto(int an) {
        if (an % 4 == 0) {
            resp = "Bisiesto";
        } else {
            resp = "No bisiesto";
        }
        return resp;
    }

    String m = "";

    public String vMayor(int num1, int num2, int num3, int num4) {

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            m = num1 + "es mayor";
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            m = num2 + "es mayor";
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            m = num3 + "es mayor";
        } else {
            m = num4 + "es mayor";
        }
        return m;
    }

    String d = "";

    public String cDiasMes(String mes) {

        if ("Enero".equals(mes)) {
            d = "31 días";
        } else if ("Febrero".equals(mes)) {
            d = "28 o 29 días";
        } else if ("Marzo".equals(mes)) {
            d = "31 días";
        } else if ("Abril".equals(mes)) {
            d = "30 días";
        } else if ("Mayo".equals(mes)) {
            d = "31 días";
        } else if ("Junio".equals(mes)) {
            d = "30 días";
        } else if ("Julio".equals(mes)) {
            d = "31 días";
        } else if ("Agosto".equals(mes)) {
            d = "31 días";
        } else if ("Septiembre".equals(mes)) {
            d = "30 días";
        } else if ("Octubre".equals(mes)) {
            d = "31 días";
        } else if ("Noviembre".equals(mes)) {
            d = "30 días";
        } else if ("Diciembre".equals(mes)) {
            d = "30 días";
        } else {
            d = "Error";
        }
        return d;
    }

    String cal = "";

    public String rCal(String ca) {

        if ("E".equals(ca)) {
            cal = "Excelente";
        } 
        else if ("MB".equals(ca)) {
            cal = "Muy Bueno";
        }
        else if ("B".equals(ca)) {
            cal = "Bueno";
        } 
        else if ("D".equals(ca)) {
            cal = "Deficiente";
        } 
        else {
            cal = "Error";
        }
        return cal;
    }

}
