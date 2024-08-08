package valueReferenceType;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class valueReferenceTest {

    //Primitive = int, double, float, char, boolean, long (lucreaza cu manipularea valorii)
    //Non-primitive(referinta) = String, Object, Array (lucram cu referinta catre obiect)
    //Static = valoare care se pastreaza pentru toate instantele dintr-o clasa
    //Final = defineste o constanta care nu isi poate modifica valoarea initiala
    //WrapperClass = constructie de clasa care este facut pe baza unui tip de data (primitiva)

    public int originalInt = 10; //variabila globala de tipu int si i-am dat valoarea 10
    public String originalString = "AltExemplu";
    public Curs cursTestare = new Curs("Curs Testare Automata", "Testare Automata", 1); //instantiem obiectu
    public final int nrCursanti = 16;
    public Integer defaultWrapper;
    public int defaultPrimitive;

    @Test
    public void metodaTest() {
        System.out.println("1. VALUE TYPE");
        valueTypeExample(originalInt);
        System.out.println("Valoarea initiala este " + originalInt);

        System.out.println("2. REFERENCE TYPE STRING");
        referenceTypeString(originalString);
        System.out.println("Valoarea initiala este " + originalString);

        System.out.println("3. REFERENCE TYPE OBJECT");
        referenceTypeObject(cursTestare);
        System.out.println("Valoarea initiala este ");
        cursTestare.prezentareCurs();

        System.out.println("4. CONSTANT");
        //nrCursanti = nrCursanti + 10;

        System.out.println("5. VALUE TYPE/WRAPPER CLASS");
        defaultValue();



    }

    public void valueTypeExample(int value) {
        value = value + 5;
        System.out.println("Valoarea noua este " + value);

    }

    public void referenceTypeString(String value) {
        value = value + "Exemplu";
        System.out.println("Valoarea noua este " + value);
    }

    public void referenceTypeObject(Curs object) {
        object.prezentareCurs();
        object.setTitlu("Testare Manuala"); //cu set modificam valorile
        object.prezentareCurs();
    }

    public void defaultValue(){
        System.out.println(defaultWrapper);
        System.out.println(defaultPrimitive);

        Integer[] array = new Integer[5];
        List<Integer> list = new ArrayList<>();

    }
}
