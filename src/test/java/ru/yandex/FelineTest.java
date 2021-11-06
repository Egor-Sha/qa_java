package ru.yandex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFelineFamilyTest() {
        Feline feline = new Feline();
        String actualFelineFamily = feline.getFamily();
        String expectedFelineFamily = "Кошачьи";
        assertEquals(expectedFelineFamily, actualFelineFamily);
    }

    @Test
    public void getKittensRealValueEqualsFinalValueTest() {
        Feline feline = new Feline();
        int actualKittensAmount = feline.getKittens(9);
        int expectedKittensAmount = 9;
        assertEquals("No coincidence of the numbers of kittens",expectedKittensAmount, actualKittensAmount);
    }

    @Test
    public void getKittensNoValueTest() {
        Feline feline = new Feline();
        int actualKittensAmount = feline.getKittens();
        int expectedKittensAmount = 1;
        assertEquals("Just 1 case possible: give nothing - get 1",expectedKittensAmount, actualKittensAmount);
    }
}
