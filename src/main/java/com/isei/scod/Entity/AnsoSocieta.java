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
@Table(name = "ANSO_SOCIETA")
public class AnsoSocieta implements Serializable {
    private static final long serialVersionUID = 6077993458570447753L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private LocalDate ansoSysdate;

    @Column(name = "ANSO_FLAG_ATTIVA")
    private Integer ansoFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AntsTiposocieta getAnsoFkAntsTiposocid() {
        return ansoFkAntsTiposocid;
    }

    public void setAnsoFkAntsTiposocid(AntsTiposocieta ansoFkAntsTiposocid) {
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