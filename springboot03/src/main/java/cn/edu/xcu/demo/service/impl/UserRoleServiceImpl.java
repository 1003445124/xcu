package cn.edu.xcu.demo.service.impl;

import cn.edu.xcu.demo.entity.UserRole;
import cn.edu.xcu.demo.mapper.UserRoleMapper;
import cn.edu.xcu.demo.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 3072 kB; (`roleid`) REFER `xcxy/t_role`(`id`); (`userid`) REFER `xc 服务实现类
 * </p>
 *
 * @author nydegang
 * @since 2019-11-02
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
