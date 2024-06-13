package tema3;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarteDeBucate {


@Test
    public void carteDeBucate() {
        Map<String, List<String>> gustulFericirii = new HashMap<>();

        List<String> placinteFillo = new ArrayList<>();

        placinteFillo.add("Un pahar de lapte (250gr) de temperatura camerei");
        placinteFillo.add("1 linguriță de zahăr");
        placinteFillo.add("Jumătate linguriță de sare");
        placinteFillo.add("Jumătate linguriță praf de copt");
        placinteFillo.add("Jumătate linguriță drojdie uscată ( sau proaspătă - 7 gr)");
        placinteFillo.add("4 linguri ulei");
        placinteFillo.add("Făină cît cuprinde ( aluat moale ca pentru plăcinte)");

        List<String> ciorbaRadauteana = new ArrayList<>();
        ciorbaRadauteana.add("1 kg pulpe si piept de pui");
        ciorbaRadauteana.add("2 radacini patrunjel");
        ciorbaRadauteana.add("100 g radacina telina");
        ciorbaRadauteana.add("2 radacini pastarnac");
        ciorbaRadauteana.add("2-3 morcovi medii");
        ciorbaRadauteana.add("1 praz (doar partea alba)");
        ciorbaRadauteana.add("4-5 catei usturoi");
        ciorbaRadauteana.add("2 galbenusuri");
        ciorbaRadauteana.add("250 ml smantana fermentata");
        ciorbaRadauteana.add("otet dupa gust (cca 50 ml)");
        ciorbaRadauteana.add("4 l apa");
        ciorbaRadauteana.add("sare");
        ciorbaRadauteana.add("patrunjel");

        List<String> papanasiPrajiti = new ArrayList<>();
        papanasiPrajiti.add("B300 g branza de vaci");
        papanasiPrajiti.add("200 g faina");
        papanasiPrajiti.add("50 g zahar");
        papanasiPrajiti.add("1 lingurita praf de copt (4 g)");
        papanasiPrajiti.add("1 lingurita plina coaja rasa de portocale");
        papanasiPrajiti.add("1 varf cutit sare");
        papanasiPrajiti.add("1 pastaie vanilie/1 plic zahar vanilat");
        papanasiPrajiti.add("500 – 600 ml ulei de arahide sau ulei de floarea soarelui");

        gustulFericirii.put("Placinte cu foi Fillo", placinteFillo);
        gustulFericirii.put("Ciorba radauteana", ciorbaRadauteana);
        gustulFericirii.put("Papanasi prajiti", papanasiPrajiti);

        System.out.println("Gustul Fericii - Fiecare gust are povestea sa, iar fericirea se află în a descoperi și a savura acele povești.\n");
        System.out.println("--- CUPRINS ---");
        System.out.println(" ");
        System.out.println("Placinte in foi Fillo");
        System.out.println("Ciorba Radauteana");
        System.out.println("Papanasi Prajiti");
    System.out.println(" ");
        System.out.println("--- Procedura de preparare ---");

        for (String key : gustulFericirii.keySet()) {
            System.out.println(" ");

            System.out.println(" ");
            System.out.println("Numele retetei este: " + key);
            System.out.println("Ingriedentele folosite sunt: " + gustulFericirii.get(key));

        }
    }
}
