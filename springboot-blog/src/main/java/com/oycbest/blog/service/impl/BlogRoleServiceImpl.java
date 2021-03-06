package com.oycbest.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oycbest.blog.dao.BlogRoleDao;
import com.oycbest.blog.entity.BlogRole;
import com.oycbest.blog.service.BlogRoleService;
import org.springframework.stereotype.Service;

/**
 * 角色信息表(BlogRole)表服务实现类
 *
 * @author oyc
 * @since 2020-12-16 11:17:05
 */
@Service("blogRoleService")
public class BlogRoleServiceImpl extends ServiceImpl<BlogRoleDao, BlogRole> implements BlogRoleService {

}