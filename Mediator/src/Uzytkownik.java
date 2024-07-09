// Abstrakcyjna klasa Użytkownika
public abstract class Uzytkownik {
    protected Mediator mediator;
    protected String nazwa;

    public Uzytkownik(Mediator mediator, String nazwa) {
        this.mediator = mediator;
        this.nazwa = nazwa;
    }

    public abstract void wyslij(String wiadomosc);
    public abstract void odbierz(String wiadomosc);
}