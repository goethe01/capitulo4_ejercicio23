package com.mycompany.cap4_ejepropuesto23;
import java.util.Scanner;
public class Cap4_ejePropuesto23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A,B,C, RESP1,RESP2;
        
        System.out.println("DAME EL VALOR DE A");
        A = entrada.nextInt();
        System.out.println("DAME EL VALOR DE B");
        B = entrada.nextInt();
        System.out.println("DAME EL VALOR DE C");
        C = entrada.nextInt();
        
        double raiz = Math.pow(B,2) - 4*A*C;
        if(raiz >0){
            RESP1 = (-B + Math.sqrt(raiz))/2*A;
            RESP2 = (-B - Math.sqrt(raiz))/2*A;
            System.out.println("RESULTADO NUMERO 1 ES: "+RESP1+"\n"+"RESULTADO NUMERO 2 ES: "+RESP2);
        }else if(raiz == 0){
            RESP1 = -B /2*A;
            System.out.println("RESULTADO ES: "+RESP1);
        }else{
            System.out.println("LA ECUACION NO TIENE SOLUCION");
        }
    }
}
