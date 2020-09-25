/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona.registro;

import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDate;
import persona.Persona;

/**
 *
 * @author raulh
 */
public class Archivo {
    
    
    public void guardarRegistro(Persona persona) throws Exception{
        String nombreRegistro = new String (
                new StringBuilder().append(persona.getNombre())
                .append(" ")
                .append(persona.getApellidoPaterno())
                .append(" ")
                .append(persona.getApellidoMaterno()));
        File file = new File(nombreRegistro.trim() + ".txt");       
        if(file.exists()){
            throw new Exception("El archivo: "+ file.getName() + " ya existe");
        }else{
            PrintWriter salida = new PrintWriter(file);                        
                salida.println("Fecha de registro: " + LocalDate.now());
                salida.println(persona.toString());
                salida.close();
                System.out.println("El archivo " + file.getName() + " se guardo con éxito");
        }
        
    }
    
}
