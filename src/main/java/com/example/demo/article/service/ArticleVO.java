package com.example.demo.article.service;

public class ArticleVO {
    private int IDX;
    private int PARENT_IDX;
    private String title;
    private String contents;
    private int HIT_CNT;
    private String DEL_GB;
    private String CREA_DTM;
    private String CREA_ID;

    public int getIDX() {
        return this.IDX;
    }

    public int getPARENT_IDX() {
        return this.PARENT_IDX;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    
    public int getHIT_CNT() {
        return this.HIT_CNT;
    }

    public void setHIT_CNT(int HIT_CNT) {
        this.HIT_CNT = HIT_CNT;
    }

    public String getDelgb() {
        return this.DEL_GB;
    }

    public void setDelgb(String DEL_GB) {
        this.DEL_GB = DEL_GB;
    }

    public String getCREA_DTM() {
        return this.CREA_DTM;
    }

    public String getCREA_ID() {
        return this.CREA_ID;
    }

    public void setCREA_ID(String CREA_ID) {
        this.CREA_ID = CREA_ID;
    }

}
