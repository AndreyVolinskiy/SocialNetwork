package trainings.reflection.homework;

import networks.config.EmailConfig;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.io.*;
import java.util.StringJoiner;

public class FileToMail {

    public static void main(String[] args) {

        final String email = "mamashka236@gmail.com";
        final String filepath = "src\\main\\java\\trainings\\reflection\\homework\\reportList.txt";
        String text;
        StringJoiner joiner = new StringJoiner("\n");

        File file = new File(filepath);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((text = reader.readLine()) != null) {
                joiner.add(text);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new FileToMail().sendMessage(joiner.toString(), email);
    }

    private void sendMessage(String text, String to) {

        SimpleMailMessage simpleMessage = new SimpleMailMessage();
        simpleMessage.setTo(to);
        simpleMessage.setSubject("Report list");
        simpleMessage.setText(text);

        JavaMailSenderImpl mailSender = EmailConfig.mailSender();
        mailSender.send(simpleMessage);
    }

}


