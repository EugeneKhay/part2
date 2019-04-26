package com.tsystems.js;

import org.jboss.ejb3.annotation.ResourceAdapter;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

//@ResourceAdapter("activemq-rar-5.15.9.rar")
//@MessageDriven(activationConfig = {
//        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
//        @ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/test-queue") })
//public class ReadMessageMDB implements MessageListener {
//    @Override
//    public void onMessage(Message msg) {
//        if (msg instanceof TextMessage) {
//            try {
//                final String text = ((TextMessage) msg).getText();
//                System.out.println(text);
//            } catch (final JMSException e) {
//                throw new RuntimeException(e);
//            }
//        } else {
//            System.out.println(msg);
//        }
//    }
//}

//@MessageDriven (name = "TestMessageBean", mappedName="queue/test-queue",
//        activationConfig =
//                {
//
//                        @ActivationConfigProperty(propertyName  = "destination",
//                                propertyValue = "queue/test-queue"),
//                        @ActivationConfigProperty(propertyName  = "destinationType",
//                                propertyValue = "javax.jms.Queue"),
//                        @ActivationConfigProperty(propertyName  = "acknowledgeMode",
//                                propertyValue = "Auto-acknowledge")
//                })
//public class TestMessageBeanBean implements MessageListener
//{
//    public void onMessage (Message message)
//    {
//        System.out.println("WELL");
//    }
//}

@MessageDriven(name = "Listener1", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java:/jms/queue/test"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})
public class TestMessageBeanBean implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println(getClass().getSimpleName() + " >>>>>>>> " + message.getBody(String.class));




        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}























//@MessageDriven(activationConfig = {
//        @ActivationConfigProperty(propertyName = "destinationLookup",
//                propertyValue = "jms/MyQueue"),
//        @ActivationConfigProperty(propertyName = "destinationType",
//                propertyValue = "javax.jms.Queue")
//})
//public class SimpleMessageBean implements MessageListener {
//
////    @Resource
////    private MessageDrivenContext mdc;
//
//    static final Logger logger = Logger.getLogger("SimpleMessageBean");
//
//    public SimpleMessageBean() {
//    }
//
//    @Override
//    public void onMessage(Message inMessage) {
//
//        try {
//            if (inMessage instanceof TextMessage) {
//                logger.log(Level.INFO,
//                        "MESSAGE BEAN: Message received: {0}",
//                        inMessage.getBody(String.class));
//            } else {
//                logger.log(Level.WARNING,
//                        "Message of wrong type: {0}",
//                        inMessage.getClass().getName());
//            }
//        } catch (JMSException e) {
//            logger.log(Level.SEVERE,
//                    "SimpleMessageBean.onMessage: JMSException: {0}",
//                    e.toString());
//            //mdc.setRollbackOnly();
//        }
//    }
//}
