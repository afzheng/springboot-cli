package com.bestpay.cup.mapper;

import com.bestpay.cup.model.CityModel;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface CityMapper {
    @Select("select * from city")
    public List<CityModel> selectAll();

    @Select("select * from city where cityID = #{cityID}")
    public CityModel selectByCityId(@Param("cityID") int cityID);

}
