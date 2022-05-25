package com.qxf.hosp.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qxf.hosp.service.HospitalSetService;
import com.qxf.yygh.model.hosp.HospitalSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;


@RestController
@RequestMapping("/admin/hosp/hospitalSet")
//@CrossOrigin
public class HospitalSetController {
        @Autowired
        private HospitalSetService hospitalSetService;
        //1 查询医院设置表的所有信息

        /**
         * url:http://localhost:8201/admin/hosp/hospitalSet/findAll
         * @return
         */
        @GetMapping("findAll")
    public List<HospitalSet> findAllHospitalSet(){
            List<HospitalSet> list = hospitalSetService.list();
            return list;
        }
}
