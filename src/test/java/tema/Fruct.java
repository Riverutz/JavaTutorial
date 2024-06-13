package tema;

import org.testng.annotations.Test;

public class Fruct {
    public String nume;
    public String tip;
    public String provenienta;
    public Integer calitate;
    public Float pret;
    public Double gramaj;
    public Boolean esteFructExotic;

    @Test
    public void metodaTest () {
        descriereFruct();

        System.out.println("===FRUCTE COMUNE===");

        descriereOriceFruct("Mere", "fruct comun", "Romania", 1, 3.50f, 50.0, false);
        descriereOriceFruct("Pere", "fruct comun", "Polonia", 1, 4.99f, 54.0, false);
        descriereOriceFruct("Cirese", "fruct comun", "Romania", 1, 45.00f, 10.1, false);

        System.out.println("===FRUCTE EXOTICE===");

        descriereOriceFruct("Kiwi", "fruct exotic", "Turcia", 2, 8.0f, 100.0, true);
        descriereOriceFruct("Ananas", "fruct exotic", "Costa Rica", 2, 12.98f, 1200.0, true);
        descriereOriceFruct("Mango", "fruct exotic", "Spania", 1, 7.49f, 200.0, true);
        descriereOriceFruct("Pitaya - Fructul dragonului", "fruct exotic", "Vietnam", 2, 29.49f, 350.0, true);

    }

    //Descrierea unui fruct
    public void descriereFruct () {
        nume = "Banana";
        tip = "fruct comun";
        provenienta = "Columbia";
        calitate = 1;
        pret = 8.0f;
        gramaj = 100.0;
        esteFructExotic = true;

        System.out.println("Nume fruct: " + nume);
        System.out.println("Este un " + tip);
        System.out.println("Tara de Origine: " + provenienta);
        System.out.println("Calitate: Clasa " + calitate + " ");
        System.out.println("Pret per KG: " + pret + " RON");
        System.out.println("Gramajul: " + gramaj + " gr");
        System.out.println("Este un fruct exotic ? " + esteFructExotic);
    }

    //Descriere orice fruct
    public void descriereOriceFruct (String nume, String tip, String provenienta, Integer calitate, Float pret, Double gramaj, Boolean esteFructExotic  ) {
        System.out.println("Nume fruct: " + nume);
        System.out.println("Este un " + tip);
        System.out.println("Tara de Origine: " + provenienta);
        System.out.println("Calitate: Clasa " + calitate + " ");
        System.out.println("Pretul per KG " + pret + " RON");
        System.out.println("Gramajul: " + gramaj + " GR");
        System.out.println("Este un fruct exotic ? " + esteFructExotic);

    }
}
