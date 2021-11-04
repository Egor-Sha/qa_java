package ru.yandex;

import org.junit.Test;
import org.mockito.Mock;

public class LionTest {

    @Mock
    private Feline feline;

    @Test (expected = Exception.class)
    public void doesHaveManeExceptionTest() throws Exception {
        final String unknownSex = "Неизвестно";
        new Lion(unknownSex, feline);
    }

    @Test (expected = Exception.class)
    public void getFoodExceptionTest() throws Exception {
        final String correctFelineSex = "Самка";
        final String unknownAnimalKind = "Хищник2";
        final Lion lion = new Lion(correctFelineSex, feline);
        lion.getFood(unknownAnimalKind);
    }
}
