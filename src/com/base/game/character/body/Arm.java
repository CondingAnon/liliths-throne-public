package com.base.game.character.body;

import java.io.Serializable;

import com.base.game.character.body.types.ArmType;
import com.base.game.character.body.types.BodyPartTypeInterface;

/**
 * @since 0.1.0
 * @version 0.1.69.9
 * @author Innoxia
 */
public class Arm implements BodyPartInterface, Serializable {
	private static final long serialVersionUID = 1L;
	
	private ArmType type;

	public Arm(ArmType type) {
		this.type = type;
	}
	
	@Override
	public ArmType getType() {
		return type;
	}

	@Override
	public void setType(BodyPartTypeInterface type) {
		this.type = (ArmType) type;
	}
}
