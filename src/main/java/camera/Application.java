package camera;

import java.util.Scanner;

import dialog.Dialog;
import dialog.VideoDialog;
import driver.Driver;
import enums.EnumOptions;

public class Application{
	Dialog dialog;
	static Application application;
	public static Driver driver;
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
		driver.currentOrientation = getCurrentOrientation();
		dialog = new VideoDialog();
	}

	//Method to map current Orientation Enum
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

}
