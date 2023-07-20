package cn.itedus.lottery;

import cn.itedus.lottery.req.ActivityReq;
import cn.itedus.lottery.res.ActivityRes;


/**
 * @description: 对外暴露的接口
 * @author：yinzheng
 * @date: 2023/7/20
 * @Copyright： yinzheng
 */

public interface IActivityBooth {
    /**
     * 传入活动号id查询活动信息
     * @param req
     * @return
     */
    ActivityRes queryActivityById(ActivityReq req);
}
