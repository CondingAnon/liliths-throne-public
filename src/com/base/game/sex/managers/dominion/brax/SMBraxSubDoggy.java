package com.base.game.sex.managers.dominion.brax;

import com.base.game.sex.SexPace;
import com.base.game.sex.SexPosition;
import com.base.game.sex.managers.SexManagerDefault;
import com.base.game.sex.sexActions.baseActionsMisc.GenericActions;
import com.base.game.sex.sexActions.baseActionsMisc.PartnerTalk;
import com.base.game.sex.sexActions.baseActionsMisc.PlayerTalk;
import com.base.game.sex.sexActions.baseActionsPartner.PartnerTailAnus;
import com.base.game.sex.sexActions.baseActionsPartner.PartnerTailVagina;
import com.base.game.sex.sexActions.baseActionsPlayer.PlayerFingerAnus;
import com.base.game.sex.sexActions.baseActionsPlayer.PlayerFingerNipple;
import com.base.game.sex.sexActions.baseActionsPlayer.PlayerFingerUrethra;
import com.base.game.sex.sexActions.baseActionsPlayer.PlayerFingerVagina;
import com.base.game.sex.sexActions.baseActionsPlayer.PlayerPenisAnus;
import com.base.game.sex.sexActions.baseActionsPlayer.PlayerPenisVagina;
import com.base.game.sex.sexActions.baseActionsPlayer.PlayerTailAnus;
import com.base.game.sex.sexActions.baseActionsPlayer.PlayerTailVagina;
import com.base.game.sex.sexActions.baseActionsSelfPartner.PartnerSelfFingerAnus;
import com.base.game.sex.sexActions.baseActionsSelfPartner.PartnerSelfFingerMouth;
import com.base.game.sex.sexActions.baseActionsSelfPartner.PartnerSelfFingerNipple;
import com.base.game.sex.sexActions.baseActionsSelfPartner.PartnerSelfFingerVagina;
import com.base.game.sex.sexActions.baseActionsSelfPartner.PartnerSelfNoPen;
import com.base.game.sex.sexActions.baseActionsSelfPartner.PartnerSelfTailAnus;
import com.base.game.sex.sexActions.baseActionsSelfPartner.PartnerSelfTailMouth;
import com.base.game.sex.sexActions.baseActionsSelfPartner.PartnerSelfTailNipple;
import com.base.game.sex.sexActions.baseActionsSelfPartner.PartnerSelfTailVagina;
import com.base.game.sex.sexActions.baseActionsSelfPlayer.PlayerSelfFingerAnus;
import com.base.game.sex.sexActions.baseActionsSelfPlayer.PlayerSelfFingerMouth;
import com.base.game.sex.sexActions.baseActionsSelfPlayer.PlayerSelfFingerNipple;
import com.base.game.sex.sexActions.baseActionsSelfPlayer.PlayerSelfFingerVagina;
import com.base.game.sex.sexActions.baseActionsSelfPlayer.PlayerSelfNoPen;
import com.base.game.sex.sexActions.baseActionsSelfPlayer.PlayerSelfTailAnus;
import com.base.game.sex.sexActions.baseActionsSelfPlayer.PlayerSelfTailMouth;
import com.base.game.sex.sexActions.baseActionsSelfPlayer.PlayerSelfTailNipple;
import com.base.game.sex.sexActions.baseActionsSelfPlayer.PlayerSelfTailVagina;
import com.base.game.sex.sexActions.dominion.brax.BraxPositioning;
import com.base.game.sex.sexActions.dominion.brax.SABraxSubDoggy;
import com.base.game.sex.sexActions.universal.GenericOrgasms;
import com.base.game.sex.sexActions.universal.dom.DomDoggy;

/**
 * @since 0.1.68
 * @version 0.1.79
 * @author Innoxia
 */
public class SMBraxSubDoggy extends SexManagerDefault {

	public SMBraxSubDoggy() {
		super(// Self actions:
				
				PlayerSelfFingerAnus.class,
				PlayerSelfFingerMouth.class,
				PlayerSelfFingerNipple.class,
				PlayerSelfFingerVagina.class,
				
				PlayerSelfTailAnus.class,
				PlayerSelfTailMouth.class,
				PlayerSelfTailNipple.class,
				PlayerSelfTailVagina.class,
				
				PlayerSelfNoPen.class,
				
				
				PartnerSelfFingerAnus.class,
				PartnerSelfFingerMouth.class,
				PartnerSelfFingerNipple.class,
				PartnerSelfFingerVagina.class,
				
				PartnerSelfTailAnus.class,
				PartnerSelfTailMouth.class,
				PartnerSelfTailNipple.class,
				PartnerSelfTailVagina.class,
				
				PartnerSelfNoPen.class,
				
				// Scene-specific:

				DomDoggy.class,
				
				SABraxSubDoggy.class,
				
				PlayerFingerNipple.class,
				PlayerFingerUrethra.class,
				PlayerFingerVagina.class,
				PlayerFingerAnus.class,
				PlayerPenisVagina.class,
				PlayerPenisAnus.class,
				PlayerTailVagina.class,
				PlayerTailAnus.class,

				PartnerTailVagina.class,
				PartnerTailAnus.class,
				
				// Positioning:
				
				BraxPositioning.class,
				
				// Universal:

				PlayerTalk.class,
				PartnerTalk.class,
				GenericActions.class,
				GenericOrgasms.class);
	}
	
	@Override
	public SexPosition getPosition() {
		return SexPosition.DOGGY_PARTNER_ON_ALL_FOURS;
	}
	
	@Override
	public boolean isConsensualSex(){
		return false;
	}
	
	@Override
	public boolean isPlayerAbleToStopSex() {
		return true;
	}
	
	@Override
	public boolean isPlayerCanRemoveOwnClothes(){
		return true;
	}
	
	@Override
	public boolean isPlayerCanRemovePartnersClothes(){
		return true;
	}
	
	@Override
	public boolean isPartnerCanRemoveOwnClothes(){
		return true;
	}
	
	@Override
	public boolean isPartnerCanRemovePlayersClothes(){
		return true;
	}

	@Override
	public SexPace getStartingSexPacePlayer() {
		return SexPace.DOM_NORMAL;
	}

	@Override
	public SexPace getStartingSexPacePartner() {
		return SexPace.SUB_NORMAL;
	}
	
}
