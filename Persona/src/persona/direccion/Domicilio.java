/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona.direccion;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author raulh
 */
public class Domicilio {
    
    private transient SimpleStringProperty sspCalle,           
            sspColonia,
            sspMunicipio,
            sspEstado;
    private transient SimpleIntegerProperty sipCodigoPostal, 
            sipManzana,
            sipLote;
    
    private String sCalle,            
            sColonia,
            sMunicipio,
            sEstado;
    
    private int manzana,
            lote,
            codigoPostal;
    public Domicilio(String calle){
        
    }
    
    public void setCalle(String calle){
        if(sspCalle == null){
            sCalle = calle;
        }else {
            sspCalle.setValue(calle);
        }        
    }
    
    public void setManzana(int _manzana){
        if(sipManzana == null){
            manzana = _manzana;
        }else{
            sipManzana.setValue(_manzana);
        }
    }
    
    public void setLote(int _lote ){
        if(sipLote == null){            
            lote = _lote; 
        }else{
            sipLote.setValue(_lote);
        }
    }
    
    public void setColonia(String colonia){
        if(sspColonia == null){
            sColonia = colonia;
        }else{
            sspColonia.setValue(colonia);
        }
    }
    
    public void setMunicipio(String municipio){
        if(sspMunicipio == null){
            sMunicipio = municipio;
        }else{
            sspMunicipio.setValue(municipio);
        }
    }
    
    public void setEstado(String estado){
        if(sspEstado == null){
            sEstado = estado;
        }else{
            sspEstado.setValue(estado);
        }
    }
    
    public void setCodigoPostal(int _codigoPostal){
        if(sipCodigoPostal == null){
            codigoPostal = _codigoPostal;
        }else{
            sipCodigoPostal.setValue(_codigoPostal);
        }
    }
    
    public String getCalle(){
        return (sspCalle == null)? sCalle: sspCalle.get();
    }
    
    public int getManzana(){
        return (sipManzana == null)? manzana: sipManzana.get();
    }
    
    public int getLote(){
        return (sipLote == null)? lote: sipLote.get();
    }
    
    public String getColonia(){
        return (sspColonia == null)? sColonia: sspColonia.get();
    }
    
    public String getMunicipio(){
        return (sspMunicipio == null)? sMunicipio: sspMunicipio.get();
    }
    
    public String getEstado(){
        return (sspEstado == null)? sEstado: sspEstado.get();
    }
    
    public int getCodigoPostal(){
        return (sipCodigoPostal == null)? codigoPostal: sipCodigoPostal.get();
    }
    
    public StringProperty callePorperty(){
        if(sspCalle == null){
            sspCalle = new SimpleStringProperty(this, "sspCalle", sCalle);
        }
        
        return sspCalle;
    }
            
    public IntegerProperty manzanaPorperty(){
        if(sipManzana == null){
            sipManzana = new SimpleIntegerProperty(this, "sipManzana", manzana);
        }        
        return sipManzana;
    }
    
    public IntegerProperty loteProperty(){
        if(sipLote == null){
            sipLote = new SimpleIntegerProperty(this, "sipLote", lote);
        }
        return sipLote;
    }
    
    public StringProperty coloniaPorperty(){
        if(sspColonia == null){
            sspColonia = new SimpleStringProperty(this, "sspColonia", sColonia);
        }
        return sspColonia;
    }
    
    public StringProperty municipioProperty(){
        if(sspMunicipio == null){
            sspMunicipio = new SimpleStringProperty(this, "sspMunicipio", sMunicipio);
        }
        
        return sspMunicipio;
    }
    
    public StringProperty estadoProperty(){
        if(sspEstado == null){
            sspEstado = new SimpleStringProperty(this, "sspEstado", sEstado);
        }
        return sspEstado;
    }
    
    public IntegerProperty codigoPostalProperty(){
        if(sipCodigoPostal == null){
            sipCodigoPostal = new SimpleIntegerProperty(this, "sipCodigoPostal", codigoPostal);
        }
        return sipCodigoPostal;
    }
    
}
