package dialog;

import camera.Application;

public class PhotoDialog extends Dialog {

	//Constructor
	public PhotoDialog() {
		onCreate();
	}

	@Override
	public void onCreate() {
		view = Application.driver.getClassObject();
	}
}
