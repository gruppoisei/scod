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
@Table(name = "ANSO_SOCIETA")
public class AnsoSocieta implements Serializable {
    private static final long serialVersionUID = 6077993458570447753L;
    @Id
    @Column(name = "ANSO_SOCIETAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANSO_FK_ANTS_TIPOSOCID")
    private AntsTiposocieta ansoFkAntsTiposocid;

    @Size(max = 100)
    @Column(name = "ANSO_RAGIONESOCIALE", length = 100)
    private String ansoRagionesociale;

    @Size(max = 11)
    @NotNull
    @Column(name = "ANSO_PARTITAIVA", nullable = false, length = 11)
    private String ansoPartitaiva;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANSO_FK_PRPR_PROGETTOID")
    private PrprProgetto ansoFkPrprProgettoid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANSO_FK_GECO_COMUNEID")
    private GecoComune ansoFkGecoComuneid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANSO_FK_GEPA_PAESEID")
    private GepaPaese ansoFkGepaPaeseid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANSO_GETO_TOPONIMOID")
    private GetoToponimo ansoGetoToponimoid;

    @Size(max = 255)
    @Column(name = "ANSO_SEDE")
    private String ansoSede;

    @Size(max = 400)
    @Column(name = "ANSO_INDIRIZZO", length = 400)
    private String ansoIndirizzo;

    @Size(max = 20)
    @Column(name = "ANSO_NUMEROCIVICO", length = 20)
    private String ansoNumerocivico;

    @Size(max = 20)
    @Column(name = "ANSO_CAP", length = 20)
    private String ansoCap;

    @Size(max = 200)
    @NotNull
    @Column(name = "ANSO_EMAIL", nullable = false, length = 200)
    private String ansoEmail;

    @Size(max = 20)
    @Column(name = "ANSO_TELEFONO", length = 20)
    private String ansoTelefono;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANSO_SYSUSER", nullable = false, length = 50)
    private String ansoSysuser;

    @Column(name = "ANSO_SYSDATE")
    private Instant ansoSysdate;

    @Column(name = "ANSO_FLAG_ATTIVA")
    private Integer ansoFlagAttiva;

}