/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import cod.Metodo;
import mipaquete.Imprimir;
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Imprimir.saludo();
        prueba();
    }
    public static void prueba (){
        Metodo aux = new Metodo();
        int a = aux.introducir(1);
    }
    
}
