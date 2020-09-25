/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import persona.direccion.Domicilio;
import static persona.formato.Formato.aMayuscula;
import persona.registro.Archivo;

/**
 *
 * @author raulh
 */
public class Persona implements Comparable {

    private final SimpleStringProperty sspNombre = new SimpleStringProperty(""),
            sspApellidoPaterno = new SimpleStringProperty(""),
            sspApellidoMaterno = new SimpleStringProperty(""),
            sspEdad = new SimpleStringProperty("");
    
    
    private final SimpleStringProperty sopFechaNacimiento = new SimpleStringProperty(LocalDate.now().toString()),
            sopSexo = new SimpleStringProperty(Sexo.HOMBRE.toString());
    
    private LocalDate localDate = LocalDate.now();
    
    private Domicilio domicilio;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Persona p1 = new Persona();
            p1.setNombre("ana denISse");
            
        Persona p2 = new Persona();
            p2.setNombre("jOSe");
            
            System.out.println("Comparando....\n"+ p1.compareTo(p2));
            System.out.println("toString: "+ p1);
            System.out.println("toString: "+ p2);
            
            Archivo archivo = new Archivo();
        try {
            archivo.guardarRegistro(p1);
        } catch (Exception ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public final void setNombre(String nombre){
        sspNombre.setValue(aMayuscula(nombre));        
    }
    
    public final void setApellidoPaterno(String apellidoPaterno){
        this.sspApellidoPaterno.setValue(aMayuscula(apellidoPaterno));
    }
    
    public final void setApellidoMaterno(String apellidoMaterno){
        this.sspApellidoMaterno.setValue(aMayuscula(apellidoMaterno)); 
    }
    
    public final void setFechaNacimiento(LocalDate fechaNacimiento){
        this.localDate = fechaNacimiento;
        
        StringBuilder builder = new StringBuilder();
            builder.append(fechaNacimiento.getDayOfMonth())
                    .append("/")
                    .append(fechaNacimiento.getMonth())
                    .append("/")
                    .append(fechaNacimiento.getYear());
        this.sopFechaNacimiento.setValue(new String(builder));
    }
    
    public final void setSexo(Sexo sexo){
        this.sopSexo.setValue(sexo.toString());
    }
    
    public void setDomicilio(Domicilio _domicilio){
        domicilio = _domicilio;
    }
    
    public final String getNombre(){
        return this.sspNombre.getValue();
    }
    
    public final String getApellidoPaterno(){
       return this.sspApellidoPaterno.getValue();
    }
    
    public final String getApellidoMaterno(){
        return this.sspApellidoMaterno.getValue();
    }
    
    public final String getFechaNacimiento(){
        setEdad();
        return (String) this.sopFechaNacimiento.getValue();
        
    }
    
    public Domicilio getDomicilio(){
        return domicilio;
    }
    
    private void setEdad(){
         int añoActual = LocalDate.now().getYear();
        
        int añoNacimiento = this.localDate.getYear();
        this.sspEdad.setValue(Integer.toString(añoActual - añoNacimiento));
        
    }
    
    public final int getEdad(){
       
        return Integer.parseInt(sspEdad.get());
    }
    
    public final StringProperty propertyNombre(){
        return this.sspNombre;
    }
    
    public final StringProperty propertyApellidoPaterno(){
        return this.sspApellidoPaterno;
    }
    
    public final StringProperty propertyApellidoMaterno(){
        return this.sspApellidoMaterno;
    }
    
    public final StringProperty propertyFechaNacimiento(){
        return this.sopFechaNacimiento;
    }
    
    public final StringProperty propertySexo(){
        return this.sopSexo;
    }
    
    public final StringProperty propertyEdad(){
        return this.sspEdad;
    }
    
    public final String getSexo(){
        return (String) this.sopSexo.getValue();
    }

    @Override
    public int compareTo(Object o) {
        int valor = 0;
        if(o instanceof Persona){
            Persona persona = (Persona) o;
            StringBuilder builder = new StringBuilder();
                builder.append(this.getNombre())
                        .append(this.getApellidoPaterno())
                        .append(this.getApellidoMaterno());
                
            StringBuilder builder2 = new StringBuilder();
                builder2.append(persona.getNombre())
                        .append(persona.getApellidoPaterno())
                        .append(persona.getApellidoMaterno());
                
            String str1 = new String(builder);
            String str2 = new String(builder2);
            
            valor = str1.compareTo(str2);

        }
         return valor;
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
                builder.append("Nombre: ")
                        .append(this.getNombre())
                        .append(" ")
                        .append(this.getApellidoPaterno())
                        .append(" ")
                        .append(this.getApellidoMaterno())
                        .append("\nFecha de nacimiento: ")                        
                        .append(this.getFechaNacimiento())
                        .append("\nEdad: " + getEdad())
                        .append("\nSexo: ")
                        .append(this.getSexo());
                
        return new String(builder);
        
    }
    
    
 
    
    
    
    
    
}
