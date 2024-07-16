package tema5;

public class CarConfigurator {
    public String marca;
    public String model;
    public Integer anulFabricatiei;
    public Integer pretStandard;
    public Integer pretFinal;

    public CarConfigurator(String marca, String model, Integer anulFabricatiei) {
        this.marca = marca;
        this.model = model;
        this.anulFabricatiei = anulFabricatiei;
    }

    public void carInfo() {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul fabricatiei este: " + anulFabricatiei);

    }
}
