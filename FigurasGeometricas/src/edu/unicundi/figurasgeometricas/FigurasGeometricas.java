package edu.unicundi.figurasgeometricas;

/**
 * Clase para almacenar los atributos y métodos de las figuras geométricas.
 * @author Camilo Tinoco
 * @author Johan Zambrano 
 * @version 1.0.0
 */
public class FigurasGeometricas {
    
    
    /**
     * Variable "lado1" para almacenar uno de los lados de la figura geométrica.
     */
    private float lado1;
    /**
     * Variable "area" para almacenar el area de la figura geométrica.
     */
    private float area;
    /**
     * Variable "perimetro" para almacenar el perimetro de la figura geométrica.
     */
    private float perimetro;
    /**
     * Variable "color" para almacenar el color de la figura geométrica.
     */
    private String color;
    
    /**
     * Constructor para inicializar los atributos de la clase.
     * @param lado1 
     * @param color 
     */
    public FigurasGeometricas(float lado1, String color){
        this.lado1 = lado1; 
        this.color = color;
    }
    
    /**
     * Método para calcular el area de la figura geometrica.
     * @return area 
     */
    public float hallarArea(){
        area = lado1 * lado1;
        return area;
    }
    
    /**
     * Método para calcular el perimetro de la figura geometrica.
     * @return perimetro
     */
    public float hallarPerimetro(){
        perimetro = lado1 * 4;
        return perimetro;
    }
    
    /**
     * Método para imprimir el area y perimetro de la figura.
     */
    public void imprimir(){
        System.out.println("Area: " + hallarArea() + " - Perimetro: " + hallarPerimetro());
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
