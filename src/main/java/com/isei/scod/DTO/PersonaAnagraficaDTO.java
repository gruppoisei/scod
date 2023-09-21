package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class PersonaAnagraficaDTO {

    private Integer id;

    private List<RuoloDTO> ruoli;

    @Size(max = 100)
    @NotNull
    private String anpeNome;

    @Size(max = 100)
    @NotNull
    private String anpeCognome;
    private LocalDate anpeDatanascita;
    private LocalDate anpeDataidoneitamedica;
    private LocalDate anpeDatascadenzaidoneitamedica;
    private LocalDate anpeDatacorsosicurezza;
    @Size(max = 20)
    @NotNull
    private String anpeCodicefiscale;
    @Size(max = 11)
    private String anpePartitaiva;
    @Size(max = 400)
    @NotNull
    private String anpeIndirizzoresidenza;
    @Size(max = 20)
    @NotNull
    private String anpeNumerocivicoresidenza;
    @Size(max = 20)
    @NotNull
    private String anpeCapresidenza;
    @Size(max = 400)
    private String anpeIndirizzodomicilio;
    @Size(max = 20)
    private String anpeNumerocivicodomicilio;
    @Size(max = 20)
    private String anpeCapdomicilio;
    @Size(max = 20)
    private String anpeNtelefono1;
    @Size(max = 20)
    private String anpeNtelefono2;

    @Size(max = 200)
    @NotNull
    private String anpeEmailaziendale;

    @Size(max = 200)
    private String anpeEmailpersonale;
    private LocalDate anpeSysdate;

    @Size(max = 50)
    @NotNull
    private String anpeSysuser;
    private Integer anpeFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<RuoloDTO> getRuoli() {
        return ruoli;
    }

    public void setRuoli(List<RuoloDTO> ruoli) {
        this.ruoli = ruoli;
    }

    public String getAnpeNome() {
        return anpeNome;
    }

    public void setAnpeNome(String anpeNome) {
        this.anpeNome = anpeNome;
    }

    public String getAnpeCognome() {
        return anpeCognome;
    }

    public void setAnpeCognome(String anpeCognome) {
        this.anpeCognome = anpeCognome;
    }

    public LocalDate getAnpeDatanascita() {
        return anpeDatanascita;
    }

    public void setAnpeDatanascita(LocalDate anpeDatanascita) {
        this.anpeDatanascita = anpeDatanascita;
    }

    public LocalDate getAnpeDataidoneitamedica() {
        return anpeDataidoneitamedica;
    }

    public void setAnpeDataidoneitamedica(LocalDate anpeDataidoneitamedica) {
        this.anpeDataidoneitamedica = anpeDataidoneitamedica;
    }

    public LocalDate getAnpeDatascadenzaidoneitamedica() {
        return anpeDatascadenzaidoneitamedica;
    }

    public void setAnpeDatascadenzaidoneitamedica(LocalDate anpeDatascadenzaidoneitamedica) {
        this.anpeDatascadenzaidoneitamedica = anpeDatascadenzaidoneitamedica;
    }

    public LocalDate getAnpeDatacorsosicurezza() {
        return anpeDatacorsosicurezza;
    }

    public void setAnpeDatacorsosicurezza(LocalDate anpeDatacorsosicurezza) {
        this.anpeDatacorsosicurezza = anpeDatacorsosicurezza;
    }


    public String getAnpeCodicefiscale() {
        return anpeCodicefiscale;
    }

    public void setAnpeCodicefiscale(String anpeCodicefiscale) {
        this.anpeCodicefiscale = anpeCodicefiscale;
    }

    public String getAnpePartitaiva() {
        return anpePartitaiva;
    }

    public void setAnpePartitaiva(String anpePartitaiva) {
        this.anpePartitaiva = anpePartitaiva;
    }

    public String getAnpeIndirizzoresidenza() {
        return anpeIndirizzoresidenza;
    }

    public void setAnpeIndirizzoresidenza(String anpeIndirizzoresidenza) {
        this.anpeIndirizzoresidenza = anpeIndirizzoresidenza;
    }

    public String getAnpeNumerocivicoresidenza() {
        return anpeNumerocivicoresidenza;
    }

    public void setAnpeNumerocivicoresidenza(String anpeNumerocivicoresidenza) {
        this.anpeNumerocivicoresidenza = anpeNumerocivicoresidenza;
    }

    public String getAnpeCapresidenza() {
        return anpeCapresidenza;
    }

    public void setAnpeCapresidenza(String anpeCapresidenza) {
        this.anpeCapresidenza = anpeCapresidenza;
    }

    public String getAnpeIndirizzodomicilio() {
        return anpeIndirizzodomicilio;
    }

    public void setAnpeIndirizzodomicilio(String anpeIndirizzodomicilio) {
        this.anpeIndirizzodomicilio = anpeIndirizzodomicilio;
    }

    public String getAnpeNumerocivicodomicilio() {
        return anpeNumerocivicodomicilio;
    }

    public void setAnpeNumerocivicodomicilio(String anpeNumerocivicodomicilio) {
        this.anpeNumerocivicodomicilio = anpeNumerocivicodomicilio;
    }

    public String getAnpeCapdomicilio() {
        return anpeCapdomicilio;
    }

    public void setAnpeCapdomicilio(String anpeCapdomicilio) {
        this.anpeCapdomicilio = anpeCapdomicilio;
    }

    public String getAnpeNtelefono1() {
        return anpeNtelefono1;
    }

    public void setAnpeNtelefono1(String anpeNtelefono1) {
        this.anpeNtelefono1 = anpeNtelefono1;
    }

    public String getAnpeNtelefono2() {
        return anpeNtelefono2;
    }

    public void setAnpeNtelefono2(String anpeNtelefono2) {
        this.anpeNtelefono2 = anpeNtelefono2;
    }

    public String getAnpeEmailaziendale() {
        return anpeEmailaziendale;
    }

    public void setAnpeEmailaziendale(String anpeEmailaziendale) {
        this.anpeEmailaziendale = anpeEmailaziendale;
    }

    public String getAnpeEmailpersonale() {
        return anpeEmailpersonale;
    }

    public void setAnpeEmailpersonale(String anpeEmailpersonale) {
        this.anpeEmailpersonale = anpeEmailpersonale;
    }

    public LocalDate getAnpeSysdate() {
        return anpeSysdate;
    }

    public void setAnpeSysdate(LocalDate anpeSysdate) {
        this.anpeSysdate = anpeSysdate;
    }

    public String getAnpeSysuser() {
        return anpeSysuser;
    }

    public void setAnpeSysuser(String anpeSysuser) {
        this.anpeSysuser = anpeSysuser;
    }

    public Integer getAnpeFlagAttiva() {
        return anpeFlagAttiva;
    }

    public void setAnpeFlagAttiva(Integer anpeFlagAttiva) {
        this.anpeFlagAttiva = anpeFlagAttiva;
    }
}
