package cn.tedu.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.tedu.spring.entity.Customer;
import cn.tedu.spring.joinentity.CustomerOrder;

@Mapper
public interface CustomerMapper {
   List<Customer> findList();
   List<CustomerOrder> queryCustomerOrder();
}
