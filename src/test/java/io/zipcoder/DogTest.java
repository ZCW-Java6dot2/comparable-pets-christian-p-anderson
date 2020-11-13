package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void speakTest(){
        //Given
        Dog testDog = new Dog("");
        String expected = "bark!";

        //when

        String actual = testDog.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getDogNameTest(){
        //Given
        String dogName = "georgie";
        String expected = "georgie";
        Dog testDog = new Dog("");

        //When
        testDog.setName(dogName);
        String actual = testDog.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setDogNameTest(){
        //Given
        Dog testDog = new Dog("");

        //When
        String expected = "zoey";
        testDog.setName(expected);

        String actual = testDog.getName();
        Assert.assertEquals(expected, actual);

    }


}

