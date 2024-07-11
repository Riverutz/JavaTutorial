package tema5;

public class AutoConfigurator {

    public String marca;
    public String model;
    public Integer an;
    public Double pretStandard;
    public Double pretFinal;

    public AutoConfigurator(String marca, String model, Integer an,
                            Double pretStandard, Double pretFinal) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.pretStandard = pretStandard;
        this.pretFinal = pretFinal;
    }

    public void infoMasina() {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul fabricatiei este: " + an);
        System.out.println("Pretul standard al masinii este: " + pretStandard);

    }
}
