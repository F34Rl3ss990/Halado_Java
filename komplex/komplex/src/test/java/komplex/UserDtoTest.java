package komplex;

import org.junit.Assert;
import org.junit.Test;



public class UserDtoTest {

    @Test
    public void getName() {
        String name = "jóska";
        UserDto dto = new UserDto(name);
        Assert.assertEquals("jóska", dto.getName());
    }

   @Test
   public  void setName() {
        String name = "Jóska";
        UserDto dto = new UserDto(name);
        dto.setName("Béla");
        Assert.assertEquals("Béla", dto.getName());
    }
}