// Klient demonstrujący użycie wzorca Mediatora
public class KlientChatroom {
    public static void main(String[] args) {
        Chatroom chatroom = new Chatroom();

        Uzytkownik uzytkownik1 = new UzytkownikImpl(chatroom, "Jan");
        Uzytkownik uzytkownik2 = new UzytkownikImpl(chatroom, "Anna");
        Uzytkownik uzytkownik3 = new UzytkownikImpl(chatroom, "Piotr");

        chatroom.dolacz(uzytkownik1);
        chatroom.dolacz(uzytkownik2);
        chatroom.dolacz(uzytkownik3);

        uzytkownik1.wyslij("Cześć wszystkim!");
        uzytkownik2.wyslij("Hej Jan!");
        uzytkownik3.wyslij("Witajcie!");


    }
}