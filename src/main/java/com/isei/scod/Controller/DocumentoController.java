package com.isei.scod.Controller;

import com.isei.scod.DTO.DocumentipersonaDTO;
import com.isei.scod.DTO.DocumentisocietaDTO;
import com.isei.scod.DTO.DocumentoDTO;
import com.isei.scod.DTO.TipoDocumentoDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.DocumentoService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documento")
public class DocumentoController {

    @Autowired
    DocumentoService documentoService;

    @PostMapping("/saveDocumento")
    public ResponseEntity<Boolean> saveDocumento(@RequestBody DocumentoDTO dto) {

        try {

            return ResponseEntity.ok(documentoService.saveDocumento(dto));

        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();

        }    catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);

        }
    }

    @PostMapping("/saveDocumentoPersona")
    public ResponseEntity<Boolean> saveDocumentoPersona(@RequestBody DocumentipersonaDTO dto) {

        try {

            return ResponseEntity.ok(documentoService.saveDocumentoPersona(dto));

        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();

        }    catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);

        }
    }

    @PostMapping("/saveDocumentoSocieta")
    public ResponseEntity<Boolean> saveDocumentoSocieta(@RequestBody DocumentisocietaDTO dto) {

        try {

            return ResponseEntity.ok(documentoService.saveDocumentoSocieta(dto));

        } catch (ConstraintViolationException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();

        }    catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);

        }
    }

    @PostMapping("/saveTipoDocumento")
    public ResponseEntity<Boolean> saveTipoDocumento(@RequestBody TipoDocumentoDTO dto) {

        try {

            return ResponseEntity.ok(documentoService.saveTipoDocumento(dto));

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
            return ResponseEntity.ok(documentoService.getDocumentoByAndoSysuser(user));
        } catch (NotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getDoc/{id}")
    public ResponseEntity<DocumentipersonaDTO> getDoc (@PathVariable(value = "id") Integer id) {

        try {
            return ResponseEntity.ok(documentoService.getDoc(id));
        } catch (NotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

}
