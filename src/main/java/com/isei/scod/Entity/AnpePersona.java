package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ANPE_PERSONA")
public class AnpePersona implements Serializable {
    private static final long serialVersionUID = -9128411653533640529L;
    @Id
    @Column(name = "ANPE_PERSONAID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "ANPE_NOME", nullable = false, length = 100)
    private String anpeNome;

    @Size(max = 100)
    @NotNull
    @Column(name = "ANPE_COGNOME", nullable = false, length = 100)
    private String anpeCognome;

    @Column(name = "ANPE_DATANASCITA")
    private LocalDate anpeDatanascita;

    @Column(name = "ANPE_DATAIDONEITAMEDICA")
    private LocalDate anpeDataidoneitamedica;

    @Column(name = "ANPE_DATASCADENZAIDONEITAMEDICA")
    private LocalDate anpeDatascadenzaidoneitamedica;

    @Column(name = "ANPE_DATACORSOSICUREZZA")
    private LocalDate anpeDatacorsosicurezza;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANPE_FK_ANSO_SOCIETAID", nullable = false)
    private AnsoSocieta anpeFkAnsoSocietaid;

    @Size(max = 20)
    @NotNull
    @Column(name = "ANPE_CODICEFISCALE", nullable = false, length = 20)
    private String anpeCodicefiscale;

    @Size(max = 11)
    @Column(name = "ANPE_PARTITAIVA", length = 11)
    private String anpePartitaiva;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANPE_FK_GEPA_PAESEID_PAESENASCITA")
    private GepaPaese anpeFkGepaPaeseidPaesenascita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANPE_FK_GEPA_PAESEID_PAESEDOMICILIO")
    private GepaPaese anpeFkGepaPaeseidPaesedomicilio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANPE_FK_GEPA_PAESEID_PAESERESIDENZA")
    private GepaPaese anpeFkGepaPaeseidPaeseresidenza;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANPE_FK_GECO_COMUNEID_COMUNENASCITA")
    private GecoComune anpeFkGecoComuneidComunenascita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANPE_FK_GECO_COMUNEID_COMUNERESIDENZA")
    private GecoComune anpeFkGecoComuneidComuneresidenza;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANPE_FK_GECO_COMUNEID_COMUNEDOMICILIO")
    private GecoComune anpeFkGecoComuneidComunedomicilio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANPE_FK_GETO_TOPONIMOID_TOPONIMORESIDENZA")
    private GetoToponimo anpeFkGetoToponimoidToponimoresidenza;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANPE_FK_GETO_TOPONIMOID_TOPONIMODOMICILIO")
    private GetoToponimo anpeFkGetoToponimoidToponimodomicilio;

    @Size(max = 400)
    @NotNull
    @Column(name = "ANPE_INDIRIZZORESIDENZA", nullable = false, length = 400)
    private String anpeIndirizzoresidenza;

    @Size(max = 20)
    @NotNull
    @Column(name = "ANPE_NUMEROCIVICORESIDENZA", nullable = false, length = 20)
    private String anpeNumerocivicoresidenza;

    @Size(max = 20)
    @NotNull
    @Column(name = "ANPE_CAPRESIDENZA", nullable = false, length = 20)
    private String anpeCapresidenza;

    @Size(max = 400)
    @Column(name = "ANPE_INDIRIZZODOMICILIO", length = 400)
    private String anpeIndirizzodomicilio;

    @Size(max = 20)
    @Column(name = "ANPE_NUMEROCIVICODOMICILIO", length = 20)
    private String anpeNumerocivicodomicilio;

    @Size(max = 20)
    @Column(name = "ANPE_CAPDOMICILIO", length = 20)
    private String anpeCapdomicilio;

    @Size(max = 20)
    @Column(name = "ANPE_NTELEFONO1", length = 20)
    private String anpeNtelefono1;

    @Size(max = 20)
    @Column(name = "ANPE_NTELEFONO2", length = 20)
    private String anpeNtelefono2;

    @Size(max = 200)
    @NotNull
    @Column(name = "ANPE_EMAILAZIENDALE", nullable = false, length = 200)
    private String anpeEmailaziendale;

    @Size(max = 200)
    @Column(name = "ANPE_EMAILPERSONALE", length = 200)
    private String anpeEmailpersonale;

    @Column(name = "ANPE_SYSDATE")
    private LocalDate anpeSysdate;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANPE_SYSUSER", nullable = false, length = 50)
    private String anpeSysuser;

    @Column(name = "ANPE_FLAG_ATTIVA")
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

    public AnsoSocieta getAnpeFkAnsoSocietaid() {
        return anpeFkAnsoSocietaid;
    }

    public void setAnpeFkAnsoSocietaid(AnsoSocieta anpeFkAnsoSocietaid) {
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

    public GepaPaese getAnpeFkGepaPaeseidPaesenascita() {
        return anpeFkGepaPaeseidPaesenascita;
    }

    public void setAnpeFkGepaPaeseidPaesenascita(GepaPaese anpeFkGepaPaeseidPaesenascita) {
        this.anpeFkGepaPaeseidPaesenascita = anpeFkGepaPaeseidPaesenascita;
    }

    public GepaPaese getAnpeFkGepaPaeseidPaesedomicilio() {
        return anpeFkGepaPaeseidPaesedomicilio;
    }

    public void setAnpeFkGepaPaeseidPaesedomicilio(GepaPaese anpeFkGepaPaeseidPaesedomicilio) {
        this.anpeFkGepaPaeseidPaesedomicilio = anpeFkGepaPaeseidPaesedomicilio;
    }

    public GepaPaese getAnpeFkGepaPaeseidPaeseresidenza() {
        return anpeFkGepaPaeseidPaeseresidenza;
    }

    public void setAnpeFkGepaPaeseidPaeseresidenza(GepaPaese anpeFkGepaPaeseidPaeseresidenza) {
        this.anpeFkGepaPaeseidPaeseresidenza = anpeFkGepaPaeseidPaeseresidenza;
    }

    public GecoComune getAnpeFkGecoComuneidComunenascita() {
        return anpeFkGecoComuneidComunenascita;
    }

    public void setAnpeFkGecoComuneidComunenascita(GecoComune anpeFkGecoComuneidComunenascita) {
        this.anpeFkGecoComuneidComunenascita = anpeFkGecoComuneidComunenascita;
    }

    public GecoComune getAnpeFkGecoComuneidComuneresidenza() {
        return anpeFkGecoComuneidComuneresidenza;
    }

    public void setAnpeFkGecoComuneidComuneresidenza(GecoComune anpeFkGecoComuneidComuneresidenza) {
        this.anpeFkGecoComuneidComuneresidenza = anpeFkGecoComuneidComuneresidenza;
    }

    public GecoComune getAnpeFkGecoComuneidComunedomicilio() {
        return anpeFkGecoComuneidComunedomicilio;
    }

    public void setAnpeFkGecoComuneidComunedomicilio(GecoComune anpeFkGecoComuneidComunedomicilio) {
        this.anpeFkGecoComuneidComunedomicilio = anpeFkGecoComuneidComunedomicilio;
    }

    public GetoToponimo getAnpeFkGetoToponimoidToponimoresidenza() {
        return anpeFkGetoToponimoidToponimoresidenza;
    }

    public void setAnpeFkGetoToponimoidToponimoresidenza(GetoToponimo anpeFkGetoToponimoidToponimoresidenza) {
        this.anpeFkGetoToponimoidToponimoresidenza = anpeFkGetoToponimoidToponimoresidenza;
    }

    public GetoToponimo getAnpeFkGetoToponimoidToponimodomicilio() {
        return anpeFkGetoToponimoidToponimodomicilio;
    }

    public void setAnpeFkGetoToponimoidToponimodomicilio(GetoToponimo anpeFkGetoToponimoidToponimodomicilio) {
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