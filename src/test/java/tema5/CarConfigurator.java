package tema5;

public class CarConfigurator {
    private String marca;
    private String model;
    private Integer anulFabricatiei;

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getAnulFabricatiei() {
        return anulFabricatiei;
    }

    public void setAnulFabricatiei(Integer anulFabricatiei) {
        this.anulFabricatiei = anulFabricatiei;
    }
}
