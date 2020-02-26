package com.bw.bean;

public class Goods_brand {
	private Integer bid;
	private String bname;

	public Goods_brand(Integer bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}

	public Goods_brand() {
		super();
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Goods_brand [bid=" + bid + ", bname=" + bname + "]";
	}

}
