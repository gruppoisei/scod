package com.isei.scod.DTO;

import com.isei.scod.Entity.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class AnsoSocietaDTO {

    private Integer id;

    private TipoSocietaDTO ansoFkAntsTiposocid;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoSocietaDTO getAnsoFkAntsTiposocid() {
        return ansoFkAntsTiposocid;
    }

    public void setAnsoFkAntsTiposocid(TipoSocietaDTO ansoFkAntsTiposocid) {
        this.ansoFkAntsTiposocid = ansoFkAntsTiposocid;
    }

    public String getAnsoRagionesociale() {
        return ansoRagionesociale;
    }

    public void setAnsoRagionesociale(String ansoRagionesociale) {
        this.ansoRagionesociale = ansoRagionesociale;
    }

    public String getAnsoPartitaiva() {
        return ansoPartitaiva;
    }

    public void setAnsoPartitaiva(String ansoPartitaiva) {
        this.ansoPartitaiva = ansoPartitaiva;
    }

    public PrprProgetto getAnsoFkPrprProgettoid() {
        return ansoFkPrprProgettoid;
    }

    public void setAnsoFkPrprProgettoid(PrprProgetto ansoFkPrprProgettoid) {
        this.ansoFkPrprProgettoid = ansoFkPrprProgettoid;
    }

    public GecoComune getAnsoFkGecoComuneid() {
        return ansoFkGecoComuneid;
    }

    public void setAnsoFkGecoComuneid(GecoComune ansoFkGecoComuneid) {
        this.ansoFkGecoComuneid = ansoFkGecoComuneid;
    }

    public GepaPaese getAnsoFkGepaPaeseid() {
        return ansoFkGepaPaeseid;
    }

    public void setAnsoFkGepaPaeseid(GepaPaese ansoFkGepaPaeseid) {
        this.ansoFkGepaPaeseid = ansoFkGepaPaeseid;
    }

    public GetoToponimo getAnsoGetoToponimoid() {
        return ansoGetoToponimoid;
    }

    public void setAnsoGetoToponimoid(GetoToponimo ansoGetoToponimoid) {
        this.ansoGetoToponimoid = ansoGetoToponimoid;
    }

    public String getAnsoSede() {
        return ansoSede;
    }

    public void setAnsoSede(String ansoSede) {
        this.ansoSede = ansoSede;
    }

    public String getAnsoIndirizzo() {
        return ansoIndirizzo;
    }

    public void setAnsoIndirizzo(String ansoIndirizzo) {
        this.ansoIndirizzo = ansoIndirizzo;
    }

    public String getAnsoNumerocivico() {
        return ansoNumerocivico;
    }

    public void setAnsoNumerocivico(String ansoNumerocivico) {
        this.ansoNumerocivico = ansoNumerocivico;
    }

    public String getAnsoCap() {
        return ansoCap;
    }

    public void setAnsoCap(String ansoCap) {
        this.ansoCap = ansoCap;
    }

    public String getAnsoEmail() {
        return ansoEmail;
    }

    public void setAnsoEmail(String ansoEmail) {
        this.ansoEmail = ansoEmail;
    }

    public String getAnsoTelefono() {
        return ansoTelefono;
    }

    public void setAnsoTelefono(String ansoTelefono) {
        this.ansoTelefono = ansoTelefono;
    }

    public String getAnsoSysuser() {
        return ansoSysuser;
    }

    public void setAnsoSysuser(String ansoSysuser) {
        this.ansoSysuser = ansoSysuser;
    }

    public LocalDate getAnsoSysdate() {
        return ansoSysdate;
    }

    public void setAnsoSysdate(LocalDate ansoSysdate) {
        this.ansoSysdate = ansoSysdate;
    }

    public Integer getAnsoFlagAttiva() {
        return ansoFlagAttiva;
    }

    public void setAnsoFlagAttiva(Integer ansoFlagAttiva) {
        this.ansoFlagAttiva = ansoFlagAttiva;
    }
}
