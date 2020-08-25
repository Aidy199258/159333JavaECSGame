package Entities;

public class Puppy {
    private boolean _alive = false;
    public boolean Alive;

    public boolean getLife() {
        return _alive;
    }

    public void setLife(boolean Alive) {
        _alive = Alive;
    }

    public String LifeStatus(){
        //The status/message of puppy's life status
        String lifestatus = null;
        if (_alive){
            lifestatus = "I'm a happy living puppy.";

        }else {lifestatus = "Sobbing...I died...";}
        return lifestatus;


    }



}
