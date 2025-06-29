import java.util.Objects;

public class Contact {
    private final String nick;
    // Объявили свойство nick (никнейм)
    private String phone;
    // Объявили свойство phone (номер телефона)

    public Contact(String nick, String phone) {
        this.nick = nick;
        this.phone = phone;
    }

    public String getNick() {
        return nick;
        // Создали геттер для nick
    }

    public String getPhone() {
        return phone;
        // Создали геттер для phone
    }

    public void setPhone(String phone) {
        this.phone = phone;
        // Создали сеттер для phone
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(nick, contact.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick);
    }
}
