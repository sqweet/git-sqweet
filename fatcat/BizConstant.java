package cn.nicecoder.util;

/**
 * 业务常量
 
 */
public enum BizConstant {
	BIZ_NEWS_0("0","新增新闻"),
	BIZ_NEWS_1("1","查询所有新闻"),
	BIZ_NEWS_2("2","查询单条新闻"),
	BIZ_NEWS_3("3","删除单条新闻"),
	BIZ_NEWS_4("4","新闻详情"),
	BIZ_NEWS_5("5","评论新闻"),
	BIZ_NEWS_6("6","点赞"),
	BIZ_NEWS_7("7","首页显示新闻"),
	;
	
	private String pCode;
	private String pName;
	
	private BizConstant(String pCode,String pName) {
		this.pCode = pCode;
		this.pName = pName;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
}
