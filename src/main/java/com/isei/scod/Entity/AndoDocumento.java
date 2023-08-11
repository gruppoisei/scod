package com.isei.scod.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ANDO_DOCUMENTO")
public class AndoDocumento implements Serializable {
    private static final long serialVersionUID = -3468920345446649501L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANDO_DOCUMENTOID", nullable = false)
    private Integer id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANDO_FK_ALTA_TIPOALLEGATOID")

    private AltaTipodocumento andoFkAltaTipoallegatoid;

    @Size(max = 255)
    @Column(name = "ANDO_PATHFILE")
    private String andoPathfile;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANDO_SYSUSER", nullable = false, length = 50)
    private String andoSysuser;

    @Column(name = "ANDO_SYSDATE")
    private LocalDate andoSysdate;

    @Column(name = "ANDO_FLAG_ATTIVA")
    private Integer andoFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AltaTipodocumento getAndoFkAltaTipoallegatoid() {
        return andoFkAltaTipoallegatoid;
    }

    public void setAndoFkAltaTipoallegatoid(AltaTipodocumento andoFkAltaTipoallegatoid) {
        this.andoFkAltaTipoallegatoid = andoFkAltaTipoallegatoid;
    }

    public String getAndoPathfile() {
        return andoPathfile;
    }

    public void setAndoPathfile(String andoPathfile) {
        this.andoPathfile = andoPathfile;
    }

    public String getAndoSysuser() {
        return andoSysuser;
    }

    public void setAndoSysuser(String andoSysuser) {
        this.andoSysuser = andoSysuser;
    }

    public LocalDate getAndoSysdate() {
        return andoSysdate;
    }

    public void setAndoSysdate(LocalDate andoSysdate) {
        this.andoSysdate = andoSysdate;
    }

    public Integer getAndoFlagAttiva() {
        return andoFlagAttiva;
    }

    public void setAndoFlagAttiva(Integer andoFlagAttiva) {
        this.andoFlagAttiva = andoFlagAttiva;
    }
}