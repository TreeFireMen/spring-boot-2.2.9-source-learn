package com.hand.springbootdataaccess.pojo;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-29
 */
public class Report {

	private Long id;

	private String content;

	private int type;

	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Report{" +
				"id=" + id +
				", content='" + content + '\'' +
				", type=" + type +
				", status=" + status +
				'}';
	}
}
