// Konkretna klasa fabryki sedanów, implementująca metodę fabrykującą
public class FabrykaSedanow extends FabrykaSamochodow {
    @Override
    protected Samochod wybierzSamochod() {
        return new Sedan(); // Zwraca nowy sedan
    }
}
