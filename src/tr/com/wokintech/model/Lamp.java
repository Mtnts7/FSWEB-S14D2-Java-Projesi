package tr.com.wokintech.model;

import tr.com.wokintech.model.enums.Lamptype;

public class Lamp {
    private int globRating;
    private boolean batteryPowered;
    private Lamptype style;
    private boolean turnedOn;

    public Lamp(int globRating, boolean hasBattery, Lamptype style,boolean turnedOn) {
        this.globRating = globRating;
        this.batteryPowered = batteryPowered;
        this.style = style;
        this.turnedOn=false;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBatteryPowered() {
        return batteryPowered;
    }

    public Lamptype getStyle() {
        return style;
    }


    public void toggle(){
        turnedOn=!turnedOn;
    }
    public void status(){
        String status = turnedOn?"on":"off";
        System.out.println("Lamp is " +status);

    }


}
