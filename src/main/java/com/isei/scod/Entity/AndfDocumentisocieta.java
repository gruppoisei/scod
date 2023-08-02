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
    private Instant andfSysdate;

    @Column(name = "ANDF_FLAG_ATTIVA")
    private Integer andfFlagAttiva;

}