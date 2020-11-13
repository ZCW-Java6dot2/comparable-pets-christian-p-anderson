package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void speakTest(){
        //Given
        Cat testCat = new Cat("");
        String expected = "meow!";

        //when

        String actual = testCat.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCatNameTest(){
        //Given
        String catName = "jon";
        Cat testCat = new Cat("");

        //When
        String expected = catName;
        String actual = testCat.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setCatNameTest(){
        //Given
        Cat testCat = new Cat("");

        //When
        String expected = "jessie";
        testCat.setName(expected);

        String actual = testCat.getName();
        Assert.assertEquals(expected, actual);

    }

}

