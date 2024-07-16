package tema5;

import java.util.List;

public class MazdaConfigurator extends CarConfigurator {
    public String nivelEchipare;
    public String motor;
    public String tractiune;
    public String transmisie;
    public String combustibil;
    public String culoare;
    public String jante;
    public String tapitarii;
    public List<String> accesorii;


    public MazdaConfigurator(String marca, String model, Integer anulFabricatiei,
                             String nivelEchipare, String motor, String tractiune,
                             String transmisie, String combustibil, String culoare, String jante,
                             String tapitarii, List<String> accesorii) {
        super(marca, model, anulFabricatiei);
        this.nivelEchipare = nivelEchipare;
        this.motor = motor;
        this.tractiune = tractiune;
        this.transmisie = transmisie;
        this.combustibil = combustibil;
        this.culoare = culoare;
        this.jante = jante;
        this.tapitarii = tapitarii;
        this.accesorii = accesorii;
    }

    public void infoMazda() {
        carInfo();
        System.out.println("Nivelul de echipare al masinii este: " + nivelEchipare);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Masina are tractiune: " + tractiune);
        System.out.println("Masina are transmisie: " + transmisie);
        System.out.println("Combustibil: " + combustibil);
        System.out.println("Culoarea caroseriei este: " + culoare);
        System.out.println("Masina este echipata cu jante: " + jante);
        System.out.println("Interiorul masinii este: " + tapitarii);
        System.out.println("Masina este echipata cu urmatoarele accesorii: ");
        {
            for (Integer k = 0; k < accesorii.size(); k++) {
                System.out.println(accesorii.get(k));
            }
        }
        calculPretStandard();
        calculPretFinal();
    }

    public void calculPretStandard() {
        if (model.equals("MAZDA MX-5")) {
            if (nivelEchipare.equals("PRIME-LINE")) {
                pretStandard = 33190;
            }
            if (nivelEchipare.equals("EXCLUSIVE-LINE")) {
                pretStandard = 36890;
            }
            if (nivelEchipare.equals("KAZARI")) {
                pretStandard = 37690;
            }
            if (nivelEchipare.equals("HOMURA")) {
                pretStandard = 42090;

            }
        }
        System.out.println("Pretul standard al masinii este: \n" + pretStandard + " EURO");
    }

    public void calculPretFinal() {
        double pretConfigurare = 0;
        if (model.equals("MAZDA MX-5")) {
            if (nivelEchipare.equals("HOMURA")) {
                switch (culoare) {
                    case "SOUL RED CRYSTAL":
                        pretConfigurare += 670;
                        break;
                }
                switch (jante) {
                    case "JANTE ALIAJ 17” GUN METALLIC CU PNEURI 205/45":
                        pretConfigurare += 0;
                        break;
                }
                switch (tapitarii) {
                    case "SCAUNE SPORT RECARO ÎN PIELE & ALCANTARA, SCAUNE ÎNCĂLZITE":
                        pretConfigurare += 0;
                        break;
                }
                for (Integer index = 0; index < accesorii.size(); index++)
                    switch (accesorii.get(index)) {
                        case "PACHET SPOILER":
                            pretConfigurare += 1959.32;
                            break;
                        case "TOBA EVACUARE SPORT":
                            pretConfigurare += 987.89;
                            break;
                    }
                pretFinal = (int) (pretStandard + pretConfigurare);
                System.out.println("Pretul final al masinii este: \n" + pretFinal + " EURO");
            }
        }
    }
}
