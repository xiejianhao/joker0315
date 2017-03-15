package com.xie.socket;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


@ServerEndpoint("/echo")
public class EchoSocket {
	@OnOpen
	public void  open(Session  session ){
		System.out.println("建立了一个 webSocket通道！！！  sid:"+session.getId());
	}
}
