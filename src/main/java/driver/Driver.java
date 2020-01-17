/**/

package driver;

import camera.VideoView;
import camera.VideoView_Portrait;
import camera.View;
import enums.EnumOptions;

public class Driver {

	public EnumOptions currentOrientation = null;

	public View getClassObject(EnumOptions dialog) {
		View view = null;
		switch (dialog) {
			case VIDEO_IDLE: 
			{
				if (currentOrientation == EnumOptions.ORIENTATION_LANDSCAPE)
					view = new VideoView();
				else
					view = new VideoView_Portrait();
				System.out.println("_______Current Orientation______" + currentOrientation);
			}
		}
		return view;
	}

}
