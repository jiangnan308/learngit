package com.family.finance.dao;

import java.util.List;
import java.util.Map;

import com.family.finance.model.AccountChartVO;
import com.family.finance.model.UserAccountsDO;

public interface UserAccountDao {

	//添加一个账单
	public Long addAccount(Map<String, Object> params);

	public List<UserAccountsDO> queryFinanceByCondition(Map<String, Object> map);

	public Long queryFinanceCountByCondition(Map<String, Object> map);

	public List<UserAccountsDO> queryFinanceChart(Map<String, Object> map);
	
	public List<AccountChartVO> queryAccountChart();

}
