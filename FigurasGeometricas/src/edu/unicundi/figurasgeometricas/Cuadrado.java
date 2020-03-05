package edu.unicundi.figurasgeometricas;

/**
 * Clase para almacenar los atributos y métodos del cuadrado.
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Cuadrado extends FigurasGeometricas{
    
    /**
     * Método para pintar el cuadrado si la validacion retorna true.
     * @param coordenadas 
     */
    public Cuadrado(int coordenadas[]) {
        super(coordenadas);
        
        if (validacionCuadrado(getCoordenadas())) {
            Pintar a = new Pintar(getCoordenadas());
        }else{
            System.out.println("Las coordenadas no son correctas para un cuadrado.");
        }
    }

    /**
     * Método para validar las posiciones del cuadrado.
     * @param coordenadas
     * @return validacion
     */
    static boolean validacionCuadrado(int[] coordenadas) {
        boolean validacion = false;
        //valida que las coordenas sean correctas para un cuadrado
        if (coordenadas[1] == coordenadas[3]) {
            if (coordenadas[2] == coordenadas[4]) {
                if (coordenadas[5] == coordenadas[7]) {
                    if (coordenadas[6] == coordenadas[0]) {
                        int lado1 = (coordenadas[0]-coordenadas[2])*-1; 
                        int lado2 = (coordenadas[3]-coordenadas[5])*-1; 
                        int lado3 = coordenadas[4]-coordenadas[6]; 
                        int lado4= coordenadas[7]-coordenadas[1]; 
                        if(lado1==lado2 && lado2==lado3 && lado3==lado4){
                            validacion = true;
                        }
                    }
                }
            }
        }
        return validacion;
    }
}