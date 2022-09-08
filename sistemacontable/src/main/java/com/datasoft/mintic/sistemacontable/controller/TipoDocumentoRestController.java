package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import com.datasoft.mintic.sistemacontable.entity.TipoDocumento;
import com.datasoft.mintic.sistemacontable.service.ITipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoDocumentoRestController {

    @Autowired
    private ITipoDocumentoService tipoDocumentoService;

    @GetMapping("/TipoDocumento/{id}")
    public TipoDocumento findById(@PathVariable long id){
       return tipoDocumentoService.findById(id);
    }

    //Metodo Get -> Busqueda de todos los objetos de mi clase
    @GetMapping("/TipoDocumento")
    public List<TipoDocumento> findAll(){
        return tipoDocumentoService.findAll();
    }

    @PostMapping("/TipoDocumento")
    public TipoDocumento createTipoDocumento(@RequestBody TipoDocumento tipoDocumento ){
        TipoDocumento docNew = new TipoDocumento(tipoDocumento.getIdTipoDocumento(), tipoDocumento.getDescripcionTipodocumento(), tipoDocumento.getSiglasTipoDocumento(), tipoDocumento.isEstado());
        return docNew;
    }

    @PutMapping("/TipoDocumento/{id}")
    public TipoDocumento updateTipoDocumento(@PathVariable long id,@RequestBody TipoDocumento tipoDocumento){
        TipoDocumento putTipoDoc = findById(id);
        putTipoDoc.setDescripcionTipodocumento(tipoDocumento.getDescripcionTipodocumento());
        putTipoDoc.setSiglasTipoDocumento(tipoDocumento.getSiglasTipoDocumento());
        putTipoDoc.setEstado(tipoDocumento.isEstado());
        return putTipoDoc;
    }

    @DeleteMapping("/TipoDocumento/{id}")
    public void deleteTipoDocumento(@PathVariable long id){
        TipoDocumento delTipoDocumento = findById(id);
    }
}
