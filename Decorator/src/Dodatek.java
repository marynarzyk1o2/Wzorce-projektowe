// Abstrakcyjna klasa dekorująca Zamowienie
public abstract class Dodatek implements Zamowienie {
    protected Zamowienie zamowienie;

    public Dodatek(Zamowienie zamowienie) {
        this.zamowienie = zamowienie;
    }

    public String opis() {
        return zamowienie.opis();
    }

    public double koszt() {
        return zamowienie.koszt();
    }
}
