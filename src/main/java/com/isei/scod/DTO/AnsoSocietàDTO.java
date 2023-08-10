package com.isei.scod.DTO;

import com.isei.scod.Entity.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class AnsoSocietàDTO {

    private AntsTiposocieta ansoFkAntsTiposocid;

    @Size(max = 100)
    private String ansoRagionesociale;

    @Size(max = 11)
    @NotNull
    private String ansoPartitaiva;

    private PrprProgetto ansoFkPrprProgettoid;

    private GecoComune ansoFkGecoComuneid;

    private GepaPaese ansoFkGepaPaeseid;

    private GetoToponimo ansoGetoToponimoid;

    @Size(max = 255)
    private String ansoSede;

    @Size(max = 400)
    private String ansoIndirizzo;

    @Size(max = 20)
    private String ansoNumerocivico;

    @Size(max = 20)
    private String ansoCap;

    @Size(max = 200)
    @NotNull
    private String ansoEmail;

    @Size(max = 20)
    private String ansoTelefono;

    @Size(max = 50)
    @NotNull
    private String ansoSysuser;

    private LocalDate ansoSysdate;

    private Integer ansoFlagAttiva;

}
