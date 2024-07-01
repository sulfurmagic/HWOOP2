public class Radio {
    private int currentRadioStation;
    private int currentSoundLevel;

    public int getCurrentRadioStation(){
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation){
        if (newCurrentRadioStation > 9){
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }
    public void previousStation() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getCurrentSoundLevel(){
        return currentSoundLevel;
    }

    public void setCurrentSoundLevel(int newCurrentSoundLevel){
        if (newCurrentSoundLevel > 100){
            return;
        }
        if (newCurrentSoundLevel < 0) {
            return;
        }
        currentSoundLevel = newCurrentSoundLevel;
    }



    public void higherSound() {
        if (currentSoundLevel >= 100) {
            return;
        } else {
            currentSoundLevel = currentSoundLevel + 1;
        }
    }

    public void lowerSound() {
        if (currentSoundLevel <= 0) {
            return;
        } else {
            currentSoundLevel = currentSoundLevel - 1;
        }
    }

}