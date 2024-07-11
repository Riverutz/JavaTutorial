package tema5;

import oop.MasinaConfigurator;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {
    public String versiune;
    public String motor;
    public String culoare;
    public String jante;
    public String interior;
    public List<String> echipamente;
    public List<String> accesoriiExterior;
    public List<String> accesoriiInterior;


    public DaciaConfigurator(String marca, String model, Integer an, Double pretStandard, Double pretFinal,
                             String versiune, String motor, String culoare, String jante, String interior,
                             List<String> echipamente,
                             List<String> accesoriiExterior, List<String> accesoriiInterior) {

        super(marca, model, an, pretStandard, pretFinal);
        this.versiune = versiune;
        this.motor = motor;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.echipamente = echipamente;
        this.accesoriiExterior = accesoriiExterior;
        this.accesoriiInterior = accesoriiInterior;
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
        System.out.println("Accesoriile exterioare ale masinii sunt: ");
        {
            for (Integer j = 0; j < accesoriiExterior.size(); j++) {
                System.out.println(accesoriiExterior.get(j));
            }
        }
        System.out.println("Accesoriile interioare ale masinii sunt: ");
        {
            for (Integer k = 0; k < accesoriiInterior.size(); k++) {
                System.out.println(accesoriiInterior.get(k));
            }
        }
    }
}
