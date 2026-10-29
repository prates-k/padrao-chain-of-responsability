package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    FuncionarioProprietario proprietario;
    FuncionarioGerente gerente;
    FuncionarioInstrutor instrutor;
    FuncionarioRecepcionista recepcionista;

    @BeforeEach
    void setUp() {
        proprietario = new FuncionarioProprietario(null);
        gerente = new FuncionarioGerente(proprietario);
        instrutor = new FuncionarioInstrutor(gerente);
        recepcionista = new FuncionarioRecepcionista(instrutor);
    }

    @Test
    void deveRetornarRecepcionistaParaAssinaturaMatricula() {
        assertEquals("Recepcionista", recepcionista.assinarDocumento(new Documento(TipoDocumentoMatricula.getTipoDocumentoMatricula())));
    }

    @Test
    void deveRetornarInstrutorParaAssinaturaFichaTreino() {
        assertEquals("Instrutor", recepcionista.assinarDocumento(new Documento(TipoDocumentoFichaTreino.getTipoDocumentoFichaTreino())));
    }

    @Test
    void deveRetornarGerenteParaAssinaturaCertificado() {
        assertEquals("Gerente", recepcionista.assinarDocumento(new Documento(TipoDocumentoCertificado.getTipoDocumentoCertificado())));
    }

    @Test
    void deveRetornarProprietarioParaAssinaturaContrato() {
        assertEquals("Proprietário", recepcionista.assinarDocumento(new Documento(TipoDocumentoContrato.getTipoDocumentoContrato())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaCupom() {
        assertEquals("Sem assinatura", recepcionista.assinarDocumento(new Documento(TipoDocumentoCupom.getTipoDocumentoCupom())));
    }

}
