package com.isei.scod.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SYUR_UTENTERUOLO")
public class SyurUtenteruolo implements Serializable {
    private static final long serialVersionUID = -4820704313027004187L;
    @Id
    @Column(name = "SYUR_IDUTENTERUOLO", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SYUR_IDUTENTE")
    private SyutUtente syurIdutente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SYUR_IDRUOLOSYS")
    private SyruRuolisistema syurIdruolosys;

}