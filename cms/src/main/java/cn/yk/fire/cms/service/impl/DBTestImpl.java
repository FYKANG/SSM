package cn.yk.fire.cms.service.impl;

import cn.yk.fire.cms.service.CmsTestService;
import cn.yk.fire.core.support.ResponseEntitySupport;
import cn.yk.fire.model.cms.vo.TestVO;
import cn.yk.fire.orm.cms.CmsTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Author: YK
 * Title: DBTestImpl
 * Description: 后台测试Impl
 * Date: 2018/12/20
 * Time: 17:30
 */
@Service
public class DBTestImpl implements CmsTestService {
    @Autowired
    CmsTestMapper cmsTestMapper;
    @Override
    public ResponseEntity DBTest(){
        TestVO cmsTest=cmsTestMapper.test();
        return ResponseEntitySupport.success(cmsTest);
    }
}
