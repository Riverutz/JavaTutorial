package tema5;

import java.util.List;

public class DaciaConfigurator extends CarConfigurator {
    private String versiune;
    private String motor;
    private String tractiune;
    private String transmisie;
    private String combustibil;
    private String culoare;
    private String jante;
    private String interior;
    private List<String> echipamenteDacia;
    private List<String> accesoriiDacia;
    private Integer pretStandard;
    private Integer pretFinal;



    public DaciaConfigurator(String marca, String model, Integer anulFabricatiei,
                             String versiune, String motor, String tractiune, String transmisie,
                             String combustibil, String culoare, String jante,
                             String interior, List<String> echipamenteDacia,
                             List<String> accesoriiDacia) {
        super(marca, model, anulFabricatiei);
        this.versiune = versiune;
        this.motor = motor;
        this.tractiune = tractiune;
        this.transmisie = transmisie;
        this.combustibil = combustibil;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.echipamenteDacia = echipamenteDacia;
        this.accesoriiDacia = accesoriiDacia;
    }

    public void infoDacia() {
        carInfo();
        System.out.println("Linia de echipare a masinii este: " + versiune);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Masina are tractiune: " + tractiune);
        System.out.println("Masina are transmisie: " + transmisie);
        System.out.println("Combustibil: " + combustibil);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Masina este echipata cu jante: " + jante);
        System.out.println("Interiorul masinii este: " + interior);
        System.out.println("Masina este echipata cu urmatoarele pachete: ");
        for (Integer i = 0; i < echipamenteDacia.size(); i++) {
            System.out.println(echipamenteDacia.get(i));
        }
        System.out.println("Masina este echipata cu urmatoarele accesorii: ");
        {
            for (Integer j = 0; j < accesoriiDacia.size(); j++) {
                System.out.println(accesoriiDacia.get(j));
            }
        }
        calculPretStandard();
        calculPretFinal();
    }

    public void calculPretStandard() {
        if (getModel().equals("Duster")) {
            if (versiune.equals("ESSENTIAL")) {
                pretStandard = 18800 ;
            }
            if (versiune.equals("EXPRESSION")) {
                pretStandard = 20000;
            }
            if (versiune.equals("JOURNEY")) {
                pretStandard = 21500;
            }
            if (versiune.equals("EXTREME")) {
                pretStandard = 26650;

            }
        }
        System.out.println("Pretul standard al versiunii " + getVersiune() + " incepe de la: " + pretStandard + " EURO");
    }

    public void calculPretFinal() {
        double pretConfigurare = 0;
        if (getModel().equals("Duster")) {
            if (versiune.equals("EXTREME")) {
                switch (culoare) {
                    case "TERRACOTTA BRUN":
                        pretConfigurare += 500;
                        break;
                }
                switch (jante) {
                    case "Jante aliaj semi-diamantate 18'":
                        pretConfigurare += 350;
                        break;
                }
                switch (interior) {
                    case "Tapiterie interioara specifica - Extreme":
                        pretConfigurare += 0;
                        break;
                }
                for (Integer index = 0; index < echipamenteDacia.size(); index++)
                    switch (echipamenteDacia.get(index)) {
                        case "Techno Pack", "Heated seats":
                            pretConfigurare += 300;
                            break;
                        case "Parking Pack":
                            pretConfigurare += 500;
                            break;
                    }
                for (Integer index = 0; index < accesoriiDacia.size(); index++)
                    switch (accesoriiDacia.get(index)) {
                        case "Suport pentru 1 bicicletă pe barele de portbagaj pavilion":
                            pretConfigurare += 195;
                            break;
                        case "Pachet trepte":
                            pretConfigurare += 411;
                            break;
                        case "Antenă rechin":
                            pretConfigurare += 42;
                            break;
                    }
                pretFinal = (int) (pretStandard + pretConfigurare);
                System.out.println("Pretul final al masinii cu optiunile alese este de: " + pretFinal + " EURO");
            }
        }
    }

    public String getVersiune() {
        return versiune;
    }

    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTractiune() {
        return tractiune;
    }

    public void setTractiune(String tractiune) {
        this.tractiune = tractiune;
    }

    public String getTransmisie() {
        return transmisie;
    }

    public void setTransmisie(String transmisie) {
        this.transmisie = transmisie;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getJante() {
        return jante;
    }

    public void setJante(String jante) {
        this.jante = jante;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public List<String> getEchipamenteDacia() {
        return echipamenteDacia;
    }

    public void setEchipamenteDacia(List<String> echipamenteDacia) {
        this.echipamenteDacia = echipamenteDacia;
    }

    public List<String> getAccesoriiDacia() {
        return accesoriiDacia;
    }

    public void setAccesoriiDacia(List<String> accesoriiDacia) {
        this.accesoriiDacia = accesoriiDacia;
    }

    public Integer getPretStandard() {
        return pretStandard;
    }

    public Integer getPretFinal() {
        return pretFinal;
    }
}