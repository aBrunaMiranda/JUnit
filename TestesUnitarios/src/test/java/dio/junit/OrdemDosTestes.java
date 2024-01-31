package dio.junit;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //Ordena por número
//@TestMethodOrder(MethodOrderer.MethodName.class) //Ordena de forma alfabetica (nome da classe)
//@TestMethodOrder(MethodOrderer.Random.class) //Ordena de forma aleatória
@TestMethodOrder(MethodOrderer.DisplayName.class) //Ordena de acordo com o DisplayName

public class OrdemDosTestes {

    @Order(3)
    @DisplayName("B")
    @Test
     void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @DisplayName("D")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(4)
    @DisplayName("A")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @DisplayName("C")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
