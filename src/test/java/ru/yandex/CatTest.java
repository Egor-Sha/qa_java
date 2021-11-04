package ru.yandex;

import org.junit.Test;
import org.mockito.Mock;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getCatSoundTest() {
        final Cat cat = new Cat(feline);
        final String expectedSound = "Мяу";
        final String actualSound = cat.getSound();
        assertEquals("Wrong sound", expectedSound, actualSound);
    }

    @Test
    public void getMeatFoodListForPredatorTest() {
        Feline feline = new Feline();
        final Cat cat = new Cat(feline);
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = null;
        try {
            actualFoodList = cat.getFood();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(expectedFoodList, actualFoodList);
    }

}
