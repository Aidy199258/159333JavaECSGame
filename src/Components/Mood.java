package Components;

import Entities.Puppy;

public class Mood {
    private String _Mood;
    public String Mood;

    public String getMood() {
        return _Mood;
    }

    public void setMood(String mood) {
        _Mood = mood;
    }


    //Happy after picking up a Rainbow
    public void BecomeHappy(){

    }

    //Sad after bumping into obstacle or falling off a cloud
    public void BecomeSad(){}
}
