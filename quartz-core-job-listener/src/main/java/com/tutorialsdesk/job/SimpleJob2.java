package com.tutorialsdesk.job;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * This is just a simple job that gets fired off many times by example 1
 * </p>
 * 
 * @author Bill Kratzer
 */
public class SimpleJob2 implements Job {

	private static Logger _log = LoggerFactory.getLogger(SimpleJob2.class);

	/**
	 * Empty constructor for job initialization
	 */
	public SimpleJob2() {
	}

	/**
	 * <p>
	 * Called by the <code>{@link org.quartz.Scheduler}</code> when a
	 * <code>{@link org.quartz.Trigger}</code> fires that is associated with the
	 * <code>Job</code>.
	 * </p>
	 * 
	 * @throws JobExecutionException
	 *             if there is an exception while executing the job.
	 */
	public void execute(JobExecutionContext context) throws JobExecutionException {

		// This job simply prints out its job name and the
		// date and time that it is running
		JobKey jobKey = context.getJobDetail().getKey();
		_log.info("SimpleJob2 says: " + jobKey + " executing at " + new Date());
	}

}
