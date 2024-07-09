// Konkretna implementacja Użytkownika
public class UzytkownikImpl extends Uzytkownik {
    public UzytkownikImpl(Mediator mediator, String nazwa) {
        super(mediator, nazwa);
    }

    @Override
    public void wyslij(String wiadomosc) {
        System.out.println(this.nazwa + " wysyła: " + wiadomosc);
        mediator.wyslijWiadomosc(wiadomosc, this);
    }

    @Override
    public void odbierz(String wiadomosc) {
        System.out.println(this.nazwa + " odbiera: " + wiadomosc);
    }
}
