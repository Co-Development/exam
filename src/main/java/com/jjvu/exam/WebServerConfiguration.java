package com.jjvu.exam;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  
public class WebServerConfiguration  {  
	
    @Bean  
    public EmbeddedServletContainerFactory createEmbeddedServletContainerFactory(){  
        TomcatEmbeddedServletContainerFactory tomcatFactory = new TomcatEmbeddedServletContainerFactory();  
        tomcatFactory.addConnectorCustomizers(new MyTomcatConnectorCustomizer());  
        return tomcatFactory;  
    }  
}  
class MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer  {  
	
    public void customize(Connector connector){  
        Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();  
        //设置最大连接数  
        protocol.setMaxConnections(500);  
        //设置最大线程数  
        protocol.setMaxThreads(500);  
        protocol.setConnectionTimeout(30000);  
    }  
} 