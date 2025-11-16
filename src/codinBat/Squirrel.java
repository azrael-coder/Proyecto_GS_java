package codinBat;
public class Squirrel {
    public boolean squirrelPlay(int temp, boolean isSummer) {

        if (temp >= 60 && temp <= 90)
            return true;
        else if (isSummer && temp >=60 && temp <= 100)
            return true;
        else
            return false;
    }

}
