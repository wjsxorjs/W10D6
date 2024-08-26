package com.sist.backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sist.backend.vo.EmpVO;

@Mapper
public interface EmpMapper {
    // 반드시 연결된 emp.xml 문서의 id를
    // 추상메서드로 정의해야한다.
    List<EmpVO> all();
    
    Integer add(EmpVO evo);

}
