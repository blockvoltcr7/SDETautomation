package OCA.EnumsPractice;

import java.util.Arrays;

public enum MusicType {

    //this is an enum with a constructor and a method

    //enum of all days of the week
    ROCK(1), JAZZ(4), CLASSICAL(5);

    private int earDamageFactor;

    private MusicType(int earDamageFactor){
        this.earDamageFactor = earDamageFactor;
    }

    public int getEarDamageFactor(){
        return earDamageFactor;
    }

    public int calcHearingLoss(int hours){
        return hours * earDamageFactor;
    }

    public String toString(){
        return "Music type: " + this.name() + ","+"ordinal is "+this.ordinal()+", ear damage factor: " + this.earDamageFactor;
    }

    //what is this.ordinal()?
    //it is the position of the enum constant in the enum declaration, starting with 0

}


