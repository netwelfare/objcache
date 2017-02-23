package org.apache.commons.jcs.auxiliary.lateral;

import java.io.IOException;

import org.apache.commons.jcs.auxiliary.lateral.socket.tcp.LateralTCPSender;
import org.apache.commons.jcs.auxiliary.lateral.socket.tcp.TCPLateralCacheAttributes;
import org.apache.commons.jcs.engine.CacheElement;

public class Test
{

	public Test()
	{

	}

	public static void main(String[] args) throws IOException
	{
		TCPLateralCacheAttributes attr = new TCPLateralCacheAttributes();
		attr.setTcpServer("localhost:23456");
		LateralTCPSender sender = new LateralTCPSender(attr);
		CacheElement ce = new CacheElement("cache", "name", "wangxiaofei");
		LateralElementDescriptor element = new LateralElementDescriptor();
		sender.send(element);
	}

}
