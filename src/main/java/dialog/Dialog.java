/**/
package dialog;

import camera.View;
import enums.EnumOptions;

public class Dialog {

	public View view;
	public EnumOptions screen;

	//Constructor.
	public Dialog() {
	}

	public void onCreate() {
	}

	//This method will update dialog pointer of application class. 
	public Dialog(EnumOptions xEnum) {

		EnterDialog(xEnum);
	}

	//Enter dialog according user input.
	public void EnterDialog(EnumOptions xEmum) {
		switch (xEmum) {
		case VIDEO_IDLE:
			new VideoDialog();
			break;
		case PHOTO_IDLE:
			new PhotoDialog();
			break;
		default:
			System.out.println("ERROR:........Unknown Mode recieved....... ");
			break;
		}
	}

}
