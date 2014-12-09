package com.family.finance.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.family.finance.dao.UserAccountDao;
import com.family.finance.model.AccountChartVO;
import com.family.finance.model.UserAccountsDO;
import com.family.finance.service.UserAccountService;
import com.family.utils.PageUtils;

@Service("userAccountService")
public class UserAccountServiceImpl implements UserAccountService {

	private UserAccountDao userAccountDao;

	@Override
	public Long addAccount(Map<String, Object> params) {
//		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//		String date = account.getCreateAtStr();
		return userAccountDao.addAccount(params);
	}

	@Override
	public List<UserAccountsDO> queryFinanceByCondition(Map<String, Object> map) {
		PageUtils.setInitPagingBean(map);
		return userAccountDao.queryFinanceByCondition(map);
	}

	public UserAccountDao getUserAccountDao() {
		return userAccountDao;
	}

	public void setUserAccountDao(UserAccountDao userAccountDao) {
		this.userAccountDao = userAccountDao;
	}

	@Override
	public Long queryFinanceCountByCondition(Map<String, Object> map) {
		return userAccountDao.queryFinanceCountByCondition(map);
	}

	@Override
	public List<UserAccountsDO> queryFinanceChart(Map<String, Object> map) {
		return userAccountDao.queryFinanceChart(map);
	}

	@Override
	public List<AccountChartVO> queryAccountChart() {
		return userAccountDao.queryAccountChart();
	}
}
