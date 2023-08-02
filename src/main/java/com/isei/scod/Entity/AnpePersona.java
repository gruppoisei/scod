package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
    private Instant anpeDatanascita;

    @Column(name = "ANPE_DATAIDONEITAMEDICA")
    private Instant anpeDataidoneitamedica;

    @Column(name = "ANPE_DATASCADENZAIDONEITAMEDICA")
    private Instant anpeDatascadenzaidoneitamedica;

    @Column(name = "ANPE_DATACORSOSICUREZZA")
    private Instant anpeDatacorsosicurezza;

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
    private Instant anpeSysdate;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANPE_SYSUSER", nullable = false, length = 50)
    private String anpeSysuser;

    @Column(name = "ANPE_FLAG_ATTIVA")
    private Integer anpeFlagAttiva;

}