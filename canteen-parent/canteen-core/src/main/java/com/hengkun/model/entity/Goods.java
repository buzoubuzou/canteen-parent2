package com.hengkun.model.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Goods implements Serializable {
    private static final long serialVersionUID = 1L;
    private  int id;
    private  int goodsId;
    private  int suppId;
    private  String specs;
    private  Double prince;
    private  String descpt;
    private  String goodsImgaeurl;
    private  int status;
    private String inTime;
}

