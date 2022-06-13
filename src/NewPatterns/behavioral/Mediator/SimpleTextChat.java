package NewPatterns.behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat{
    User javaDeveloper;
    User cppDeveloper;

    List<User> users = new ArrayList<>();

    public void setJavaDeveloper(User javaDeveloper) {
        this.javaDeveloper = javaDeveloper;
    }

    public void setCppDeveloper(User cppDeveloper) {
        this.cppDeveloper = cppDeveloper;
    }

    public void addUserToChat(User user){
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u: users){
            u.getMessage(message);
        }
    }
}
