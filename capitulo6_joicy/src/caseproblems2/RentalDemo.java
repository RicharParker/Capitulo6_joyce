/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblems2;

/**
 *
 * @author ARCHV
 */
public class RentalDemo {
    public static void main(String[] args) {
        Rental renta1 = new Rental("Rentar silla", 60);
        renta1.setMinutes(60);
        renta1.coupon();
    }
}
