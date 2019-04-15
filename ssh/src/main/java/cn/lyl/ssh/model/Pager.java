package cn.lyl.ssh.model;

import java.util.List;

public class Pager<T> {
	//分页大小，每页显示数据条数
	private int size;
	
	//每一页起始条数索引
	private int offset;
	
	//查询总条数
	private long total;
	
	//每张分页具体的数据
	private List<T> rows;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "Pager [size=" + size + ", offset=" + offset + ", total=" + total + ", rows=" + rows + "]";
	}
	
	
}
