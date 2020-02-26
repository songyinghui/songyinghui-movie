package com.bw.dao;

import java.util.List;

import com.bw.bean.Condition;
import com.bw.bean.Goods;
import com.bw.bean.Goods_brand;
import com.bw.bean.Goods_type;

public interface GoodDao {

	List<Goods> getList(Condition con);

	List<Goods_brand> getBList();

	List<Goods_type> getTList();

	void add(Goods good);

}
