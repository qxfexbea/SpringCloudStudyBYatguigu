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
//    //2 逻辑删除医院设置
//    @ApiOperation(value = "逻辑删除医院设置")
//    @DeleteMapping("{id}")
//    public Result removeHospSet(@PathVariable Long id) {
//        boolean flag = hospitalSetService.removeById(id);
//        if(flag) {
//            return Result.ok();
//        } else {
//            return Result.fail();
//        }
//    }
//    //3 条件查询带分页
//    @PostMapping("findPageHospSet/{current}/{limit}")
//    public Result findPageHospSet(@PathVariable long current,
//                                  @PathVariable long limit,
//                                  @RequestBody
//                                          (required = false) HospitalSetQueryVo hospitalSetQueryVo) {
//        //创建page对象，传递当前页，每页记录数
//        Page<HospitalSet> page = new Page<>(current,limit);
//        //构建条件
//        QueryWrapper<HospitalSet> wrapper = new QueryWrapper<>();
//        String hosname = hospitalSetQueryVo.getHosname();//医院名称
//        String hoscode = hospitalSetQueryVo.getHoscode();//医院编号
//        if(!StringUtils.isEmpty(hosname)) {
//            wrapper.like("hosname",hospitalSetQueryVo.getHosname());
//        }
//        if(!StringUtils.isEmpty(hoscode)) {
//            wrapper.eq("hoscode",hospitalSetQueryVo.getHoscode());
//        }
//        //调用方法实现分页查询
//        Page<HospitalSet> pageHospitalSet = hospitalSetService.page(page, wrapper);
//        //返回结果
//        return Result.ok(pageHospitalSet);
//    }
//
//    //4 添加医院设置
//    @PostMapping("saveHospitalSet")
//    public Result saveHospitalSet(@RequestBody HospitalSet hospitalSet) {
//        //设置状态 1 使用 0 不能使用
//        hospitalSet.setStatus(1);
//        //签名秘钥
//        Random random = new Random();
//        hospitalSet.setSignKey(MD5.encrypt(System.currentTimeMillis()+""+random.nextInt(1000)));
//        //调用service
//        boolean save = hospitalSetService.save(hospitalSet);
//        if(save) {
//            return Result.ok();
//        } else {
//            return Result.fail();
//        }
//    }
//
//    //5 根据id获取医院设置
//    @GetMapping("getHospSet/{id}")
//    public Result getHospSet(@PathVariable Long id) {
//        HospitalSet hospitalSet = hospitalSetService.getById(id);
//        return Result.ok(hospitalSet);
//    }
//
//    //6 修改医院设置
//    @PostMapping("updateHospitalSet")
//    public Result updateHospitalSet(@RequestBody HospitalSet hospitalSet) {
//        boolean flag = hospitalSetService.updateById(hospitalSet);
//        if(flag) {
//            return Result.ok();
//        } else {
//            return Result.fail();
//        }
//    }
//
//    //7 批量删除医院设置
//    @DeleteMapping("batchRemove")
//    public Result batchRemoveHospitalSet(@RequestBody List<Long> idList) {
//        hospitalSetService.removeByIds(idList);
//        return Result.ok();
//    }

}
