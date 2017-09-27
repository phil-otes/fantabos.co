package com.matt.forgehax.asm;

import com.matt.forgehax.asm.utils.asmtype.ASMClass;
import com.matt.forgehax.asm.utils.asmtype.ASMMethod;
import com.matt.forgehax.asm.utils.asmtype.builders.ASMBuilders;

/**
 * Created on 5/29/2017 by fr1kin
 */
public interface TypesSpecial {
    interface Classes {
        ASMClass BaseRenderer = ASMBuilders.newClassBuilder()
                .setClassName("journeymap/client/cartography/render/BaseRenderer")
                .build();

        ASMClass Stratum = ASMBuilders.newClassBuilder()
                .setClassName("journeymap/client/cartography/Stratum")
                .build();

        ASMClass SchematicPrinter = ASMBuilders.newClassBuilder()
                .setClassName("com/github/lunatrius/schematica/client/printer/SchematicPrinter")
                .build();
    }

    interface Fields {

    }

    interface Methods {
        ASMMethod BaseRenderer_setStratumColors = Classes.BaseRenderer.childMethod()
                .setName("setStratumColors")
                .setReturnType(void.class)
                .beginParameters()
                .add(Classes.Stratum)
                .add(int.class)
                .add(Integer.class)
                .add(boolean.class)
                .add(boolean.class)
                .add(boolean.class)
                .finish()
                .build();

        ASMMethod SchematicPrinter_placeBlock = Classes.SchematicPrinter.childMethod()
                .setName("placeBlock")
                .setReturnType(boolean.class)
                .beginParameters()
                .add(TypesMc.Classes.WorldClient)
                .add(TypesMc.Classes.EntityPlayerSP)
                .add(TypesMc.Classes.ItemStack)
                .add(TypesMc.Classes.BlockPos)
                .add(TypesMc.Classes.EnumFacing)
                .add(TypesMc.Classes.Vec3d)
                .add(TypesMc.Classes.EnumHand)
                .finish()
                .build();
    }
}
