/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra.practicaexamen1.logic;

/**
 *
 * @author xarthy
 */
public class Tanda {
    private Pelicula movie;
    private String type;
    private String time;
    private String date;
    private String room;
    private double price_general;
    private double price_old_people;

    public Tanda() {
    }

    public Tanda(Pelicula movie, String type, String time, String date, String room, double price_general, double price_old_people) {
        this.movie = movie;
        this.type = type;
        this.time = time;
        this.date = date;
        this.room = room;
        this.price_general = price_general;
        this.price_old_people = price_old_people;
    }

    public Pelicula getMovie() {
        return movie;
    }

    public void setMovie(Pelicula movie) {
        this.movie = movie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public double getPrice_general() {
        return price_general;
    }

    public void setPrice_general(double price_general) {
        this.price_general = price_general;
    }

    public double getPrice_old_people() {
        return price_old_people;
    }

    public void setPrice_old_people(double price_old_people) {
        this.price_old_people = price_old_people;
    }

    @Override
    public String toString() {
        return "Tanda{" + "movie=" + movie + ", type=" + type + ", time=" + time + ", date=" + date + ", room=" + room + ", price_general=" + price_general + ", price_old_people=" + price_old_people + '}';
    }
}
