/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.sharding.algorithm;

import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * 表Sharding算法。
 *
 * @author shinnlove.jinsheng
 * @version $Id: TableShardingAlgorithm.java, v 0.1 2018-06-05 下午10:14 shinnlove.jinsheng Exp $$
 */
public class TableShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
        for (String each: availableTargetNames) {
            if (each.endsWith(shardingValue.getValue() %2 +"")) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }

}