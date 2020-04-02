package komplex;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;


public class UserServiceImplTest {


    @Test
    public void save() {
        UserModify userModify = mock(UserModify.class);
        List<Validator> validators = new ArrayList<>();
        SpaceValidator spaceValidator = mock(SpaceValidator.class);
        LengthValidator lengthValidator = mock(LengthValidator.class);
        validators.add(spaceValidator);
        validators.add(lengthValidator);
        User user = mock(User.class);
        UserServiceImpl userService = new UserServiceImpl(userModify, validators);
        userModify.save(user);
        userService.save(user);
        verify(userModify, times(1)).save(user);
    }
    @Test
    public void save_When_isValid_false(){
        UserModify userModify = mock(UserModify.class);
        List<Validator> validators = new ArrayList<>();
        SpaceValidator spaceValidator = mock(SpaceValidator.class);
        LengthValidator lengthValidator = mock(LengthValidator.class);
        validators.add(spaceValidator);
        validators.add(lengthValidator);
        User user = mock(User.class);
        UserServiceImpl userService = new UserServiceImpl(userModify, validators);

        when(spaceValidator.isValid(user)).thenReturn(false);
        when(lengthValidator.isValid(user)).thenReturn(false);
        spaceValidator.isValid(user);
        lengthValidator.isValid(user);
        userService.save(user);
        userModify.save(user);
        userService.isValid(user);


        verify(userModify, times(1)).save(user);
        verify(spaceValidator, times(3)).isValid(user);
        verify(lengthValidator, times(1)).isValid(user);
    }
    @Test
    public void save_When_isValid_true(){
        UserModify userModify = mock(UserModify.class);
        List<Validator> validators = new ArrayList<>();
        SpaceValidator spaceValidator = mock(SpaceValidator.class);
        LengthValidator lengthValidator = mock(LengthValidator.class);
        validators.add(spaceValidator);
        validators.add(lengthValidator);
        User user = mock(User.class);
        UserServiceImpl userService = new UserServiceImpl(userModify, validators);

        when(spaceValidator.isValid(user)).thenReturn(true);
        when(lengthValidator.isValid(user)).thenReturn(true);
        spaceValidator.isValid(user);
        lengthValidator.isValid(user);
        userService.save(user);
        userModify.save(user);
        userService.isValid(user);
        verify(userModify, times(2)).save(user);
        verify(spaceValidator, times(3)).isValid(user);
        verify(lengthValidator, times(3)).isValid(user);

    }
}
