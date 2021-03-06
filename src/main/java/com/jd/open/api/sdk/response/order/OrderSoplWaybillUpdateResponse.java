// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderSoplWaybillUpdateResponse.java

package com.jd.open.api.sdk.response.order;

import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderSoplWaybillUpdateResponse extends AbstractResponse {

    public OrderSoplWaybillUpdateResponse() {
    }

    public OrderSoplWaybillUpdateResponse(String venderId, long orderId) {
        this.venderId = venderId;
        this.orderId = orderId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getVenderId() {
        return venderId;
    }

    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    private static final long serialVersionUID = 0x213ad5c7L;
    private String venderId;
    private String modified;
    private long orderId;
}
