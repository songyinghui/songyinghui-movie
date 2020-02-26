package com.bw.bean;

public class Condition {
	private Integer pageNum;
	private Integer tid;
	private Integer bid;
	private Double p1;
	private Double p2;
	private String name;
	private String tj;

	public Condition(Integer pageNum, Integer tid, Integer bid, Double p1, Double p2, String name, String tj) {
		super();
		this.pageNum = pageNum;
		this.tid = tid;
		this.bid = bid;
		this.p1 = p1;
		this.p2 = p2;
		this.name = name;
		this.tj = tj;
	}

	public Condition() {
		super();
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Double getP1() {
		return p1;
	}

	public void setP1(Double p1) {
		this.p1 = p1;
	}

	public Double getP2() {
		return p2;
	}

	public void setP2(Double p2) {
		this.p2 = p2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTj() {
		return tj;
	}

	public void setTj(String tj) {
		this.tj = tj;
	}

	@Override
	public String toString() {
		return "Condition [pageNum=" + pageNum + ", tid=" + tid + ", bid=" + bid + ", p1=" + p1 + ", p2=" + p2
				+ ", name=" + name + ", tj=" + tj + "]";
	}

}
