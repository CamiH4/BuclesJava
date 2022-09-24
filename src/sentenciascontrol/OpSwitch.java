/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

import static java.lang.Math.sqrt;

/**
 *
 * @author USUARIO
 */
public class OpSwitch {

    String resp = "";

    public String verificarMes(String mes) {

        switch (mes) {
            case "Enero":
                resp = "Tiene 31 días";
                break;

            case "Febrero":
                resp = "Tiene 28 días y 29 días en año bisiesto";
                break;

            case "Marzo":
                resp = "Tiene 31 días";
                break;

            case "Abril":
                resp = "Tiene 30 días";
                break;

            case "Mayo":
                resp = "Tiene 31 días";
                break;

            case "Junio":
                resp = "Tiene 30 días";
                break;

            case "Julio":
                resp = "Tiene 31 días";
                break;

            case "Agosto":
                resp = "Tiene 31 días";
                break;

            case "Septiembre":
                resp = "Tiene 30 días";
                break;

            case "Octubre":
                resp = "Tiene 31 días";
                break;

            case "Noviembre":
                resp = "Tiene 30 días";
                break;

            case "Diciembre":
                resp = "Tiene 30 días";
                break;
        }
        return resp;
    }

    String est = "";

    public String estacionAño(int num) {

        switch (num) {

            case 1:
                est = "Invierno";
                break;

            case 2:
                est = "Invierno";
                break;

            case 3:
                est = "Primavera";
                break;

            case 4:
                est = "Primavera";
                break;

            case 5:
                est = "Primavera";
                break;

            case 6:
                est = "Verano";
                break;

            case 7:
                est = "Verano";
                break;

            case 8:
                est = "Verano";
                break;

            case 9:
                est = "Otoño";
                break;

            case 10:
                est = "Otoño";
                break;

            case 11:
                est = "Otoño";
                break;

            case 12:
                est = "Invierno";
                break;
        }
        return est;
    }

    String nMes = "";

    public String verificarNumMes(int mes) {

        switch (mes) {
            case 1:
                nMes = "Tiene 31 días";
                break;

            case 2:
                nMes = "Tiene 28 días y 29 días en año bisiesto";
                break;

            case 3:
                nMes = "Tiene 31 días";
                break;

            case 4:
                nMes = "Tiene 30 días";
                break;

            case 5:
                nMes = "Tiene 31 días";
                break;

            case 6:
                nMes = "Tiene 30 días";
                break;

            case 7:
                nMes = "Tiene 31 días";
                break;

            case 8:
                nMes = "Tiene 31 días";
                break;

            case 9:
                nMes = "Tiene 30 días";
                break;

            case 10:
                nMes = "Tiene 31 días";
                break;

            case 11:
                nMes = "Tiene 30 días";
                break;

            case 12:
                nMes = "Tiene 30 días";
                break;
        }
        return nMes;
    }

    String vNum = "";

    public String verificarNum(int n) {
        int r;

        if (n % 2 == 0) {
            r = 1;
        } else {
            r = 2;
        }

        switch (r) {
            case 1:
                vNum = "Par";
                break;
            case 2:
                vNum = "Impar";
                break;
        }
        return vNum;
    }

    public double calcRaiz(double number) {
        double r = 0;
        r = sqrt(number);
        System.out.println(r);
        return r;
    }

    public double calcResiduo(double number1, double number2) {
        double div;
        div = number1 % number2;
        return div;
    }

    public Double calcMenor(double number3, double number4, double number5) {
        double menor = 0;
        if (number3 > number4 && number3 > number5) {
            menor = number3;
        } else if (number4 > number3 && number4 > number5) {
            menor = number4;
        } else if (number5 > number3 && number5 > number4) {
            menor = number5;
        }
        return menor;
    }
}
