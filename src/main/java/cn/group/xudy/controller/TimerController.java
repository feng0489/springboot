package cn.group.xudy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



@Component
@EnableScheduling
public class TimerController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 每间隔10秒输出时间
     *
     * 定时器
     */
    @Scheduled(fixedRate = 10000)
    public void logTime(){
        logger.info("定时任务，现在时间："+System.currentTimeMillis());

    }

}
