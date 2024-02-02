package dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CriptografiaTeste {

    @Test
    public void validarCriptografia() {
        CifraDeCesar palavra = new CifraDeCesar();
        Assertions.assertEquals("rod, pxqgr", palavra.cifraDeCesarTradicional("Ola, mundo"));
    }

    @Test
    public void validarCriptoLivre(){
        CifraDeCesar livre = new CifraDeCesar();
        Assertions.assertEquals("udidho jxlpdudhv vdnxudl", livre.cifraDeCesarLivre("Rafael Guimaraes Sakurai", 3));
        }

    @Test
    public void desencriptarTradicional(){
        CifraDeCesar desencripitarTradicional = new CifraDeCesar();
        Assertions.assertEquals("ola, mundo", desencripitarTradicional.decifraCesarTradicional("rod, pxqgr"));
    }

    @Test
    public void desencriptarLivre(){
        CifraDeCesar desencripitarLivre = new CifraDeCesar();
        Assertions.assertEquals("rafael guimaraes sakurai", desencripitarLivre.decifraCesarLivre("udidho jxlpdudhv vdnxudl", 3));
    }


}
