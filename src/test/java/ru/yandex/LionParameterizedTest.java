package ru.yandex;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedMane;

    public LionParameterizedTest(String sex, boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Mock
    private Feline feline;
    
    @Parameterized.Parameters
    public static Object[][] giveSexGetManeExistingDataTest() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        final Lion lion = new Lion(sex, feline);
        final boolean actualMane = lion.doesHaveMane();
        assertEquals(expectedMane, actualMane);
    }

}
