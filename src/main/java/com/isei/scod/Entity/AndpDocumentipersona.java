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
@Table(name = "ANDP_DOCUMENTIPERSONA")
public class AndpDocumentipersona implements Serializable {
    private static final long serialVersionUID = -3849341868378817723L;
    @Id
    @Column(name = "ANDP_DOCUMENTOPERDONAID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANDP_FK_ANPE_PERSONAID")
    private AnpePersona andpFkAnpePersonaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANDP_FK_ANDO_DOCUMENTOID")
    private AndoDocumento andpFkAndoDocumentoid;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANDP_SYSUSER", nullable = false, length = 50)
    private String andpSysuser;

    @Column(name = "ANDP_SYSDATE")
    private LocalDate andpSysdate;

    @Column(name = "ANDP_FLAG_ATTIVA")
    private Integer andpFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AnpePersona getAndpFkAnpePersonaid() {
        return andpFkAnpePersonaid;
    }

    public void setAndpFkAnpePersonaid(AnpePersona andpFkAnpePersonaid) {
        this.andpFkAnpePersonaid = andpFkAnpePersonaid;
    }

    public AndoDocumento getAndpFkAndoDocumentoid() {
        return andpFkAndoDocumentoid;
    }

    public void setAndpFkAndoDocumentoid(AndoDocumento andpFkAndoDocumentoid) {
        this.andpFkAndoDocumentoid = andpFkAndoDocumentoid;
    }

    public String getAndpSysuser() {
        return andpSysuser;
    }

    public void setAndpSysuser(String andpSysuser) {
        this.andpSysuser = andpSysuser;
    }

    public LocalDate getAndpSysdate() {
        return andpSysdate;
    }

    public void setAndpSysdate(LocalDate andpSysdate) {
        this.andpSysdate = andpSysdate;
    }

    public Integer getAndpFlagAttiva() {
        return andpFlagAttiva;
    }

    public void setAndpFlagAttiva(Integer andpFlagAttiva) {
        this.andpFlagAttiva = andpFlagAttiva;
    }
}