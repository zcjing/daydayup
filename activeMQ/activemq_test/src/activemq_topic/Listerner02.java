package activemq_topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
/**
 * <p>
 * Listerner02 ������02�ļ�����
 * <p>
 */
public class Listerner02 implements MessageListener{

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("������02���յ���Ϣ��"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}