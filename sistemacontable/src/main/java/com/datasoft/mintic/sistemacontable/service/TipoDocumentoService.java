package com.datasoft.mintic.sistemacontable.service;

import com.datasoft.mintic.sistemacontable.entity.TipoDocumento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TipoDocumentoService implements ITipoDocumentoService {

    @Override
    public TipoDocumento findById(long id) {
        TipoDocumento docUno = new TipoDocumento(id, "Cedula Ciudadania", "CC", true);
        return docUno;
    }

    @Override
    public List<TipoDocumento> findAll() {
        List<TipoDocumento> tipoDoc = new ArrayList<TipoDocumento>();
        TipoDocumento tDoc1 = new TipoDocumento(2, "Cedula Extranjeria", "CI", true);
        tipoDoc.add(tDoc1);
        TipoDocumento tDoc2 = new TipoDocumento(3, "numero identificacion", "NUIP", true);
        tipoDoc.add(tDoc2);
        return tipoDoc;
    }

    @Override
    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento) {
        TipoDocumento docNew = new TipoDocumento(tipoDocumento.getIdTipoDocumento(), tipoDocumento.getDescripcionTipodocumento(), tipoDocumento.getSiglasTipoDocumento(), tipoDocumento.isEstado());
        return docNew;
    }

    @Override
    public TipoDocumento updateTipoDocumento(long id, TipoDocumento tipoDocumento) {
        TipoDocumento putTipoDoc = findById(id);
        putTipoDoc.setDescripcionTipodocumento(tipoDocumento.getDescripcionTipodocumento());
        putTipoDoc.setSiglasTipoDocumento(tipoDocumento.getSiglasTipoDocumento());
        putTipoDoc.setEstado(tipoDocumento.isEstado());
        return putTipoDoc;
    }

    @Override
    public void deleteTipoDocumento(long id) {
        TipoDocumento delTipoDocumento = findById(id);
    }
}
