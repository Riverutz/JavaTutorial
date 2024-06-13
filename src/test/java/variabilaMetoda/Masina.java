package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {
    public String marca;
    public String modelul;
    public String tip;
    public Integer anul;
    public Float pret;
    public Double greutate;
    public Boolean esteDecapotabila;


    @Test
    public void metodaTest () {
        afisareMasina();
        System.out.println("===Exemplu 2===");
        afisareOriceMasina("Opel", "Accident", "Sedan", 2015, 25999.9f, 1500.0, true);
        System.out.println("===Exemplu 3===");
        afisareOriceMasina("Dacia", "Spring", "Masina de oras", 2023, 15112.9f, 1000.0, true);

    }
    //Descriem o masina
    public void afisareMasina () {
        marca = "Opel";
        modelul = "Accident";
        tip = "Sedan";
        anul = 2015;
        pret = 25999.9f;
        greutate = 1500.0;
        esteDecapotabila = false;

        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + modelul);
        System.out.println("Tipul caroseriei este " + tip);
        System.out.println("Anul fabricatiei este " + anul);
        System.out.println("Pretul masinii este " + pret + " de EURO");
        System.out.println("Masina are o greutata de " + greutate + " de KG");
        System.out.println("Masina este decapotabila?" + esteDecapotabila);

    }

    //Descriem orice masina
    public void afisareOriceMasina (String marca, String modelul, String tip, Integer anul, Float pret, Double greutate, Boolean esteDecapotabila) {

        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + modelul);
        System.out.println("Tipul caroseriei este " + tip);
        System.out.println("Anul fabricatiei este " + anul);
        System.out.println("Pretul masinii este " + pret + " de EURO");
        System.out.println("Masina are o greutata de " + greutate + " de KG");
        System.out.println("Masina este decapotabila?" + esteDecapotabila);

    }
}
