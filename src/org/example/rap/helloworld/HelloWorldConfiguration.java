package org.example.rap.helloworld;

import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;
import org.eclipse.rap.rwt.lifecycle.IEntryPoint;

public class HelloWorldConfiguration implements ApplicationConfiguration {

	@Override
	public void configure(Application application) {
		// TODO Auto-generated method stub
		application.addEntryPoint( "/hello", EntryPoint.class, null );

	}

}
