/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependencias;

/**
 *
 * @author Zephaniel
 */
public class Circu {
    private double radio;

    public Circu(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area() {
    double area = Math.PI * Math.pow(this.radio, 2);
    return area;
}
    public double perimetro() {
    double perimetro = 2*Math.PI * this.radio;
    return perimetro;
    }
}
