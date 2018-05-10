package org.motest.admin.service.impl;

import org.motest.admin.entity.TSUser;
import org.motest.admin.mapper.TSUserMapper;
import org.motest.admin.service.TSUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 587776 kB; (`id`) REFER `jeecg/t_s_base_user`(` 服务实现类
 * </p>
 *
 * @author Terry
 * @since 2018-05-10
 */
@Service
public class TSUserServiceImpl extends ServiceImpl<TSUserMapper, TSUser> implements TSUserService {

}
