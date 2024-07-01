import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(567);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-3);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationWhenAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationWhenBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDefaultAmountOfStationsWhenNegativeValuePassed() {
        Radio radio = new Radio(-5);

        int expected = 10;
        int actual = radio.getCurrentAmountOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldInitializeWithDefaultConstructor() {
        Radio radio = new Radio();
        int expectedStations = 10;
        int actualStations = radio.getCurrentAmountOfStations();
        Assertions.assertEquals(expectedStations, actualStations);
    }

    @Test
    public void shouldInitializeWithParameterizedConstructor() {
        Radio radio = new Radio(20);
        int expectedStations = 20;
        int actualStations = radio.getCurrentAmountOfStations();
        Assertions.assertEquals(expectedStations, actualStations);
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotGoOverSetStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(567);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotGoUnderSetStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-3);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoTo0IfNextStationOverMax() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoTo9IfPreviousStationUnderMin() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);
        radio.previousStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.previousStation();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundLevel() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(1);

        int expected = 1;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundLevelAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(101);

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundLevelBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(-1);

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeSoundLouder() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(1);
        radio.higherSound();

        int expected = 2;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMakeSoundLouderThan100() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(100);
        radio.higherSound();

        int expected = 100;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeSoundLower() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(1);
        radio.lowerSound();

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMakeSoundLowerThan0() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(0);
        radio.lowerSound();

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAmountOfStations() {
        Radio radio = new Radio();
        radio.setCurrentAmountOfStations(20);

        int expected = 20;
        int actual = radio.getCurrentAmountOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAmountOfStationsTo10ByDefault() {
        Radio radio = new Radio();

        int expected = 10;
        int actual = radio.getCurrentAmountOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToZeroIfNextOnMax() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(radio.getCurrentAmountOfStations() - 1);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToMaxStationIfPrev0() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);
        radio.previousStation();

        int expected = radio.getCurrentAmountOfStations() - 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStaySameIfMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(100);
        radio.higherSound();

        int expected = 100;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStaySameIfMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(0);
        radio.lowerSound();

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }
}