package com.zhidi.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 一对多关系中，Dept为主体
 * @author lx
 *
 */
@Entity
@Table(name="dept")
public class Dept {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer deptno;
	private String dname;
	private String loc;
	
	//持有关联实体的引用
	//一对多
	//mappedBy：指定对方实体维护关系的字段，指定了mappedBy就不需要指定@JoinColumn注解
	//@OneToMany(mappedBy="dept")
	private Integer version;

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", version=" + version + "]";
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
