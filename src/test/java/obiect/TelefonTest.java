package obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {
    @Test
    public void metodaTest(){
        System.out.println(" ");
        System.out.println("===TELEFON: IPHONE===");
        System.out.println(" ");
        Map<String, String> specificatiiIphone15 = new HashMap<>();
        specificatiiIphone15.put("Model Procesor", "Apple A16 Bionic");
        specificatiiIphone15.put("Sistem de Operare", "IOS");
        specificatiiIphone15.put("Tip Display", "Super Retina XDR");
        specificatiiIphone15.put("Rezolutie Video", "Full HD");
        specificatiiIphone15.put("Memorie RAM", "6 GB");
        specificatiiIphone15.put("Porturi USB", "USB TYPE C");

        List<String> iphone15accesorii = new ArrayList<>();
        iphone15accesorii.add("Iphone 15");
        iphone15accesorii.add("Incarcator");
        iphone15accesorii.add("Cablu USB");
        iphone15accesorii.add("Casti");
        iphone15accesorii.add("Stylus");
        iphone15accesorii.add("Stickere");

        Telefon Iphone15 = new Telefon("Iphone","15", "Albastru", "512 GB", 2000, specificatiiIphone15,iphone15accesorii, false );
        Iphone15.infoTelefon();

        System.out.println(" ");
        System.out.println("===TELEFON: SAMSUNG===");
        System.out.println(" ");
        Map<String, String> specificatiiSamsungS24 = new HashMap<>();
        specificatiiSamsungS24.put("Model Procesor", "Intel Pentium 4");
        specificatiiSamsungS24.put("Sistem de Operare", "Android");
        specificatiiSamsungS24.put("Tip Display", "Super Amoled");
        specificatiiSamsungS24.put("Rezolutie Video", "4K");
        specificatiiSamsungS24.put("Memorie RAM", "16 GB");
        specificatiiSamsungS24.put("Porturi USB", "USB TYPE C");

        List<String> samsungs24accesorii = new ArrayList<>();
        samsungs24accesorii.add("Samsung S24");
        samsungs24accesorii.add("Incarcator");
        samsungs24accesorii.add("Cablu USB");
        samsungs24accesorii.add("Casti");

        Telefon SamsungS24 = new Telefon("Samsung","S24", "Galben", "1 TB", 2500, specificatiiSamsungS24, samsungs24accesorii, false );
        SamsungS24.infoTelefon();

        System.out.println("===TELEFON: HONOR MAGIC 5 PRO===");
        System.out.println(" ");
        Map<String, String> specificatiiHonorMagic5Pro = new HashMap<>();
        specificatiiHonorMagic5Pro.put("Model Procesor", "Andreno 845");
        specificatiiHonorMagic5Pro.put("Sistem de Operare", "Android");
        specificatiiHonorMagic5Pro.put("Tip Display", "OLED");
        specificatiiHonorMagic5Pro.put("Rezolutie Video", "4K");
        specificatiiHonorMagic5Pro.put("Memorie RAM", "12 GB");
        specificatiiHonorMagic5Pro.put("Porturi USB", "USB TYPE C");

        List<String> honorMagic5Proaccesorii = new ArrayList<>();
        honorMagic5Proaccesorii.add("Iphone 15");
        honorMagic5Proaccesorii.add("Incarcator");
        honorMagic5Proaccesorii.add("Cablu USB");
        honorMagic5Proaccesorii.add("Casti");

        Telefon HonorMagic5Pro = new Telefon("Honor","Magic 5 Pro", "Verde", "512 GB", 4500, specificatiiHonorMagic5Pro,honorMagic5Proaccesorii, true, "Atentie! Produs cu urme de utilizare!" );
        HonorMagic5Pro.infoTelefon();








    }
}
