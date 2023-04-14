/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra.practicaexamen1.logic;

/**
 *
 * @author xarthy
 */
public class Cliente {
    private String name;
    private String id;
    private String card_num;

    public Cliente() {
    }
    
    public Cliente(String name, String id, String card_num) {
        this.name = name;
        this.id = id;
        this.card_num = card_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCard_num() {
        return card_num;
    }

    public void setCard_num(String card_num) {
        this.card_num = card_num;
    }

    @Override
    public String toString() {
        return "Cliente{" + "name=" + name + ", id=" + id + ", card_num=" + card_num + '}';
    }
}
