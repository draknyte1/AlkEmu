package alkemu;

import java.awt.*;

import alkemu.object.ReleaseState;

public class MainClass {

	private static final String mAppName = "AlkEmu";
	private static final String mVersion = "0.0.1";
	private static final ReleaseState mReleaseState = ReleaseState.ALPHA;
	
	
	public static void main(final String[] array) {
		if (GraphicsEnvironment.isHeadless()) {
			System.out.println("AlkEmu cannot run because Java does not have access to a graphical environment.");
			System.exit(1);
		}
		// new MainGuiWindow(array, (byte)0);
	}

	public String getAppInfo() {
		return mAppName+"-"+mVersion+"-"+mReleaseState.getValue();
	}
}
