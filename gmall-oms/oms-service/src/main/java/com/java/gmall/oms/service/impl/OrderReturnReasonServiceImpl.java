package com.java.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.java.gmall.oms.dao.OrderReturnReasonDao;
import com.java.gmall.oms.entity.OrderReturnReason;
import com.java.gmall.oms.service.OrderReturnReasonService;

@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonDao, OrderReturnReason> implements OrderReturnReasonService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OrderReturnReason> page = this.page(
                new Query<OrderReturnReason>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}