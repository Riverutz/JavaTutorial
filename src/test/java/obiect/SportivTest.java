package obiect;

import org.testng.annotations.Test;

public class SportivTest {
    @Test
    public void metodaTest(){
        //instantiem un obiect de tipul Sportiv. O sa mai auzim obiect de tipul "X" / X-ul reprezinta tipul clasei
        //stam cu cursorul pe obiectul Sportiv( ne arata variabilele )
        //CTRL+CLICK pe obiect (Sportiv) - ne trimite la constructorul clasei = legatura

        Sportiv Ionut = new Sportiv("Popescu", "Ionut", 33, 'M',
                "baschet", true);
        Ionut.prezentareSportiv();
        Ionut.varsta = 34;
        Ionut.sportPracticat = "box";
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta();
        Ionut.marireSalar(10);

        System.out.println("==================================");
        Sportiv Alin = new Sportiv("Galusca", "Alin", 18, 'M', "oina", true);
        Alin.prezentareSportiv();
        Alin.verificareVarsta();
        Alin.marireSalar(5);

        System.out.println("===================================");

        Sportiv Alex = new Sportiv("Vlasceanu", "Daniel", 34, 'M', "box", true, 3500 );
        Alex.prezentareSportiv();
        Alex.verificareVarsta();
        Alex.marireSalar(15);


    }
}
