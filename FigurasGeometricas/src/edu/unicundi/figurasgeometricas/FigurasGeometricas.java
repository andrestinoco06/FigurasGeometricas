package edu.unicundi.figurasgeometricas;

/**
 * Clase para almacenar los atributos y métodos de las figuras geométricas.
 * @author Camilo Tinoco
 * @author Johan Zambrano 
 * @version 1.0.0
 */
public class FigurasGeometricas {
    
    private int[] coordenadas;
    
    /**
     * Variable "lado1" para almacenar uno de los lados de la figura geométrica.
     */
    private double lado1;
    /**
     * Variable "area" para almacenar el area de la figura geométrica.
     */
    private double area;
    /**
     * Variable "perimetro" para almacenar el perimetro de la figura geométrica.
     */
    private double perimetro;
    /**
     * Variable "color" para almacenar el color de la figura geométrica.
     */
    private String color;
    /**
     * Constructor para inicializar las coordenadas
     * @param vectr = recibe el arreglo de las coordenadas
     */
    public FigurasGeometricas(int[] vectr){
        this.coordenadas = vectr;
    }
    
    /**
     * Constructor para inicializar los atributos de la clase.
     * @param lado1 
     * @param color 
     */
    public FigurasGeometricas(double lado1, String color){
        this.lado1 = lado1; 
        this.color = color;
    }
    
    /**
     * Método para calcular el area de la figura geometrica.
     * @return area 
     */
    public double hallarArea(){
        area = lado1 * lado1;
        return area;
    }
    
    /**
     * Método para calcular el perimetro de la figura geometrica.
     * @return perimetro
     */
    
    public double hallarPerimetro(){
        perimetro = lado1 * 4;
        return perimetro;
    }
    
    /**
     * Método para imprimir el area y perimetro de la figura.
     */
    public void imprimir(){
        System.out.println("Area: " + hallarArea() + " - Perimetro: " + hallarPerimetro());
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int[] coordenadas) {
        this.coordenadas = coordenadas;
    }
    
    
}
