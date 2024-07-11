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


    public DaciaConfigurator(String marca, String model, Integer an, Double pretStandard, Double pretFinal,
                             String versiune, String motor, String culoare, String jante, String interior,
                             List<String> echipamente, List<String> accesorii) {

        super(marca, model, an, pretStandard, pretFinal);
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
        for (Integer i = 0; i <echipamente.size(); i++) {
            System.out.println(echipamente.get(i));
        }
        System.out.println("Accesoriile masinii sunt: ");
        {
            for (Integer j = 0; j < accesorii.size(); j++) {
                System.out.println(accesorii.get(j));
            }
        }
    }
}
