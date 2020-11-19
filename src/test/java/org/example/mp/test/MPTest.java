package org.example.mp.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.mp.beans.Employee;
import org.example.mp.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author chenyufei
 * @since 2020/10/29 10:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MPTest {

    @Resource
    private EmployeeMapper employeeMapper;

    @Test
    public void simpleTest() {
        Employee employee = employeeMapper.selectById(12);
        System.out.println("employee = " + employee);
    }


    public void testSelect() {
        QueryWrapper<Employee> queryWrapper = Wrappers.query();
//        queryWrapper.eq("last_name", "MP1").and(Consumer<Param> consumer)
//
//        employeeMapper.selectList();
    }

    /**
     * 分页查询 操作
     */
    @Test
    public void testSelectPage() {
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("last_name", "MP1");
        Page<Employee> page = new Page<>(2, 2);

        Page<Employee> employeePage = employeeMapper.selectPage(page, queryWrapper);
        List<Employee> employeeList = employeePage.getRecords();

        System.out.println("总页数：" + employeePage.getPages());
        System.out.println("总记录条数：" + employeePage.getTotal());
        for (Employee employee : employeeList) {
            System.out.println("employee = " + employee);
        }
    }



}
