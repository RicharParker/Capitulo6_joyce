/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

/**
 *
 * @author ARCHV
 */
public class Die {
    private Integer cara;
    
    public Die(){
        this.lanzar();
    }
    
    public void roll(Die juego1, Die juego2){
        do {
            System.out.println("Jugador 1");
            juego1.lanzar();
            System.out.println("jugador 2");
            juego2.lanzar();
        } while (juego1.getCara()<=10||juego2.getCara()<=10);
        
    }
    public Integer suma(Die dado){
        return (this.cara + dado.cara);
    }
    public void lanzar(){
        this.cara = (int)(Math.random() * 6 + 1);
    }
    public Integer getCara() {
        return cara;
    }

    public void setCara(Integer cara) {
        this.cara = cara;
    }
}
