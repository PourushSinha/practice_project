package com.pourush.springjdbctemplate.dao;

import com.pourush.springjdbctemplate.dto.Employee;
import lombok.Data;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by pourush.sinha on 17/01/19.
 */

@Data
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public int saveEmployee(Employee e){
        String query="insert into employee values( '"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
        return jdbcTemplate.update(query);
    }
    public int updateEmployee(Employee e){
        String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";
        return jdbcTemplate.update(query);
    }
    public int deleteEmployee(Employee e){
        String query="delete from employee where id='"+e.getId()+"' ";
        return jdbcTemplate.update(query);
    }
}
