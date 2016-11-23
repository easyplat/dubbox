package com.telecomjs.mapper;

import com.telecomjs.entities.EopApp;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.Cacheable;

public interface EopAppMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EOP_APP
     *
     * @mbggenerated
     */
    int insert(EopApp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EOP_APP
     *
     * @mbggenerated
     */
    int insertSelective(EopApp record);

    @Cacheable(value = "auth",key = "'getAppByKeyAndSecret#'.concat( #p0.concat( #p1) )",condition = "#p0 != null")
    //@Cacheable(value = "auth")
    public EopApp getAppByKeyAndSecret(@Param("apikey") String apikey,@Param("secret")  String secret);

    @Cacheable(value = "auth")
    public EopApp getAppByAppId(   long appId);
}