package tema5;

import oop.VwConfigurator;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AutoTest {
    @Test
    public void metodaTest(){

        System.out.println(" ");
        System.out.println("==== DACIA DUSTER 2024 ===");
        System.out.println(" ");

        List<String> echipamenteDuster = Arrays.asList("Parking Pack", "Techno Pack", "Heated seats");
        List<String> accesoriiExteriorDuster = Arrays.asList("Pachet trepte", "Antenă rechin");
        List<String> accesoriiInteriorDuster = Arrays.asList("YouClip – încărcător smartphone cu inducţie", "YouClip – buzunar");
        DaciaConfigurator dusterConfigurator = new DaciaConfigurator("Dacia", "Duster",
                2024, 21.500,
                29.146, "EXTREME", "HEV 140", "Terracotta Brun",
                "Jante aliaj semi-diamantate 18", "Tapiterie interioara specifica - Extreme",
                echipamenteDuster, accesoriiExteriorDuster, accesoriiInteriorDuster );
        dusterConfigurator.infoDacia();

        System.out.println(" ");
        System.out.println("==== VOLKSWAGEN TIGUAN 2024 ===");
        System.out.println(" ");

        List<String> dotariOptionale = Arrays.asList("Pachet Confort2", "Pachet design: Black Style", "Trapa de sticla panoramica");
        VwConfigurator Tiguan = new VwConfigurator("Volkswagen",
                "Tiguan", 2024, 40.000, 55.364, "R-LINE",
                "2.0 TDI", "Rosu (persimmon red metallic)", "Jante aliaj usor - York 8,5J x 20",
                "Stofa / piele", dotariOptionale );
        Tiguan.infoVolkswagen();
    }
}
