package com.isei.scod.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SYRA_RUOLIAPP")
public class SyraRuoliapp implements Serializable {
    private static final long serialVersionUID = -6302546556101938219L;
    @Id
    @Column(name = "SYRA_IDRUOLOAPP", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SYRA_IDAPP")
    private SyapApp syraIdapp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SYRA_IDRUOLOSYS")
    private SyruRuolisistema syraIdruolosys;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SyapApp getSyraIdapp() {
        return syraIdapp;
    }

    public void setSyraIdapp(SyapApp syraIdapp) {
        this.syraIdapp = syraIdapp;
    }

    public SyruRuolisistema getSyraIdruolosys() {
        return syraIdruolosys;
    }

    public void setSyraIdruolosys(SyruRuolisistema syraIdruolosys) {
        this.syraIdruolosys = syraIdruolosys;
    }
}