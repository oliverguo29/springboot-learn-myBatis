package com.ao.springbootmybatis.Controller;

import com.ao.springbootmybatis.entities.Provider;
import com.ao.springbootmybatis.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Autowired
    ProviderMapper providerMapper;

    @GetMapping("/provider/{pid}")
    public Provider getProvider(@PathVariable("pid") int pid){
        Provider provider = providerMapper.getProviderById(pid);
        return provider;
    }

    @GetMapping("/provider")
    public Provider addProvider(Provider provider){
        providerMapper.addProvider(provider);
        return  provider;
    }


}
