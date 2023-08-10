package com.isei.scod.Controller;

import com.isei.scod.DTO.SysaStatoAbilitazioneDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.SysaStatoAbilitazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysaStatoAbilitazione")
public class SysaStatoAbilitazioneController {

    @Autowired
    SysaStatoAbilitazioneService sysaStatoAbilitazioneService;

    @GetMapping("/getStatoAbilitazione/{id}")
    public ResponseEntity<SysaStatoAbilitazioneDTO> getStatoAbilitazioneById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(sysaStatoAbilitazioneService.getSysaStatoAbilitazioneById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }
}
