package com.klxc.pojo;

public class InviteData {
	//门店:M 招生团队:Z 招生团队代理:D 区域经理:Q 校园代理：X 教练：J 学员：A
	private static final String type_M = "M";
	private static final String type_Z = "Z";
	private static final String type_D = "D";
	private static final String type_Q = "Q";
	private static final String type_X = "X";
	private static final String type_J = "J";
	private static final String type_A = "A";
	
	public static String getTypeDesc(String type) {
		String str = "未知";
		if(type_M.equals(type)) {
			str = "门店";
		} else if(type_Z.equals(type)) {
			str = "招生团队";
		} else if(type_D.equals(type)) {
			str = "招生团队代理";
		} else if(type_Q.equals(type)) {
			str = "区域经理";
		} else if(type_X.equals(type)) {
			str = "校园代理";
		} else if(type_J.equals(type)) {
			str = "教练";
		} else if(type_A.equals(type)) {
			str = "学员";
		}
		return str;
	}
}
