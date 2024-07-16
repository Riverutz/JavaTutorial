package oop;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {
    public String versiune;
    public String motor;
    public String culoare;
    public String jante;
    public String interior;
    public List<String> echipamente;
    public List<String> accesorii;


    public DaciaConfigurator(String marca, String model, Integer an,
                             String versiune, String motor, String culoare, String jante, String interior,
                             List<String> echipamente, List<String> accesorii) {

        super(marca, model, an);
        this.versiune = versiune;
        this.motor = motor;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.echipamente = echipamente;
        this.accesorii = accesorii;
    }

    public void infoDacia() {
        infoMasina();
        System.out.println("Versiunea masinii este: " + versiune);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Jantele masinii sunt: " + jante);
        System.out.println("Interiorul masinii este: " + interior);
        System.out.println("Echipamentele masinii sunt: ");
        for (Integer i = 0; i < echipamente.size(); i++) {
            System.out.println(echipamente.get(i));
        }
        System.out.println("Accesoriile masinii sunt: ");
        {
            for (Integer j = 0; j < accesorii.size(); j++) {
                System.out.println(accesorii.get(j));
            }
        }
        calculPretStandard();
        calculPretFinal();
    }

    //TREBUIE SA DETERMINAM PRETUL STANDARD IN FUNCTIE DE MODEL(DACIA VS VW)

    public void calculPretStandard() {
        if (model.equals("Logan")) {
            if (versiune.equals("Essential")) {
                pretStandard = 13.500;
            }
            if (versiune.equals("Expression")) {
                pretStandard = 14.150;
            }
            if (versiune.equals("Journey")) {
                pretStandard = 15.200;
            }
            if (versiune.equals("Journey+")) {
                pretStandard = 15.700;
            }
        }
        System.out.printf("Pretul standard al masinii este: %,.3f \n", pretStandard);
    }

    public void calculPretFinal() {
        double pretOptiuni = 0.000;
        if (model.equals("Logan")) {
            if (versiune.equals("Essential")) {
                switch (culoare) {
                    case "Grey":
                        pretOptiuni += 0.460;//shortcut pt pretOptiuni = pretOptiuni + 0.460
                        break;
                    case "Alb":
                        pretOptiuni += 0;
                        break;
                }
                switch (jante) {
                    case "Standard":
                        pretOptiuni += 2.000;
                        break;
                }
                switch (interior) {
                    case "Standard":
                        pretOptiuni += 0;
                        break;
                }
            }
        }
        pretFinal=pretStandard + pretOptiuni;
        System.out.printf("Pretul final al masinii este: %,.3f \n", pretFinal);
    }
}
