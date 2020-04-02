package komplex;

import org.junit.Test;

import static org.mockito.Mockito.*;


public class UserControllerTest {

    @Test
    public void save() {
     //   String name = "jóska";
        UserService userService = mock(UserService.class);
        NeptunCodeGenerator neptunCodeGenerator = mock(NeptunCodeGenerator.class);
        UserDto userDto = mock(UserDto.class);
        User user = mock(User.class);
        UserController userController = new UserController(userService, neptunCodeGenerator);
        userService.save(user);
        userController.save(userDto);
        verify(userService, times(1)).save(user);


    }
}