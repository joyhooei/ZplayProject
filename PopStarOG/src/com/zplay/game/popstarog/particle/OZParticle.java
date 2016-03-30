package com.zplay.game.popstarog.particle;

import com.orange.entity.IEntityFactory;
import com.orange.entity.particle.SpriteParticleSystem;
import com.orange.entity.particle.emitter.IParticleEmitter;
import com.orange.entity.sprite.Sprite;
import com.orange.opengl.texture.region.ITextureRegion;
import com.orange.opengl.vbo.VertexBufferObjectManager;

public class OZParticle extends SpriteParticleSystem {

	public OZParticle(IParticleEmitter pParticleEmitter, float pRateMinimum,
			float pRateMaximum, int pParticlesMaximum,
			ITextureRegion pTextureRegion,
			VertexBufferObjectManager pVertexBufferObjectManager) {
		super(pParticleEmitter, pRateMinimum, pRateMaximum, pParticlesMaximum,
				pTextureRegion, pVertexBufferObjectManager);
	}

	public OZParticle(float pX, float pY, IParticleEmitter pParticleEmitter,
			float pRateMinimum, float pRateMaximum, int pParticlesMaximum,
			ITextureRegion pTextureRegion,
			VertexBufferObjectManager pVertexBufferObjectManager) {
		super(pX, pY, pParticleEmitter, pRateMinimum, pRateMaximum,
				pParticlesMaximum, pTextureRegion, pVertexBufferObjectManager);
	}

	protected OZParticle(float pX, float pY,
			IEntityFactory<Sprite> pEntityFactory,
			IParticleEmitter pParticleEmitter, float pRateMinimum,
			float pRateMaximum, int pParticlesMaximum) {
		super(pX, pY, pEntityFactory, pParticleEmitter, pRateMinimum,
				pRateMaximum, pParticlesMaximum);
	}

	private final static float LIFE_TIME = 2;

	private float elapsedTime = 0;

	public void addDelta(float delta) {
		elapsedTime += delta;
	}

	public boolean isExpire() {
		if (elapsedTime >= LIFE_TIME) {
			return true;
		}
		return false;

	}

}
