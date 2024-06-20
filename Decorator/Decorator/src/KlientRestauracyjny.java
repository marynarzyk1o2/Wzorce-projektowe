// Klient demonstrujący użycie wzorca Dekorator
public class KlientRestauracyjny {
    public static void main(String[] args) {
        Zamowienie podstawoweZamowienie = new PodstawoweZamowienie();

        // Dodanie dodatkowego sera do zamówienia
        Zamowienie zamowienieZSerem = new DodatkowySer(podstawoweZamowienie);
        System.out.println("Opis zamówienia: " + zamowienieZSerem.opis());
        System.out.println("Koszt zamówienia: " + zamowienieZSerem.koszt());

        // Dodanie dodatkowych frytek do zamówienia
        Zamowienie zamowienieZFrytkami = new DodatkoweFrytki(zamowienieZSerem);
        System.out.println("\nOpis zamówienia: " + zamowienieZFrytkami.opis());
        System.out.println("Koszt zamówienia: " + zamowienieZFrytkami.koszt());
    }
}