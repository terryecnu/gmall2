package com.es.controller;


import com.es.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EScontroller {

    class ElasticsearchDemoApplicationTests {

        @Autowired
        private ElasticsearchTemplate restTemplate;


        void contextLoads() {
            this.restTemplate.createIndex(User.class);
            this.restTemplate.putMapping(User.class);
        }
    }
}
