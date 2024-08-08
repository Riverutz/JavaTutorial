package lombok;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor //un constructor cu toate variabilele pe care le-am facut mai jos
public class Telefon {
    private String marca;
    private String model;
    private Integer anFabricatie;
    private String specificatii;
    private Double pret;
    private List<String> accesorii;
}

