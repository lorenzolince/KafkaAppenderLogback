/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llh.kafka.appender.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lorenzolince
 */
@RestController
@RequestMapping(name = "Test", value = "/api/test")
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void test() {
        for (int i = 0; i < 100; i++) {
            LOGGER.info((i + 1) + " test kafka appender");
        }

    }
}
