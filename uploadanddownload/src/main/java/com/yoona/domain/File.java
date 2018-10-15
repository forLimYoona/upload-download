package com.yoona.domain;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("file")
@Scope("prototype")
public class File {
	
	private int id;
	private String filename;  //文件名
	private String filepath;  //文件位置
	private String filesize; //文件大小
	private Date createtime; //创建时间
	private int canshare;    //表示私有性
	private String owner;    //表示上传者姓名
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public String getFilesize() {
		return filesize;
	}
	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public int getCanshare() {
		return canshare;
	}
	public void setCanshare(int canshare) {
		this.canshare = canshare;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
