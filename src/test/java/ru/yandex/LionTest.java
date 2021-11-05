package ru.yandex;

import org.junit.Test;
import org.mockito.Mock;

public class LionTest {

    @Mock
    private Feline feline;

    @Test (expected = Exception.class)
    public void doesHaveManeExceptionTest() throws Exception {
        String unknownSex = "Неизвестно";
        new Lion(unknownSex, feline);
    }

    @Test (expected = Exception.class)
    public void getFoodExceptionTest() throws Exception {
        Feline feline = new Feline();
        String correctFelineSex = "Самка";
        String unknownAnimalKind = "Неизвестный";
        Lion lion = new Lion(correctFelineSex, feline);
        feline.getFood(unknownAnimalKind);
    }
}
