package com.oycbest.ssmblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oycbest.ssmblog.vo.UserRoleVo;

/**
 * (SsmUser)表服务接口
 *
 * @author oyc
 * @since 2020-04-28 23:21:53
 */
public interface UserRoleVoService extends IService<UserRoleVo> {
	/**
	 * 通过账号查询用户信息
	 *
	 * @param account 账号
	 * @return 对象列表
	 */
	UserRoleVo queryByAccount(String account);

}
