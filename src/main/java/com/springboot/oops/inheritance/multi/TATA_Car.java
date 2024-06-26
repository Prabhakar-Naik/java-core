package com.springboot.oops.inheritance.multi;

/**
 * @author prabhakar, @Date 26-06-2024
 */
public class TATA_Car extends Car{

    String ac;
    String smartScreen;
    String seating;
    String logo;

    public TATA_Car() {
    }

    public TATA_Car(String ac, String smartScreen, String seating, String logo) {
        this.ac = ac;
        this.smartScreen = smartScreen;
        this.seating = seating;
        this.logo = logo;
    }

    public TATA_Car(String engine, String cc, String doors, String tires, String ac, String smartScreen, String seating, String logo) {
        super(engine, cc, doors, tires);
        this.ac = ac;
        this.smartScreen = smartScreen;
        this.seating = seating;
        this.logo = logo;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getSmartScreen() {
        return smartScreen;
    }

    public void setSmartScreen(String smartScreen) {
        this.smartScreen = smartScreen;
    }

    public String getSeating() {
        return seating;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "TATA_Car{" +
                "ac='" + ac + '\'' +
                ", smartScreen='" + smartScreen + '\'' +
                ", seating='" + seating + '\'' +
                ", logo='" + logo + '\'' +
                ", engine='" + engine + '\'' +
                ", cc='" + cc + '\'' +
                ", doors='" + doors + '\'' +
                ", tires='" + tires + '\'' +
                '}';
    }

}
