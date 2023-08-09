package com.isei.scod.Controller;

import com.isei.scod.DTO.TipoDocumentoDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.TipoDocumentoService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doc")
public class TipoDocumentoController {

    @Autowired
    TipoDocumentoService tipoDocumentoService;

    @PostMapping("/saveTipoDocumento")
    public ResponseEntity<Boolean> saveTipoDocumento(@RequestBody TipoDocumentoDTO dto) {

        try {

            return ResponseEntity.ok(tipoDocumentoService.saveTipoDocumento(dto));

        } catch (ConstraintViolationException e) {

            e.printStackTrace();
            return ResponseEntity.badRequest().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);

        }
    }

    @GetMapping("/getTipoDocumento/{id}")
    public ResponseEntity<TipoDocumentoDTO> getTipoDocumentoById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(tipoDocumentoService.geTipoDocumentoById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }


}
