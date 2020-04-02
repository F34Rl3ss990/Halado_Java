package komplex;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;


public class UseRepositoryTest {

    @Test
    public void save() {
        List<User> users = new ArrayList<>();
        User user = mock(User.class);
        UseRepository useRepository = new UseRepository();
        users.add(user);
        Assert.assertEquals(1,users.size());
        useRepository.save(user);



    }

    @Test
    public void getByNektunKod() {
        List<User> users = new ArrayList<>();
        String neptunkod = "AAA111";
        String neptunkod2= "AAA222";
        User user = mock(User.class);
        UseRepository useRepository = new UseRepository();
        users.add(user);
        when(user.getNeptunkod()).thenReturn(neptunkod2);
        user.getNeptunkod();
        useRepository.save(user);
        User proba2 = useRepository.getByNektunKod(neptunkod);
        Assert.assertEquals(null, proba2);
        verify(user, times(2)).getNeptunkod();
    }
    @Test
    public void getByNektunKod2() {
        List<User> users = new ArrayList<>();
        String neptunkod = "AAA111";
        User user = mock(User.class);
        UseRepository useRepository = new UseRepository();
        users.add(user);
        when(user.getNeptunkod()).thenReturn(neptunkod);
        user.getNeptunkod();
        useRepository.save(user);
        User proba = useRepository.getByNektunKod(neptunkod);
        Assert.assertEquals(neptunkod, user.getNeptunkod());
        Assert.assertEquals(user, proba);
        verify(user, times(3)).getNeptunkod();
    }

    @Test
    public void findAll() {

        UseRepository useRepository = new UseRepository();
        List<User> users = new ArrayList<>();
        User user = mock(User.class);
        users.add(user);
        useRepository.save(user);
        Assert.assertEquals(users, useRepository.findAll());


    }

    @Test
    public void findByEnabledIsTrue() {
        UseRepository useRepository = new UseRepository();
        List<User> users = new ArrayList<>();
        User user = mock(User.class);
        users.add(user);
        when(user.isEnabled()).thenReturn(false);
        user.isEnabled();
        useRepository.save(user);
        Assert.assertEquals(Collections.emptyList(), useRepository.findByEnabledIsTrue());
    }
    @Test
    public void findByEnabledIsTrue2() {
        UseRepository useRepository = new UseRepository();
        List<User> users = new ArrayList<>();
        User user = mock(User.class);
        users.add(user);
        useRepository.save(user);
        when(user.isEnabled()).thenReturn(true);
        user.isEnabled();
        Assert.assertEquals(users, useRepository.findByEnabledIsTrue());
    }
}