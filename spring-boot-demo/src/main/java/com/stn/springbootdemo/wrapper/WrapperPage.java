package com.stn.springbootdemo.wrapper;

import com.github.pagehelper.PageInfo;

import java.util.List;

public class WrapperPage<T> {

	
	/**
	 * 成功码.
	 */
	public static final int SUCCESS_CODE = 200;

	/**
	 * 成功信息.
	 */
	public static final String SUCCESS_MESSAGE = "SUCCESS";

	/**
	 * 错误码.
	 */
	public static final int ERROR_CODE = 500;

	/**
	 * 错误信息.
	 */
	public static final String ERROR_MESSAGE = "FAIL";
	
	
	/**
	 * 编号.
	 */
	private int code;

	/**
	 * 信息.
	 */
	private String message;
	
	/**
	 * bootstrap table需要使用该参数 当前分页的列表信息
	 */
	private List<T> rows;
	
	/**
	 * 总数量
	 */
	private long total = 0;

	

	public WrapperPage(int code, String message, List<T> rows, long total) {
		super();
		this.code = code;
		this.message = message;
		this.rows = rows;
		this.total = total;
	}
	
	/**
	 * 分页返回对象
	 * @param o
	 * @return
	 */
	public static <T> WrapperPage<T> ok(PageInfo<T> pageInfo) {
		
		if(pageInfo!=null) {
		
			return new WrapperPage<T>(SUCCESS_CODE,SUCCESS_MESSAGE,pageInfo.getList(),pageInfo.getTotal());
		}
		
		return new WrapperPage<T>(SUCCESS_CODE,SUCCESS_MESSAGE,null,0);
	}
	
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}
}
