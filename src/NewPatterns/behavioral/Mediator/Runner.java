package NewPatterns.behavioral.Mediator;

public class Runner {
    public static void main(String[] args) {
        Chat chat = new SimpleTextChat();

        User userCpp = new CppDeveloper(chat, "Tomas");
        User userJava = new JavaDeveloper(chat, "Ann");

        chat.addUserToChat(userCpp);
        chat.addUserToChat(userJava);

        chat.sendMessage("TEST Chat", userCpp);
        chat.sendMessage("TEST Chat", userJava);
    }
}
