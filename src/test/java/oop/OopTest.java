package oop;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OopTest {
    @Test
    public void metodaTest(){
        //DAM O COMANDA DE O MASINA DACIA
        List<String> echipamenteLogan = Arrays.asList("Pachet Techno", "Pachet Clima", "Pachet Parking");
        List<String> accesoriiLogan = Arrays.asList("Covorase", "Scrumiera", "Suport de pahare");
        DaciaConfigurator Logan = new DaciaConfigurator("Dacia", "Logan", 2024,12.000,17.000,
                "Essential","TCe 90 MT6", "albastru",
                "Jante 16 otel", "Expression", echipamenteLogan, accesoriiLogan);
        Logan.infoDacia();

        System.out.println("=========");

        List<String> optionalePolo = Arrays.asList("Pachet Confort", "Trapa de sticla panoramica",
                "Alarma antifurt", "Keyless Access");
        VolkswagenConfigurator Polo = new VolkswagenConfigurator("Volkswagen",
                "Polo", 2023, 16.000,
                40.000, "Advanced",
                "Polo life 1.0 TSI", "Gri", "Roti 15", "stofa", optionalePolo);
        Polo.infoVolkswagen();
    }
}
