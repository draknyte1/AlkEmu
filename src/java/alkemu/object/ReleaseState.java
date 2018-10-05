package alkemu.object;

public enum ReleaseState {

	ALPHA("Alpha"), BETA("Beta"), FINAL("Release");

	private final String mValue;

	private ReleaseState(String aState) {
		mValue = aState;
	}

	public String getValue() {
		return mValue;
	}

}
