/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.sharding.jdbc.dao;

import com.shinnlove.sharding.model.Order;
import com.shinnlove.sharding.model.OrderItem;

import java.util.List;

/**
 * 订单数据项DAO层。
 *
 * @author shinnlove.jinsheng
 * @version $Id: OrderItemDaoMapper.java, v 0.1 2018-06-05 下午10:40 shinnlove.jinsheng Exp $$
 */
public interface OrderItemDaoMapper {

    int delete(Long orderItemId);

    int insert(OrderItem record);

    List<Order> selectAll();

}
