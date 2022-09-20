package com.datasoft.mintic.softcontable.service;

import com.datasoft.mintic.softcontable.entity.TipoDocumento;

import java.util.List;

public interface ITipoDocumentoService {

    public TipoDocumento findById(long id);

    public List<TipoDocumento> findAll();

    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento);

    public TipoDocumento updateTipoDocumento(long id, TipoDocumento tipoDocumento);

    public void deleteTipoDocumento(long id);
}
