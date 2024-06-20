// Klasa reprezentująca podstawowe zamówienie
public class PodstawoweZamowienie implements Zamowienie {
    @Override
    public String opis() {
        return "Zamówienie podstawowe";
    }

    @Override
    public double koszt() {
        return 10.0;
    }
}