package com.lolineet.system.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lolineet.system.model.entity.SysDict;
import com.lolineet.system.model.form.DictForm;
import com.lolineet.system.model.vo.DictPageVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

/**
 * 字典数据项对象转换器
 *
 * @author haoxr
 * @since 2022/6/8
 */
@Mapper(componentModel = "spring")
public interface DictConverter {

    Page<DictPageVO> entity2Page(Page<SysDict> page);

    DictForm entity2Form(SysDict entity);

    @InheritInverseConfiguration(name="entity2Form")
    SysDict form2Entity(DictForm entity);
}
