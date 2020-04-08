package com.vergil.mapper;

import com.pojo.orm.City;
import java.util.Date;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper //此注解说明这是一个mybatis的 查询用接口。 mybatis 操作字节码的方式进行实现和调用。
//需要了解的知识有 ASM CGLIB JDK 动态代理 和 CGLIB代理
public interface CityMapper {

  @Select("SELECT city_id,city,country_id,last_update FROM city WHERE city_id = #{cityId}")
  @Results(id = "cityResults", value = {
      @Result(property = "cityId", column = "city_id"),
      @Result(property = "countryId", column = "country_id"),
      @Result(property = "city", column = "city", javaType = String.class),
      @Result(property = "lastUpdate", column = "last_update", javaType = Date.class),
  })
  City findByCityId(@Param("cityId") Integer cityId);

  @Delete("delete from city where city_id =#{cityId}")
  int deleteByCityId(@Param("id") Integer id);

  @Update("update city set city =#{city} ,last_update= now() where  city_id =#{cityId}")
  int updateNameByCityId(@Param("cityId") Integer id, @Param("city") String city);
}
