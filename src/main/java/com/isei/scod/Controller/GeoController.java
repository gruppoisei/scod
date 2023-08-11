package com.isei.scod.Controller;

import com.isei.scod.DTO.*;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/geo")
public class GeoController {

    @Autowired
    GeoService geoService;

    @GetMapping("/getPaeseById/{id}")
    public ResponseEntity<PaeseDTO> getPeseById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(geoService.getPaeseById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }


    @GetMapping("/getComuneById/{id}")
    public ResponseEntity<ComuneDTO> getComuneById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(geoService.getComuneById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getToponimoById/{toponimo}")
    public ResponseEntity<ToponimoDTO> getToponimoById(@PathVariable(value = "toponimo") String toponimo) {

        try {

            return ResponseEntity.ok(geoService.getToponimoById(toponimo));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getProvinciaById/{id}")
    public ResponseEntity<ProvinciaDTO> getProvinciaById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(geoService.getProvinciaById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getRegioneById/{id}")
    public ResponseEntity<RegioneDTO> getRegioneById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(geoService.getRegioneById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

    @GetMapping("/getAreaGeograficaById/{id}")
    public ResponseEntity<AreaGeograficaDTO> getAreaGeograficaById(@PathVariable(value = "id") Integer id) {

        try {

            return ResponseEntity.ok(geoService.getAreaGeograficaById(id));

        } catch (NotFoundException e) {

            e.printStackTrace();
            return ResponseEntity.notFound().build();

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }
}
