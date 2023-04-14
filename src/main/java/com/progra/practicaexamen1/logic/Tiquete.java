/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra.practicaexamen1.logic;

/**
 *
 * @author xarthy
 */
public class Tiquete {
   private String ticket_code;
   private Cliente client;
   private double cost;

    public Tiquete() {
    }

    public Tiquete(String ticket_code, Cliente client, double cost) {
        this.ticket_code = ticket_code;
        this.client = client;
        this.cost = cost;
    }

    public String getTicket_code() {
        return ticket_code;
    }

    public void setTicket_code(String ticket_code) {
        this.ticket_code = ticket_code;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "ticket_code=" + ticket_code + ", client=" + client + ", cost=" + cost + '}';
    }
}

