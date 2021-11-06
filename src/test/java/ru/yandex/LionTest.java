package ru.yandex;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
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
        String incorrectSexForLion = "Неизвестно";
        Lion lion = new Lion(incorrectSexForLion, feline);
        lion.getFood();
    }
}
