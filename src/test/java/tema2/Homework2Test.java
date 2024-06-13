package tema2;

import org.testng.annotations.Test;

public class Homework2Test {


    @Test
    public void afisareNumereTrei() {

        //afisamDoarNrPare();
        //afisamNrPare();
        //sumaDouaNumere();
        //numereDivizibileCuCinci();
        //wordYes();
        //numereDivizibileCuCinciV2();
        //afisareNumereTrei();
        //inmultirePrimeleCinciNumbere();
        //verificNrMaiMare();
        //adunarePrimeleZeceNumere();
        //verificNumarMaiMare(25);
        verificNumarMaiMareV3(3.25);


        //Afisam in consola primele 3 numere de la 1 la 3

        for (Integer index = 1; index <= 3; index++) {
            System.out.println(index);
        }
    }

    //Afisam in consola numerele pare si numerele impare pana la 10.

    public void afisamNrPare() {
        for (Integer index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.println("Numarul " + index + " este par.");
            } else {
                System.out.println("Numarul " + index + " este impar.");
            }
        }
    }

    //Afisam in consola doar numerele pare pana la 10.

    public void afisamDoarNrPare() {
        for (Integer index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.println("Numarul " + index + " este par.");
            }
        }
    }

    //Afisam in consola suma a doua numere.

    public void sumaDouaNumere() {
        int x = 235;
        int y = 10;
        int sum = x + y;
        System.out.println("Suma numerelor este " + sum + ".");
    }

    public void numereDivizibileCuCinci() {
        for (Integer index = 5; index <= 15; index++) {
            if (index % 5 == 0) {
                System.out.println(index + " este divizibil cu 5");
            }
        }
    }

    //Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre ele.

    public void wordYes() {
        System.out.println("DA DA DA DA DA");
    }

    //Afisam in consola numerele divizibile cu 5.

    public void numereDivizibileCuCinciV2() {
        for (Integer index = 5; index <= 100; index++) {
            if (index % 5 == 0) {
                System.out.println(index + " este divizibil cu 5");
            }
        }
    }

    //Afisam in consola produsul numerelor pana la 5

    public void inmultirePrimeleCinciNumbere() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;

        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        f = a * b * c * d * e;

        System.out.println("1*2*3*4*5 = " + f);

    }

    //Afisam in consola numarul cel mai mare dintre 15 si 20

    public void verificNrMaiMare() {
        int a = 15;
        int b = 20;
        int max = a;
        if (b > max) {
            max = b;
        }
        System.out.println(max + " este numarul mai mare.");

    }

    //Afisam in consolo suma numerele pana la 10

    public void adunarePrimeleZeceNumere() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        int j = 10;
        int sum = a + b + c + d + e + f + g + h + i + j;

        System.out.println("1+2+3+4+5+6+7+8+9+10 = " + sum);

    }
    //Verific numar mai mare v2

    public void verificNumarMaiMare(Integer nr) {
        if (nr > 15) {
            System.out.println("Numarul " + nr + " este mai mare decat 15");

        } else {
            System.out.println("Numarul " + nr + " nu este mai mare decat 15");

        }

    }

    public void verificNumarMaiMareV3(Double nr) {
        if (nr < 4.5);
        System.out.println("Dintre 4.5 si 3.25. Numarul " + nr + " este cel mai mic.");

    }
}













