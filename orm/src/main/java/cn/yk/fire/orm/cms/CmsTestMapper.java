package cn.yk.fire.orm.cms;

import cn.yk.fire.model.cms.vo.TestVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

/**
 * Author: YK
 * Title: CmsTestMapper
 * Description: mapper测试
 * Date: 2018/12/20
 * Time: 18:09
 */
@Mapper
@Repository
public interface CmsTestMapper {
    TestVO test();
}
