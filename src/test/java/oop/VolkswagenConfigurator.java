package oop;

import java.util.List;

public class VolkswagenConfigurator extends MasinaConfigurator {
    public String linieEchipare;
    public String motor;
    public String vopsea;
    public String roti;
    public String tapiterie;
    public List<String> dotariOptionale;


    public VolkswagenConfigurator(String marca, String model, Integer an,
                                  Double pretStandard, Double pretFinal, String linieEchipare,
                                  String motor, String vopsea, String roti, String tapiterie, List<String> dotariOptionale) {
        super(marca, model, an, pretStandard, pretFinal);
        this.linieEchipare = linieEchipare;
        this.motor = motor;
        this.vopsea = vopsea;
        this.roti = roti;
        this.tapiterie = tapiterie;
        this.dotariOptionale = dotariOptionale;
    }

    public void infoVolkswagen() {
        infoMasina();
        System.out.println("Linia de echipare a masinii este: " + linieEchipare);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Vopseaua masinii este: " + vopsea);
        System.out.println("Rotile masinii sunt: " + roti);
        System.out.println("Tapiteria masinii este: " + tapiterie);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Dotarile optionale ale masinii sunt: ");
        {
            for (Integer t = 0; t <dotariOptionale.size(); t++) {
                System.out.println(dotariOptionale.get(t));
            }
        }
    }
}