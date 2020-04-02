package komplex;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class LengthValidatorTest {

    @Test
    public void isValid() {
        User user = mock(User.class);
        String asd= "béluska";
        when(user.getName()).thenReturn(asd);
        LengthValidator lngv = new LengthValidator();
        boolean valid = lngv.isValid(user);
        Assert.assertEquals(true, valid);
        verify(user, times(1)).getName();
    }
}