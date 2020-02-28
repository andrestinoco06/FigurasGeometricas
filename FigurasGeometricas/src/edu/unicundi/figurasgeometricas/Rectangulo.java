package edu.unicundi.figurasgeometricas;

/**
 * Clase para almacenar los atributos y métodos del rectangulo, extiende de FigurasGeometricas.
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Rectangulo extends FigurasGeometricas {
    
    /**
     * Variable "lado2" para almacenar uno de los lados de la figura geométrica.
     */
    private double lado2;
    private int[] coordenadas = new int[8];
    /*
    public Rectangulo(int[] coordenadas){
        if (validacionRectangulo(coordenadas)) {
            Pintar a = new Pintar(coordenadas);
        }else{
            System.out.println("Las coordenadas no son correctas para un cuadrado.");
        }
    }*/
    
    /**
     * Constructor para inicializar los atributos de la clase.
     * @param lado1
     * @param color
     * @param lado2 
     */
    public Rectangulo(double lado1, String color, double lado2){
        super(lado1, color);
        this.lado2 = lado2;
        Pintar a = new Pintar(coordenadas);
    }
    
    /**
     * Método para calcular el area de la figura geometrica.
     * @return getArea()
     */
    @Override
    public double hallarArea(){
        setArea(getLado1() * lado2);
        return getArea();
    }
    
    /**
     * Método para calcular el perimetro de la figura geometrica.
     * @return getPerimetro()
     */
    @Override
    public double hallarPerimetro(){
        setPerimetro((getLado1() * 2) + (lado2 * 2));
        return getPerimetro();
    }
    
    /**
     * Método para validar las posiciones del rectangulo.
     * @param coordenadas
     * @return validacion
     */
    static boolean validacionRectangulo(int[] coordenadas) {
        boolean validacion = false;
        //valida que las coordenas sean correctas para un rectangulo
        if (coordenadas[1] == coordenadas[3]) {
            if (coordenadas[2] == coordenadas[4]) {
                if (coordenadas[5] == coordenadas[7]) {
                    if (coordenadas[6] == coordenadas[0]) {
                        validacion = true;
                    }
                }
            }
        }
        return validacion;
    }
    
    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}
