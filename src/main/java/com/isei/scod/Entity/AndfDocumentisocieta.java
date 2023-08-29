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
@Table(name = "ANDF_DOCUMENTISOCIETA")
public class AndfDocumentisocieta implements Serializable {
    private static final long serialVersionUID = 4045006469207826729L;
    @Id
    @Column(name = "ANDF_DOCUMENTOPERDONAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANDF_FK_ANSO_SOCIETAID")
    private AnsoSocieta andfFkAnsoSocietaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANDF_FK_ANDO_DOCUMENTOID")
    private AndoDocumento andfFkAndoDocumentoid;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANDF_SYSUSER", nullable = false, length = 50)
    private String andfSysuser;

    @Column(name = "ANDF_SYSDATE")
    private LocalDate andfSysdate;

    @Column(name = "ANDF_FLAG_ATTIVA")
    private Integer andfFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AnsoSocieta getAndfFkAnsoSocietaid() {
        return andfFkAnsoSocietaid;
    }

    public void setAndfFkAnsoSocietaid(AnsoSocieta andfFkAnsoSocietaid) {
        this.andfFkAnsoSocietaid = andfFkAnsoSocietaid;
    }

    public AndoDocumento getAndfFkAndoDocumentoid() {
        return andfFkAndoDocumentoid;
    }

    public void setAndfFkAndoDocumentoid(AndoDocumento andfFkAndoDocumentoid) {
        this.andfFkAndoDocumentoid = andfFkAndoDocumentoid;
    }

    public String getAndfSysuser() {
        return andfSysuser;
    }

    public void setAndfSysuser(String andfSysuser) {
        this.andfSysuser = andfSysuser;
    }

    public LocalDate getAndfSysdate() {
        return andfSysdate;
    }

    public void setAndfSysdate(LocalDate andfSysdate) {
        this.andfSysdate = andfSysdate;
    }

    public Integer getAndfFlagAttiva() {
        return andfFlagAttiva;
    }

    public void setAndfFlagAttiva(Integer andfFlagAttiva) {
        this.andfFlagAttiva = andfFlagAttiva;
    }
}