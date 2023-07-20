package cn.itedus.lottery.res;

import cn.itedus.lottery.dto.ActivityDto;
import cn.iteuds.lottery.common.Result;

import java.io.Serializable;

/**
 * @description:
 * @author：yinzheng
 * @date: 2023/7/20
 * @Copyright： yinzheng
 */
public class ActivityRes implements Serializable {
    private Result result;
    private ActivityDto activity;

    public ActivityRes() {
    }

    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activity = activity;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivity() {
        return activity;
    }

    public void setActivity(ActivityDto activity) {
        this.activity = activity;
    }
}
