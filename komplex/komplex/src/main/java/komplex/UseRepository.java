package komplex;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

import java.util.ArrayList;
import java.util.List;

public class UseRepository implements UserModify {
    private final Logger logger = LogManager.getLogger(UseRepository.class);
    private List<User> users = new ArrayList<>();
    public void save(User user) {
        logger.log(Level.INFO, "%s mentve %n", user.getName());
        users.add(user);
    }
    public User getByNektunKod(String neptunkod) {
        for (User user : users) {
            if (user.getNeptunkod().equals(neptunkod)) {
                return user;
            }
        }
        return null;
    }
    public List<User> findAll() {
        return users;
    }
    public List<User> findByEnabledIsTrue() {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.isEnabled()) {
                result.add(user);
            }
        }
        return result;
    }
}
