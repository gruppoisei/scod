package com.isei.scod.Controller;

import com.isei.scod.DTO.StatoAbilitazioneDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.StatoAbilitazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysaStatoAbilitazione")
public class StatoAbilitazioneController {

    @Autowired
    StatoAbilitazioneService statoAbilitazioneService;

    @GetMapping("/getStatoAbilitazione/{id}")
    public ResponseEntity<StatoAbilitazioneDTO> getStatoAbilitazioneById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(statoAbilitazioneService.getSysaStatoAbilitazioneById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }
}
