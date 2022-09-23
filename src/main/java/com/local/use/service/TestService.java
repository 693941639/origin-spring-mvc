package com.local.use.service;

import com.local.use.entity.Test;
import com.local.use.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class TestService {
    @Autowired
    TestMapper testMapper;

    public Test getTestById(long id) {
        Test test = testMapper.getById(id);

        if (test == null) {
            throw new RuntimeException("Test not found by id " + id);
        }

        return test;
    }
}
