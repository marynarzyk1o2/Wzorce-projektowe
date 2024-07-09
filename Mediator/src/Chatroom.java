// Konkretna implementacja Mediatora (Chatroom)
import java.util.List;
import java.util.ArrayList;
public class Chatroom implements Mediator {
    @Override
    public void wyslijWiadomosc(String wiadomosc, Uzytkownik nadawca) {
        // Symulacja przekazywania wiadomości do wszystkich użytkowników (poza nadawcą)
        for (Uzytkownik uzytkownik : uzytkownicy) {
            if (uzytkownik != nadawca) {
                uzytkownik.odbierz(wiadomosc);
            }
        }
    }

    private List<Uzytkownik> uzytkownicy;

    public Chatroom() {
        this.uzytkownicy = new ArrayList<>();
    }

    public void dolacz(Uzytkownik uzytkownik) {
        this.uzytkownicy.add(uzytkownik);
        uzytkownik.mediator = this;
    }
}
