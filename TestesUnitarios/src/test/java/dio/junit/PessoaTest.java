package dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    //Verificar o calculo de idade
    void validarCalculoIdade(){
        Pessoa maria = new Pessoa("Maria", LocalDateTime.of(2004, 3, 15, 20, 15, 30));
        Assertions.assertEquals(19, maria.getIdade());
    }


    @Test
    void retornarSeEhMaiorIdade(){
        Pessoa maria = new Pessoa("Maria", LocalDateTime.of(2004, 3, 15, 20, 15, 30));
        Assertions.assertTrue(maria.ehMaiorIdade());

        Pessoa jorge = new Pessoa("Jorge", LocalDateTime.of(2010, 10, 30, 15, 22, 17));
        Assertions.assertFalse(jorge.ehMaiorIdade());
    }


}
