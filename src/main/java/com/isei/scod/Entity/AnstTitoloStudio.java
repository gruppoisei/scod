package com.isei.scod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "ANST_TITOLO_STUDIO")
public class AnstTitoloStudio implements Serializable {
    private static final long serialVersionUID = -1369131304855689053L;
    @Id
    @Column(name = "ANST_TITOLOSTUDIOID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "ANST_TITOLOSTUDIODESC")
    private String anstTitolostudiodesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANST_SYSUSER", nullable = false, length = 50)
    private String anstSysuser;

    @Column(name = "ANST_SYSDATE")
    private Instant anstSysdate;

    @Column(name = "ANST_FLAG_ATTIVA")
    private Integer anstFlagAttiva;

}