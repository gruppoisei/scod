package com.isei.scod.DTO;

import com.isei.scod.Entity.SysaStatoAbilitazione;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO {

    private Integer syutFkPersPersonaid;

    private SysaStatoAbilitazione syutFkSysaStatAb;

    @Size(max = 100)
    @NotNull
    private String syutUserName;

    @Size(max = 256)
    @NotNull
    private String syutPasswordHash;

    private Integer syutFlagResetPassword;

    @Size(max = 50)
    @NotNull
    private String syutSysuser;

    private LocalDate syutSysdate;

    private Integer syutFlagAttiva;

    public Integer getSyutFkPersPersonaid() {
        return syutFkPersPersonaid;
    }

    public void setSyutFkPersPersonaid(Integer syutFkPersPersonaid) {
        this.syutFkPersPersonaid = syutFkPersPersonaid;
    }

    public SysaStatoAbilitazione getSyutFkSysaStatAb() {
        return syutFkSysaStatAb;
    }

    public void setSyutFkSysaStatAb(SysaStatoAbilitazione syutFkSysaStatAb) {
        this.syutFkSysaStatAb = syutFkSysaStatAb;
    }

    public String getSyutUserName() {
        return syutUserName;
    }

    public void setSyutUserName(String syutUserName) {
        this.syutUserName = syutUserName;
    }

    public String getSyutPasswordHash() {
        return syutPasswordHash;
    }

    public void setSyutPasswordHash(String syutPasswordHash) {
        this.syutPasswordHash = syutPasswordHash;
    }

    public Integer getSyutFlagResetPassword() {
        return syutFlagResetPassword;
    }

    public void setSyutFlagResetPassword(Integer syutFlagResetPassword) {
        this.syutFlagResetPassword = syutFlagResetPassword;
    }

    public String getSyutSysuser() {
        return syutSysuser;
    }

    public void setSyutSysuser(String syutSysuser) {
        this.syutSysuser = syutSysuser;
    }

    public LocalDate getSyutSysdate() {
        return syutSysdate;
    }

    public void setSyutSysdate(LocalDate syutSysdate) {
        this.syutSysdate = syutSysdate;
    }

    public Integer getSyutFlagAttiva() {
        return syutFlagAttiva;
    }

    public void setSyutFlagAttiva(Integer syutFlagAttiva) {
        this.syutFlagAttiva = syutFlagAttiva;
    }
}
