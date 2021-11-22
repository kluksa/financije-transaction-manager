package com.kluksa.financije.tmgr.cucumber;

import com.kluksa.financije.tmgr.TransactionManagerApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = TransactionManagerApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
