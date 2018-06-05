/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.sharding.jdbc.dao;

import com.shinnlove.sharding.model.Order;

/**
 * Order仓储。
 *
 * @author shinnlove.jinsheng
 * @version $Id: OrderDaoMapper.java, v 0.1 2018-06-05 下午10:38 shinnlove.jinsheng Exp $$
 */
public interface OrderDaoMapper {

    int delete(Long orderId);

    int insert(Order order);

}
