/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo_generics;

/**
 *
 * @author cassisi
 */
/*public class Principal {

 public static void main(String[] args) {
 Bolsa bolsa = new Bolsa(5);
 Chocolatina c = new Chocolatina("milka");
 Chocolatina c1 = new Chocolatina("milka");
 Chocolatina c2 = new Chocolatina("ferrero");
 Golosina g1 = new Golosina("gominola");
 Golosina g2 = new Golosina("chicle");

 bolsa.add(c);
 bolsa.add(c1);
 bolsa.add(c2);
 bolsa.add(g1);
 bolsa.add(g2);

 for (Object o : bolsa) {

 if (o instanceof Chocolatina) {

 Chocolatina chocolatina = (Chocolatina) o;
 System.out.println(chocolatina.getMarca());

 } else {

 Golosina golosina = (Golosina) o;
 System.out.println(golosina.getNombre());
 }
 }
 }
 }*/
public class Principal {

    public static void main(String[] args) {

        Bolsa<Chocolatina> bolsa = new Bolsa<Chocolatina>(3);
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");

        bolsa.add(c);
        bolsa.add(c1);
        bolsa.add(c2);

        for (Chocolatina chocolatina : bolsa) {

            System.out.println(chocolatina.getMarca());
        }

    }
}