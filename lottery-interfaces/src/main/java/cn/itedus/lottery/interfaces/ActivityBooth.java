package cn.itedus.lottery.interfaces;

import cn.itedus.lottery.IActivityBooth;
import cn.itedus.lottery.dto.ActivityDto;
import cn.itedus.lottery.infrastructure.dao.IActivityDao;
import cn.itedus.lottery.infrastructure.po.Activity;
import cn.itedus.lottery.req.ActivityReq;
import cn.itedus.lottery.res.ActivityRes;
import cn.iteuds.lottery.common.Constants;
import cn.iteuds.lottery.common.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 活动展台
 * @author：yinzheng
 * @date: 2023/7/20
 * @Copyright： yinzheng
 */
@Service
public class ActivityBooth implements IActivityBooth {
    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }
}
