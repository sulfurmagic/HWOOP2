public class Radio {
    // Поля
    private int currentRadioStation;
    private int currentSoundLevel;

    private final int minVolume = 0;
    private final int maxVolume = 100;

    private final int minAmountOfStations = 0;
    private int currentAmountOfStations;
    private int maxRadioStation;

    // Конструкторы
    public Radio() {
        this.currentAmountOfStations = 10;
        this.maxRadioStation = currentAmountOfStations - 1;
    }

    public Radio(int amountOfStations) {
        if (amountOfStations > 0) {
            this.currentAmountOfStations = amountOfStations;
        } else {
            this.currentAmountOfStations = 10;
        }
        this.maxRadioStation = this.currentAmountOfStations - 1;
    }

    // Методы
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
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
        if (currentSoundLevel < maxVolume) {
            currentSoundLevel++;
        }
    }

    public void lowerSound() {
        if (currentSoundLevel > minVolume) {
            currentSoundLevel--;
        }
    }

    public int getCurrentAmountOfStations() {
        return currentAmountOfStations;
    }

    public void setCurrentAmountOfStations(int currentAmountOfStations) {
        if (currentAmountOfStations > 0) {
            this.currentAmountOfStations = currentAmountOfStations;
            this.maxRadioStation = this.currentAmountOfStations - 1;
        }
    }
}