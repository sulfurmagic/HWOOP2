public class Radio {
    private int currentRadioStation;
    private int currentSoundLevel;

    public int minVolume = 0;
    public int maxVolume = 100;

    public int minAmountOfStations = 0;
    public int currentAmountOfStations = 10;
    private int maxAmountOfStations = currentAmountOfStations;
    public int maxRadioStation = maxAmountOfStations - 1;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxAmountOfStations) {
            return;
        }
        if (newCurrentRadioStation < minAmountOfStations) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void previousStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public int getCurrentSoundLevel() {
        return currentSoundLevel;
    }

    public void setCurrentSoundLevel(int newCurrentSoundLevel) {
        if (newCurrentSoundLevel > maxVolume) {
            return;
        }
        if (newCurrentSoundLevel < minVolume) {
            return;
        }
        currentSoundLevel = newCurrentSoundLevel;
    }


    public void higherSound() {
        if (currentSoundLevel >= maxVolume) {
            currentSoundLevel = maxVolume;
        } else {
            currentSoundLevel = currentSoundLevel + 1;
        }
    }

    public void lowerSound() {
        if (currentSoundLevel <= minVolume) {
            currentSoundLevel = minVolume;
        } else {
            currentSoundLevel = currentSoundLevel - 1;
        }
    }

    //AMOUNT OF STATIONS
    public int getCurrentAmountOfStations() {
        return currentAmountOfStations;
    }

    public void setCurrentAmountOfStations(int currentAmountOfStations) {
        if (currentAmountOfStations > 0) {
            this.currentAmountOfStations = currentAmountOfStations;
            this.maxRadioStation = this.currentAmountOfStations - 1;   }
    }

//    public void setCurrentAmountOfStations(int currentAmountOfStations) {
//        this.currentAmountOfStations = currentAmountOfStations;
//    }

    public Radio() {
        setCurrentAmountOfStations(currentAmountOfStations);
    }

    public void setCurrentAmountOfStations() {
        setCurrentAmountOfStations(10);
    }
}


