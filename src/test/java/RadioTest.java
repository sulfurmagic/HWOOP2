import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetStation(){
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotGoOverSetStation(){
        radio.setCurrentRadioStation(567);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotGoUnderSetStation(){
        radio.setCurrentRadioStation(-3);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoTo0If9(){
        radio.setCurrentRadioStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoTo9If0(){
        radio.setCurrentRadioStation(0);
        radio.previousStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToNextStation(){
        radio.setCurrentRadioStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
    }

    @Test
    public void shouldGoToPreviousStation(){
        radio.setCurrentRadioStation(3);
        radio.previousStation();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();
    }

    @Test
    public void shouldSetSoundLevel() {
        radio.setCurrentSoundLevel(1);

        int expected = 1;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeSoundLouder(){
        radio.setCurrentSoundLevel(1);
        radio.higherSound();

        int expected = 2;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotMakeSoundLouderThan100(){
        radio.setCurrentSoundLevel(100);
        radio.higherSound();

        int expected = 100;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeSoundLower(){
        radio.setCurrentSoundLevel(1);
        radio.lowerSound();

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMakeSoundLowerThan0(){
        radio.setCurrentSoundLevel(0);
        radio.lowerSound();

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundtoLowerThan0(){
        radio.setCurrentSoundLevel(-1);

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundtoHigherThan100(){
        radio.setCurrentSoundLevel(101);

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

}