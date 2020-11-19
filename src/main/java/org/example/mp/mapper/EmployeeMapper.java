package org.example.mp.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.example.mp.beans.Employee;

import java.util.List;

/**
 * @author chenyufei
 * @since 2020/10/29 11:02
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

    List<Employee> getAll(@Param(Constants.WRAPPER) Wrapper<Employee> wrapper);

    Page<Employee> getPage(Page<Employee> page, @Param(Constants.WRAPPER) Wrapper<Employee> wrapper);
}
