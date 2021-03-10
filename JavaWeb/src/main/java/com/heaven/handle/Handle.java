package com.heaven.handle;

import com.heaven.entity.Movic;
import com.heaven.entity.VOmovic;
import com.heaven.resposity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/mapper")
public class Handle {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/findAll")
    public VOmovic findAll(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit){
        page--;
        List<Movic> movic = userRepository.findAll(page, limit);
        VOmovic vOmovic = new VOmovic();
        vOmovic.setCode(0);
        vOmovic.setMsg("");
        vOmovic.setData(movic);
        vOmovic.setCount(userRepository.count());
        return vOmovic;
    }
}
