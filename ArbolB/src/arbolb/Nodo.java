/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolb;

/**
 *
 * @author Esteban Olaya
 */
public class Nodo {
    public int[] valores;
    public Nodo[] nodo;
    public static int numValores;
    public boolean tengoHijos = false;
    public int ocupados = 0;
    public Nodo padre;

    public Nodo() {
        nodo = new Nodo[Raiz.grado * 2 + 3];
        valores = new int[Raiz.grado * 2 + 1];
    }
}
