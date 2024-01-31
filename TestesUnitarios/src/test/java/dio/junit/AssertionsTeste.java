package dio.junit;



import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

    @Test
    void validarLancamentos(){
        int [] primeiroLance = {10, 20, 30, 40, 50};
        int [] segundoLance = {10, 5, 2, 3, 10};

        //Verifica se o conteudo é =.. o tamanho tem q ser o mesmo
       // Assertions.assertArrayEquals(primeiroLance, segundoLance);

        // Verifica se são diferentes
       assertNotEquals(primeiroLance, segundoLance);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        //verifica vazio
       assertNull(pessoa);

        pessoa = new Pessoa("Marcia", LocalDateTime.now());

        // verifica se n está vazio
        assertNotNull(pessoa);
    }


}
