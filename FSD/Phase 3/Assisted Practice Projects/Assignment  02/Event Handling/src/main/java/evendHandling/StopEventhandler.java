package evendHandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

public class StopEventhandler implements ApplicationListener<ContextStoppedEvent>
{
	public void onApplicationEvent(ContextStoppedEvent event) 
	{
		System.out.println("Context Stopped");
		
	}
	
}
