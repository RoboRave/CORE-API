package info.coremodding.api.meunet.machine;

import info.coremodding.api.meunet.meu.MEUPacket;

/**
 * All machines inherit this
 */
public interface IMachine {

	/**
	 * Put energy into the machine
	 * @param amount The amount to try with
	 * @return How much worked
	 */
	public int depositEnergy(MEUPacket amount);
	
	/**
	 * Remove energy from the machine
	 * @param amount The amount to try with
	 * @return How much was removed
	 */
	public int removeEnergy(MEUPacket amount);
}