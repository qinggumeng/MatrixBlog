package com.matrix.pojo;

import java.util.Date;

public class Content {
    private Long id;

    private String title;

    private String content;

    private String summary;

    private Integer codingtype;

    private String linkto;

    private String thumbnail;

    private Long authorid;

    private String authorip;

    private String writername;

    private String writeremail;

    private Integer orderflag;

    private Integer status;

    private Integer voteup;

    private Integer votedown;

    private Integer commentvalve;

    private Integer viewcount;

    private Date createtime;

    private Date modifitime;

    private String metakeywords;

    private String metadescription;

    private String remarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getCodingtype() {
        return codingtype;
    }

    public void setCodingtype(Integer codingtype) {
        this.codingtype = codingtype;
    }

    public String getLinkto() {
        return linkto;
    }

    public void setLinkto(String linkto) {
        this.linkto = linkto == null ? null : linkto.trim();
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public Long getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Long authorid) {
        this.authorid = authorid;
    }

    public String getAuthorip() {
        return authorip;
    }

    public void setAuthorip(String authorip) {
        this.authorip = authorip == null ? null : authorip.trim();
    }

    public String getWritername() {
        return writername;
    }

    public void setWritername(String writername) {
        this.writername = writername == null ? null : writername.trim();
    }

    public String getWriteremail() {
        return writeremail;
    }

    public void setWriteremail(String writeremail) {
        this.writeremail = writeremail == null ? null : writeremail.trim();
    }

    public Integer getOrderflag() {
        return orderflag;
    }

    public void setOrderflag(Integer orderflag) {
        this.orderflag = orderflag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVoteup() {
        return voteup;
    }

    public void setVoteup(Integer voteup) {
        this.voteup = voteup;
    }

    public Integer getVotedown() {
        return votedown;
    }

    public void setVotedown(Integer votedown) {
        this.votedown = votedown;
    }

    public Integer getCommentvalve() {
        return commentvalve;
    }

    public void setCommentvalve(Integer commentvalve) {
        this.commentvalve = commentvalve;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifitime() {
        return modifitime;
    }

    public void setModifitime(Date modifitime) {
        this.modifitime = modifitime;
    }

    public String getMetakeywords() {
        return metakeywords;
    }

    public void setMetakeywords(String metakeywords) {
        this.metakeywords = metakeywords == null ? null : metakeywords.trim();
    }

    public String getMetadescription() {
        return metadescription;
    }

    public void setMetadescription(String metadescription) {
        this.metadescription = metadescription == null ? null : metadescription.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}