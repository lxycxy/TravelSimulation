package com.backend;

import com.backend.mapper.PathMapper;
import com.backend.pojo.Graph;
import com.backend.pojo.Path;
import com.backend.pojo.Planed;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class BackendApplicationTests {

    @Autowired
    private PathMapper pathMapper;
    @Test
    void contextLoads() {
        Graph graph = new Graph(pathMapper.selectList(null));
        Set<Integer> set = new HashSet<>();
        set.add(1);set.add(3);
        Planed planed = graph.getDfs(110100, 120100, set,0);

    }

}
