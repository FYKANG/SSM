package cn.yk.fire.cms.controller;

import cn.yk.fire.cms.service.CmsTestService;
import cn.yk.fire.model.cms.vo.TestVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Author: YK
 * Title: CmsTestController
 * Description: 后台测试控制器
 * Date: 2018/12/20
 * Time: 17:25
 */
@RestController
@RequestMapping("cms")
@Api(description ="后台测试模块")
public class CmsTestController {
    @Autowired
    CmsTestService cmsTestService;

    @GetMapping("jsonTest")
    @ApiOperation(value="Get的测试接口", response = TestVO.class)
    public ResponseEntity jsonTest(){
        return cmsTestService.DBTest();
    }

    @PostMapping("jsonTest")
    @ApiOperation(value="Post的测试接口", notes="用于测试Post接口")
    public ResponseEntity postJsonTest(@RequestBody TestVO request){
        System.out.println(request.toString());
        return new ResponseEntity<>(request,HttpStatus.OK);
    }
}
