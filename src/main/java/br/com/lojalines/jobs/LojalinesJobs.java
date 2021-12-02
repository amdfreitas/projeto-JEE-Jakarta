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
	/*
	@Inject
	@JMSConnectionFactory("java:jboss/DefaultJMSConnectionFactory")
	private  JMSContext contest;
	
	@Resource(mappedName = "java:/jms/queue/filavendas")
	private Queue queue;
	
	public LojalinesJobs() {}
	
	@Schedule(hour = "*", minute = "*",second = "*")
	public void enviaEmail() {
		
		contest.createProducer().send(queue, "Email");
		
	}
	module add --name=com.mysql --resources="/home/amfreitas/workspace/mysql-connector.jar" --dependencies=javax.api,javax.transaction.api
    jms-queue add --queue-address=filavendas --entries=java:/jms/queue/filavendas
    /subsystem=datasources/jdbc-driver=mysql:add(driver-name=mysql,driver-module-name=com.mysql,driver-xa-datasource-class-name=com.mysql.cj.jdbc.MysqlXADataSource

*/
}
