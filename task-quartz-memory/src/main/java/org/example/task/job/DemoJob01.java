package org.example.task.job;

import org.example.task.service.DemoService;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@DisallowConcurrentExecution
public class DemoJob01 extends QuartzJobBean {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final AtomicInteger counts = new AtomicInteger();
    @Autowired
    private DemoService demoService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("[executeInternal][定时第 ({}) 次执行, demoService 为 ({})]", counts.incrementAndGet(),
                demoService);
    }
}
