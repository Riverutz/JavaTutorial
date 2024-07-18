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
        DaciaConfigurator Logan = new DaciaConfigurator("Dacia", "Logan", 2024,
                "Essential","TCe 90 MT6", "Grey",
                "Standard", "Standard", echipamenteLogan, accesoriiLogan);
        Logan.infoDacia();
        Logan.pornesteMotor();
        Logan.deschidereGeam();
        Logan.promotieDacia();
        Logan.promotieDacia("RABLA");
        Logan.promotieDacia(25);


//        System.out.println("=========");
//        List<String> optionalePolo = Arrays.asList("Faruri LED Matrix", "Trapa de sticla panoramica",
//                "Alarma antifurt", "Keyless Access");
//        VolkswagenConfigurator Polo = new VolkswagenConfigurator("Volkswagen",
//                "Polo", 2023, "Advanced",
//                "Polo Advanced 1.0 TSI", "Argintiu (reflex silver metallic)", "Jante aliaj 15' - Essex, negre", "Stofa negru titan", optionalePolo);
//        Polo.infoVolkswagen();


    }
}
