// Konkretna klasa fabryki SUV-ów, implementująca metodę fabrykującą
public class FabrykaSUVow extends FabrykaSamochodow {
    @Override
    protected Samochod wybierzSamochod() {
        return new SUV(); // Zwraca nowego SUV-a
    }
}