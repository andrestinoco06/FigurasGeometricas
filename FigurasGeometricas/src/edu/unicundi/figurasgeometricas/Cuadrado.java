package edu.unicundi.figurasgeometricas;

/**
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */


public class Cuadrado {
    
    public Cuadrado(int coordenadas[]) {
        if (validacionCuadrado(coordenadas)) {
            Pintar a = new Pintar(coordenadas);
        }else{
            System.out.println("Las coordenadas no son correctas para un cuadrado.");
        }
    }

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
    
    //ÉSTA va en la clase de la rectangulo -- Bueno jaja ! 
    /*static boolean validacionRectangulo(int[] coordenadas) {
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
    }*/
}