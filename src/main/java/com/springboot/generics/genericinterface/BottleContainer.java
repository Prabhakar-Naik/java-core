package com.springboot.generics.genericinterface;

/**
 * @author prabhakar, @Date 31-12-2024
 */
public class BottleContainer implements Container<Bottle>{

    private Bottle bottle;

    @Override
    public void add(Bottle value) {
//        this.bottle.setId(value.getId());
//        this.bottle.setName(value.getName());
//        this.bottle.setColor(value.getColor());
//        this.bottle.setLitre(value.getLitre());
        this.bottle = value;
    }

    @Override
    public Bottle get() {
        return bottle;
    }

    @Override
    public String toString() {
        return "BottleContainer{" +
                "bottle=" + bottle +
                '}';
    }
}
