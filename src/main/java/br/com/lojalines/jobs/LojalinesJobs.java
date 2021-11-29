package br.com.lojalines.jobs;


import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

@Singleton
public class LojalinesJobs {
	
	@Inject
	@JMSConnectionFactory("java:jboss/DefaultJMSConnectionFactory")
	private  JMSContext contest;
	
	@Resource(mappedName = "java:/jms/queue/filavendas")
	private Queue queue;
	
	public LojalinesJobs() {}
	
	@Schedule(hour = "*", minute = "*/60",second = "*/10")
	public void enviaEmail() {
		
		contest.createProducer().send(queue, "Email");
		
	}

}
