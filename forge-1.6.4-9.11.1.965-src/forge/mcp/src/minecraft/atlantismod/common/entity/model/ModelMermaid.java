/*package atlantismod.common.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMermaid extends ModelBase
{
  //fields
    ModelRenderer fin6;
    ModelRenderer fin1;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer fin2;
    ModelRenderer fin3;
    ModelRenderer fin4;
    ModelRenderer fin5;
    ModelRenderer fin7;
  
  public ModelMermaid()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      fin6 = new ModelRenderer(this, 32, 0);
      fin6.addBox(2F, 0F, 5F, 1, 1, 1);
      fin6.setRotationPoint(0F, 14F, 13F);
      fin6.setTextureSize(64, 64);
      fin6.mirror = true;
      setRotation(fin6, 0F, 0F, 0F);
      fin1 = new ModelRenderer(this, 32, 0);
      fin1.addBox(-3F, 0F, 0F, 6, 1, 3);
      fin1.setRotationPoint(0F, 14F, 13F);
      fin1.setTextureSize(64, 64);
      fin1.mirror = true;
      setRotation(fin1, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 1F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, -0.0174533F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 0.3141593F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(64, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0.3141593F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(64, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0.3141593F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 32);
      rightleg.addBox(-4F, 0F, -1F, 8, 12, 3);
      rightleg.setRotationPoint(0F, 10F, 3F);
      rightleg.setTextureSize(64, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 1.151917F, 0F, 0F);
      fin2 = new ModelRenderer(this, 32, 0);
      fin2.addBox(-4F, 0F, 2F, 8, 1, 2);
      fin2.setRotationPoint(0F, 14F, 13F);
      fin2.setTextureSize(64, 64);
      fin2.mirror = true;
      setRotation(fin2, 0F, 0F, 0F);
      fin3 = new ModelRenderer(this, 32, 0);
      fin3.addBox(-5F, 0F, 3F, 10, 1, 2);
      fin3.setRotationPoint(0F, 14F, 13F);
      fin3.setTextureSize(64, 64);
      fin3.mirror = true;
      setRotation(fin3, 0F, 0F, 0F);
      fin4 = new ModelRenderer(this, 32, 0);
      fin4.addBox(-6F, 0F, 5F, 3, 1, 3);
      fin4.setRotationPoint(0F, 14F, 13F);
      fin4.setTextureSize(64, 64);
      fin4.mirror = true;
      setRotation(fin4, 0F, 0F, 0F);
      fin5 = new ModelRenderer(this, 32, 0);
      fin5.addBox(3F, 0F, 5F, 3, 1, 3);
      fin5.setRotationPoint(0F, 14F, 13F);
      fin5.setTextureSize(64, 64);
      fin5.mirror = true;
      setRotation(fin5, 0F, 0F, 0F);
      fin7 = new ModelRenderer(this, 32, 0);
      fin7.addBox(-3F, 0F, 5F, 1, 1, 1);
      fin7.setRotationPoint(0F, 14F, 13F);
      fin7.setTextureSize(64, 64);
      fin7.mirror = true;
      setRotation(fin7, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    fin6.render(f5);
    fin1.render(f5);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    fin2.render(f5);
    fin3.render(f5);
    fin4.render(f5);
    fin5.render(f5);
    fin7.render(f5);
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

}*/
