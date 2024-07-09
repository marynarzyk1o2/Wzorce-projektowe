// Konkretny dekorator dodający dodatkowy ser do zamówienia
public class DodatkowySer extends Dodatek {
    public DodatkowySer(Zamowienie zamowienie) {
        super(zamowienie);
    }

    public String opis() {
        return zamowienie.opis() + ", dodatkowy ser";
    }

    public double koszt() {
        return zamowienie.koszt() + 2.0;
    }
}

