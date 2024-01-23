package com.company;

abstract class Vehine {
    private boolean isActive;
    abstract public void draw(boolean isActive);
    public Vehine(boolean isActive){
        this.isActive=isActive;
    }
    public Vehine(){ this.isActive=true;}

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
