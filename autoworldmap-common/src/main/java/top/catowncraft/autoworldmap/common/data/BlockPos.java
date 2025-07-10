package top.catowncraft.autoworldmap.common.data;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BlockPos {
    private int x;
    private int y;
    private int z;
}
