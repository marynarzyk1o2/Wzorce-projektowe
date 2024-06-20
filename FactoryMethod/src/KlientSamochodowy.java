// Klasa klienta demonstrująca użycie fabryk samochodów
public class KlientSamochodowy {
    public static void main(String[] args) {
        // Tworzenie fabryki sedanów i produkcja sedana
        System.out.println("Klient: Produkuje sedana");
        FabrykaSamochodow fabrykaSedanow = new FabrykaSedanow();
        fabrykaSedanow.produkujSamochod();

        // Tworzenie fabryki SUV-ów i produkcja SUV-a
        System.out.println("\nKlient: Produkuje SUV-a");
        FabrykaSamochodow fabrykaSUVow = new FabrykaSUVow();
        fabrykaSUVow.produkujSamochod();
    }
}