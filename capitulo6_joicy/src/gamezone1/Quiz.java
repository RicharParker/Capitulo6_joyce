/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

import java.util.ArrayList;

/**
 *
 * @author ARCHV
 */
public class Quiz {
   private ArrayList<Pregunta> preguntas;
   public Quiz(){
       this.preguntas = new ArrayList<>();
   }
   
   public void addPregunta(Pregunta pregunta){
       this.preguntas.add(pregunta);
   }
   public int size (){
       return this.preguntas.size();
   }
   
   public Pregunta getPregunta(int indice){
       return this.preguntas.get(indice);
   }
   

    
}
