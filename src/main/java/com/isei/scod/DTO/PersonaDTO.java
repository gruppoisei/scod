package com.isei.scod.DTO;

import com.isei.scod.Entity.AnsoSocieta;
import com.isei.scod.Entity.GecoComune;
import com.isei.scod.Entity.GepaPaese;
import com.isei.scod.Entity.GetoToponimo;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO {

    private Integer id;

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
    @NotNull
    private SocietaDTO anpeFkAnsoSocietaid;
    @Size(max = 20)
    @NotNull
    private String anpeCodicefiscale;
    @Size(max = 11)
    private String anpePartitaiva;
    private PaeseDTO anpeFkGepaPaeseidPaesenascita;
    private PaeseDTO anpeFkGepaPaeseidPaesedomicilio;
    private PaeseDTO anpeFkGepaPaeseidPaeseresidenza;
    private ComuneDTO anpeFkGecoComuneidComunenascita;
    private ComuneDTO anpeFkGecoComuneidComuneresidenza;
    private ComuneDTO anpeFkGecoComuneidComunedomicilio;
    private ToponimoDTO anpeFkGetoToponimoidToponimoresidenza;
    private ToponimoDTO anpeFkGetoToponimoidToponimodomicilio;
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

    public SocietaDTO getAnpeFkAnsoSocietaid() {
        return anpeFkAnsoSocietaid;
    }

    public void setAnpeFkAnsoSocietaid(SocietaDTO anpeFkAnsoSocietaid) {
        this.anpeFkAnsoSocietaid = anpeFkAnsoSocietaid;
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

    public PaeseDTO getAnpeFkGepaPaeseidPaesenascita() {
        return anpeFkGepaPaeseidPaesenascita;
    }

    public void setAnpeFkGepaPaeseidPaesenascita(PaeseDTO anpeFkGepaPaeseidPaesenascita) {
        this.anpeFkGepaPaeseidPaesenascita = anpeFkGepaPaeseidPaesenascita;
    }

    public PaeseDTO getAnpeFkGepaPaeseidPaesedomicilio() {
        return anpeFkGepaPaeseidPaesedomicilio;
    }

    public void setAnpeFkGepaPaeseidPaesedomicilio(PaeseDTO anpeFkGepaPaeseidPaesedomicilio) {
        this.anpeFkGepaPaeseidPaesedomicilio = anpeFkGepaPaeseidPaesedomicilio;
    }

    public PaeseDTO getAnpeFkGepaPaeseidPaeseresidenza() {
        return anpeFkGepaPaeseidPaeseresidenza;
    }

    public void setAnpeFkGepaPaeseidPaeseresidenza(PaeseDTO anpeFkGepaPaeseidPaeseresidenza) {
        this.anpeFkGepaPaeseidPaeseresidenza = anpeFkGepaPaeseidPaeseresidenza;
    }

    public ComuneDTO getAnpeFkGecoComuneidComunenascita() {
        return anpeFkGecoComuneidComunenascita;
    }

    public void setAnpeFkGecoComuneidComunenascita(ComuneDTO anpeFkGecoComuneidComunenascita) {
        this.anpeFkGecoComuneidComunenascita = anpeFkGecoComuneidComunenascita;
    }

    public ComuneDTO getAnpeFkGecoComuneidComuneresidenza() {
        return anpeFkGecoComuneidComuneresidenza;
    }

    public void setAnpeFkGecoComuneidComuneresidenza(ComuneDTO anpeFkGecoComuneidComuneresidenza) {
        this.anpeFkGecoComuneidComuneresidenza = anpeFkGecoComuneidComuneresidenza;
    }

    public ComuneDTO getAnpeFkGecoComuneidComunedomicilio() {
        return anpeFkGecoComuneidComunedomicilio;
    }

    public void setAnpeFkGecoComuneidComunedomicilio(ComuneDTO anpeFkGecoComuneidComunedomicilio) {
        this.anpeFkGecoComuneidComunedomicilio = anpeFkGecoComuneidComunedomicilio;
    }

    public ToponimoDTO getAnpeFkGetoToponimoidToponimoresidenza() {
        return anpeFkGetoToponimoidToponimoresidenza;
    }

    public void setAnpeFkGetoToponimoidToponimoresidenza(ToponimoDTO anpeFkGetoToponimoidToponimoresidenza) {
        this.anpeFkGetoToponimoidToponimoresidenza = anpeFkGetoToponimoidToponimoresidenza;
    }

    public ToponimoDTO getAnpeFkGetoToponimoidToponimodomicilio() {
        return anpeFkGetoToponimoidToponimodomicilio;
    }

    public void setAnpeFkGetoToponimoidToponimodomicilio(ToponimoDTO anpeFkGetoToponimoidToponimodomicilio) {
        this.anpeFkGetoToponimoidToponimodomicilio = anpeFkGetoToponimoidToponimodomicilio;
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
