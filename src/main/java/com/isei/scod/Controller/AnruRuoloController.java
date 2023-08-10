package com.isei.scod.Controller;

import com.isei.scod.DTO.AnruRuoloDTO;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.AnruRuoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anruRuolo")
public class AnruRuoloController {

    @Autowired
    AnruRuoloService anruRuoloService;

    @GetMapping("/getAnruRuoloById/{id}")
    public ResponseEntity<AnruRuoloDTO> getAnruRuoloById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(anruRuoloService.getAnruRuoloById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }


}
