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

    private Integer anutFkPersPersonaid;

    private SysaStatoAbilitazione anutFkSysaStatAb;

    @Size(max = 100)
    @NotNull
    private String anutUserName;

    @Size(max = 256)
    @NotNull
    private String anutPasswordHash;

    private Integer anutFlagResetPassword;

    @Size(max = 50)
    @NotNull
    private String anutSysuser;

    private LocalDate anutSysdate;

    private Integer anutFlagAttiva;

    public Integer getAnutFkPersPersonaid() {
        return anutFkPersPersonaid;
    }

    public void setAnutFkPersPersonaid(Integer anutFkPersPersonaid) {
        this.anutFkPersPersonaid = anutFkPersPersonaid;
    }

    public SysaStatoAbilitazione getAnutFkSysaStatAb() {
        return anutFkSysaStatAb;
    }

    public void setAnutFkSysaStatAb(SysaStatoAbilitazione anutFkSysaStatAb) {
        this.anutFkSysaStatAb = anutFkSysaStatAb;
    }

    public String getAnutUserName() {
        return anutUserName;
    }

    public void setAnutUserName(String anutUserName) {
        this.anutUserName = anutUserName;
    }

    public String getAnutPasswordHash() {
        return anutPasswordHash;
    }

    public void setAnutPasswordHash(String anutPasswordHash) {
        this.anutPasswordHash = anutPasswordHash;
    }

    public Integer getAnutFlagResetPassword() {
        return anutFlagResetPassword;
    }

    public void setAnutFlagResetPassword(Integer anutFlagResetPassword) {
        this.anutFlagResetPassword = anutFlagResetPassword;
    }

    public String getAnutSysuser() {
        return anutSysuser;
    }

    public void setAnutSysuser(String anutSysuser) {
        this.anutSysuser = anutSysuser;
    }

    public LocalDate getAnutSysdate() {
        return anutSysdate;
    }

    public void setAnutSysdate(LocalDate anutSysdate) {
        this.anutSysdate = anutSysdate;
    }

    public Integer getAnutFlagAttiva() {
        return anutFlagAttiva;
    }

    public void setAnutFlagAttiva(Integer anutFlagAttiva) {
        this.anutFlagAttiva = anutFlagAttiva;
    }
}
