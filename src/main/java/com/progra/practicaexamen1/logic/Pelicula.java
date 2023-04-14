/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra.practicaexamen1.logic;

/**
 *
 * @author xarthy
 */
public class Pelicula {
    private String name;
    private double duration;
    private String genre;
    private String audience;

    public Pelicula() {
    }

    public Pelicula(String name, double duration, String genre, String audience) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.audience = audience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "name=" + name + ", duration=" + duration + ", genre=" + genre + ", audience=" + audience + '}';
    }
}
