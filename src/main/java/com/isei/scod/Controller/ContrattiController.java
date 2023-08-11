package com.isei.scod.Controller;


import com.isei.scod.DTO.CcnlDTO;
import com.isei.scod.DTO.ContrattoPersDTO;
import com.isei.scod.DTO.LivelloDTO;
import com.isei.scod.DTO.TipoContrattoDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.ContrattiService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contratti")
public class ContrattiController {

    @Autowired
    ContrattiService contrattiService;

    @GetMapping("/getCcnlById/{id}")
    public ResponseEntity<CcnlDTO> getCCnlById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(contrattiService.getCcnlById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getCcnlByDesc/{desc}")
    public ResponseEntity<CcnlDTO> getCcnlByDesc(@PathVariable(value = "desc") String desc) {

        try {

            return ResponseEntity.ok(contrattiService.getCcnlByDesc(desc));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getLivelloById/{id}")
    public ResponseEntity<LivelloDTO> getLivello(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(contrattiService.getLivellolById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getLivelloByCcnl/{idCcnl}")
    public ResponseEntity<LivelloDTO> getCcnlByDesc(@PathVariable(value = "idCcnl") Integer idCcnl) {

        try {

            return ResponseEntity.ok(contrattiService.getLivelloByCcnl(idCcnl));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getContrattoPers/{id}")
    public ResponseEntity<ContrattoPersDTO> getContrattoPers(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(contrattiService.getContrattoPersById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @PostMapping("/saveContrattoPers")
    public ResponseEntity<Boolean> savePersona(@RequestBody ContrattoPersDTO dto) {

        try {

            return ResponseEntity.ok(contrattiService.saveContrattoPers(dto));

        } catch (ConstraintViolationException e) {

            e.printStackTrace();
            return ResponseEntity.badRequest().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().body(false);

        }
    }

    @GetMapping("/getTipoContratto/{id}")
    public ResponseEntity<TipoContrattoDTO> getTipoContratto(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(contrattiService.getTipoContrattoById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

}
