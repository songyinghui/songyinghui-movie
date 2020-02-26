package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.bean.Condition;
import com.bw.bean.Goods;
import com.bw.bean.Goods_brand;
import com.bw.bean.Goods_type;
import com.bw.dao.GoodDao;
import com.bw.service.GoodService;

@Service
@Transactional
public class GoodServiceImpl implements GoodService {
	@Autowired
	private GoodDao dao;

	@Override
	public List<Goods> getList(Condition con) {
		// TODO Auto-generated method stub
		return dao.getList(con);
	}

	@Override
	public List<Goods_brand> getBList() {
		// TODO Auto-generated method stub
		return dao.getBList();
	}

	@Override
	public List<Goods_type> getTList() {
		// TODO Auto-generated method stub
		return dao.getTList();
	}

	@Override
	public void add(Goods good) {
		// TODO Auto-generated method stub
		dao.add(good);
	}
}
