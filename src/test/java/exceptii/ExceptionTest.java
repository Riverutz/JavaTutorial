package exceptii;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExceptionTest
{
    @Test
    public void metodaTest() throws FileNotFoundException {
        ExceptieConcept exceptieConcept = new ExceptieConcept();
       // exceptieConcept.checkedExceptionExample();
        //exceptieConcept.uncheckedExceptionExample();
        //exceptieConcept.throwExceptionExample(20);
        //exceptieConcept.throwExceptionExample(15);
        exceptieConcept.throwsExceptionExample();
    }
}
