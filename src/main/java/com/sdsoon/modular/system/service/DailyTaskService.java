package com.sdsoon.modular.system.service;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.vo.DailyTaskVo;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * Created By Chr on 2019/8/10.
 */
public interface DailyTaskService {

    int addDailyTask(Integer category, String createTimeStamp, String taskDesc) throws ResponseException;

    List<DailyTaskVo> getDailyTask(Integer category);

    Map<String,Object> getDailyTask(Integer page, Integer limit);

    long getDailyCount();

    boolean removeDaily(String dailyTaskId) throws ResponseException;

    boolean update(DailyTaskVo dailyTaskVo) throws ParseException;
}
