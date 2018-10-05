package alkemu.core;

import alkemu.api.IInputDevice;
import alkemu.core.cartridge.GameCartridge;
import alkemu.core.cpu.SNES_CPU;
import alkemu.core.memory.SNES_MemoryManager;
import alkemu.core.ppu.SNES_PPU;
import alkemu.core.sound.SNES_SPU;

public class SuperNintendo {

	//The SNES CPU
	public SNES_CPU mCPU;
	
	//The SNES memory handler
	public SNES_MemoryManager mMemController;
	
	//The SNES PPU
	public SNES_PPU mPPU;
	
	//The SNES Sound Co-processor
	public SNES_SPU mSPU;	
	
	//The Input Devices
	public IInputDevice[] mControllerArray;
	
	//The Game currently inserted, can be null.
	public GameCartridge mCurrentlyInsertedGameCart;
	
	
	public SuperNintendo() {
		
	}

}
