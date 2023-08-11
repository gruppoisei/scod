package com.isei.scod.Controller;

import com.isei.scod.DTO.DocumentoDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.DocumentoService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/andoDocumento")
public class DocumentoController {

    @Autowired
    DocumentoService documentoService;

    @PostMapping("/saveAndoDocumento")
    public ResponseEntity<Boolean> saveAndoDocumento(@RequestBody DocumentoDTO dto) {

        try {

            return ResponseEntity.ok(documentoService.saveAndoDocumento(dto));

        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();

        }    catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);

        }
    }

    @GetMapping("/getDocumentoByUser/{user}")
    public ResponseEntity<DocumentoDTO> getDocumentoByUser (@PathVariable(value = "user") String user) {

        try {
            return ResponseEntity.ok(documentoService.getAndoDocumentoByAndoSysuser(user));
        } catch (NotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

}
