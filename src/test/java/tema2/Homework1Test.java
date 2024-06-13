package tema2;

import org.testng.annotations.Test;

public class Homework1Test {
    public String titlu;
    public Integer varsta;
    public String nume;
    public String prenume;

    @Test


    public void metodaTest() {
        //salariuAngajat();
        //rezultatEcuatie();
        //idAngajat();
        //nrDepartament();


        titlu = "Hello World";
        varsta = 34;
        nume = "Vlasceanu";
        prenume = "Daniel";

        System.out.println(titlu);
        System.out.println("Ma numesc ");
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println("Si am varsta de " + varsta + " de ani");


    }

    //Afisam salariul angajatului daca numele lui este Andrei

    public void salariuAngajat() {
        int salariu = 2500;
        String nume = "Andrei";
        if (nume.equals("Andrei")) ;
        System.out.println("Salariul angajatului este " + salariu + " RON");
    }

    //Afisam in consola rezultatul ecuatiei [2+(3*4)-3]/3

    public void rezultatEcuatie() {
        Integer rezultat = (2 + (3 * 4) - 3) / 3;
        System.out.println("Rezultatul ecuatiei este: " + rezultat);
    }

    //Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"

    public void idAngajat() {
        String nume = "Popescu";
        String idAngajat = "E666";
        String departament = "Automation Testing";

        if (nume.equals("Popescu")) {
            System.out.println("ID angajat: " + idAngajat);
            System.out.println("Departament: " + departament);
        } else {
            System.out.println("Pe angajat nu il cheama Popescu.");
        }
    }

    //Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287.

    public void nrDepartament() {
        String numeDepartament = "Automation Testing";
        int numarDepartament = 290;

        if (numarDepartament > 287) {
            System.out.println("Numele Departamentului: " + numeDepartament);
            System.out.println("Numărul Departamentului: " + numarDepartament);
        } else {
            System.out.println("Numărul departamentului nu este mai mare decât 287.");
        }

    }

}


























