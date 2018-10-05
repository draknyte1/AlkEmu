package alkemu.core.controller;

import alkemu.api.IInputDevice;

public abstract class BaseInputDevice implements IInputDevice {

	private final byte mDevicePort;
	
	public BaseInputDevice(byte aDevicePort) {
		mDevicePort = aDevicePort;
	}

	@Override
	public int getDevicePort() {
		return mDevicePort;
	}

}
