/**/

package driver;

import camera.PhotoView;
import camera.PhotoView_Portrait;
import camera.VideoView;
import camera.VideoView_Portrait;
import camera.View;
import enums.EnumOptions;

public class Driver {

	public EnumOptions currentOrientation = EnumOptions.UNKNOWN;
	public EnumOptions currentMode = EnumOptions.UNKNOWN;

	//Returns View.
	public View getClassObject() {
		View view = null;
		switch (currentMode) {
		case VIDEO_IDLE: {
			if (currentOrientation == EnumOptions.ORIENTATION_LANDSCAPE)
				view = new VideoView();
			else
				view = new VideoView_Portrait();
			break;
		}
		case PHOTO_IDLE: {
			if (currentOrientation == EnumOptions.ORIENTATION_LANDSCAPE)
				view = new PhotoView();
			else
				view = new PhotoView_Portrait();
			break;
		}
		default: System.out.println("ERROR:____Unknown Orientation_____");
			break;
		}

		System.out.println("_______Current Orientation______" + currentOrientation);
		return view;
	}

}
