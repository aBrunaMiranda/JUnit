package dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CriptografiaTeste {

    @Test
    public void validarCriptografia(){
        CifraDeCesar palavra = new CifraDeCesar();
        Assertions.assertEquals("rod, pxqgr", palavra.cifraDeCesarTradicional("Ola, mundo"));
    }
}
