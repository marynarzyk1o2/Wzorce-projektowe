// Klasa abstrakcyjna definiująca metodę fabrykującą oraz metodę do produkcji samochodów
public abstract class FabrykaSamochodow {
    // Abstrakcyjna metoda fabrykująca, która będzie implementowana przez podklasy
    protected abstract Samochod wybierzSamochod();

    // Metoda produkująca samochód, wykorzystująca metodę fabrykującą
    public void produkujSamochod() {
        Samochod samochod = wybierzSamochod(); // Wybór samochodu
        samochod.produkuj(); // Produkcja samochodu
    }
}