/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.sharding.model;

import java.io.Serializable;

/**
 * 订单项模型。
 *
 * @author shinnlove.jinsheng
 * @version $Id: OrderItem.java, v 0.1 2018-06-05 下午10:40 shinnlove.jinsheng Exp $$
 */
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 310249038246378657L;

    private Long orderItemId;

    private Long orderId;

    private Long userId;

    private String status;

    public OrderItem() {
    }

    public OrderItem(Long orderItemId, Long orderId, Long userId, String status) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.userId = userId;
        this.status = status;
    }

    /**
     * Getter method for property orderItemId.
     *
     * @return property value of orderItemId
     */
    public Long getOrderItemId() {
        return orderItemId;
    }

    /**
     * Setter method for property orderItemId.
     *
     * @param orderItemId value to be assigned to property orderItemId
     */
    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
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