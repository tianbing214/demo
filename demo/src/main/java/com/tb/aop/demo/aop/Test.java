package com.tb.aop.demo.aop;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apiguardian.api.API;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;



/**
 * @author tb
 */
@RestController
@RequestMapping("/Test")
@Api(value = "测试")
public class Test {

    @MyLog(desc = "测试aop")
    @ApiOperation(value="aop测试", notes="aop测试")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "a", value = "a", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "b", value = "b", required = true, dataType = "String")
    })
    @GetMapping(value = "/aopTest")
    public void Test(String a,String b){

        System.out.println("啦啦啦");
    }








}
