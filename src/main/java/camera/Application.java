package camera;

import java.util.Scanner;

import dialog.Dialog;
import driver.Driver;
import enums.EnumOptions;

public class Application {
	static Dialog dialog;
	static Application application;
	public static Driver driver;
	//Scaner object to take user Input.
	Scanner scan = new Scanner(System.in);

	// Static block to initialize Driver class.
	static {
		System.out.println("__________Log driver Initialized_______");
		driver = new Driver();
	}

	// Application class Constructor.
	public Application() {
		System.out.println("___________Application Initialized___________");
		application = this;
		init();
	}

	// Init method to initialize the application.
	public void init() {

		driver.currentMode = getCurrentMode();
		driver.currentOrientation = getCurrentOrientation();
		dialog = new Dialog(driver.currentMode);
	}

	// Method to map current Orientation Enum
	public EnumOptions getCurrentOrientation() {
		EnumOptions currentOrientation = EnumOptions.UNKNOWN;
		System.out.println("Press 1 for Landscape and 2 for Portrait:");
		switch (scan.nextInt()) {
		case 1:
			currentOrientation = EnumOptions.ORIENTATION_LANDSCAPE;
			break;
		case 2:
			currentOrientation = EnumOptions.ORIENTATION_PORTRAIT;
			break;
		default:
			currentOrientation = EnumOptions.ORIENTATION_LANDSCAPE;
			break;
		}

		return currentOrientation;
	}

	// Method to map current Camera Mode Enum
	public EnumOptions getCurrentMode() {
		EnumOptions currentMode = EnumOptions.UNKNOWN;
		System.out.println("Press 1 for Video and 2 for Photo:");
		switch (scan.nextInt()) {
		case 1:
			currentMode = EnumOptions.VIDEO_IDLE;
			break;
		case 2:
			currentMode = EnumOptions.PHOTO_IDLE;
			break;
		default:
			currentMode = EnumOptions.VIDEO_IDLE;
			break;
		}
		return currentMode;
	}

}
