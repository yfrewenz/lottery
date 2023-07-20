package cn.itedus.lottery.req;

import java.io.Serializable;

/**
 * @description: 活动数据请求
 * @author：yinzheng
 * @date: 2023/7/20
 * @Copyright： yinzheng
 */
public class ActivityReq implements Serializable {
    private long activityId;

    public long getActivityId() {
        return activityId;
    }

    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }
}
