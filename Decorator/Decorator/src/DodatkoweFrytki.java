// Konkretny dekorator dodający dodatkowe frytki do zamówienia
public class DodatkoweFrytki extends Dodatek {
    public DodatkoweFrytki(Zamowienie zamowienie) {
        super(zamowienie);
    }

    public String opis() {
        return zamowienie.opis() + ", dodatkowe frytki";
    }

    public double koszt() {
        return zamowienie.koszt() + 5.0;
    }
}