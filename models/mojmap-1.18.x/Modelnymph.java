// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelnymph<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nymph"), "main");
	private final ModelPart bipedHead;
	private final ModelPart bipedBody;
	private final ModelPart bipedRightArm;
	private final ModelPart bipedLeftArm;
	private final ModelPart bipedRightLeg;
	private final ModelPart bipedLeftLeg;

	public Modelnymph(ModelPart root) {
		this.bipedHead = root.getChild("bipedHead");
		this.bipedBody = root.getChild("bipedBody");
		this.bipedRightArm = root.getChild("bipedRightArm");
		this.bipedLeftArm = root.getChild("bipedLeftArm");
		this.bipedRightLeg = root.getChild("bipedRightLeg");
		this.bipedLeftLeg = root.getChild("bipedLeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bipedHead = partdefinition.addOrReplaceChild("bipedHead",
				CubeListBuilder.create().texOffs(2, 1)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(27, 46)
						.addBox(-4.5F, -8.5F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(14, 34)
						.addBox(-1.0F, 0.0F, 3.0F, 2.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-1.0F, -3.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition horn2_r1 = bipedHead.addOrReplaceChild("horn2_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -11.0F, -1.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.2559F, -0.056F, 0.211F));

		PartDefinition horn1_r1 = bipedHead.addOrReplaceChild("horn1_r1",
				CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -11.0F, -1.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.2559F, 0.056F, -0.211F));

		PartDefinition ear = bipedHead.addOrReplaceChild("ear",
				CubeListBuilder.create().texOffs(24, 22)
						.addBox(-0.0719F, -1.0F, -0.6476F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 18)
						.addBox(0.9281F, -1.0F, -0.6476F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 23)
						.addBox(1.9281F, -1.0F, -0.6476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -5.0F, 1.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition ear2 = bipedHead.addOrReplaceChild("ear2",
				CubeListBuilder.create().texOffs(24, 18)
						.addBox(-0.6216F, -1.0F, 0.1105F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(0.3784F, -1.0F, 0.1105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 21)
						.addBox(1.3784F, -1.0F, 0.1105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -5.0F, 1.0F, -3.1416F, -0.2182F, 3.1416F));

		PartDefinition bipedBody = partdefinition.addOrReplaceChild("bipedBody", CubeListBuilder.create()
				.texOffs(28, 30).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bipedBody_r1 = bipedBody.addOrReplaceChild("bipedBody_r1",
				CubeListBuilder.create().texOffs(27, 0).addBox(1.0F, -21.0F, -11.0F, 3.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 25.0F, 0.0F, -0.3924F, 0.0167F, -0.0403F));

		PartDefinition bipedBody_r2 = bipedBody.addOrReplaceChild("bipedBody_r2",
				CubeListBuilder.create().texOffs(37, 4).addBox(-4.0F, -21.0F, -11.0F, 3.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 25.0F, 0.0F, -0.3924F, 0.0167F, 0.0403F));

		PartDefinition bipedRightArm = partdefinition.addOrReplaceChild(
				"bipedRightArm", CubeListBuilder.create().texOffs(46, 12).addBox(-0.8264F, -1.0152F, -1.0F, 2.0F, 12.0F,
						2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bipedLeftArm = partdefinition.addOrReplaceChild(
				"bipedLeftArm", CubeListBuilder.create().texOffs(20, 34).addBox(-1.1736F, -1.0152F, -1.0F, 2.0F, 12.0F,
						2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 1.5F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bipedRightLeg = partdefinition.addOrReplaceChild("bipedRightLeg", CubeListBuilder.create()
				.texOffs(0, 34).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition bipedLeftLeg = partdefinition.addOrReplaceChild("bipedLeftLeg", CubeListBuilder.create()
				.texOffs(32, 14).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bipedHead.render(poseStack, buffer, packedLight, packedOverlay);
		bipedBody.render(poseStack, buffer, packedLight, packedOverlay);
		bipedRightArm.render(poseStack, buffer, packedLight, packedOverlay);
		bipedLeftArm.render(poseStack, buffer, packedLight, packedOverlay);
		bipedRightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		bipedLeftLeg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bipedRightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.bipedRightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.bipedLeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.bipedLeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.bipedHead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bipedHead.xRot = headPitch / (180F / (float) Math.PI);
	}
}