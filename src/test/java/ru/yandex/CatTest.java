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
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals("Wrong sound", expectedSound, actualSound);
    }

    @Test
    public void getMeatFoodListForPredatorTest() throws Exception{
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = cat.getFood();
        assertEquals(expectedFoodList, actualFoodList);
    }
}

