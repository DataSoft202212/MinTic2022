package com.datasoft.mintic.sistemacontable.controller;

import com.datasoft.mintic.sistemacontable.entity.Rol;
import com.datasoft.mintic.sistemacontable.entity.TipoDocumento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoDocumentoRestController {

    @GetMapping("/TipoDocumento/{id}")
    public TipoDocumento findById(@PathVariable long id){
       TipoDocumento docUno = new TipoDocumento(id,"Cedula Ciudadania","CC",true);
       return docUno;
    }

    //Metodo Get -> Busqueda de todos los objetos de mi clase
    @GetMapping("/TipoDocumento")
    public List<TipoDocumento> findAll(){
        List<TipoDocumento> tiposDoc = new ArrayList<TipoDocumento>();
        TipoDocumento tDoc1 = new TipoDocumento(2,"Cedula Extranjeria","CI",true);
        tiposDoc.add(tDoc1);
        TipoDocumento tDoc2 = new TipoDocumento(3,"numero identificacion","NUIP",true);
        tiposDoc.add(tDoc2);
        return tiposDoc;
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
