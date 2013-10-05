package Operaciones;

import java.util.Random;

public class Operaciones {
    private int edad;
    private String sexo;
    private int v1;
    private int num1;
    private int num2;

    //Constructores
    public Operaciones() {
    }
    
    public Operaciones(int edad, String sexo) {
        this.edad = edad;
        this.sexo = sexo;
    }

    public Operaciones(int v1) {
        this.v1 = v1;
    }

    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

        
    //Ejercicio 1
    public int seg(){
        int pago=0;
        if (sexo.equals("Femenino")){
            if (edad<25){
                pago=30000;
            }else
                pago=25000;
        }else
            if (sexo.equals("Masculino")){
                if (edad<30){
                    pago=33000;
                }else
                    pago=28000;
            }
        return pago;
    }
    
    //Ejercicio 2
    public int aleatorio(){
        Random r=new Random();
        int num=r.nextInt(101);
        int x=0;
        
         if (num<54){
             x = v1-((15 * v1)/100);
         }else
             if ((num>=54) || (num<81)){
                 x = v1-((20 * v1)/100);
             }else 
                 if(num>=81){
                     x = v1-((23 * v1)/100); 
                 }
         return x;
     }
    
    //Ejercicio 3
    public String amigo(){
        String resp;
        int i=1,div1=0,div2=0;
        
        while(i<num1){
            if(num1%i==0){
                div1=div1+i;    
            }
            i++;
        }
        i=1;
        while(i<num2){
            if(num2%i==0){ 
                div2=div2+i;
            }
            i++;
        }
        if (div1==num2 & div2==num1){
            resp="Son Amigos";
        }
        else {
            resp="No Son Amigos";
        }
        return resp;
    } 
}
