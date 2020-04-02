package komplex;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class UserTest {

    @Test
    public void getName() {
        String name = "Béla";
        User user = new User(name, true, "AAA111");
        Assert.assertEquals(name, user.getName());


    }

    @Test
    public void isEnabled() {
        boolean enable = true;
        User user = new User("Pista", enable, "AAA111");
        Assert.assertEquals(enable, user.isEnabled());

    }

    @Test
    public void getNeptunkod() {
        String neptunkod = "AAA111";
        User user = new User("Jóska", true, neptunkod);
        Assert.assertEquals(neptunkod, user.getNeptunkod());

    }
}