package tema5;

import java.util.List;

public class VolkswagenConfigurator extends CarConfigurator {
    private String linieDeEchipare;
    private String motor;
    private String transmisie;
    private String tractiune;
    private String combustibil;
    private String vopsea;
    private String roti;
    private String interior;
    private List<String> dotariOptionaleExterioare;
    private List<String> dotariOptionaleInterioare;
    private List<String> dotariOptionaleGenerale;
    private List<String> accesoriiVolkswagen;
    private Integer pretStandard;
    private Integer pretFinal;

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
        if (getModel().equals("Golf")) {
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
        System.out.println("Pretul standard al masinii cu echiparea " + getLinieDeEchipare() + " incepe de la: " + pretStandard + " EURO");
    }

    public void calculPretFinal() {
        double pretConfigurare = 0;
        if (getModel().equals("Golf")) {
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
                System.out.println("Pretul final al masinii cu optiunile alese este de: " + pretFinal + " EURO");
            }
        }
    }

    public String getLinieDeEchipare() {
        return linieDeEchipare;
    }

    public void setLinieDeEchipare(String linieDeEchipare) {
        this.linieDeEchipare = linieDeEchipare;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTransmisie() {
        return transmisie;
    }

    public void setTransmisie(String transmisie) {
        this.transmisie = transmisie;
    }

    public String getTractiune() {
        return tractiune;
    }

    public void setTractiune(String tractiune) {
        this.tractiune = tractiune;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public String getVopsea() {
        return vopsea;
    }

    public void setVopsea(String vopsea) {
        this.vopsea = vopsea;
    }

    public String getRoti() {
        return roti;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public List<String> getDotariOptionaleExterioare() {
        return dotariOptionaleExterioare;
    }

    public void setDotariOptionaleExterioare(List<String> dotariOptionaleExterioare) {
        this.dotariOptionaleExterioare = dotariOptionaleExterioare;
    }

    public List<String> getDotariOptionaleInterioare() {
        return dotariOptionaleInterioare;
    }

    public void setDotariOptionaleInterioare(List<String> dotariOptionaleInterioare) {
        this.dotariOptionaleInterioare = dotariOptionaleInterioare;
    }

    public List<String> getDotariOptionaleGenerale() {
        return dotariOptionaleGenerale;
    }

    public void setDotariOptionaleGenerale(List<String> dotariOptionaleGenerale) {
        this.dotariOptionaleGenerale = dotariOptionaleGenerale;
    }

    public List<String> getAccesoriiVolkswagen() {
        return accesoriiVolkswagen;
    }

    public void setAccesoriiVolkswagen(List<String> accesoriiVolkswagen) {
        this.accesoriiVolkswagen = accesoriiVolkswagen;
    }

    public Integer getPretStandard() {
        return pretStandard;
    }

    public Integer getPretFinal() {
        return pretFinal;
    }
}
