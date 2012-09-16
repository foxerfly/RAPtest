package org.example.rap.helloworld;

import org.eclipse.swt.widgets.Button;

import org.eclipse.rap.rwt.lifecycle.IEntryPoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class EntryPoint implements IEntryPoint {

	@Override
	public int createUI() {
		// TODO Auto-generated method stub

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(1, false));

		Button button = new Button(shell, SWT.PUSH);
		button.setText("hello wrold");

		shell.pack();
		shell.open();
//		while (!shell.isDisposed()) {
//			if (!display.readAndDispatch())
//				display.sleep();
//		}
//		display.dispose();

		return 0;
	}

}
