package com.offcn;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Server {

	/**
	 * 供客户端调用的 
	 * @param name 传入参数
	 * @return String 返回结果
	 */
	//1111
	public String getValue(String name){
		return "我叫"+name;
	}
	
	/**
	 * 主方法，发布Webservice服务
	 * @param args
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9001/Service/hello", new Server());
		System.out.println("服务发布成功！");
	}
	
}
