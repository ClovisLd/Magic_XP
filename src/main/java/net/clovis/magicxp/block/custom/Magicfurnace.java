package net.clovis.magicxp.block.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class Magicfurnace extends Block {
    public Magicfurnace(Properties properties) {super(properties);}



    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if (entity instanceof LivingEntity LivingEntity && entity.isSteppingCarefully()) {
            LivingEntity.addEffect(new MobEffectInstance(MobEffects.JUMP, 200));
            int blockPosZ = blockPos.get(Direction.Axis.Z);
            int blockPosY = blockPos.get(Direction.Axis.Y);
            int blockPosX = blockPos.get(Direction.Axis.X);
            entity.setPos(blockPosX,blockPosY, blockPosZ);
        }
        super.stepOn(level, blockPos, blockState, entity);

    }
    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player,
                                 InteractionHand hand, BlockHitResult blockHitResult) {

        if(hand == InteractionHand.MAIN_HAND && !level.isClientSide){
            /*if (player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.YELLOW_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.WHITE_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.RED_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.PURPLE_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.PINK_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.ORANGE_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.MAGENTA_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.LIME_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.GREEN_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.GRAY_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.CYAN_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.BROWN_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.BLUE_DYE)
                ||player.getItemInHand(InteractionHand.MAIN_HAND).equals(Items.BLACK_DYE)){

                player.sendSystemMessage(Component.literal("you have pooped"));
            }
             */
            player.sendSystemMessage(Component.literal("you have poopeeeeed"));
        }
        return super.use(blockState, level, blockPos, player, hand, blockHitResult);
    }
}

