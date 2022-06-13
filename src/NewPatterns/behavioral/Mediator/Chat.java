package NewPatterns.behavioral.Mediator;

public interface Chat {
    void sendMessage(String message, User user);

    void addUserToChat(User user);
}
