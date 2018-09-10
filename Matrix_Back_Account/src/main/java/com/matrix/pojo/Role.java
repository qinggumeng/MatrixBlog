package com.matrix.pojo;

import java.util.Date;

public class Role {
    private Long id;

    private String rolename;

    private String remark;

    private Integer delflag;

    private Date creatertime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
    }

    public Date getCreatertime() {
        return creatertime;
    }

    public void setCreatertime(Date creatertime) {
        this.creatertime = creatertime;
    }
}