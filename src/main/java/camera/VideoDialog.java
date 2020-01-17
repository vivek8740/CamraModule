package camera;

import enums.EnumOptions;

public class VideoDialog extends Dialog {

	VideoDialog() {
		screen = EnumOptions.VIDEO_IDLE;
		onCreate();
	}

	public void onCreate() {
		view = Application.driver.getClassObject(screen);
	}

}
