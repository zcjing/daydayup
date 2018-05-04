package activemq_test;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
/**
 * <p>
 * MQListerner Éú²úÕß¼àÌıÆ÷
 * <p>
 */
public class MQListerner implements MessageListener{

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println(((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}