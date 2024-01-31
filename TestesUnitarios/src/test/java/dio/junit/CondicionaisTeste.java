package dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

 /*   @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "GABRIEL ZUCCHI")
    void validarUsuarioGabriel() {
        //Assumptions.assumeFalse("GABRIEL ZUCCHI".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }*/

    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS}) //Pode-se passar arrays
    void validarOSWindows(){
        Assertions.assertEquals(10, 5+5);
        System.out.println("FOI");
    }

}
