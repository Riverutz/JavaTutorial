package tema4;

import org.testng.annotations.Test;

import java.util.*;

public class Masina2Test {

    @Test
    public void metodaTest(){

        System.out.println(" ");
        System.out.println("=== Volkswagen Golf 2.0 TSI DSG 4Motion R Edition 20 ===");
        LinkedHashMap<String, String> specificatiiGolfGTI = new LinkedHashMap<>();
        specificatiiGolfGTI.put("CAPACITATE CILINDRICA: ", "1.984 cm3");
        specificatiiGolfGTI.put("COMBUSTIBIL: ", "Benzina SUPER");
        specificatiiGolfGTI.put("PUTERE: ", "333 CP");
        specificatiiGolfGTI.put("TRANSMISIE: ", "4x4");
        specificatiiGolfGTI.put("CUTIE DE VITEZE: ", " Automata");
        specificatiiGolfGTI.put("CONSUM EXTRAURBAN: ", "5,90 l/100km");
        specificatiiGolfGTI.put("CONSUM URBAN: ", "9l/100km");
        specificatiiGolfGTI.put("NORMA DE POLUARE: ", "Euro 6d");
        specificatiiGolfGTI.put("EMISII CO2: ", " 161 g/km");
        specificatiiGolfGTI.put("TARA DE ORIGINE: ", "Romania");

        System.out.println(" ");
        List<String> dotariAudioGolfGTI = new ArrayList<>();
        dotariAudioGolfGTI.add("-Android Auto");
        dotariAudioGolfGTI.add("-Bluetooth");
        dotariAudioGolfGTI.add("-Radio");
        dotariAudioGolfGTI.add("-Porturi USB");
        dotariAudioGolfGTI.add("-Port Wireless charging");
        dotariAudioGolfGTI.add("-Sistem Audio Bose");
        dotariAudioGolfGTI.add("-Monitor cu Touch-Screen");
        dotariAudioGolfGTI.add("-Conexiune Internet");

        System.out.println(" ");
        List<String> dotariConfortGolfGTI = new ArrayList<>();
        dotariConfortGolfGTI.add("-Climatronic pe 3 zone");
        dotariConfortGolfGTI.add("-Tapiterie piele");
        dotariConfortGolfGTI.add("-Climatizare spate");
        dotariConfortGolfGTI.add("-Scaun sofer ajustabil electric");
        dotariConfortGolfGTI.add("-Incalzire scaun sofer si pasager");
        dotariConfortGolfGTI.add("-Scaun cu memorie");
        dotariConfortGolfGTI.add("-Scaune sport fata");
        dotariConfortGolfGTI.add("-Cotiera fata/spate");
        dotariConfortGolfGTI.add("-Volan sport din piele cu padele si incalzit");
        dotariConfortGolfGTI.add("-Pornire motor Keyless");
        dotariConfortGolfGTI.add("-Senzor ploaie");
        dotariConfortGolfGTI.add("-Geamuri electrice fata si spate");

        System.out.println(" ");
        List<String> dotariAsistentaGolfGTI = new ArrayList<>();
        dotariAsistentaGolfGTI.add("-Pilot automat adaptiv (distronic)");
        dotariAsistentaGolfGTI.add("-Faruri LED");
        dotariAsistentaGolfGTI.add("-Senzori parcare fata si spate");
        dotariAsistentaGolfGTI.add("-Oglinzi exterioare cu reglare electrica si incalzite");
        dotariAsistentaGolfGTI.add("-Asistenta schimbare banda");
        dotariAsistentaGolfGTI.add("-Asistenta la franare");
        dotariAsistentaGolfGTI.add("-Asistenta in rampa");
        dotariAsistentaGolfGTI.add("-Sistem recunoastere indicatoare de viteza");
        dotariAsistentaGolfGTI.add("-Conducere autonoma");
        dotariAsistentaGolfGTI.add("-Faruri autoadaptive");
        dotariAsistentaGolfGTI.add("-Faruri cu temporizator");
        dotariAsistentaGolfGTI.add("-Faruri directionale");
        dotariAsistentaGolfGTI.add("-Lumini de zi si stopuri LED");
        dotariAsistentaGolfGTI.add("-Iluminare interioara LED");
        dotariAsistentaGolfGTI.add("-Sistem Start/Stop");
        dotariAsistentaGolfGTI.add("-Frana parcare electrica");
        dotariAsistentaGolfGTI.add("-Servodirectie");
        dotariAsistentaGolfGTI.add("-Asistenta ambuteiaj");

        System.out.println(" ");
        List<String> dotariSigurantaGolfGTI = new ArrayList<>();
        dotariSigurantaGolfGTI.add("-Franare asistata");
        dotariSigurantaGolfGTI.add("-Sistem asistenta franare oras");
        dotariSigurantaGolfGTI.add("-Sistem activ franare urgenta");
        dotariSigurantaGolfGTI.add("-Sistem franare automata pietoni");
        dotariSigurantaGolfGTI.add("-Sistem monitorizare stare sofer");
        dotariSigurantaGolfGTI.add("-Sistem activ recomandare pauza sofer");
        dotariSigurantaGolfGTI.add("-Sistem activ monitorizare sofer cu asistenta de urgenta");
        dotariSigurantaGolfGTI.add("-Asistenta telefonica urgenta");
        dotariSigurantaGolfGTI.add("-Airbag sofer si pasager");
        dotariSigurantaGolfGTI.add("-Airbag lateral sofer si pasager");
        dotariSigurantaGolfGTI.add("-Airbag cortina spate");
        dotariSigurantaGolfGTI.add("-Isofix");

        Masina2 VolkswagenGolfR = new Masina2("Volkswagen", "GOLF GTI R", "VII", "Hatchback", "Albastra Metalizata", 52600,
                2024, "1 KM",specificatiiGolfGTI, dotariAudioGolfGTI, dotariConfortGolfGTI,
                dotariAsistentaGolfGTI, dotariSigurantaGolfGTI, false, " Atentie! Masina are istoric cu accidente!");
        VolkswagenGolfR.descriereMasina();

        System.out.println(" ");
        System.out.println("=== AUDI A4 B8 ===");
        LinkedHashMap<String, String> specificatiiAudiA4B8 = new LinkedHashMap<>();
        specificatiiAudiA4B8.put("CAPACITATE CILINDRICA: ", "2.698 cm3");
        specificatiiAudiA4B8.put("COMBUSTIBIL: ", "Diesel");
        specificatiiAudiA4B8.put("PUTERE: ", "190 CP");
        specificatiiAudiA4B8.put("TRANSMISIE: ", "Fata");
        specificatiiAudiA4B8.put("CUTIE DE VITEZE: ", " Automata");
        specificatiiAudiA4B8.put("CONSUM EXTRAURBAN: ", "5,50 l/100km");
        specificatiiAudiA4B8.put("CONSUM URBAN: ", "7,80 l/100km");
        specificatiiAudiA4B8.put("NORMA DE POLUARE: ", "Euro 5");
        specificatiiAudiA4B8.put("EMISII CO2: ", " 167 g/km");
        specificatiiAudiA4B8.put("TARA DE ORIGINE: ", "Germania");

        System.out.println(" ");
        List<String> dotariAudioAudiA4B8 = new ArrayList<>();
        dotariAudioAudiA4B8.add("-Bluetooth");
        dotariAudioAudiA4B8.add("-Radio");
        dotariAudioAudiA4B8.add("-Porturi USB");
        dotariAudioAudiA4B8.add("-Port Wireless charging");
        dotariAudioAudiA4B8.add("-Sistem de Navigatie");
        dotariAudioAudiA4B8.add("-Sistem Audio");

        System.out.println(" ");
        List<String> dotariConfortAudiA4B8 = new ArrayList<>();
        dotariConfortAudiA4B8.add("-Climatronic pe 2 zone");
        dotariConfortAudiA4B8.add("-Tapiterie piele");
        dotariConfortAudiA4B8.add("-Climatizare spate");
        dotariConfortAudiA4B8.add("-Scaun sofer ajustabil electric");
        dotariConfortAudiA4B8.add("-Incalzire scaun sofer si pasager");
        dotariConfortAudiA4B8.add("-Scaune sport fata");
        dotariConfortAudiA4B8.add("-Cotiera fata/spate");
        dotariConfortAudiA4B8.add("-Volan din piele si incalzit");
        dotariConfortAudiA4B8.add("-Pornire motor Keyless");
        dotariConfortAudiA4B8.add("-Senzor ploaie");
        dotariConfortAudiA4B8.add("-Geamuri electrice fata si spate");

        System.out.println(" ");
        List<String> dotariAsistentaAudiA4B8 = new ArrayList<>();
        dotariAsistentaAudiA4B8.add("-Pilot automat adaptiv (distronic)");
        dotariAsistentaAudiA4B8.add("-Faruri Xenon");
        dotariAsistentaAudiA4B8.add("-Senzori parcare fata si spate");
        dotariAsistentaAudiA4B8.add("-Oglinzi exterioare cu reglare electrica si incalzite");
        dotariAsistentaAudiA4B8.add("-Averitzare unghi mort");
        dotariAsistentaAudiA4B8.add("-Asistenta schimbare banda");
        dotariAsistentaAudiA4B8.add("-Limitator de viteza");
        dotariAsistentaAudiA4B8.add("-Controlul tractiunii");
        dotariAsistentaAudiA4B8.add("-Faruri ceata");
        dotariAsistentaAudiA4B8.add("-Conducere autonoma");
        dotariAsistentaAudiA4B8.add("-Faruri autoadaptive");
        dotariAsistentaAudiA4B8.add("-Faruri directionale");
        dotariAsistentaAudiA4B8.add("-Lumini de zi si stopuri LED");
        dotariAsistentaAudiA4B8.add("-Frana parcare electrica");
        dotariAsistentaAudiA4B8.add("-Servodirectie");

        System.out.println(" ");
        List<String> dotariSigurantaAudiA4B8 = new ArrayList<>();
        dotariSigurantaAudiA4B8.add("-Franare asistata");
        dotariSigurantaAudiA4B8.add("-ABS si ESP");
        dotariSigurantaAudiA4B8.add("-Airbag cap fata");
        dotariSigurantaAudiA4B8.add("-Airbag sofer si pasager");
        dotariSigurantaAudiA4B8.add("-Airbag lateral sofer si pasager");
        dotariSigurantaAudiA4B8.add("-Airbag cortina spate");
        dotariSigurantaAudiA4B8.add("-Isofix");

        Masina2 AudiA4B8 = new Masina2("Audi", "A4", "B8", "Sedan", "Gri metalizata", 12900,
                2011, "154.486 KM",specificatiiAudiA4B8, dotariAudioAudiA4B8, dotariConfortAudiA4B8,
                dotariAsistentaAudiA4B8, dotariSigurantaAudiA4B8, true, " Atentie! Masina are istoric cu accidente!");
        AudiA4B8.descriereMasina();

        System.out.println(" ");
        System.out.println("=== MAZDA MX-5 ===");
        LinkedHashMap<String, String> specificatiiMazdaMX5 = new LinkedHashMap<>();
        specificatiiMazdaMX5.put("CAPACITATE CILINDRICA: ", "1.998 cm3");
        specificatiiMazdaMX5.put("COMBUSTIBIL: ", "Benzina");
        specificatiiMazdaMX5.put("PUTERE: ", "160 CP");
        specificatiiMazdaMX5.put("TRANSMISIE: ", "Spate");
        specificatiiMazdaMX5.put("CUTIE DE VITEZE: ", "Manuala");
        specificatiiMazdaMX5.put("CONSUM EXTRAURBAN: ", "5,40 l/100km");
        specificatiiMazdaMX5.put("CONSUM URBAN: ", "8,70 l/100km");
        specificatiiMazdaMX5.put("NORMA DE POLUARE: ", "Euro 6");
        specificatiiMazdaMX5.put("EMISII CO2: ", " 154 g/km");
        specificatiiMazdaMX5.put("TARA DE ORIGINE: ", "Olanda");

        System.out.println(" ");
        List<String> dotariAudioMazdaMX5 = new ArrayList<>();
        dotariAudioMazdaMX5.add("-Bluetooth");
        dotariAudioMazdaMX5.add("-Radio");
        dotariAudioMazdaMX5.add("-Porturi USB");
        dotariAudioMazdaMX5.add("-Port Wireless charging");
        dotariAudioMazdaMX5.add("-Sistem de Navigatie");
        dotariAudioMazdaMX5.add("-Sistem Audio");
        dotariAudioMazdaMX5.add("-Sistem Hands-Free");

        System.out.println(" ");
        List<String> dotariConfortMazdaMX5 = new ArrayList<>();
        dotariConfortMazdaMX5.add("-Climatronic pe 2 zone");
        dotariConfortMazdaMX5.add("-Tapiterie piele");
        dotariConfortMazdaMX5.add("-Climatizare spate");
        dotariConfortMazdaMX5.add("-Scaun sofer ajustabil electric");
        dotariConfortMazdaMX5.add("-Incalzire scaun sofer si pasager");
        dotariConfortMazdaMX5.add("-Scaune sport fata");
        dotariConfortMazdaMX5.add("-Volan din piele");
        dotariConfortMazdaMX5.add("-Senzor ploaie");
        dotariConfortMazdaMX5.add("Schimbator viteze piele");
        dotariConfortMazdaMX5.add("-Geamuri electrice fata");

        System.out.println(" ");
        List<String> dotariAsistentaMazdaMX5 = new ArrayList<>();
        dotariAsistentaMazdaMX5.add("-Pilot automat adaptiv (distronic)");
        dotariAsistentaMazdaMX5.add("-Faruri LED");
        dotariAsistentaMazdaMX5.add("-Senzori parcare spate");
        dotariAsistentaMazdaMX5.add("-Oglinzi exterioare cu reglare electrica si incalzite");
        dotariAsistentaAudiA4B8.add("-Averitzare unghi mort");
        dotariAsistentaAudiA4B8.add("-Lane assist");
        dotariAsistentaAudiA4B8.add("-Controlul tractiunii");
        dotariAsistentaAudiA4B8.add("-Faruri directionale");
        dotariAsistentaAudiA4B8.add("-Lumini de zi si stopuri LED");
        dotariAsistentaAudiA4B8.add("-Frana parcare de mana");
        dotariAsistentaAudiA4B8.add("-Servodirectie");
        dotariAsistentaAudiA4B8.add("-Sistem Start/Stop");

        System.out.println(" ");
        List<String> dotariSigurantaMazdaMX5 = new ArrayList<>();
        dotariSigurantaMazdaMX5.add("-Franare asistata");
        dotariSigurantaMazdaMX5.add("-ABS si ESP");
        dotariSigurantaMazdaMX5.add("-EBD");
        dotariSigurantaMazdaMX5.add("-Franare asistata");
        dotariSigurantaMazdaMX5.add("-Sistem avertizare marsarier");
        dotariSigurantaMazdaMX5.add("-Airbag cap fata");
        dotariSigurantaMazdaMX5.add("-Airbag sofer si pasager");
        dotariSigurantaMazdaMX5.add("-Airbag lateral sofer si pasager");

        Masina2 MazdaMX5 = new Masina2("Mazda", "MX-5", "IV", "Masina Sport - Cabrio", "Negru metalizata", 20000,
                2017, "72.000 KM", specificatiiMazdaMX5, dotariAudioMazdaMX5, dotariConfortMazdaMX5,
                dotariAsistentaMazdaMX5, dotariSigurantaMazdaMX5, true, " Masina nu are istoric cu accidente!");
        MazdaMX5.descriereMasina();


    }
}
