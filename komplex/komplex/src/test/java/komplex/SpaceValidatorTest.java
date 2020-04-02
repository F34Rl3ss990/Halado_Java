package komplex;


import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class SpaceValidatorTest {

    @Test
    public void isValid() {
        User user = mock(User.class);
        String asd= "béluska";
        when(user.getName()).thenReturn(asd);
        SpaceValidator sv = new SpaceValidator();
        boolean valid = sv.isValid(user);
        Assert.assertEquals(true, valid);
        verify(user, times(1)).getName();
    }
}