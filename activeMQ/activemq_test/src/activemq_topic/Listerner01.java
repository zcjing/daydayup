package activemq_topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
/**
 * <p>
 * Listerner01 ������01�ļ�����
 * <p>
 */
public class Listerner01 implements MessageListener{

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("������01���յ���Ϣ��" + ((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}