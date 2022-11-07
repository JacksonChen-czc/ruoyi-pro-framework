package cn.chenzecheng.ruoyi.module.example.convert.user;

import cn.chenzecheng.ruoyi.module.example.api.user.dto.UserInfoDTO;
import cn.chenzecheng.ruoyi.module.example.api.user.dto.UserRespDTO;
import cn.chenzecheng.ruoyi.module.example.dal.dataobject.user.MemberUserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserRespDTO convertResp(MemberUserDO bean);

    UserInfoDTO convertInfo(MemberUserDO bean);
}
