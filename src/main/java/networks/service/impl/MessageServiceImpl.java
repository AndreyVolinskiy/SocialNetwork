package networks.service.impl;

import networks.config.EmailConfig;
import networks.service.MessageService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MessageServiceImpl implements MessageService {
    @Override
    public void sendMessage(String text, String to) {

        SimpleMailMessage simpleMessage = new SimpleMailMessage();
        simpleMessage.setTo(to);
        simpleMessage.setSubject("Happy birthday");
        simpleMessage.setText(text);

        JavaMailSenderImpl mailSender = EmailConfig.mailSender();
        mailSender.send(simpleMessage);
    }
}
