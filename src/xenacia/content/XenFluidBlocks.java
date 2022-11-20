package xenacia.content;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.liquid.*;
import mindustry.content.*;
import xenacia.world.blocks.units.TeamLiquidRouter;

import static mindustry.type.ItemStack.*;

public class XenFluidBlocks{
    public static Block
            fluidPipe, fluidRouter, fluidJunction, bridgePipe,
            smallFluidTank, largeFluidTank, bulkFluidTank,
            fluidPayloadTransportTank;

    public static void load(){
        fluidPipe = new Conduit("fluid-pipe"){{
            requirements(Category.liquid, with(XenItems.aluminum, 1, Items.graphite, 1));
            health = 80;

            researchCost = with(XenItems.aluminum, 80, Items.graphite, 80);
        }};
        fluidRouter = new LiquidRouter("fluid-router"){{
            requirements(Category.liquid, with(XenItems.aluminum, 2, Items.graphite, 3));
            health = 80;
            liquidCapacity = 20f;
            underBullets = true;
            solid = false;

            researchCost = with(XenItems.aluminum, 100, Items.graphite, 100);
        }};
        fluidJunction = new LiquidJunction("fluid-junction"){{
            requirements(Category.liquid, with(XenItems.aluminum, 2, Items.graphite, 3));
            solid = false;

            researchCost = with(XenItems.aluminum, 100, Items.graphite, 100);
        }};
        bridgePipe = new LiquidBridge("bridge-pipe"){{
            requirements(Category.liquid, with(XenItems.aluminum, 4, Items.graphite, 4));
            fadeIn = moveArrows = false;
            arrowSpacing = 6f;
            range = 6;
            hasPower = false;

            researchCost = with(XenItems.aluminum, 150, Items.graphite, 150);
        }};
        smallFluidTank = new LiquidRouter("small-fluid-tank"){{
            requirements(Category.liquid, with(XenItems.iron, 20, XenItems.aluminum, 25, Items.graphite, 15));
            health = 480;
            size = 2;
            liquidCapacity = 500f;
            underBullets = false;
            solid = true;

            researchCostMultiplier = 1f;
        }};
        largeFluidTank = new LiquidRouter("large-fluid-tank"){{
            requirements(Category.liquid, with(XenItems.iron, 50, XenItems.aluminum, 80, Items.graphite, 30));
            health = 1080;
            size = 3;
            liquidCapacity = 2000f;
            underBullets = false;
            solid = true;

            researchCostMultiplier = 1f;
        }};
        bulkFluidTank = new TeamLiquidRouter("bulk-fluid-tank"){{
            requirements(Category.liquid, with(Items.titanium, 200, XenItems.aluminum, 250, Items.graphite, 100));
            health = 3000;
            size = 5;
            liquidCapacity = 8000f;
            underBullets = false;
            solid = true;

            researchCostMultiplier = 1f;
        }};
        fluidPayloadTransportTank = new TeamLiquidRouter("fluid-payload-transport-tank"){{
            requirements(Category.liquid, with(XenItems.cobalt, 800, Items.titanium, 1000, XenItems.aluminum, 1500, Items.graphite, 800));
            health = 6000;
            size = 7;
            liquidCapacity = 25000f;
            underBullets = false;
            solid = true;

            researchCostMultiplier = 1.5f;
        }};
    }
}