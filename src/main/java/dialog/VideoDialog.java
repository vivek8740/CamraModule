package dialog;

import camera.Application;

public class VideoDialog extends Dialog {

	//Constructor.
	public VideoDialog() {
		onCreate();
	}
	
	//OnCreate method to initialize object.
	public void onCreate() {
		view = Application.driver.getClassObject();
	}

}
