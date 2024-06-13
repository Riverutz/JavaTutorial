package tema4;

import java.util.List;
import java.util.Map;

public class Masina2 {

    public String marca;
    public String model;
    public String generatie;
    public String caroserie;
    public String culoare;
    public Integer pret;
    public Integer anulFabricatiei;
    public String nrKm;
    public Map<String, String> specificatiiTehnice;
    public List<String> dotariAudio;
    public List<String> dotariConfort;
    public List<String> dotariSistemDeAsistenta;
    public List<String> dotariSistemDeSiguranta;
    public Boolean masinaSH;
    public String masinaAvariata;


    public Masina2(String marca, String model, String generatie, String caroserie, String culoare, Integer pret, Integer anulFabricatiei, String nrKm, Map<String, String> specificatiiTehnice,
                   List<String> dotariAudio, List<String> dotariConfort, List<String> dotariSistemDeAsistenta,
                   List<String> dotariSistemDeSiguranta, Boolean masinaSH, String masinaAvariata) {
        this.marca = marca;
        this.model = model;
        this.generatie = generatie;
        this.caroserie = caroserie;
        this.culoare = culoare;
        this.pret = pret;
        this.anulFabricatiei = anulFabricatiei;
        this.nrKm = nrKm;
        this.specificatiiTehnice = specificatiiTehnice;
        this.dotariAudio = dotariAudio;
        this.dotariConfort = dotariConfort;
        this.dotariSistemDeAsistenta = dotariSistemDeAsistenta;
        this.dotariSistemDeSiguranta = dotariSistemDeSiguranta;
        this.masinaSH = masinaSH;
        this.masinaAvariata = masinaAvariata;
    }

    public void descriereMasina() {

        System.out.println("Marca: " + marca);
        System.out.println("Model: " + model);
        System.out.println("Culoare: " + culoare);
        System.out.println("Pret: " + pret + " de EURO");
        System.out.println("Anul fabricatiei: " + anulFabricatiei);
        System.out.println("Nr. KM: " + nrKm);

        System.out.println(" ");
        System.out.println("===SPECIFACTII TEHNICE===");
        System.out.println(" ");
        for (String key : specificatiiTehnice.keySet()) {
            System.out.println(key + " " + specificatiiTehnice.get(key));
        }

        System.out.println(" ");
        System.out.println("***DOTARI: AUDIO SI TEHNOLOGIE***");
        System.out.println("Dotarile audio si de tehnologie ale masinii sunt: ");
        System.out.println(" ");
        for (Integer index = 0; index < dotariAudio.size(); index++) {
            System.out.println(dotariAudio.get(index));
        }

        System.out.println(" ");
        System.out.println("***DOTARI: CONFORT SI OPTIONALE***");
        System.out.println("Dotarile confort si optionalele masinii sunt: ");
        System.out.println(" ");
        for (Integer index = 0; index < dotariConfort.size(); index++) {
            System.out.println(dotariConfort.get(index));
        }

        System.out.println(" ");
        System.out.println("***DOTARI SISTEME DE ASISTENTA***");
        System.out.println("Sistemele de asistenta ale masinii sunt: ");
        System.out.println(" ");
        for (Integer index = 0; index < dotariSistemDeAsistenta.size(); index++) {
            System.out.println(dotariSistemDeAsistenta.get(index));
        }

        System.out.println(" ");
        System.out.println("***DOTARI SISTEME DE SIGURANTA***");
        System.out.println("Sistemele de siguranta ale masinii sunt: ");
        System.out.println(" ");
        for (Integer index = 0; index < dotariSistemDeSiguranta.size(); index++) {
            System.out.println(dotariSistemDeSiguranta.get(index));
        }
        System.out.println(" ");
        if (masinaSH) {
            System.out.println("Este o masina Second-Hand." + masinaAvariata);
        } else {
            System.out.println("Masina este noua!");
        }
    }
}










