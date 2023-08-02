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
@Table(name = "COTC_TIPOCONTRATTO")
public class CotcTipocontratto implements Serializable {
    private static final long serialVersionUID = -2555706867635080774L;
    @Id
    @Column(name = "COTC_TIPOCONTRATTOID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "COTC_CONTRATTO", nullable = false, length = 100)
    private String cotcContratto;

    @Size(max = 50)
    @NotNull
    @Column(name = "COTC_SYSUSER", nullable = false, length = 50)
    private String cotcSysuser;

    @Column(name = "COTC_SYSDATE")
    private Instant cotcSysdate;

    @Column(name = "COTC_FLAG_ATTIVA")
    private Integer cotcFlagAttiva;

}