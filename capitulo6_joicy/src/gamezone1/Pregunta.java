/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

/**
 *
 * @author ARCHV
 */
public class Pregunta {
    private String texto;
    private Inciso[] incisos;
    
    private int indice;
    
    public Pregunta (String texto){
        this.texto = texto;
        this.incisos = new Inciso[4];
    }
    public void addInciso(Inciso inciso){
        if (indice <= 3) {
            this.incisos [indice]=inciso;
            indice++;
        }
    }
    
    public Boolean respuesta(Integer inciso){
        return incisos[inciso].isStatus();
    }
  
    public void impirmir (){
        System.out.println(this.getTexto());
        for (int i = 0; i < this.incisos.length; i++) {
            System.out.println(this.incisos[i].getTexto());
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Inciso[] getIncisos() {
        return incisos;
    }

    public void setIncisos(Inciso[] incisos) {
        this.incisos = incisos;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    
}
