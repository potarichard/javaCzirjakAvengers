package com;

import java.util.Map;

public class InfinityStones {

	public static Map<Stone, InfinityStone> entities = Map.of(Stone.MIND, new InfinityStone(Stone.MIND),
															  Stone.POWER, new InfinityStone(Stone.POWER),
															  Stone.REALITY, new InfinityStone(Stone.REALITY),
															  Stone.SOUL, new InfinityStone(Stone.SOUL),
															  Stone.SPACE, new InfinityStone(Stone.SPACE),
															  Stone.TIME, new InfinityStone(Stone.TIME));
}
