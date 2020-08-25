package Entities;

import Components.Mood;

public class Rainbow {
    private boolean _PickedUpRainbow = false;
    public boolean PickedUpRainbow;

    public void setPickedUpRainbow(boolean PickedUpRainbow){
        _PickedUpRainbow = PickedUpRainbow;
    }

    public boolean getPickedUpRainbow(){
        return _PickedUpRainbow;
    }
    public void Rainbow(Mood mood){
        mood.setMood("Happy");
    }



}
