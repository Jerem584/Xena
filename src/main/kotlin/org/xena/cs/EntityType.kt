package org.xena.cs

import org.xena.offsets.OffsetManager.process

/**
 * Created by Jonathan on 7/12/2016.
 */
enum class EntityType(val weapon: Boolean = false, val grenade: Boolean = false) {
	
	
	NULL,
	CAI_BaseNPC,
	CAK47(weapon = true),
	CBaseAnimating,
	CBaseAnimatingOverlay,
	CBaseAttributableItem,
	CBaseButton,
	CBaseCombatCharacter,
	CBaseCombatWeapon,
	CBaseCSGrenade(grenade = true),
	CBaseCSGrenadeProjectile(grenade = true),
	CBaseDoor,
	CBaseEntity,
	CBaseFlex,
	CBaseGrenade(grenade = true),
	CBaseParticleEntity,
	CBasePlayer,
	CBasePropDoor,
	CBaseTeamObjectiveResource,
	CBaseTempEntity,
	CBaseToggle,
	CBaseTrigger,
	CBaseViewModel,
	CBaseVPhysicsTrigger,
	CBaseWeaponWorldModel,
	CBeam,
	CBeamSpotlight,
	CBoneFollower,
	CBRC4Target,
	CBreachCharge,
	CBreachChargeProjectile,
	CBreakableProp,
	CBreakableSurface,
	CC4,
	CCascadeLight,
	CChicken,
	CColorCorrection,
	CColorCorrectionVolume,
	CCSGameRulesProxy,
	CCSPlayer,
	CCSPlayerResource,
	CCSRagdoll,
	CCSTeam,
	CDangerZone,
	CDangerZoneController,
	CDEagle(weapon = true),
	CDecoyGrenade(grenade = true),
	CDecoyProjectile(grenade = true),
	CDrone,
	CDronegun,
	CDynamicLight,
	CDynamicProp,
	CEconEntity,
	CEconWearable,
	CEmbers,
	CEntityDissolve,
	CEntityFlame,
	CEntityFreezing,
	CEntityParticleTrail,
	CEnvAmbientLight,
	CEnvDetailController,
	CEnvDOFController,
	CEnvGasCanister,
	CEnvParticleScript,
	CEnvProjectedTexture,
	CEnvQuadraticBeam,
	CEnvScreenEffect,
	CEnvScreenOverlay,
	CEnvTonemapController,
	CEnvWind,
	CFEPlayerDecal,
	CFireCrackerBlast,
	CFireSmoke,
	CFireTrail,
	CFish,
	CFists,
	CFlashbang(grenade = true),
	CFogController,
	CFootstepControl,
	CFunc_Dust,
	CFunc_LOD,
	CFuncAreaPortalWindow,
	CFuncBrush,
	CFuncConveyor,
	CFuncLadder,
	CFuncMonitor,
	CFuncMoveLinear,
	CFuncOccluder,
	CFuncReflectiveGlass,
	CFuncRotating,
	CFuncSmokeVolume,
	CFuncTrackTrain,
	CGameRulesProxy,
	CGrassBurn,
	CHandleTest,
	CHEGrenade(grenade = true),
	CHostage,
	CHostageCarriableProp,
	CIncendiaryGrenade(grenade = true),
	CInferno,
	CInfoLadderDismount,
	CInfoMapRegion,
	CInfoOverlayAccessor,
	CItem_Healthshot(weapon = true),
	CItemCash,
	CItemDogtags,
	CKnife,
	CKnifeGG,
	CLightGlow,
	CMaterialModifyControl,
	CMelee,
	CMolotovGrenade(grenade = true),
	CMolotovProjectile(grenade = true),
	CMovieDisplay,
	CParadropChopper,
	CParticleFire,
	CParticlePerformanceMonitor,
	CParticleSystem,
	CPhysBox,
	CPhysBoxMultiplayer,
	CPhysicsProp,
	CPhysicsPropMultiplayer,
	CPhysMagnet,
	CPhysPropAmmoBox,
	CPhysPropLootCrate,
	CPhysPropRadarJammer,
	CPhysPropWeaponUpgrade,
	CPlantedC4,
	CPlasma,
	CPlayerResource,
	CPointCamera,
	CPointCommentaryNode,
	CPointWorldText,
	CPoseController,
	CPostProcessController,
	CPrecipitation,
	CPrecipitationBlocker,
	CPredictedViewModel,
	CProp_Hallucination,
	CPropCounter,
	CPropDoorRotating,
	CPropJeep,
	CPropVehicleDriveable,
	CRagdollManager,
	CRagdollProp,
	CRagdollPropAttached,
	CRopeKeyframe,
	CSCAR17(weapon = true),
	CSceneEntity,
	CSensorGrenade(grenade = true),
	CSensorGrenadeProjectile(grenade = true),
	CShadowControl,
	CSlideshowDisplay,
	CSmokeGrenade(grenade = true),
	CSmokeGrenadeProjectile(grenade = true),
	CSmokeStack,
	CSpatialEntity,
	CSpotlightEnd,
	CSprite,
	CSpriteOriented,
	CSpriteTrail,
	CStatueProp,
	CSteamJet,
	CSun,
	CSunlightShadowControl,
	CSurvivalSpawnChopper,
	CTablet,
	CTeam,
	CTeamplayRoundBasedRulesProxy,
	CTEArmorRicochet,
	CTEBaseBeam,
	CTEBeamEntPoint,
	CTEBeamEnts,
	CTEBeamFollow,
	CTEBeamLaser,
	CTEBeamPoints,
	CTEBeamRing,
	CTEBeamRingPoint,
	CTEBeamSpline,
	CTEBloodSprite,
	CTEBloodStream,
	CTEBreakModel,
	CTEBSPDecal,
	CTEBubbles,
	CTEBubbleTrail,
	CTEClientProjectile,
	CTEDecal,
	CTEDust,
	CTEDynamicLight,
	CTEEffectDispatch,
	CTEEnergySplash,
	CTEExplosion,
	CTEFireBullets,
	CTEFizz,
	CTEFootprintDecal,
	CTEFoundryHelpers,
	CTEGaussExplosion,
	CTEGlowSprite,
	CTEImpact,
	CTEKillPlayerAttachments,
	CTELargeFunnel,
	CTEMetalSparks,
	CTEMuzzleFlash,
	CTEParticleSystem,
	CTEPhysicsProp,
	CTEPlantBomb,
	CTEPlayerAnimEvent,
	CTEPlayerDecal,
	CTEProjectedDecal,
	CTERadioIcon,
	CTEShatterSurface,
	CTEShowLine,
	CTesla,
	CTESmoke,
	CTESparks,
	CTESprite,
	CTESpriteSpray,
	CTest_ProxyToggle_Networkable,
	CTestTraceline,
	CTEWorldDecal,
	CTriggerPlayerMovement,
	CTriggerSoundOperator,
	CVGuiScreen,
	CVoteController,
	CWaterBullet,
	CWaterLODControl,
	CWeaponAug(weapon = true),
	CWeaponAWP(weapon = true),
	CWeaponBaseItem,
	CWeaponBizon(weapon = true),
	CWeaponCSBase,
	CWeaponCSBaseGun,
	CWeaponCycler,
	CWeaponElite(weapon = true),
	CWeaponFamas(weapon = true),
	CWeaponFiveSeven(weapon = true),
	CWeaponG3SG1(weapon = true),
	CWeaponGalil(weapon = true),
	CWeaponGalilAR(weapon = true),
	CWeaponGlock(weapon = true),
	CWeaponHKP2000(weapon = true),
	CWeaponM249(weapon = true),
	CWeaponM3(weapon = true),
	CWeaponM4A1(weapon = true),
	CWeaponMAC10(weapon = true),
	CWeaponMag7(weapon = true),
	CWeaponMP5Navy(weapon = true),
	CWeaponMP7(weapon = true),
	CWeaponMP9(weapon = true),
	CWeaponNegev(weapon = true),
	CWeaponNOVA(weapon = true),
	CWeaponP228(weapon = true),
	CWeaponP250(weapon = true),
	CWeaponP90(weapon = true),
	CWeaponSawedoff(weapon = true),
	CWeaponSCAR20(weapon = true),
	CWeaponScout(weapon = true),
	CWeaponSG550(weapon = true),
	CWeaponSG552(weapon = true),
	CWeaponSG556(weapon = true),
	CWeaponSSG08(weapon = true),
	CWeaponTaser(weapon = true),
	CWeaponTec9(weapon = true),
	CWeaponTMP(weapon = true),
	CWeaponUMP45(weapon = true),
	CWeaponUSP(weapon = true),
	CWeaponXM1014(weapon = true),
	CWorld,
	CWorldVguiText,
	DustTrail,
	MovieExplosion,
	ParticleSmokeGrenade(grenade = true),
	RocketTrail,
	SmokeTrail,
	SporeExplosion,
	SporeTrail;
	
	open var id: Long = ordinal - 1L
	
	companion object {
		
		@JvmStatic
		private val cachedValues = values()
		
		@JvmStatic
		fun byId(id: Long) = cachedValues.firstOrNull { it.id == id }
		
		@JvmStatic
		fun byAddress(address: Long): EntityType? {
			try {
				val vt = process().readUnsignedInt(address + 0x8)
				if (vt <= 0) {
					return null
				}
				val fn = process().readUnsignedInt(vt + 0x8)
				if (fn <= 0) {
					return null
				}
				val cls = process().readUnsignedInt(fn + 0x1)
				if (cls <= 0) {
					return null
				}
				val classId = process().readUnsignedInt(cls + 20)
				return EntityType.byId(classId)
			} catch (e: Exception) {
				//e.printStackTrace()
				return null
			}
		}
		
	}
	
}