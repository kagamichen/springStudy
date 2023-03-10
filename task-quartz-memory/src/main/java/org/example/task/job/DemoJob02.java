package org.example.task.job;// DemoJob02.java

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

@DisallowConcurrentExecution
public class DemoJob02 extends QuartzJobBean {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("[executeInternal][我开始的执行了]");
    }
}