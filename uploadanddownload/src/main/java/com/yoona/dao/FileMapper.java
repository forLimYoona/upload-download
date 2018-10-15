package com.yoona.dao;

import com.yoona.domain.File;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface FileMapper {

    @Insert("insert into file values(null, #{filename},#{filepath},#{filesize},#{createtime},1,#{owner})")
    Integer insertFile(File file) throws Exception;
}
