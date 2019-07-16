package com.hengkun.model.entity;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 菜品实体类
 * @author yunik
 * @create 2019-07-15 14:14
 **/
@Data
public class Dishes  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;                //ID
    private int categoryId;        //菜品ID
    private String name;           //菜品名称
    private String description;    //菜品描述
    private String url;            //菜品图片URL
    private Double rawcost;        //菜品原料成本
    private Double sale;           //菜品售价
    private int supplierId;        //菜品供应商ID
    private int goodsId;           //商品ID
    private int productId;         //产品ID
    public Integer getId() {
        return id;
    }

    public Dishes(int id, int categoryId, String name, String description, String url, Double rawcost, Double sale, int supplierId, int goodsId, int productId) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.url = url;
        this.rawcost = rawcost;
        this.sale = sale;
        this.supplierId = supplierId;
        this.goodsId = goodsId;
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", rawcost=" + rawcost +
                ", sale=" + sale +
                ", supplierId=" + supplierId +
                ", goodsId=" + goodsId +
                ", productId=" + productId +
                '}';
    }


    public class getyId {
    }
}
