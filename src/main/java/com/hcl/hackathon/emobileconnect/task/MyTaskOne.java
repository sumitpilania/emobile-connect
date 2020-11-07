package com.hcl.hackathon.emobileconnect.task;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import com.hcl.hackathon.emobileconnect.entity.RequestStatusEntity;
import com.hcl.hackathon.emobileconnect.entity.UserEntity;

public class MyTaskOne implements Tasklet{

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception 
    {
        System.out.println("MyTaskOne start..");
        RequestStatusEntity requestStatusEntity = new RequestStatusEntity();
        requestStatusEntity.setStatus("Connection Enabled");
        System.out.println("MyTaskOne done..");
        return RepeatStatus.FINISHED;
    }   
}
