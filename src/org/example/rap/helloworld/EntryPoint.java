package org.example.rap.helloworld;

import org.eclipse.swt.widgets.Button;

import org.eclipse.rap.rwt.lifecycle.IEntryPoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class EntryPoint implements IEntryPoint {

	@Override
	public int createUI() {
		// TODO Auto-generated method stub

		Display display = new Display();
	    Shell shell = new Shell( display );
	    shell.setLayout( new GridLayout() );
	    Label label = new Label( shell, SWT.NONE );
	    label.setText( "Hello RAP World" );
	    shell.setSize( 500, 400 );
	    shell.open();

		return 0;
	}

}
