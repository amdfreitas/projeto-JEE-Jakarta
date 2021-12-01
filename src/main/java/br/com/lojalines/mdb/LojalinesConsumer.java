package br.com.lojalines.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
	
@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup",
				propertyValue = "java:/jms/queue/filavendas"),
		@ActivationConfigProperty(propertyName = "destinationType",
		propertyValue = "javax.jms.Queue")
})
public class LojalinesConsumer  implements MessageListener{

	
	@Override
	public void onMessage(Message message) {
		try {
			String body = message.getBody(String.class);
			System.out.println(body);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
