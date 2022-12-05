package com.fnd.service.Impl;

import com.fnd.dao.TestRepository;
import com.fnd.eo.Test;
import com.fnd.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public Test getTest(Long id) {
        return testRepository.findOne(id);
    }
}
