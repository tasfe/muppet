package cn.bronzeware.muppet.core;

public class DataSourceException extends InitException {

	private String msg = "";
	
	public  DataSourceException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String message() {
		
		return msg.equals("") ? "数据源异常" : msg;
	}

}