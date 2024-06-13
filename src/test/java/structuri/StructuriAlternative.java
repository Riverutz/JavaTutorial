package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative: If.. Then.. Else/Switch.. Case..


    @Test
    public void metodaTest() {
        //verificNrMaiMare();
        //verificNrMaiMareV2(11);
        //verificNrMaiMareV2(8);
//        verificNrPar(7);
//        verificNrPar(6);
//        verificNrPar(0);
//        verificNrPar(-1);
//        verificNrPar(-4);
       zileleSaptamanii(2);
    }

    //verificam daca un numar este mai mare decat 10

    public void verificNrMaiMare() {

        if (15 > 10) {
            System.out.println("Numarul 15 este mai mare decat 10");

        } else {
            System.out.println("Numarul 15 nu este mai mare decat 10");

        }
    }

    //verificam daca un numar este mai mare decat 10

    public void verificNrMaiMareV2(Integer nr){
        if (nr > 10) {
            System.out.println("Numarul " + nr + " este mai mare decat 10");

        } else {
            System.out.println("Numarul " + nr + " nu este mai mare decat 10");

        }
    }

    //verificam daca un numar este par si pozitiv

    public void verificNrPar(Integer nr){

        //daca vrem sa luam catul impartirii = / (divide)
        //daca vrem sa luam restul impartirii = % (modulo) sau mod

        if (nr>0){
            if (nr % 2==0){
                System.out.println("Numarul meu este pozitiv " + nr + " si par");
            }
            else {
                System.out.println("Numarul meu este pozitiv " + nr + " si impar");
            }
        } else if (nr<0) {
            if (nr % 2==0){
                System.out.println("Numarul meu este negativ " + nr + " si par");
            }
            else {
                System.out.println("Numarul meu este negativ " + nr + " si impar");
            }
        }
        else {
            System.out.println("Numarul este egal cu 0 ");
        }
    }

    //definim zilele saptamanii

    public void zileleSaptamanii (Integer zi){
        switch (zi){
            case 1:
                System.out.println("Azi e Luni");
                break;
            case 2:
                System.out.println("Azi e Marti");
                break;
            case 3:
                System.out.println("Azi e Miercuri");
                break;
            case 4:
                System.out.println("Azi e Joi");
                break;
            case 5:
                System.out.println("Azi e Vineri");
                break;
            default:
                System.out.println("S-au terminat zilele!");

        }
    }
}
