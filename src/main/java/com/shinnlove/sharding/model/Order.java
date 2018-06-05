/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.sharding.model;

import java.io.Serializable;

/**
 * 订单模型。
 *
 * @author shinnlove.jinsheng
 * @version $Id: Order.java, v 0.1 2018-06-05 下午10:39 shinnlove.jinsheng Exp $$
 */
public class Order implements Serializable {

    private static final long serialVersionUID = -7121997458748583474L;

    private Long orderId;

    private Long userId;

    private String status;

    public Order() {
    }

    public Order(Long orderId, Long userId, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.status = status;
    }

    /**
     * Getter method for property orderId.
     *
     * @return property value of orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * Setter method for property orderId.
     *
     * @param orderId value to be assigned to property orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Getter method for property userId.
     *
     * @return property value of userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Setter method for property userId.
     *
     * @param userId value to be assigned to property userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property status.
     *
     * @return property value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for property status.
     *
     * @param status value to be assigned to property status
     */
    public void setStatus(String status) {
        this.status = status;
    }

}