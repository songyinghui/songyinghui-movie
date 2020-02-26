package com.bw.bean;

import java.io.Serializable;

public class Goods implements Serializable {
	private Integer id;
	private String name;
	private String englishName;
	private Double size;
	private Double price;
	private Integer num;
	private String inform;
	private String pic;
	private Integer bid;
	private String bname;
	private Integer tid;
	private String tname;

	public Goods(Integer id, String name, String englishName, Double size, Double price, Integer num, String inform,
			String pic, Integer bid, String bname, Integer tid, String tname) {
		super();
		this.id = id;
		this.name = name;
		this.englishName = englishName;
		this.size = size;
		this.price = price;
		this.num = num;
		this.inform = inform;
		this.pic = pic;
		this.bid = bid;
		this.bname = bname;
		this.tid = tid;
		this.tname = tname;
	}

	public Goods() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getInform() {
		return inform;
	}

	public void setInform(String inform) {
		this.inform = inform;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
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

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", englishName=" + englishName + ", size=" + size + ", price="
				+ price + ", num=" + num + ", inform=" + inform + ", pic=" + pic + ", bid=" + bid + ", bname=" + bname
				+ ", tid=" + tid + ", tname=" + tname + "]";
	}

}
