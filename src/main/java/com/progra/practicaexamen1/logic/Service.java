/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra.practicaexamen1.logic;
import java.util.ArrayList;

/**
 *
 * @author xarthy
 */
public class Service {
    private static Service uniqueInstance;
    
    public static Service instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Service();
        }
        return uniqueInstance;
    }
    
    ArrayList<Tiquete> tickets;
    ArrayList<Tanda> screenings;
    
    private Service() {
       screenings = new ArrayList();
       screenings.add(new Tanda(new Pelicula("Mario", 1.32, "Action", "TP"), "2D DOB", "14:20", "Viernes 14 de Abril", "Sala 6", 3500, 2800));
       screenings.add(new Tanda(new Pelicula("Mario", 1.32, "Action", "TP"), "3D DOB", "12:20", "Viernes 14 de Abril", "Sala 7", 4400, 4000));
       screenings.add(new Tanda(new Pelicula("John Wick 4", 2.49, "Action", "M-18"), "2D SUB", "20:00", "Sábado 15 de Abril", "Sala 2", 3500, 2800));
       screenings.add(new Tanda(new Pelicula("John Wick 4", 2.49, "Action", "M'18"), "3D DOB", "17:20", "Viernes 14 de Abril", "Sala 3", 4400, 4000));
    }
    
    public ArrayList<Tanda> peliculaFind(String name) throws Exception {
        ArrayList<Tanda> result = new ArrayList();
        for (int i = 0; i < screenings.size(); i++) {
            if (screenings.get(i).getMovie().getName().equals(name)) {
                result.add(screenings.get(i));
            }
        }
        return result;
    }
    
    public Tiquete ticketFind(String code) throws Exception {
        for(int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getTicket_code().equals(code)) {
                return tickets.get(i);
            }
        }
        return null;
    }
}
