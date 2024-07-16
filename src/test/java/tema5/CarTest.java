package tema5;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CarTest {
    @Test

    public void daciaTest() {
        System.out.println("=== DACIA DUSTER 2024===");
        List<String> echipamenteDuster = Arrays.asList("Techno Pack", "Heated seats", "Parking Pack");
        List<String> accesoriiDuster = Arrays.asList("Suport pentru 1 bicicletă pe barele de portbagaj pavilion",
                "Pachet trepte", "Antenă rechin");
        DaciaConfigurator daciaDuster = new DaciaConfigurator("Dacia", "Duster",
                2024, "EXTREME", "HEV 140", "4x2",
                "Automata", "Benzina", "TERRACOTTA BRUN",
                "Jante aliaj semi-diamantate 18'",
                "Tapiterie interioara specifica - Extreme", echipamenteDuster, accesoriiDuster);
        daciaDuster.infoDacia();

        System.out.println(" ");
        System.out.println("===MAZDA MX-5 2024===");
        List<String> accesoriiMx5 = Arrays.asList("PACHET SPOILER", "TOBA EVACUARE SPORT");
        MazdaConfigurator mx5 = new MazdaConfigurator("Mazda", "MAZDA MX-5",
                2024, "HOMURA", "2.0L SKYACTIV-G 184",
                "Spate", "Transmisie manuală în 6-trepte",
                "Benzina", "SOUL RED CRYSTAL",
                "JANTE ALIAJ 17” GUN METALLIC CU PNEURI 205/45",
                "SCAUNE SPORT RECARO ÎN PIELE & ALCANTARA, SCAUNE ÎNCĂLZITE", accesoriiMx5);
        mx5.infoMazda();

        System.out.println(" ");
        System.out.println("===VOLKSWAGEN GOLF 2024===");
        List<String> dotariExterioareGolf = Arrays.asList("Trapa panoramica actionata electric");
        List<String> dotariInterioareGolf = Arrays.asList("Covorase textile fata/spate", "Pachet iarna cu volan incalzit", "Scaun sofer ergoActiv");
        List<String> dotariGeneraleGolf = Arrays.asList("Airbag-uri locuri laterale spate", "Pachet asistenta sofer", "Side Assist", "Sistem de navigatie Discover", "Faruri IQ Light LED Matrix");
        List<String> accesoriiGolf = Arrays.asList("Cutie bagaje basic Volkswagen 340l, culoare negru mat", "Scaun copil Dualfix i-SIZE");
        VolkswagenConfigurator golf = new VolkswagenConfigurator("Volkswagen",
                "Golf", 2024, "Advanced", "2.0 TDI",
                "Manuala, 6 trepte", "Fata", "Motorina",
                "Rosu (kings red metallic)", "Jante aliaj usor - Leeds 7,5J x 18'",
                "stofa/microfibra - Soul", dotariExterioareGolf, dotariInterioareGolf,
                dotariGeneraleGolf, accesoriiGolf);
        golf.infoVolkswagen();
        }
}
