package com.datasoft.mintic.sistemacontable.service;

import com.datasoft.mintic.sistemacontable.entity.TipoDocumento;
import com.datasoft.mintic.sistemacontable.repository.ITipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoService implements ITipoDocumentoService {
    @Autowired
    private ITipoDocumentoRepository tipoDocumentoRepository;

    @Override
    public TipoDocumento findById(long id) {
        Optional<TipoDocumento> tipoDocumento = tipoDocumentoRepository.findById(id);
        return tipoDocumento.get();
    }

    @Override
    public List<TipoDocumento> findAll() {
        List<TipoDocumento> tipoDoc = (List<TipoDocumento>) tipoDocumentoRepository.findAll();
        System.out.println(tipoDoc);
        return tipoDoc;
    }


    @Override
    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento) {
        TipoDocumento docNew = tipoDocumentoRepository.save(tipoDocumento);
        return docNew;
    }

    @Override
    public TipoDocumento updateTipoDocumento(long id, TipoDocumento tipoDocumento) {
        TipoDocumento putTipoDoc = tipoDocumentoRepository.save(tipoDocumento);
        return putTipoDoc;
    }

    @Override
    public void deleteTipoDocumento(long id) {
        tipoDocumentoRepository.deleteById(id);
    }
}
