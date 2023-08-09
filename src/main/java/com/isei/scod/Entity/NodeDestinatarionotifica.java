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
@Table(name = "NODE_DESTINATARIONOTIFICA")
public class NodeDestinatarionotifica implements Serializable {
    private static final long serialVersionUID = 5798583854839566569L;
    @Id
    @Column(name = "NODE_DESTINATARIONOTIFICAID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NODE_FK_NOTI_NOTIFICAID")
    private NotiNotifica nodeFkNotiNotificaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NODE_FK_ANPE_PERSONAID")
    private AnpePersona nodeFkAnpePersonaid;

    @Size(max = 50)
    @NotNull
    @Column(name = "NODE_SYSUSER", nullable = false, length = 50)
    private String nodeSysuser;

    @Column(name = "NODE_SYSDATE")
    private LocalDate nodeSysdate;

    @Column(name = "NODE_FLAG_ATTIVA")
    private Integer nodeFlagAttiva;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NotiNotifica getNodeFkNotiNotificaid() {
        return nodeFkNotiNotificaid;
    }

    public void setNodeFkNotiNotificaid(NotiNotifica nodeFkNotiNotificaid) {
        this.nodeFkNotiNotificaid = nodeFkNotiNotificaid;
    }

    public AnpePersona getNodeFkAnpePersonaid() {
        return nodeFkAnpePersonaid;
    }

    public void setNodeFkAnpePersonaid(AnpePersona nodeFkAnpePersonaid) {
        this.nodeFkAnpePersonaid = nodeFkAnpePersonaid;
    }

    public String getNodeSysuser() {
        return nodeSysuser;
    }

    public void setNodeSysuser(String nodeSysuser) {
        this.nodeSysuser = nodeSysuser;
    }

    public LocalDate getNodeSysdate() {
        return nodeSysdate;
    }

    public void setNodeSysdate(LocalDate nodeSysdate) {
        this.nodeSysdate = nodeSysdate;
    }

    public Integer getNodeFlagAttiva() {
        return nodeFlagAttiva;
    }

    public void setNodeFlagAttiva(Integer nodeFlagAttiva) {
        this.nodeFlagAttiva = nodeFlagAttiva;
    }
}