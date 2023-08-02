package com.isei.scod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PRRP_RUOLOPROGETTO")
public class PrrpRuoloprogetto implements Serializable {

    private static final long serialVersionUID = 5831371126613834908L;

    @Id
    @Column(name = "PRRP_RUOLOPROGETTOID", nullable = false)
    private Integer prrpRuoloprogettoid;

    @Size(max = 100)
    @Column(name = "PRRP_RUOLOPROGETTODESC", length = 100)
    private String prrpRuoloprogettodesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "PRRP_SYSUSER", nullable = false, length = 50)
    private String prrpSysuser;

    @Column(name = "PRRP_SYSDATE")
    private Instant prrpSysdate;

    @Column(name = "PRRP_FLAG_ATTIVA")
    private Integer prrpFlagAttiva;

}