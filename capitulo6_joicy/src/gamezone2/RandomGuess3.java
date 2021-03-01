/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ARCHV
 */
public class RandomGuess3 {
    ArrayList<Integer> intentos;
    private Integer aleatorio;
    private Integer numero;
    Scanner sc = new Scanner(System.in);

    public void play(){
        setAleatorio();
         System.out.println("tu numero aleatorio es : "+getAleatorio());
       System.out.println("Escribe un nuevo numero: "); 
       numero = sc.nextInt();
       if (numero == getAleatorio ()) {
           System.out.println("Correcto");
       }else{
           if (numero > getAleatorio()) {
               System.out.println(" Muy alto");
           }else{
               System.out.println("Muy bajo");
           }
       }
       intentos = new ArrayList<Integer>();
        do {
            intentos.add(this.numero);
        } while (this.aleatorio != this.numero);
        
    }
      
    public void Intentos(){
        for (int i = 0; i < intentos.size(); i++) {
            System.out.println(intentos.get(i));
        }
    }
    public Integer getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio() {
        this.aleatorio = (int)(Math.random()*10+1);
    }

    public ArrayList<Integer> getIntentos() {
        return intentos;
    }

    public void setIntentos(ArrayList<Integer> intentos) {
        this.intentos = intentos;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    

}
