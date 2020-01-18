package dialog;

import camera.Application;
import enums.EnumOptions;

public class VideoDialog extends Dialog {

	public VideoDialog() {
		screen = EnumOptions.VIDEO_IDLE;
		onCreate();
	}

	public void onCreate() {
		view = Application.driver.getClassObject(screen);
	}

}
