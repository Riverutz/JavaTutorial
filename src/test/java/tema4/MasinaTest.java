package tema4;

import org.testng.annotations.Test;

public class MasinaTest {
    @Test
    public void metodaTest(){
        System.out.println(" ");
        System.out.println("--- VOLKSWAGEN GOLF GTI ---");
        System.out.println(" ");
        Masina Volkswagen = new Masina("Volkswagen", "Golf GTI", 41000, "Hatchback",
                2024, 12.541f, "Benzina Super", 2000,
                300, "Automata", true);
        Volkswagen.prezentareMasina();
        Volkswagen.verificareKm();
        Volkswagen.verificareImpozit();
        System.out.println(" ");
        System.out.println("--- AUDI A4 ---");
        System.out.println(" ");
        Masina Audi = new Masina("Audi", "A4", 25000,"Sedan",
                2019, 109.456f, "Diesel", 3000,
                231, "Automata", true);
        Audi.prezentareMasina();
        Audi.verificareKm();
        Audi.verificareImpozit();
        System.out.println(" ");
        System.out.println("--- Alfa Romeo Giulietta ---");
        System.out.println(" ");
        Masina Alfa = new Masina("Alfa", "Romeo", 6199, "Compacta",
                2010, 244.411f, "Diesel", 1598,
                105, "Manuala", true);
        Alfa.prezentareMasina();
        Alfa.verificareKm();
        Alfa.verificareImpozit();

    }
}
