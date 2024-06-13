package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    //asta este un comentariu
    //Recunoastem o clasa intr-un fisier Java dupa cuvantul cheie class
    //Intr-un fisier Java putem avea o multime de clase pe care le diferentiem prin numele lor
    //Nu este un practice bun in Java sa avem intr-un fisier mai multe clase
    //In fiecare trebuie sa definim un nume
    //Intelegem printr-o clasa ca fiind un sablon specific din viata reala
    //Intr-o clasa putem defini variabile si metode
    //Variabila = proprietatea unei clase (atribut)
    //Intr-o clasa putem avea o multime de variabile
    //Variabilele se diferentiaza prin tip si nume
    //Variabilele pot sa fie de doua feluri: globale si locale
    //Variabila globala = proprietate vizibila oriunde in cod
    //Variabila locala = proprietate vizibila doar in locul definit
    //Tipuri de date: string, integer, double/float, character, boolean (true sau false)

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;


    //metoda = actiunea unei clase
    //intr-o clasa putem avea o multime de metode diferentiate prin numele acestora
    //exista doua tipuri de metode: void si return
    //metoda void = actiune pe care vrem sa o afisam/interpretam fara a fi nevoie sa o returnam
    //pentru o metoda trebuie sa specificam un access control (public), () si {}


@Test
    public void metodaTest (){
        descrieCursant();
        primesteBursa();

    }
    public void primesteBursa () {
    Integer bursa = 1000;
        System.out.println("Bursa cursantului este " + bursa);


    }


    public void descrieCursant () {
        nume = "Vlasceanu";
        prenume = "Daniel";
        varsta = 33;
        adresa = "Str. Mihai Cartofarul, Nr. 24";
        inaltime = 1.70;
        greutate = 75.00f;
        sex = 'M';
        areRestante = true;

        System.out.println("Numele cursantului este " + nume); //concatenare
        System.out.println("Prenumle cursatului este " + prenume);
        System.out.println("Cursantul are varsta de " + varsta + " de ani");
        System.out.println("Adresa cursantului este " + adresa);
        System.out.println("Cursantul are o inaltime de " + inaltime + " de cm");
        System.out.println("Cursantul are o greutate de " + greutate + " de KG");
        System.out.println("Sexul cursantului este " + sex);
        System.out.println("Cursantul are restante? "+ areRestante);
    }
}
