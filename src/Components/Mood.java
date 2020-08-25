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

    //Sad after bumping into obstacle or falling off a cloud

    public String PuppyMood (Mood mood){
        String puppymood = null;
        switch (mood.getMood()){
            case "Happy":puppymood ="Puppy is happy!";
                    break;
            case "Sad": puppymood = "Puppy is sad :(.";
                    break;
        }
        return puppymood;

    }
}
