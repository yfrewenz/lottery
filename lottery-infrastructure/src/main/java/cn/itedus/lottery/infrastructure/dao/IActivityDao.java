package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author：yinzheng
 * @date: 2023/7/20
 * @Copyright： yinzheng
 */
@Mapper
public interface IActivityDao {

    void insert(Activity req);

    Activity queryActivityById(Long activityId);

    int queryCount();
}