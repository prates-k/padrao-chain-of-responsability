package org.example;

public class TipoDocumentoFichaTreino implements TipoDocumento {

    private static TipoDocumentoFichaTreino tipoDocumentoFichaTreino = new TipoDocumentoFichaTreino();

    private TipoDocumentoFichaTreino() {};

    public static TipoDocumentoFichaTreino getTipoDocumentoFichaTreino() {
        return tipoDocumentoFichaTreino;
    }
}
