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
public class Player {
    private Die dado1;
    private Die dado2;

    public Player() {
    dado1 = new Die();
    dado2 = new Die();
    }
    
    public void play(){
        this.dado1.lanzar();
        System.out.println(this.dado1.getCara());
        this.dado2.lanzar();
        System.out.println(this.dado2.getCara());
    }
 
}
