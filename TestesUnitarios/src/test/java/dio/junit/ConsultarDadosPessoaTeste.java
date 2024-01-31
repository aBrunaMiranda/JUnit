package dio.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ConsultarDadosPessoaTeste {

    @BeforeAll
    static void configuraConexao(){
        GerenciadorDeConexaoBD.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        GerenciadorDeConexaoBD.insereDados(new Pessoa("Geraldo", LocalDateTime.of(2015,07,15,22,55,06)));
    }

    @AfterEach
    void removeDadosParaTeste(){
        GerenciadorDeConexaoBD.removeDados(new Pessoa("Geraldo", LocalDateTime.of(2015,07,15,22,55,06)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        GerenciadorDeConexaoBD.finalizarConexao();
    }
}
