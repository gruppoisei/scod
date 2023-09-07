package com.isei.scod.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class PersonaDTO {

    private Integer id;
    private String[] ruoli;
    @Size(max = 100)
    private String anpeNome;
    @Size(max = 100)
    private String anpeCognome;
    private LocalDate anpeDataNascita;
    private LocalDate anpeDataVisitaMedica;
    private LocalDate anpeDataCorsoSicurezza;
    private String anpeLuogoNascita;
    private String anpeProvinciaNascita;
    @Size(max = 20)
    @NotNull
    private String anpeCodicefiscale;
    @Size(max = 400)
    private String anpeIndirizzoResidenza;
    @Size(max = 20)
    private String anpeCapResidenza;
    @Size(max = 400)
    private String anpeIndirizzoDomicilio;
    @Size(max = 20)
    private String anpeCapDomicilio;
    @Size(max = 200)
    @NotNull
    private String anpeEmailAziendale;
    @Size(max = 200)
    private String anpeEmailPersonale;

    private MultipartFile anpeDocumento;
    private MultipartFile anpeCertificazioni;
    private MultipartFile anpeCv;
    private MultipartFile anpeCvAziendale;
    private MultipartFile anpeTitoliStudio;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String[] getRuoli() {
        return ruoli;
    }

    public void setRuoli(String[] ruoli) {
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

    public LocalDate getAnpeDataNascita() {
        return anpeDataNascita;
    }

    public void setAnpeDataNascita(LocalDate anpeDataNascita) {
        this.anpeDataNascita = anpeDataNascita;
    }

    public LocalDate getAnpeDataVisitaMedica() {
        return anpeDataVisitaMedica;
    }

    public void setAnpeDataVisitaMedica(LocalDate anpeDataVisitaMedica) {
        this.anpeDataVisitaMedica = anpeDataVisitaMedica;
    }

    public LocalDate getAnpeDataCorsoSicurezza() {
        return anpeDataCorsoSicurezza;
    }

    public void setAnpeDataCorsoSicurezza(LocalDate anpeDataCorsoSicurezza) {
        this.anpeDataCorsoSicurezza = anpeDataCorsoSicurezza;
    }

    public String getAnpeLuogoNascita() {
        return anpeLuogoNascita;
    }

    public void setAnpeLuogoNascita(String anpeLuogoNascita) {
        this.anpeLuogoNascita = anpeLuogoNascita;
    }

    public String getAnpeProvinciaNascita() {
        return anpeProvinciaNascita;
    }

    public void setAnpeProvinciaNascita(String anpeProvinciaNascita) {
        this.anpeProvinciaNascita = anpeProvinciaNascita;
    }

    public String getAnpeCodicefiscale() {
        return anpeCodicefiscale;
    }

    public void setAnpeCodicefiscale(String anpeCodicefiscale) {
        this.anpeCodicefiscale = anpeCodicefiscale;
    }

    public String getAnpeIndirizzoResidenza() {
        return anpeIndirizzoResidenza;
    }

    public void setAnpeIndirizzoResidenza(String anpeIndirizzoResidenza) {
        this.anpeIndirizzoResidenza = anpeIndirizzoResidenza;
    }

    public String getAnpeCapResidenza() {
        return anpeCapResidenza;
    }

    public void setAnpeCapResidenza(String anpeCapResidenza) {
        this.anpeCapResidenza = anpeCapResidenza;
    }

    public String getAnpeIndirizzoDomicilio() {
        return anpeIndirizzoDomicilio;
    }

    public void setAnpeIndirizzoDomicilio(String anpeIndirizzoDomicilio) {
        this.anpeIndirizzoDomicilio = anpeIndirizzoDomicilio;
    }

    public String getAnpeCapDomicilio() {
        return anpeCapDomicilio;
    }

    public void setAnpeCapDomicilio(String anpeCapDomicilio) {
        this.anpeCapDomicilio = anpeCapDomicilio;
    }

    public String getAnpeEmailAziendale() {
        return anpeEmailAziendale;
    }

    public void setAnpeEmailAziendale(String anpeEmailAziendale) {
        this.anpeEmailAziendale = anpeEmailAziendale;
    }

    public String getAnpeEmailPersonale() {
        return anpeEmailPersonale;
    }

    public void setAnpeEmailPersonale(String anpeEmailPersonale) {
        this.anpeEmailPersonale = anpeEmailPersonale;
    }

    public MultipartFile getAnpeDocumento() {
        return anpeDocumento;
    }

    public void setAnpeDocumento(MultipartFile anpeDocumento) {
        this.anpeDocumento = anpeDocumento;
    }

    public MultipartFile getAnpeCertificazioni() {
        return anpeCertificazioni;
    }

    public void setAnpeCertificazioni(MultipartFile anpeCertificazioni) {
        this.anpeCertificazioni = anpeCertificazioni;
    }

    public MultipartFile getAnpeCv() {
        return anpeCv;
    }

    public void setAnpeCv(MultipartFile anpeCv) {
        this.anpeCv = anpeCv;
    }

    public MultipartFile getAnpeCvAziendale() {
        return anpeCvAziendale;
    }

    public void setAnpeCvAziendale(MultipartFile anpeCvAziendale) {
        this.anpeCvAziendale = anpeCvAziendale;
    }

    public MultipartFile getAnpeTitoliStudio() {
        return anpeTitoliStudio;
    }

    public void setAnpeTitoliStudio(MultipartFile anpeTitoliStudio) {
        this.anpeTitoliStudio = anpeTitoliStudio;
    }






}
