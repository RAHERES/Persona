/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author raulh
 */
public enum Sexo {
    
    HOMBRE (0),
    MUJER (1);
    
    private int valor;
    Sexo(int num){
        valor = num;
    }
    
    public int getValor(){
        return valor;
    }
    
}
