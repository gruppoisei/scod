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
@Table(name = "ANRU_RUOLO")
public class AnruRuolo implements Serializable {
    private static final long serialVersionUID = -1184175294621892765L;
    @Id
    @Column(name = "ANRU_RUOLOID", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "ANRU_RUOLODESC", nullable = false, length = 100)
    private String anruRuolodesc;

    @Size(max = 50)
    @NotNull
    @Column(name = "ANRU_SYSUSER", nullable = false, length = 50)
    private String anruSysuser;

    @Column(name = "ANRU_SYSDATE")
    private Instant anruSysdate;

    @Column(name = "ANRU_FLAG_ATTIVA")
    private Integer anruFlagAttiva;

}