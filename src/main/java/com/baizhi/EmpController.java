package com.baizhi;

import com.baizhi.entity.Emp;
import com.baizhi.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    EmpMapper mapper;

    @RequestMapping("/getAll")
    public List<Emp> gatAll() {
        List<Emp> list = mapper.selectAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }

        return list;
    }
}
