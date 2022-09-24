package sentenciascontrol;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class OpLog {
    
   String vf = "";
   
   public String verificarNum(int num1, int num2){
       
       if (num1 == num2){
           vf = "Iguales";
       }
       else{
           vf = "Diferentes";
       }
       return vf;
   }
   
   String cMay = "";
   public String calcularMa(int num3, int num4){
       
       if (num3 > num4){
           cMay = num3 + " es mayor";
       }
       else if (num3 < num4) { cMay = num4 + " es mayor";}
       else { cMay = "Error";}
          return cMay;
   }
   
   String cMenor = "";
   public String calcularMe(int num5, int num6){
       
       if (num5 < num6){
           cMenor = num5 + " es menor";
       }
       else if (num6 < num5){ cMenor = num6 + " es menor";}
       else { cMenor = "Error";}
          return cMenor;
   }
   
   String vMa = "";
   public String valorVerMay(int num7, int num8){
       
       if (num7 >= num8){
           vMa = "Verdadero";
       }
       else{vMa = "Falso";}
          return vMa;
   }
   
   String vMe = "";
   public String valorVerMen(int num9, int num10){
       
       if (num9 <= num10){
           vMe = "Verdadero";
       }
       else{vMe = "Falso";}
          return vMe;
   }
   
   String i = "";
   public String verificarIg(String ch1, String ch2){
       
       if (ch1.equals(ch2)){
           i = "Iguales";
       }
       else{ i = "Error";}
       return i;
   }
   
   String d = "";
   public String verificarDif(String ch3, String ch4){
       
       if (!ch3.equals(ch4)){
           d = "Diferentes";
       }
       else{ d = "Error";}
       return d;
   }
   
   String cc = "";
   public String verificarCad(String ch5, String ch6){
       
       if (ch5.equals(ch6)){
           cc = "Iguales";
       }
       else { cc = "Diferentes";}
       return cc;
   }
   
   String ccM = "";
   public String calcCadMay(String ch7, String ch8){
     
       if (ch7.length() > ch8.length()){
           ccM = ch7 + " es mayor";
       }
       else { ccM = ch8 + " es mayor";}
       return ccM;
   }
   
   String n = "";
   
   public String verificcarNumero(int num){
       
       if (num > 0){ n = "Positivo";}
       else if (num < 0){n = "Negativo";}
       else{ n  = "Neutro";}
       return n;
   }
}
