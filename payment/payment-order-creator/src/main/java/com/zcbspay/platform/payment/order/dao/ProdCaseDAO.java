/* 
 * IProdCaseDAO.java  
 * 
 * version TODO
 *
 * 2015年9月11日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zcbspay.platform.payment.order.dao;

import com.zcbspay.platform.payment.commons.dao.BaseDAO;
import com.zcbspay.platform.payment.order.dao.pojo.PojoProdCase;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2015年9月11日 下午4:54:19
 * @since 
 */
public interface ProdCaseDAO extends BaseDAO<PojoProdCase>{
   
	public PojoProdCase getMerchProd(String prdtver,String busicode);
}
