package cn.tedu.spring.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.tedu.spring.entity.Dept;

@Mapper
public interface DeptMapper {
  Dept  findDeptByString(String name);
}
