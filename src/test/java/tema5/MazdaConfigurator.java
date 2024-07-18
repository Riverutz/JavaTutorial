package tema5;

import java.util.List;

public class MazdaConfigurator extends CarConfigurator {
    private String nivelEchipare;
    private String motor;
    private String tractiune;
    private String transmisie;
    private String combustibil;
    private String culoare;
    private String jante;
    private String tapitarii;
    private List<String> accesorii;
    private Integer pretStandard;
    private Integer pretFinal;

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
        if (getModel().equals("MAZDA MX-5")) {
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
        System.out.println("Pretul standard al masinii cu echiparea " + getNivelEchipare() + " incepe de la: " + pretStandard + " EURO");
    }

    public void calculPretFinal() {
        double pretConfigurare = 0;
        if (getModel().equals("MAZDA MX-5")) {
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
                System.out.println("Pretul final al masinii cu optiunile alese este de: " + pretFinal + " EURO");
            }
        }
    }

    public String getNivelEchipare() {
        return nivelEchipare;
    }

    public void setNivelEchipare(String nivelEchipare) {
        this.nivelEchipare = nivelEchipare;
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

    public String getTapitarii() {
        return tapitarii;
    }

    public void setTapitarii(String tapitarii) {
        this.tapitarii = tapitarii;
    }

    public List<String> getAccesorii() {
        return accesorii;
    }

    public void setAccesorii(List<String> accesorii) {
        this.accesorii = accesorii;
    }

    public Integer getPretStandard() {
        return pretStandard;
    }

    public Integer getPretFinal() {
        return pretFinal;
    }
}
