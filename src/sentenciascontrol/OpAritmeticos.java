/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

/**
 *
 * @author USUARIO
 */

import java.lang.Math;
public class OpAritmeticos {
    
    public String verificarMult(float num1, float num2){ 
        
        if (num1 % num2 == 0) return "El numero es multiplo";
        else return "El numero no es multiplo";
    }
    
    float result;
    public float calcularResp(float num3, float num4, float num5, float num6, float num7){
        result = num3 + num4 - num5  * num6 / num7;
        return result;
    }
    
    float resp;
    public float clacExpresion(float num8, float num9, float num10, float num11, float num12){ 
        resp = (num8 + num9) * num10 - (num11 / num12);
        return resp;
    }
    

    float potencia;
    public float calcPot(float num13, float num14){ 
        float pot = (float)Math.pow(num13,num14);
        potencia = pot;
        return potencia;
    }
    
    float ans;
    public float calcExpr(float num15, float num16, float num17){ 
       float power = (float)Math.pow(num15,num16);
       ans = power * (num15 / num17);
       return ans;
    }
}
