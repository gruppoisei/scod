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
@Table(name = "NOTI_NOTIFICA")
public class NotiNotifica implements Serializable {
    private static final long serialVersionUID = 3179468632402503315L;
    @Id
    @Column(name = "NOTI_NOTOFICAID", nullable = false)
    private Integer id;

    @Column(name = "NOTI_DATANOTIFICA")
    private Instant notiDatanotifica;

    @Column(name = "NOTI_DATAINVIONOTIFICA")
    private Instant notiDatainvionotifica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NOTI_FK_NOTN_TIPONOTIFICAID")
    private NotnTiponotifica notiFkNotnTiponotificaid;

    @Size(max = 50)
    @NotNull
    @Column(name = "NOTI_SYSUSER", nullable = false, length = 50)
    private String notiSysuser;

    @Column(name = "NOTI_SYSDATE")
    private Instant notiSysdate;

    @Column(name = "NOTI_FLAG_ATTIVA")
    private Integer notiFlagAttiva;

}