package edu.unicundi.figurasgeometricas;

/**
 * Clase para almacenar los atributos y métodos del triangulo, extiende de Rectangulo.
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Triangulo extends Rectangulo{
    
    /**
     * Variable "lado3" para almacenar uno de los lados de la figura geométrica.
     */
    private double lado3;
    /**
     * Variable "tipo" para almacenar el tipo de triangulo.
     */
    private String tipo;
    
    public Triangulo(int[] triangulo){
        super(triangulo);
        Pintar a = new Pintar(getCoordenadas());
    }
    
    /**
     * Constructor para inicializar los atributos de la clase.
     * @param lado1
     * @param color
     * @param lado2
     * @param lado3
     * @param tipo 
     */
    public Triangulo(double lado1, String color, double lado2, double lado3){
        super(lado1, color, lado2);
        this.lado3 = lado3;
    }
    
    /**
     * Método para hallar el perimetro de la figura geometrica.
     * @return getPerimetro()
     */
    @Override
    public double hallarPerimetro(){
        setPerimetro(getLado1() + getLado2() + lado3);
        return getPerimetro();
    }
    
    /**
     * Método para hallar el area de la figura geometrica.
     * @return getArea()
     */
    @Override
    public double hallarArea(){
        double per = (hallarPerimetro()/2);
        setArea((double) Math.sqrt(per*(per-getLado1())*(per-getLado2())*(per-lado3)));
        return getArea();
    }
    
    /**
     * Método para imprimir el area, perimetro y tipo de triangulo.
     */
    @Override
    public void imprimir(){
        System.out.println("Area: " + hallarArea() + " - Perimetro: " + hallarPerimetro() + " Tipo: " + tipoTriangulo());
    }
    
    /**
     * Método para conocer el tipo de triangulo.
     * @return tipo
     */
    public String tipoTriangulo(){
        if((getLado1() == getLado2()) & (getLado1() == lado3) & (getLado2() == lado3)){
            tipo = "Es un triangulo equilatero";
        }
        else if ((getLado1() != getLado2()) & (getLado1() != lado3) & (getLado2() != lado3)){
            tipo = "Es un triangulo escaleno";
        }
        else {
            tipo = "Es un triangulo isosceles";
        }
        return tipo;
    }
    
    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
