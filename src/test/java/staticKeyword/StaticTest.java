package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {
    @Test
    public void metodaTest(){
        System.out.println(" ");
        Elev Daniel = new Elev("Daniel", "Vlasceanu", 34);
        Daniel.prezentare();
        System.out.println(" ");
        Elev Mihai = new Elev("Mihai", "Stratulat", 19);
        Mihai.prezentare();
    }

}
