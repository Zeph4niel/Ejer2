/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zephaniel.ejer2;

import Dependencias.Circu;
import java.util.Scanner;

/**
 *
 * @author Zephaniel
 */
public class Ejer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circu c1 = new Circu(0.0);
        System.out.println("Ingrese el radio:");
        c1.setRadio(sc.nextDouble());
        System.out.println("El dato es: " + c1.getRadio());
        System.out.println("Vamos a los calculos.");
        System.out.println("El area es: " + c1.area());
        System.out.println("El perimetro es: " + c1.perimetro());
    }
}
