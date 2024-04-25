package com.lolineet.system.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lolineet.system.model.bo.UserBO;
import com.lolineet.system.model.entity.SysUser;
import com.lolineet.system.model.form.UserForm;
import com.lolineet.system.model.vo.UserImportVO;
import com.lolineet.system.model.vo.UserInfoVO;
import com.lolineet.system.model.vo.UserPageVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * 用户对象转换器
 *
 * @author haoxr
 * @since 2022/6/8
 */
@Mapper(componentModel = "spring")
public interface UserConverter {

    @Mappings({
            @Mapping(target = "genderLabel", expression = "java(com.lolineet.system.common.base.IBaseEnum.getLabelByValue(bo.getGender(), com.lolineet.system.common.enums.GenderEnum.class))")
    })
    UserPageVO bo2PageVo(UserBO bo);

    Page<UserPageVO> bo2PageVo(Page<UserBO> bo);

    UserForm entity2Form(SysUser entity);

    @InheritInverseConfiguration(name = "entity2Form")
    SysUser form2Entity(UserForm entity);

    @Mappings({
            @Mapping(target = "userId", source = "id")
    })
    UserInfoVO toUserInfoVo(SysUser entity);

    SysUser importVo2Entity(UserImportVO vo);

}
