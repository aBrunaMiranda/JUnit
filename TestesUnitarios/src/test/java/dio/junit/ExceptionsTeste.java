package dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

        @Test
        void validarExcecaoNaTransferencia(){
            Conta contaOrigem = new Conta("123456", 90);
            Conta contaDestino = new Conta("756923", 155);

            TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

          //  Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
            Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 1)); // usado quando uma coisa n lançara exceção
        }
}
