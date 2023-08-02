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
    private Instant nodeSysdate;

    @Column(name = "NODE_FLAG_ATTIVA")
    private Integer nodeFlagAttiva;

}