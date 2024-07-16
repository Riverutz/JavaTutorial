package tema5;

import java.util.List;

public class DaciaConfigurator extends CarConfigurator {
    public String versiune;
    public String motor;
    public String tractiune;
    public String transmisie;
    public String combustibil;
    public String culoare;
    public String jante;
    public String interior;
    public List<String> echipamenteDacia;
    public List<String> accesoriiDacia;


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
        if (model.equals("Duster")) {
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
        System.out.println("Pretul standard al masinii este: \n" + pretStandard + " EURO");
    }

    public void calculPretFinal() {
        double pretConfigurare = 0;
        if (model.equals("Duster")) {
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
                System.out.println("Pretul final al masinii este: \n" + pretFinal + " EURO");
            }
        }
    }
}