/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github1.pkg0;

/**
 *
 * @author freddycra
 */
public class Prueba2 {

    public Prueba2() {
        var = 5;
    }
    
    public void setVar(int var){
        this.var=var;
    }

    @Override
    public String toString() {
        return Integer.toString(var);
    }

    private int var;
}
