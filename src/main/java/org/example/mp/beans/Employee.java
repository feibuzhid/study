package org.example.mp.beans;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @author chenyufei
 * @since 2020/10/28 17:39
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "tbl_employee")
public class Employee extends Model<Employee> {

    @TableId("emp_id")
    private Integer empId ;

    private String lastName;

    private String email ;

    private Integer gender ;

    private Integer age ;


}
