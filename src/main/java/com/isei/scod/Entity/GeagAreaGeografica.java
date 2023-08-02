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
@Table(name = "GEAG_AREA_GEOGRAFICA")
public class GeagAreaGeografica implements Serializable {
    private static final long serialVersionUID = -6793082804434864594L;
    @Id
    @Column(name = "GEAG_AGEOID", nullable = false)
    private Integer id;

    @Size(max = 200)
    @NotNull
    @Column(name = "GEAG_DENO", nullable = false, length = 200)
    private String geagDeno;

    @Column(name = "GEAG_SYSDATE")
    private Instant geagSysdate;

    @Size(max = 50)
    @NotNull
    @Column(name = "GEAG_SYSUSER", nullable = false, length = 50)
    private String geagSysuser;

    @Column(name = "GEAG_FLAG_ATTIVA")
    private Integer geagFlagAttiva;

}