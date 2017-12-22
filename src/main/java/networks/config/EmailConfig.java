package networks.config;

import org.springframework.mail.javamail.JavaMailSenderImpl;

public class EmailConfig {

    private static final Integer PORT = 587;

    public static JavaMailSenderImpl mailSender() {

        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

        javaMailSender.setHost("smtp.gmail.com");
        javaMailSender.setPort(PORT);
        javaMailSender.setUsername("mamashka2@gmail.com");
        javaMailSender.setPassword("19011981ddD");
        javaMailSender.getJavaMailProperties().setProperty("mail.smtp.auth", "true");
        javaMailSender.getJavaMailProperties().setProperty("mail.smtp.starttls.enable", "true");
        return javaMailSender;
    }
}
