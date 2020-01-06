package com.gx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gx.entity.Human;
import com.gx.mapper.HumanMapper;
import com.gx.service.HumanService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xun.guo
 * @since 2019-12-31
 */
@Service
public class HumanServiceImpl extends ServiceImpl<HumanMapper, Human> implements HumanService {

}
