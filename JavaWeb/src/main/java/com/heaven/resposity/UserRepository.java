package com.heaven.resposity;

import com.heaven.entity.Movic;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserRepository {
    public List<Movic> findAll(Integer page, Integer limit);
    public Integer count();
}
