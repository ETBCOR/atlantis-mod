/*package atlantismod.common.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKraken extends ModelBase
{
  //fields
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer fin1;
    ModelRenderer fin2;
    ModelRenderer fin6;
    ModelRenderer fin5;
    ModelRenderer fin3;
    ModelRenderer fin4;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer nose;
    ModelRenderer tenticle1;
    ModelRenderer tenticle2;
    ModelRenderer tenticle3;
    ModelRenderer tenticle1-2;
    ModelRenderer tenticle3-1;
    ModelRenderer tenticle3-2;
    ModelRenderer tenticle4-1;
    ModelRenderer tenticle4-2;
  
  public ModelKraken()
  {
    textureWidth = 117;
    textureHeight = 105;
    
      body1 = new ModelRenderer(this, 0, 0);
      body1.addBox(-9F, -7F, -20F, 14, 14, 22);
      body1.setRotationPoint(0F, 6F, -20F);
      body1.setTextureSize(117, 105);
      body1.mirror = true;
      setRotation(body1, -0.3141593F, 0.2094395F, 0F);
      body2 = new ModelRenderer(this, 0, 0);
      body2.addBox(-7F, -10F, 0F, 14, 14, 22);
      body2.setRotationPoint(0F, 9F, -21F);
      body2.setTextureSize(117, 105);
      body2.mirror = true;
      setRotation(body2, -0.0698132F, -0.2094395F, 0F);
      body3 = new ModelRenderer(this, 0, 0);
      body3.addBox(-6F, -5F, -2F, 14, 14, 22);
      body3.setRotationPoint(-5F, 6F, 1F);
      body3.setTextureSize(117, 105);
      body3.mirror = true;
      setRotation(body3, 0F, 0F, 0F);
      fin1 = new ModelRenderer(this, 0, 0);
      fin1.addBox(-2F, -5F, -1F, 4, 5, 8);
      fin1.setRotationPoint(-5F, -4F, -29F);
      fin1.setTextureSize(117, 105);
      fin1.mirror = true;
      setRotation(fin1, -0.3141593F, 0.2094395F, 0F);
      fin2 = new ModelRenderer(this, 0, 0);
      fin2.addBox(-1F, -8F, 0F, 2, 3, 6);
      fin2.setRotationPoint(-5F, -4F, -29F);
      fin2.setTextureSize(117, 105);
      fin2.mirror = true;
      setRotation(fin2, -0.3141593F, 0.2094395F, 0F);
      fin6 = new ModelRenderer(this, 0, 0);
      fin6.addBox(-1F, -8F, 1F, 2, 3, 6);
      fin6.setRotationPoint(-3F, 1F, -8F);
      fin6.setTextureSize(117, 105);
      fin6.mirror = true;
      setRotation(fin6, -0.0698132F, -0.2094395F, 0F);
      fin5 = new ModelRenderer(this, 0, 0);
      fin5.addBox(-2F, -5F, 0F, 4, 5, 8);
      fin5.setRotationPoint(-3F, 0F, -8F);
      fin5.setTextureSize(117, 105);
      fin5.mirror = true;
      setRotation(fin5, -0.0698132F, -0.2094395F, 0F);
      fin3 = new ModelRenderer(this, 0, 0);
      fin3.addBox(-8F, 0F, -4F, 7, 1, 10);
      fin3.setRotationPoint(-10F, 2F, -27F);
      fin3.setTextureSize(117, 105);
      fin3.mirror = true;
      setRotation(fin3, -0.3141593F, -0.7853982F, 0F);
      fin4 = new ModelRenderer(this, 0, 0);
      fin4.addBox(0F, 0F, 0F, 7, 1, 10);
      fin4.setRotationPoint(-2F, 2F, -32F);
      fin4.setTextureSize(117, 105);
      fin4.mirror = true;
      setRotation(fin4, -0.3141593F, 0.9773844F, 0F);
      neck = new ModelRenderer(this, 0, 0);
      neck.addBox(-4F, -4F, 0F, 8, 8, 7);
      neck.setRotationPoint(-6F, 0F, -41F);
      neck.setTextureSize(117, 105);
      neck.mirror = true;
      setRotation(neck, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 64);
      head.addBox(-5F, -5F, -10F, 10, 10, 10);
      head.setRotationPoint(-6F, -1F, -40F);
      head.setTextureSize(117, 105);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 0);
      leg1.addBox(-6F, -1F, -4F, 6, 6, 20);
      leg1.setRotationPoint(3F, 2F, 21F);
      leg1.setTextureSize(117, 105);
      leg1.mirror = true;
      setRotation(leg1, 0.3839724F, 0.2617994F, 0F);
      leg2 = new ModelRenderer(this, 0, 0);
      leg2.addBox(0F, 0F, -4F, 6, 6, 20);
      leg2.setRotationPoint(-10F, 2F, 21F);
      leg2.setTextureSize(117, 105);
      leg2.mirror = true;
      setRotation(leg2, 0.3839724F, -0.2617994F, 0F);
      leg3 = new ModelRenderer(this, 0, 0);
      leg3.addBox(0F, -7F, -4F, 6, 6, 15);
      leg3.setRotationPoint(-10F, 16F, 21F);
      leg3.setTextureSize(117, 105);
      leg3.mirror = true;
      setRotation(leg3, -0.3839724F, -0.2617994F, 0F);
      leg4 = new ModelRenderer(this, 0, 0);
      leg4.addBox(-6F, -7F, -4F, 6, 6, 15);
      leg4.setRotationPoint(3F, 16F, 21F);
      leg4.setTextureSize(117, 105);
      leg4.mirror = true;
      setRotation(leg4, -0.3839724F, 0.2617994F, 0F);
      nose = new ModelRenderer(this, 21, 64);
      nose.addBox(-1F, -1F, -11F, 2, 2, 2);
      nose.setRotationPoint(-6F, -1F, -40F);
      nose.setTextureSize(117, 105);
      nose.mirror = true;
      setRotation(nose, 0F, 0F, 0F);
      tenticle1 = new ModelRenderer(this, 64, 64);
      tenticle1.addBox(-19F, -1F, -1F, 20, 2, 2);
      tenticle1.setRotationPoint(-11F, 6F, -1F);
      tenticle1.setTextureSize(117, 105);
      tenticle1.mirror = true;
      setRotation(tenticle1, 0F, 1.171639F, 0.3316126F);
      tenticle2 = new ModelRenderer(this, 64, 64);
      tenticle2.addBox(-1F, -1F, -1F, 20, 2, 2);
      tenticle2.setRotationPoint(3F, 6F, -1F);
      tenticle2.setTextureSize(117, 105);
      tenticle2.mirror = true;
      setRotation(tenticle2, 0F, -1.171643F, -0.3316126F);
      tenticle3 = new ModelRenderer(this, 64, 64);
      tenticle3.addBox(-1F, -1F, -1F, 16, 2, 2);
      tenticle3.setRotationPoint(10F, 0F, 16F);
      tenticle3.setTextureSize(117, 105);
      tenticle3.mirror = true;
      setRotation(tenticle3, 0F, -1.570796F, 0F);
      tenticle1-2 = new ModelRenderer(this, 64, 64);
      tenticle1-2.addBox(-1F, -1F, -1F, 16, 2, 2);
      tenticle1-2.setRotationPoint(-18F, 0F, 16F);
      tenticle1-2.setTextureSize(117, 105);
      tenticle1-2.mirror = true;
      setRotation(tenticle1-2, 0F, -1.570796F, 0F);
      tenticle3-1 = new ModelRenderer(this, 64, 64);
      tenticle3-1.addBox(-1F, -1F, -1F, 20, 2, 2);
      tenticle3-1.setRotationPoint(3F, 6F, -1F);
      tenticle3-1.setTextureSize(117, 105);
      tenticle3-1.mirror = true;
      setRotation(tenticle3-1, 0F, -1.171643F, 0.3316126F);
      tenticle3-2 = new ModelRenderer(this, 64, 64);
      tenticle3-2.addBox(-1F, -1F, -1F, 16, 2, 2);
      tenticle3-2.setRotationPoint(10F, 12F, 16F);
      tenticle3-2.setTextureSize(117, 105);
      tenticle3-2.mirror = true;
      setRotation(tenticle3-2, 0F, -1.570796F, 0F);
      tenticle4-1 = new ModelRenderer(this, 64, 64);
      tenticle4-1.addBox(-19F, -1F, -1F, 20, 2, 2);
      tenticle4-1.setRotationPoint(-11F, 6F, -1F);
      tenticle4-1.setTextureSize(117, 105);
      tenticle4-1.mirror = true;
      setRotation(tenticle4-1, 0F, 1.171639F, -0.3316126F);
      tenticle4-2 = new ModelRenderer(this, 64, 64);
      tenticle4-2.addBox(-1F, -1F, -1F, 16, 2, 2);
      tenticle4-2.setRotationPoint(-18F, 12F, 16F);
      tenticle4-2.setTextureSize(117, 105);
      tenticle4-2.mirror = true;
      setRotation(tenticle4-2, 0F, -1.570796F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    body1.render(f5);
    body2.render(f5);
    body3.render(f5);
    fin1.render(f5);
    fin2.render(f5);
    fin6.render(f5);
    fin5.render(f5);
    fin3.render(f5);
    fin4.render(f5);
    neck.render(f5);
    head.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    nose.render(f5);
    tenticle1.render(f5);
    tenticle2.render(f5);
    tenticle3.render(f5);
    tenticle1-2.render(f5);
    tenticle3-1.render(f5);
    tenticle3-2.render(f5);
    tenticle4-1.render(f5);
    tenticle4-2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
*/