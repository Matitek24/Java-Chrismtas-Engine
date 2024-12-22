package subfolder;

public class Main {
    public static void main(String[] args) {
        ChristmasEngine engine = new ChristmasEngine("Fabryka Świętego Mikołaja");

        engine.showName();

        // Tworzenie prezentów
        engine.createGift("Klocki", 2);
        engine.createGift("Lalka", 1);
        engine.createGift("Samochodzik", 3);
        engine.createGift();
        engine.createGift("Dron");

        String[] gifts = {"Pies","Myszka"};
        int[] weights = {3,10};
        engine.createGift(gifts, weights);
        System.out.println(engine.countAvarageWeights() + " Średnia waga prezentów !!!");
        // Wyświetlanie wszystkich prezentów
        engine.showAllGifts();

        // Wyświetlanie liczby prezentów
        System.out.println("Liczba prezentów: " + engine.countGifts());


        Reindeer[] reindeers = {
                new Reindeer("Rudolf", true),
                new Reindeer("Blitzen", true),
                new Reindeer("Dasher", true),
                new Reindeer("Dancer"),
                new Reindeer("Vixen", true),
                new Reindeer("Comet"),
                new Reindeer("Cupid", true),
                new Reindeer("Prancer", false),
                new Reindeer("Donner", true)
        };

        // Tworzymy Świętego Mikołaja i dodajemy prezenty z fabryki
        Santa santa = new Santa(engine, reindeers);
        santa.addGiftFromFactory();  // Dodajemy prezenty do tablicy Santa
        System.out.println("Usunięto "+santa.dropGift());
        System.out.println("Liczba prezentów mikolaja: " + santa.CountSantaGift());
        santa.fly();

        Child alice = new Child("Alice", true, engine);
        Child bob = new Child("Bob", false, engine);

        // Santa daje prezenty
        santa.giveGift(alice);
        santa.giveGift(bob);
        System.out.println("=======");
        alice.changeAttitiude();
        santa.giveGift(alice);
    }
}
