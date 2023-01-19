package com.examle.email_reader;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.mail.Session;
import javax.mail.Store;
import java.util.Properties;


@RequiredArgsConstructor
@Service
public class EmailService {

    private final TokenHolder tokenHolder;

    public void getEmail() throws Exception {

        Properties props = new Properties();

        props.put("mail.store.protocol", "imap");
        props.put("mail.imap.host", "outlook.office365.com");
        props.put("mail.imap.port", "993");
        props.put("mail.imap.ssl.enable", "true");
        props.put("mail.imap.starttls.enable", "true");
        props.put("mail.imap.auth", "true");
        props.put("mail.imap.auth.mechanisms", "XOAUTH2");
        props.put("mail.imap.user", "support-test@notix.cz");
        props.put("mail.debug", "true");
        props.put("mail.debug.auth", "true");

        // open mailbox....
        String token = tokenHolder.getToken();
        Session session = Session.getInstance(props);
        session.setDebug(true);
        Store store = session.getStore("imap");
        store.connect("outlook.office365.com", "support-test@notix.cz", token);
    }

}
