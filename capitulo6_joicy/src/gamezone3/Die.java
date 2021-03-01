/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone3;

/**
 *
 * @author ARCHV
 */
public class Die {
    private Integer cara;
    private Integer numero;
    
    public Die(){
        this.lanzar();
    }
    
    public void rolls(){
        int a = 1;
        int b = 2;
        do {
            if (a == 1) {
                this.lanzar();
                if (this.checar(numero)) {
                    System.out.println("Ganaste");
                }else{
                    if (b!=0) {
                        System.out.println("Intenta de nuevo");   
                    }
                }
                b--;
            }else{
                System.out.println("Numero incorrecto");
            }
        } while (b>-1);
        if (b!= -2) {
            System.out.println("Perdiste");
        }
    }
    public void lanzar(){
        this.cara = (int)(Math.random() * 6 + 1);
    }
    
    public Boolean checar(Integer c){
        return this.cara==c;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public Integer getCara() {
        return cara;
    }

    public void setCara(Integer cara) {
        this.cara = cara;
    }
    
}
