/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra.practicaexamen1.presentation.cartelera;

import com.progra.practicaexamen1.logic.Tanda;
import java.util.ArrayList;

/**
 *
 * @author xarthy
 */
public class Model {
    ArrayList<Tanda> cartelera;
    Tanda seleccionado;
    
    public Model() {
        this.reset();
    }
    
    public void reset(){ 
        ArrayList<Tanda> rows = new ArrayList<>();        
        seleccionado=null;  
        this.setCartelera(rows);
    }
    
    public void setCartelera(ArrayList<Tanda> cartelera){
        this.cartelera = cartelera;    
    }

     public ArrayList<Tanda> getCartelera() {
        return cartelera;
    }

    public Tanda getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Tanda seleccionado) {
        this.seleccionado = seleccionado;
    }
}
