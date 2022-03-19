package evendHandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventhandler implements ApplicationListener<ContextStartedEvent>
{

	public void onApplicationEvent(ContextStartedEvent event)
	{
		System.out.println("Context Started");
		
	}

}
