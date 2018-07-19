package com.klxc.pojo;

/**
 * 支付
 * 
 * @author qiujing
 *
 */
public class Pay {
	private int tid;
	private int order_tid;// 订单号
	private int pay_type;// 支付方式，默认0值，为微信支付;1：支付宝；2：钱包；3：银联；4：现金；
	private String pay_type_desc;
	private int pay_done;// 支付是否成功，0：未完成支付。1：成功
	private String pay_done_desc;
	private String out_trade_no;// 第三方支付返回的商户订单号，如微信支付
	private String buyer_id;// 买家支付宝账号对应的支付宝\n唯一用户号。\n以2088开头的纯16位数字。
	private String trade_no;// 支付宝交易号\n该交易在支付宝系统中的交易\n流水号。\n最短16位，最长64位(String)。
	private int pay_method;// 支付类型 默认0\n0：支付\n1：充值
	private String pay_method_desc;
	private String create_time;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getOrder_tid() {
		return order_tid;
	}

	public void setOrder_tid(int order_tid) {
		this.order_tid = order_tid;
	}

	public int getPay_type() {
		return pay_type;
	}

	public void setPay_type(int pay_type) {
		this.pay_type = pay_type;
	}

	// 支付方式，默认0值，为微信支付;1：支付宝；2：钱包；3：银联；4：现金；
	public String getPay_type_desc() {
		switch (pay_type) {
		case 0:
			pay_type_desc = "微信";
			break;
		case 1:
			pay_type_desc = "支付宝";
			break;
		case 2:
			pay_type_desc = "钱包";
			break;
		case 3:
			pay_type_desc = "银联";
			break;
		case 4:
			pay_type_desc = "现金";
			break;
		default:
			break;
		}
		return pay_type_desc;
	}

	public int getPay_done() {
		return pay_done;
	}

	public void setPay_done(int pay_done) {
		this.pay_done = pay_done;
	}

	// 支付是否成功，0：未完成支付。1：成功
	public String getPay_done_desc() {
		switch (pay_done) {
		case 0:
			pay_done_desc = "未完成";
			break;
		case 1:
			pay_done_desc = "成功";
			break;
		default:
			break;
		}
		return pay_done_desc;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}

	public String getTrade_no() {
		return trade_no;
	}

	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}

	public int getPay_method() {
		return pay_method;
	}

	public void setPay_method(int pay_method) {
		this.pay_method = pay_method;
	}

	// 支付类型 默认0\n0：支付\n1：充值
	public String getPay_method_desc() {
		switch (pay_method) {
		case 0:
			pay_method_desc = "支付";
			break;
		case 1:
			pay_method_desc = "充值";
			break;
		default:
			break;
		}
		return pay_method_desc;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

}
