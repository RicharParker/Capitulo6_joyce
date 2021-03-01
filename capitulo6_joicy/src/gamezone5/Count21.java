/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone5;
import java.util.Scanner;

/**
 *
 * @author ARCHV
 */
public class Count21 {
    Scanner sc = new Scanner(System.in);
    private static final Integer ventiuno =21;
    private Integer jugador;
    private Integer entrada;
    private Integer total;

    public Count21() {
        this.jugador = jugador;
        this.entrada = 0;
        this.total = 0;
    }
    

    public Integer getJugador() {
        return jugador;
    }

    public void setJugador() {
        while(this.total<=21){
            System.out.println("Jugador , por favor ingresa 1,2 o 3 : ");
            this.jugador = sc.nextInt();
            while (this.jugador != 1 && this.jugador !=2 && this.jugador !=3){
                System.out.println("Jugador , por favor ingresa 1,2 o 3 :"); 
                jugador =sc.nextInt();
            }
        }
        total += this.jugador;
        System.out.println("El total es : "+this.total);
        if (this.total==21) {
            System.out.println("El jugador gana");
            this.total =25;
        }
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Count21 jugador) {
        total += this.entrada;
        System.out.println(" la entrada es :"+this.entrada);
        System.out.println("El total es: "+this.total);
        if (this.total ==21) {
            this.total =25;
            System.out.println("La maquina gana");
        }else{
            System.out.println("El total es"+this.total);
        }
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal() {
        if (this.total<ventiuno) {
            switch (total){
                case 1 : this.entrada= 1;break;
                case 2 : this.entrada= 1;break;
                case 3 : this.entrada= 3;break;
                case 4 : this.entrada= 3;break;
                case 5 : this.entrada= 3;break;
                case 6 : this.entrada= 2;break;
                case 7 : this.entrada= 1;break;
                case 8 : this.entrada= 1;break;
                case 9 : this.entrada= 3;break;
                case 10 : this.entrada= 2;break;
                case 11 : this.entrada= 3;break;
                case 12 : this.entrada= 2;break;
                case 13: this.entrada= 1;break;
                case 14 : this.entrada= 3;break;
                case 15 : this.entrada= 2;break;
                case 16 : this.entrada= 1;break;
                case 17 : this.entrada= 1;break;
                case 18: this.entrada= 3;break;
                case 19: this.entrada= 2;break;
                case 20: this.entrada= 1;break;
                default: this.entrada=1;
            }
        }
    }
    
}
