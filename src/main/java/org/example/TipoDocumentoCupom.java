package org.example;

public class TipoDocumentoCupom implements TipoDocumento {

    private static TipoDocumentoCupom tipoDocumentoCupom = new TipoDocumentoCupom();

    private TipoDocumentoCupom() {};

    public static TipoDocumentoCupom getTipoDocumentoCupom() {
        return tipoDocumentoCupom;
    }
}