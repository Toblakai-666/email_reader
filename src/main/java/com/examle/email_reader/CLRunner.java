package com.examle.email_reader;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CLRunner implements CommandLineRunner {

    private final TokenHolder tokenHolder;
    private final EmailService emailService;
    @Override
    public void run(String... args) throws Exception {

        emailService.getEmail();

    }
}
