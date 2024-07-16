package tema5;

import java.util.List;

public class VolkswagenConfigurator extends CarConfigurator {
    public String linieDeEchipare;
    public String motor;
    public String transmisie;
    public String tractiune;
    public String combustibil;
    public String vopsea; //Rosu (kings red metallic) 736,61 €
    public String roti; //Jante aliaj usor "Leeds" 7,5J x 18,527,17 €
    public String interior;
    public List<String> dotariOptionaleExterioare;
    public List<String> dotariOptionaleInterioare;
    public List<String> dotariOptionaleGenerale;
    public List<String> accesoriiVolkswagen;


    public VolkswagenConfigurator(String marca, String model, Integer anulFabricatiei,
                                  String linieDeEchipare, String motor,
                                  String transmisie, String tractiune, String combustibil,
                                  String vopsea, String roti, String interior,
                                  List<String> dotariOptionaleExterioare,
                                  List<String> dotariOptionaleInterioare,
                                  List<String> dotariOptionaleGenerale,
                                  List<String> accesoriiVolkswagen) {
        super(marca, model, anulFabricatiei);
        this.linieDeEchipare = linieDeEchipare;
        this.motor = motor;
        this.transmisie = transmisie;
        this.tractiune = tractiune;
        this.combustibil = combustibil;
        this.vopsea = vopsea;
        this.roti = roti;
        this.interior = interior;
        this.dotariOptionaleExterioare = dotariOptionaleExterioare;
        this.dotariOptionaleInterioare = dotariOptionaleInterioare;
        this.dotariOptionaleGenerale = dotariOptionaleGenerale;
        this.accesoriiVolkswagen = accesoriiVolkswagen;

    }

    public void infoVolkswagen() {
        carInfo();
        System.out.println("Linia de echipare a masinii este: " + linieDeEchipare);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Masina are transmisie: " + transmisie);
        System.out.println("Masina are tractiune: " + tractiune);
        System.out.println("Combustibil: " + combustibil);
        System.out.println("Vopseaua masinii este: " + vopsea);
        System.out.println("Masina este echipata cu jante: " + roti);
        System.out.println("Interiorul masinii este: " + interior);
        System.out.println("Masina este echipata cu urmatoarele dotari optionale exterioare: ");
        for (Integer i = 0; i < dotariOptionaleExterioare.size(); i++) {
            System.out.println(dotariOptionaleExterioare.get(i));
        }
        System.out.println("Masina este echipata cu urmatoarele dotari optionale interioare: ");
        for (Integer j = 0; j < dotariOptionaleInterioare.size(); j++) {
            System.out.println(dotariOptionaleInterioare.get(j));
        }
        System.out.println("Masina este echipata cu urmatoarele accesorii: ");
        {
            for (Integer k = 0; k < accesoriiVolkswagen.size(); k++) {
                System.out.println(accesoriiVolkswagen.get(k));
            }
        }
        calculPretStandard();
        calculPretFinal();
    }

    public void calculPretStandard() {
        if (model.equals("Golf")) {
            if (linieDeEchipare.equals("Life")) {
                pretStandard = 28245;
            }
            if (linieDeEchipare.equals("Advanced")) {
                pretStandard = 28245;
            }
            if (linieDeEchipare.equals("Style")) {
                pretStandard = 31078;
            }
            if (linieDeEchipare.equals("Rline")) {
                pretStandard = 31278;

            }
        }
        System.out.println("Pretul standard al masinii este: \n" + pretStandard + " EURO");
    }

    public void calculPretFinal() {
        double pretConfigurare = 0;
        if (model.equals("Golf")) {
            if (linieDeEchipare.equals("Advanced")) {
                switch (vopsea) {
                    case "Rosu (kings red metallic)":
                        pretConfigurare += 128.52;
                        break;
                }
                switch (roti) {
                    case "Jante aliaj usor - Leeds 7,5J x 18'":
                        pretConfigurare += 689.01;
                        break;
                }
                switch (interior) {
                    case "stofa/microfibra - Soul":
                        pretConfigurare += 0;
                        break;
                }
                for (Integer index = 0; index < dotariOptionaleExterioare.size(); index++)
                    switch (dotariOptionaleExterioare.get(index)) {
                        case "Trapa panoramica actionata electric":
                            pretConfigurare += 967.47;
                            break;
                    }
                for (Integer index = 0; index < dotariOptionaleInterioare.size(); index++)
                    switch (dotariOptionaleInterioare.get(index)) {
                        case "Covorase textile fata/spate":
                            pretConfigurare += 110.67;
                            break;
                        case "Pachet iarna cu volan incalzit":
                            pretConfigurare += 398.65;
                            break;
                        case "Scaun sofer ergoActiv":
                            pretConfigurare += 829.43;
                            break;
                    }
                for (Integer index = 0; index < dotariOptionaleGenerale.size(); index++)
                    switch (dotariOptionaleGenerale.get(index)) {
                        case "Airbag-uri locuri laterale spate":
                            pretConfigurare += 320.11;
                            break;
                        case "Pachet asistenta sofer":
                            pretConfigurare += 531.93;
                            break;
                        case "Side Assist":
                            pretConfigurare += 0;
                            break;
                        case "Sistem de navigatie Discover":
                            pretConfigurare += 1225.70;
                            break;
                        case "Faruri IQ Light LED Matrix":
                            pretConfigurare += 1884.96;
                            break;
                    }
                for (Integer index = 0; index < accesoriiVolkswagen.size(); index++)
                    switch (accesoriiVolkswagen.get(index)) {
                        case "Cutie bagaje basic Volkswagen 340l, culoare negru mat":
                            pretConfigurare += 496.31;
                            break;
                        case "Scaun copil Dualfix i-SIZE":
                            pretConfigurare += 860.66;
                            break;

                    }
                pretFinal = (int) (pretStandard + pretConfigurare);
                System.out.println("Pretul final al masinii este: \n" + pretFinal + " EURO");
            }
        }
    }
}
