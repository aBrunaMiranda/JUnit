package dio.junit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarUsuarioGabriel(){
        Assumptions.assumeTrue("Gabriel Zucchi".equals(System.getenv("USER")));
     //   Assertions.assertEquals(10, 5 + 5);
    }
}
