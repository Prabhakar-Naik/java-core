package com.springboot.generics.genericinterface;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public class Bottle {

    private Integer id;
    private String name;
    private String color;
    private int litre;

    public Bottle(Integer id, String name, String color, int litre) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.litre = litre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLitre() {
        return litre;
    }

    public void setLitre(int litre) {
        this.litre = litre;
    }
}
