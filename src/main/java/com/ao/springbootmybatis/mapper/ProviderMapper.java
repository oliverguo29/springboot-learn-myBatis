package com.ao.springbootmybatis.mapper;


import com.ao.springbootmybatis.entities.Provider;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ProviderMapper {
    //list
    @Select("Select * from provider where pid=#{pid}")
    Provider getProviderById(int pid);

    //insert
    @Insert("Insert into provider(providerName) values(#{providerName})")
    int addProvider(Provider provider);

    //delete
    @Delete("Delete from provider where pid =#{pid}")
    int deleteProvider(int pid);

    //update
    @Update("Update  provider set providerName=#{providerName} where pid=#{Pid}")
    int updateProvider(Provider provider);







}
