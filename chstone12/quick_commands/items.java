package chstone12.quick_commands;

public class items extends quick_commands {
    public static String item_list = """
https://minecraft-ids.grahamedgecombe.com/api
0 ; 0 ; Air ; air
1 ; 0 ; Stone ; stone
1 ; 1 ; Granite ; granite
1 ; 2 ; Polished Granite ; polished_granite
1 ; 3 ; Diorite ; diorite
1 ; 4 ; Polished Diorite ; polished_diorite
1 ; 5 ; Andesite ; andesite
1 ; 6 ; Polished Andesite ; polished_andesite
2 ; 0 ; Grass ; grass_block
3 ; 0 ; Dirt ; dirt
3 ; 1 ; Coarse Dirt ; coarse_dirt
3 ; 2 ; Podzol ; podzol
4 ; 0 ; Cobblestone ; cobblestone
5 ; 0 ; Oak Wood Plank ; oak_planks
5 ; 1 ; Spruce Wood Plank ; spruce_planks
5 ; 2 ; Birch Wood Plank ; birch_planks
5 ; 3 ; Jungle Wood Plank ; jungle_planks
5 ; 4 ; Acacia Wood Plank ; acacia_planks
5 ; 5 ; Dark Oak Wood Plank ; dark_oak_planks
5 ; 6 ; Mangrove Wood Plank ; mangrove_planks
5 ; 7 ; Cherry Wood Plank ; cherry_planks
5 ; 8 ; Pale Wood Plank ; pale_oak_planks
5 ; 9 ; Bamboo Plank ; bamboo_planks
5 ; 10 ; Crimson Wood Plank ; crimson_planks
5 ; 11 ; Warped Wook Plank ; warped_planks
6 ; 0 ; Oak Sapling ; oak_sapling
6 ; 1 ; Spruce Sapling ; spruce_sapling
6 ; 2 ; Birch Sapling ; birch_sapling
6 ; 3 ; Jungle Sapling ; jungle_sapling
6 ; 4 ; Acacia Sapling ; acacia_sapling
6 ; 5 ; Dark Oak Sapling ; dark_oak_sapling
6 ; 6 ; Mangrove Propagule ; mangrove_propagule
6 ; 7 ; Cherry Sapling ; cherry_sapling
6 ; 8 ; Pale Oak Sapling ; pale_oak_sapling
7 ; 0 ; Bedrock ; bedrock
8 ; 0 ; Flowing Water ; flowing_water
9 ; 0 ; Still Water ; water
10 ; 0 ; Flowing Lava ; flowing_lava
11 ; 0 ; Still Lava ; lava
12 ; 0 ; Sand ; sand
12 ; 1 ; Red Sand ; red_sand
13 ; 0 ; Gravel ; gravel
14 ; 0 ; Gold Ore ; gold_ore
15 ; 0 ; Iron Ore ; iron_ore
16 ; 0 ; Coal Ore ; coal_ore
17 ; 0 ; Oak Wood ; oak_log
17 ; 1 ; Spruce Wood ; spruce_log
17 ; 2 ; Birch Wood ; birch_log
17 ; 3 ; Jungle Wood ; jungle_log
17 ; 4 ; Acacia Wood ; acacia_log
17 ; 5 ; Dark Oak Wood ; dark_oak_log
17 ; 6 ; Mangrove Wood ; mangrove_log
17 ; 7 ; Cherry Wood ; cherry_log
17 ; 8 ; Pale Oak Wood ; pale_oak_wood
17 ; 9 ; Bamboo Block ; bamboo_block
17 ; 10 ; Crimson Stem ; crimson_stem
17 ; 11 ; Warped Stem ; warped_stem
18 ; 0 ; Oak Leaves ; oak_leaves
18 ; 1 ; Spruce Leaves ; spruce_leaves
18 ; 2 ; Birch Leaves ; birch_leaves
18 ; 3 ; Jungle Leaves ; jungle_leaves
18 ; 4 ; Acacia Leaves ; acacia_leaves
18 ; 5 ; Dark Oak Leaves ; dark_oak_leaves
18 ; 6 ; Mangrove Leaves ; mangrove_leaves
18 ; 7 ; Cherry Leaves ; cherry_leaves
18 ; 8 ; Pale Oak Leaves ; pale_oak_leaves
18 ; 9 ; Bamboo ; bamboo
18 ; 10 ; Nether Wart Block ; nether_wart_block
18 ; 11 ; Warped Wart Block ; warped_wart_block
19 ; 0 ; Sponge ; sponge
19 ; 1 ; Wet Sponge ; wet_sponge
20 ; 0 ; Glass ; glass
21 ; 0 ; Lapis Lazuli Ore ; lapis_ore
22 ; 0 ; Lapis Lazuli Block ; lapis_block
23 ; 0 ; Dispenser ; dispenser
24 ; 0 ; Sandstone ; sandstone
24 ; 1 ; Chiseled Sandstone ; chiseled_sandstone
24 ; 2 ; Smooth Sandstone ; smooth_sandstone
25 ; 0 ; Note Block ; noteblock
26 ; 0 ; White Bed ; white_bed
27 ; 0 ; Powered Rail ; golden_rail
27 ; 0 ; Powered Rail ; powered_rail
28 ; 0 ; Detector Rail ; detector_rail
29 ; 0 ; Sticky Piston ; sticky_piston
30 ; 0 ; Cobweb ; cobweb
31 ; 0 ; Dead Shrub ; tallgrass ; 이건 뭔 블럭이여..
31 ; 1 ; Grass ; short_grass
31 ; 2 ; Fern ; fern
32 ; 0 ; Dead Bush ; dead_bush
33 ; 0 ; Piston ; piston
34 ; 0 ; Piston Head ; piston_head
35 ; 0 ; White Wool ; white_wool
35 ; 1 ; Orange Wool ; orange_wool
35 ; 2 ; Magenta Wool ; magenta_wool
35 ; 3 ; Light Blue Wool ; light_blue_wool
35 ; 4 ; Yellow Wool ; yellow_wool
35 ; 5 ; Lime Wool ; lime_wool
35 ; 6 ; Pink Wool ; pink_wool
35 ; 7 ; Gray Wool ; gray_wool
35 ; 8 ; Light Gray Wool ; light_gray_wool
35 ; 9 ; Cyan Wool ; cyan_wool
35 ; 10 ; Purple Wool ; purple_wool
35 ; 11 ; Blue Wool ; blue_wool
35 ; 12 ; Brown Wool ; brown_wool
35 ; 13 ; Green Wool ; green_wool
35 ; 14 ; Red Wool ; red_wool
35 ; 15 ; Black Wool ; black_wool
37 ; 0 ; Dandelion ; dandelion
38 ; 0 ; Poppy ; poppy
38 ; 1 ; Blue Orchid ; blue_orchid
38 ; 2 ; Allium ; allium
38 ; 3 ; Azure Bluet ; azure_bluet
38 ; 4 ; Red Tulip ; red_tulip
38 ; 5 ; Orange Tulip ; orange_tulip
38 ; 6 ; White Tulip ; white_tulip
38 ; 7 ; Pink Tulip ; pink_tulip
38 ; 8 ; Oxeye Daisy ; oxeye_daisy
39 ; 0 ; Brown Mushroom ; brown_mushroom
40 ; 0 ; Red Mushroom ; red_mushroom
41 ; 0 ; Block of Gold ; gold_block
42 ; 0 ; Block of Iron ; iron_block
43 ; 0 ; Double Stone Slab ; smooth_stone
43 ; 1 ; Double Sandstone Slab ; sandstone_slab
43 ; 2 ; Double Wooden Slab ; oak_planks
43 ; 3 ; Double Cobblestone Slab ; cobblestone
43 ; 4 ; Double Brick Slab ; bricks
43 ; 5 ; Double Stone Brick Slab ; stone_bricks
43 ; 6 ; Double Nether Brick Slab ; nether_bricks
43 ; 7 ; Double Quartz Slab ; quartz_block
44 ; 0 ; Stone Slab ; smooth_stone_slab
44 ; 1 ; Sandstone Slab ; sandstone_slab
44 ; 2 ; Wooden Slab ; oak_slab
44 ; 3 ; Cobblestone Slab ; cobblestone_slab
44 ; 4 ; Brick Slab ; brick_slab
44 ; 5 ; Stone Brick Slab ; stone_brick_slab
44 ; 6 ; Nether Brick Slab ; nether_brick_slab
44 ; 7 ; Quartz Slab ; quartz_slab
45 ; 0 ; Bricks ; bricks
46 ; 0 ; TNT ; tnt
47 ; 0 ; Bookshelf ; bookshelf
48 ; 0 ; Moss Stone ; mossy_cobblestone
49 ; 0 ; Obsidian ; obsidian
50 ; 0 ; Torch ; torch
51 ; 0 ; Fire ; fire
52 ; 0 ; Monster Spawner ; spawner
53 ; 0 ; Oak Wood Stairs ; oak_stairs
54 ; 0 ; Chest ; chest
55 ; 0 ; Redstone Wire ; redstone
56 ; 0 ; Diamond Ore ; diamond_ore
57 ; 0 ; Block of Diamond ; diamond_block
58 ; 0 ; Crafting Table ; crafting_table
59 ; 0 ; Wheat Crops ; wheat
60 ; 0 ; Farmland ; farmland
61 ; 0 ; Furnace ; furnace
62 ; 0 ; Burning Furnace ; blast_furnace
63 ; 0 ; Standing Sign Block ; oak_sign
64 ; 0 ; Oak Door Block ; oak_door
65 ; 0 ; Ladder ; ladder
66 ; 0 ; Rail ; rail
67 ; 0 ; Cobblestone Stairs ; cobblestone_stairs
68 ; 0 ; Wall-mounted Sign Block ; oak_sign
69 ; 0 ; Lever ; lever
70 ; 0 ; Stone Pressure Plate ; stone_pressure_plate
71 ; 0 ; Iron Door Block ; iron_door
72 ; 0 ; Oak Pressure Plate ; oak_pressure_plate
72 ; 1 ; Spruce Pressure Plate ; spruce_pressure_plate
72 ; 2 ; Birch Pressure Plate ; birch_pressure_plate
72 ; 3 ; Jungle Pressure Plate ; jungle_pressure_plate
72 ; 4 ; Acacia Pressure Plate ; acacia_pressure_plate
72 ; 5 ; Dark Oak Pressure Plate ; dark_oak_pressure_plate
72 ; 6 ; Mangrove Pressure Plate ; mangrove_pressure_plate
72 ; 7 ; Cherry Pressure Plate ; cherry_pressure_plate
72 ; 8 ; Pale Oak Pressure Plate ; pale_oak_pressure_plate
72 ; 9 ; Bamboo Pressure Plate ; bamboo_pressure_plate
72 ; 10 ; Crimson Pressure Plate ; crimson_pressure_plate
72 ; 11 ; Warped Pressure Plate ; warped_pressure_plate
73 ; 0 ; Redstone Ore ; redstone_ore
74 ; 0 ; Glowing Redstone Ore ; lit_redstone_ore
75 ; 0 ; Redstone Torch (off) ; unlit_redstone_torch
76 ; 0 ; Redstone Torch (on) ; redstone_torch
77 ; 0 ; Stone Button ; stone_button
77 ; 1 ; Polished blackstone Button ; polished_blackstone_button
78 ; 0 ; Snow ; snow
79 ; 0 ; Ice ; ice
80 ; 0 ; Snow Block ; snow_block
81 ; 0 ; Cactus ; cactus
82 ; 0 ; Clay ; clay
83 ; 0 ; Sugar Canes ; sugar_cane
84 ; 0 ; Jukebox ; jukebox
85 ; 0 ; Oak Fence ; oak_fence
86 ; 0 ; Pumpkin ; pumpkin
87 ; 0 ; Netherrack ; netherrack
88 ; 0 ; Soul Sand ; soul_sand
89 ; 0 ; Glowstone ; glowstone
90 ; 0 ; Nether Portal ; portal
91 ; 0 ; Jack o'Lantern ; lit_pumpkin
92 ; 0 ; Cake Block ; cake
93 ; 0 ; Redstone Repeater Block (off) ; unpowered_repeater
94 ; 0 ; Redstone Repeater Block (on) ; powered_repeater
95 ; 0 ; White Stained Glass ; white_stained_glass
95 ; 1 ; Orange Stained Glass ; orange_stained_glass
95 ; 2 ; Magenta Stained Glass ; magenta_stained_glass
95 ; 3 ; Light Blue Stained Glass ; light_blue_stained_glass
95 ; 4 ; Yellow Stained Glass ; yellow_stained_glass
95 ; 5 ; Lime Stained Glass ; lime_stained_glass
95 ; 6 ; Pink Stained Glass ; pink_stained_glass
95 ; 7 ; Gray Stained Glass ; gray_stained_glass
95 ; 8 ; Light Gray Stained Glass ; light_gray_stained_glass
95 ; 9 ; Cyan Stained Glass ; cyan_stained_glass
95 ; 10 ; Purple Stained Glass ; purple_stained_glass
95 ; 11 ; Blue Stained Glass ; blue_stained_glass
95 ; 12 ; Brown Stained Glass ; brown_stained_glass
95 ; 13 ; Green Stained Glass ; green_stained_glass
95 ; 14 ; Red Stained Glass ; red_stained_glass
95 ; 15 ; Black Stained Glass ; black_stained_glass
96 ; 0 ; Wooden Trapdoor ; oak_trapdoor
97 ; 0 ; Stone Monster Egg ; infested_stone
97 ; 1 ; Cobblestone Monster Egg ; infested_cobblestone
97 ; 2 ; Stone Brick Monster Egg ; infested_stone_bricks
97 ; 3 ; Mossy Stone Brick Monster Egg ; infested_mossy_stone_bricks
97 ; 4 ; Cracked Stone Brick Monster Egg ; infested_cracked_stone_bricks
97 ; 5 ; Chiseled Stone Brick Monster Egg ; infested_chiseled_stone_bricks
98 ; 0 ; Stone Bricks ; stone_bricks
98 ; 1 ; Mossy Stone Bricks ; mossy_stone_bricks
98 ; 2 ; Cracked Stone Bricks ; cracked_stone_bricks
98 ; 3 ; Chiseled Stone Bricks ; chiseled_stone_bricks
99 ; 0 ; Brown Mushroom Block ; brown_mushroom_block
100 ; 0 ; Red Mushroom Block ; red_mushroom_block
101 ; 0 ; Iron Bars ; iron_bars
102 ; 0 ; Glass Pane ; glass_pane
103 ; 0 ; Melon Block ; melon
104 ; 0 ; Pumpkin Stem ; pumpkin_stem
105 ; 0 ; Melon Stem ; melon_stem
106 ; 0 ; Vines ; vine
107 ; 0 ; Oak Fence Gate ; oak_fence_gate
108 ; 0 ; Brick Stairs ; brick_stairs
109 ; 0 ; Stone Brick Stairs ; stone_brick_stairs
110 ; 0 ; Mycelium ; mycelium
111 ; 0 ; Lily Pad ; lily_pad
112 ; 0 ; Nether Brick ; nether_bricks
113 ; 0 ; Nether Brick Fence ; nether_brick_fence
114 ; 0 ; Nether Brick Stairs ; nether_brick_stairs
115 ; 0 ; Nether Wart ; nether_wart
116 ; 0 ; Enchantment Table ; enchantment_table
117 ; 0 ; Brewing Stand ; brewing_stand
118 ; 0 ; Cauldron ; cauldron
119 ; 0 ; End Portal ; end_portal
120 ; 0 ; End Portal Frame ; end_portal_frame
121 ; 0 ; End Stone ; end_stone
122 ; 0 ; Dragon Egg ; dragon_egg
123 ; 0 ; Redstone Lamp (inactive) ; redstone_lamp
124 ; 0 ; Redstone Lamp (active) ; lit_redstone_lamp
125 ; 0 ; Double Oak Wood Slab ; double_wooden_slab
125 ; 1 ; Double Spruce Wood Slab ; double_wooden_slab
125 ; 2 ; Double Birch Wood Slab ; double_wooden_slab
125 ; 3 ; Double Jungle Wood Slab ; double_wooden_slab
125 ; 4 ; Double Acacia Wood Slab ; double_wooden_slab
125 ; 5 ; Double Dark Oak Wood Slab ; double_wooden_slab
126 ; 0 ; Oak Wood Slab ; oak_slab
126 ; 1 ; Spruce Wood Slab ; spruce_slab
126 ; 2 ; Birch Wood Slab ; birch_slab
126 ; 3 ; Jungle Wood Slab ; jungle_slab
126 ; 4 ; Acacia Wood Slab ; acacia_slab
126 ; 5 ; Dark Oak Wood Slab ; dark_oak_slab
126 ; 6 ; Mangrove Wood Slab ; mangrove_slab
126 ; 7 ; Cherry Wood Slab ; cherry_slab
126 ; 8 ; Pale Oak Wood Slab ; pale_oak_slab
126 ; 9 ; Bamboo Slab ; bamboo_slab
126 ; 10 ; Crimson Wood Slab ; crimson_slab
126 ; 11 ; Warped Wood Slab ; warped_slab
127 ; 0 ; Cocoa ; cocoa_beans
128 ; 0 ; Sandstone Stairs ; sandstone_stairs
129 ; 0 ; Emerald Ore ; emerald_ore
130 ; 0 ; Ender Chest ; ender_chest
131 ; 0 ; Tripwire Hook ; tripwire_hook
132 ; 0 ; Tripwire ; tripwire_hook
133 ; 0 ; Emerald Block ; emerald_block
134 ; 0 ; Spruce Wood Stairs ; spruce_stairs
135 ; 0 ; Birch Wood Stairs ; birch_stairs
136 ; 0 ; Jungle Wood Stairs ; jungle_stairs
137 ; 0 ; Command Block ; command_block
137 ; 1 ; Repeating Command Block ; repeating_command_block
137 ; 2 ; Chain Command Block ; chain_command_block
138 ; 0 ; Beacon ; beacon
139 ; 0 ; Cobblestone Wall ; cobblestone_wall
139 ; 1 ; Mossy Cobblestone Wall ; mossy_cobblestone_wall
140 ; 0 ; Flower Pot ; flower_pot
141 ; 0 ; Carrots ; carrot
142 ; 0 ; Potatoes ; potato
143 ; 0 ; Oak Button ; oak_button
143 ; 1 ; Spruce Button ; spruce_button
143 ; 2 ; Birch Button ; birch_button
143 ; 3 ; Jungle Button ; jungle_button
143 ; 4 ; Acacia Button ; acacia_button
143 ; 5 ; Dark Oak Button ; dark_oak_button
143 ; 6 ; Mangrove Button ; mangrove_button
143 ; 7 ; Cherry Button ; cherry_button
143 ; 8 ; Pale Oak Button ; pale_oak_button
143 ; 9 ; Bamboo Button ; bamboo_button
143 ; 10 ; Crimson Button ; crimson_button
143 ; 11 ; Warped Button ; warped_button
144 ; 0 ; Mob Head ; skeleton_skull
145 ; 0 ; Anvil ; anvil
146 ; 0 ; Trapped Chest ; trapped_chest
147 ; 0 ; Weighted Pressure Plate (light) ; light_weighted_pressure_plate
148 ; 0 ; Weighted Pressure Plate (heavy) ; heavy_weighted_pressure_plate
149 ; 0 ; Redstone Comparator (inactive) ; unpowered_comparator
150 ; 0 ; Redstone Comparator (active) ; comparator
151 ; 0 ; Daylight Sensor ; daylight_detector
152 ; 0 ; Redstone Block ; redstone_block
153 ; 0 ; Nether Quartz Ore ; nether_quartz_ore
154 ; 0 ; Hopper ; hopper
155 ; 0 ; Quartz Block ; quartz_block
155 ; 1 ; Chiseled Quartz Block ; chiseled_quartz_block
155 ; 2 ; Pillar Quartz Block ; quartz_pillar
156 ; 0 ; Quartz Stairs ; quartz_stairs
157 ; 0 ; Activator Rail ; activator_rail
158 ; 0 ; Dropper ; dropper
159 ; 0 ; White Hardened Clay ; white_terracotta
159 ; 1 ; Orange Hardened Clay ; orange_terracotta
159 ; 2 ; Magenta Hardened Clay ; magenta_terracotta
159 ; 3 ; Light Blue Hardened Clay ; light_blue_terracotta
159 ; 4 ; Yellow Hardened Clay ; yellow_terracotta
159 ; 5 ; Lime Hardened Clay ; lime_terracotta
159 ; 6 ; Pink Hardened Clay ; pink_terracotta
159 ; 7 ; Gray Hardened Clay ; gray_terracotta
159 ; 8 ; Light Gray Hardened Clay ; light_gray_terracotta
159 ; 9 ; Cyan Hardened Clay ; cyan_terracotta
159 ; 10 ; Purple Hardened Clay ; purple_terracotta
159 ; 11 ; Blue Hardened Clay ; blue_terracotta
159 ; 12 ; Brown Hardened Clay ; brown_terracotta
159 ; 13 ; Green Hardened Clay ; green_terracotta
159 ; 14 ; Red Hardened Clay ; red_terracotta
159 ; 15 ; Black Hardened Clay ; black_terracotta
160 ; 0 ; White Stained Glass Pane ; white_stained_glass_pane
160 ; 1 ; Orange Stained Glass Pane ; orange_stained_glass_pane
160 ; 2 ; Magenta Stained Glass Pane ; magenta_stained_glass_pane
160 ; 3 ; Light Blue Stained Glass Pane ; light_blue_stained_glass_pane
160 ; 4 ; Yellow Stained Glass Pane ; yellow_stained_glass_pane
160 ; 5 ; Lime Stained Glass Pane ; lime_stained_glass_pane
160 ; 6 ; Pink Stained Glass Pane ; pink_stained_glass_pane
160 ; 7 ; Gray Stained Glass Pane ; gray_stained_glass_pane
160 ; 8 ; Light Gray Stained Glass Pane ; light_gray_stained_glass_pane
160 ; 9 ; Cyan Stained Glass Pane ; cyan_stained_glass_pane
160 ; 10 ; Purple Stained Glass Pane ; purple_stained_glass_pane
160 ; 11 ; Blue Stained Glass Pane ; blue_stained_glass_pane
160 ; 12 ; Brown Stained Glass Pane ; brown_stained_glass_pane
160 ; 13 ; Green Stained Glass Pane ; green_stained_glass_pane
160 ; 14 ; Red Stained Glass Pane ; red_stained_glass_pane
160 ; 15 ; Black Stained Glass Pane ; black_stained_glass_pane
161 ; 0 ; Acacia Leaves ; leaves2
161 ; 1 ; Dark Oak Leaves ; leaves2
162 ; 0 ; Acacia Wood ; log2
162 ; 1 ; Dark Oak Wood ; log2
163 ; 0 ; Acacia Wood Stairs ; acacia_stairs
164 ; 0 ; Dark Oak Wood Stairs ; dark_oak_stairs
165 ; 0 ; Slime Block ; slime_block
166 ; 0 ; Barrier ; barrier
167 ; 0 ; Iron Trapdoor ; iron_trapdoor
168 ; 0 ; Prismarine ; prismarine
168 ; 1 ; Prismarine Bricks ; prismarine_bricks
168 ; 2 ; Dark Prismarine ; dark_prismarine
169 ; 0 ; Sea Lantern ; sea_lantern
169 ; 9 ; MinedApple's Head ; player_head[profile={name:MinedApple}]
170 ; 0 ; Hay Bale ; hay_block
171 ; 0 ; White Carpet ; white_carpet
171 ; 1 ; Orange Carpet ; orange_carpet
171 ; 2 ; Magenta Carpet ; magenta_carpet
171 ; 3 ; Light Blue Carpet ; light_blue_carpet
171 ; 4 ; Yellow Carpet ; yellow_carpet
171 ; 5 ; Lime Carpet ; lime_carpet
171 ; 6 ; Pink Carpet ; pink_carpet
171 ; 7 ; Gray Carpet ; gray_carpet
171 ; 8 ; Light Gray Carpet ; light_gray_carpet
171 ; 9 ; Cyan Carpet ; cyan_carpet
171 ; 10 ; Purple Carpet ; purple_carpet
171 ; 11 ; Blue Carpet ; blue_carpet
171 ; 12 ; Brown Carpet ; brown_carpet
171 ; 13 ; Green Carpet ; green_carpet
171 ; 14 ; Red Carpet ; red_carpet
171 ; 15 ; Black Carpet ; black_carpet
172 ; 0 ; Hardened Clay ; terracotta
173 ; 0 ; Block of Coal ; coal_block
174 ; 0 ; Packed Ice ; packed_ice
175 ; 0 ; Sunflower ; sunflower
175 ; 1 ; Lilac ; lilac
175 ; 2 ; Double Tallgrass ; tall_grass
175 ; 3 ; Large Fern ; large_fern
175 ; 4 ; Rose Bush ; rose_bush
175 ; 5 ; Peony ; peony
176 ; 0 ; Free-standing Banner ; standing_banner
177 ; 0 ; Wall-mounted Banner ; wall_banner
178 ; 0 ; Inverted Daylight Sensor ; daylight_detector_inverted
179 ; 0 ; Red Sandstone ; red_sandstone
179 ; 1 ; Chiseled Red Sandstone ; chiseled_red_sandstone
179 ; 2 ; Smooth Red Sandstone ; smooth_red_sandstone
180 ; 0 ; Red Sandstone Stairs ; red_sandstone_stairs
181 ; 0 ; Double Red Sandstone Slab ; double_stone_slab2
182 ; 0 ; Red Sandstone Slab ; stone_slab2
183 ; 0 ; Spruce Fence Gate ; spruce_fence_gate
184 ; 0 ; Birch Fence Gate ; birch_fence_gate
185 ; 0 ; Jungle Fence Gate ; jungle_fence_gate
186 ; 0 ; Dark Oak Fence Gate ; dark_oak_fence_gate
187 ; 0 ; Acacia Fence Gate ; acacia_fence_gate
188 ; 0 ; Spruce Fence ; spruce_fence
189 ; 0 ; Birch Fence ; birch_fence
190 ; 0 ; Jungle Fence ; jungle_fence
191 ; 0 ; Dark Oak Fence ; dark_oak_fence
192 ; 0 ; Acacia Fence ; acacia_fence
193 ; 0 ; Spruce Door Block ; spruce_door
194 ; 0 ; Birch Door Block ; birch_door
195 ; 0 ; Jungle Door Block ; jungle_door
196 ; 0 ; Acacia Door Block ; acacia_door
197 ; 0 ; Dark Oak Door Block ; dark_oak_door
198 ; 0 ; End Rod ; end_rod
199 ; 0 ; Chorus Plant ; chorus_plant
200 ; 0 ; Chorus Flower ; chorus_flower
201 ; 0 ; Purpur Block ; purpur_block
202 ; 0 ; Purpur Pillar ; purpur_pillar
203 ; 0 ; Purpur Stairs ; purpur_stairs
204 ; 0 ; Purpur Double Slab ; purpur_double_slab
205 ; 0 ; Purpur Slab ; purpur_slab
206 ; 0 ; End Stone Bricks ; end_stone_bricks
207 ; 0 ; Beetroot Block ; mangrove_log ; 아니 얘는 뭐임..
208 ; 0 ; Grass Path ; dirt_path
209 ; 0 ; End Gateway ; end_gateway
210 ; 0 ; Repeating Command Block ; repeating_command_block
211 ; 0 ; Chain Command Block ; chain_command_block
212 ; 0 ; Frosted Ice ; frosted_ice
213 ; 0 ; Magma Block ; magma_block
214 ; 0 ; Nether Wart Block ; nether_wart_block
215 ; 0 ; Red Nether Brick ; red_nether_bricks
216 ; 0 ; Bone Block ; bone_block
217 ; 0 ; Structure Void ; structure_void
218 ; 0 ; Observer ; observer
219 ; 0 ; White Shulker Box ; white_shulker_box
220 ; 0 ; Orange Shulker Box ; orange_shulker_box
221 ; 0 ; Magenta Shulker Box ; magenta_shulker_box
222 ; 0 ; Light Blue Shulker Box ; light_blue_shulker_box
223 ; 0 ; Yellow Shulker Box ; yellow_shulker_box
224 ; 0 ; Lime Shulker Box ; lime_shulker_box
225 ; 0 ; Pink Shulker Box ; pink_shulker_box
226 ; 0 ; Gray Shulker Box ; gray_shulker_box
227 ; 0 ; Light Gray Shulker Box ; silver_shulker_box
228 ; 0 ; Cyan Shulker Box ; cyan_shulker_box
229 ; 0 ; Purple Shulker Box ; purple_shulker_box
230 ; 0 ; Blue Shulker Box ; blue_shulker_box
231 ; 0 ; Brown Shulker Box ; brown_shulker_box
232 ; 0 ; Green Shulker Box ; green_shulker_box
233 ; 0 ; Red Shulker Box ; red_shulker_box
234 ; 0 ; Black Shulker Box ; black_shulker_box
235 ; 0 ; White Glazed Terracotta ; white_glazed_terracotta
236 ; 0 ; Orange Glazed Terracotta ; orange_glazed_terracotta
237 ; 0 ; Magenta Glazed Terracotta ; magenta_glazed_terracotta
238 ; 0 ; Light Blue Glazed Terracotta ; light_blue_glazed_terracotta
239 ; 0 ; Yellow Glazed Terracotta ; yellow_glazed_terracotta
240 ; 0 ; Lime Glazed Terracotta ; lime_glazed_terracotta
241 ; 0 ; Pink Glazed Terracotta ; pink_glazed_terracotta
242 ; 0 ; Gray Glazed Terracotta ; gray_glazed_terracotta
243 ; 0 ; Light Gray Glazed Terracotta ; light_gray_glazed_terracotta
244 ; 0 ; Cyan Glazed Terracotta ; cyan_glazed_terracotta
245 ; 0 ; Purple Glazed Terracotta ; purple_glazed_terracotta
246 ; 0 ; Blue Glazed Terracotta ; blue_glazed_terracotta
247 ; 0 ; Brown Glazed Terracotta ; brown_glazed_terracotta
248 ; 0 ; Green Glazed Terracotta ; green_glazed_terracotta
249 ; 0 ; Red Glazed Terracotta ; red_glazed_terracotta
250 ; 0 ; Black Glazed Terracotta ; black_glazed_terracotta
251 ; 0 ; White Concrete ; white_concrete
251 ; 1 ; Orange Concrete ; orange_concrete
251 ; 2 ; Magenta Concrete ; magenta_concrete
251 ; 3 ; Light Blue Concrete ; light_blue_concrete
251 ; 4 ; Yellow Concrete ; yellow_concrete
251 ; 5 ; Lime Concrete ; lime_concrete
251 ; 6 ; Pink Concrete ; pink_concrete
251 ; 7 ; Gray Concrete ; gray_concrete
251 ; 8 ; Light Gray Concrete ; light_gray_concrete
251 ; 9 ; Cyan Concrete ; cyan_concrete
251 ; 10 ; Purple Concrete ; purple_concrete
251 ; 11 ; Blue Concrete ; blue_concrete
251 ; 12 ; Brown Concrete ; brown_concrete
251 ; 13 ; Green Concrete ; green_concrete
251 ; 14 ; Red Concrete ; red_concrete
251 ; 15 ; Black Concrete ; black_concrete
252 ; 0 ; White Concrete Powder ; white_concrete_powder
252 ; 1 ; Orange Concrete Powder ; orange_concrete_powder
252 ; 2 ; Magenta Concrete Powder ; magenta_concrete_powder
252 ; 3 ; Light Blue Concrete Powder ; light_blue_concrete_powder
252 ; 4 ; Yellow Concrete Powder ; yellow_concrete_powder
252 ; 5 ; Lime Concrete Powder ; lime_concrete_powder
252 ; 6 ; Pink Concrete Powder ; pink_concrete_powder
252 ; 7 ; Gray Concrete Powder ; gray_concrete_powder
252 ; 8 ; Light Gray Concrete Powder ; light_gray_concrete_powder
252 ; 9 ; Cyan Concrete Powder ; cyan_concrete_powder
252 ; 10 ; Purple Concrete Powder ; purple_concrete_powder
252 ; 11 ; Blue Concrete Powder ; blue_concrete_powder
252 ; 12 ; Brown Concrete Powder ; brown_concrete_powder
252 ; 13 ; Green Concrete Powder ; green_concrete_powder
252 ; 14 ; Red Concrete Powder ; red_concrete_powder
252 ; 15 ; Black Concrete Powder ; black_concrete_powder
255 ; 0 ; Structure Block ; structure_block
256 ; 0 ; Iron Shovel ; iron_shovel
257 ; 0 ; Iron Pickaxe ; iron_pickaxe
258 ; 0 ; Iron Axe ; iron_axe
259 ; 0 ; Flint and Steel ; flint_and_steel
260 ; 0 ; Apple ; apple
261 ; 0 ; Bow ; bow
262 ; 0 ; Arrow ; arrow
263 ; 0 ; Coal ; coal
263 ; 1 ; Charcoal ; charcoal
264 ; 0 ; Diamond ; diamond
265 ; 0 ; Iron Ingot ; iron_ingot
266 ; 0 ; Gold Ingot ; gold_ingot
267 ; 0 ; Iron Sword ; iron_sword
268 ; 0 ; Wooden Sword ; wooden_sword
269 ; 0 ; Wooden Shovel ; wooden_shovel
270 ; 0 ; Wooden Pickaxe ; wooden_pickaxe
271 ; 0 ; Wooden Axe ; wooden_axe
272 ; 0 ; Stone Sword ; stone_sword
273 ; 0 ; Stone Shovel ; stone_shovel
274 ; 0 ; Stone Pickaxe ; stone_pickaxe
275 ; 0 ; Stone Axe ; stone_axe
276 ; 0 ; Diamond Sword ; diamond_sword
277 ; 0 ; Diamond Shovel ; diamond_shovel
278 ; 0 ; Diamond Pickaxe ; diamond_pickaxe
279 ; 0 ; Diamond Axe ; diamond_axe
280 ; 0 ; Stick ; stick
281 ; 0 ; Bowl ; bowl
282 ; 0 ; Mushroom Stew ; mushroom_stew
283 ; 0 ; Golden Sword ; golden_sword
284 ; 0 ; Golden Shovel ; golden_shovel
285 ; 0 ; Golden Pickaxe ; golden_pickaxe
286 ; 0 ; Golden Axe ; golden_axe
287 ; 0 ; String ; string
288 ; 0 ; Feather ; feather
289 ; 0 ; Gunpowder ; gunpowder
290 ; 0 ; Wooden Hoe ; wooden_hoe
291 ; 0 ; Stone Hoe ; stone_hoe
292 ; 0 ; Iron Hoe ; iron_hoe
293 ; 0 ; Diamond Hoe ; diamond_hoe
294 ; 0 ; Golden Hoe ; golden_hoe
295 ; 0 ; Wheat Seeds ; wheat_seeds
296 ; 0 ; Wheat ; wheat
297 ; 0 ; Bread ; bread
298 ; 0 ; Leather Helmet ; leather_helmet
299 ; 0 ; Leather Tunic ; leather_chestplate
300 ; 0 ; Leather Pants ; leather_leggings
301 ; 0 ; Leather Boots ; leather_boots
302 ; 0 ; Chainmail Helmet ; chainmail_helmet
303 ; 0 ; Chainmail Chestplate ; chainmail_chestplate
304 ; 0 ; Chainmail Leggings ; chainmail_leggings
305 ; 0 ; Chainmail Boots ; chainmail_boots
306 ; 0 ; Iron Helmet ; iron_helmet
307 ; 0 ; Iron Chestplate ; iron_chestplate
308 ; 0 ; Iron Leggings ; iron_leggings
309 ; 0 ; Iron Boots ; iron_boots
310 ; 0 ; Diamond Helmet ; diamond_helmet
311 ; 0 ; Diamond Chestplate ; diamond_chestplate
312 ; 0 ; Diamond Leggings ; diamond_leggings
313 ; 0 ; Diamond Boots ; diamond_boots
314 ; 0 ; Golden Helmet ; golden_helmet
315 ; 0 ; Golden Chestplate ; golden_chestplate
316 ; 0 ; Golden Leggings ; golden_leggings
317 ; 0 ; Golden Boots ; golden_boots
318 ; 0 ; Flint ; flint
319 ; 0 ; Raw Porkchop ; porkchop
320 ; 0 ; Cooked Porkchop ; cooked_porkchop
321 ; 0 ; Painting ; painting
322 ; 0 ; Golden Apple ; golden_apple
322 ; 1 ; Enchanted Golden Apple ; enchanted_golden_apple
323 ; 0 ; Oak Sign ; oak_sign
323 ; 1 ; Spruce Sign ; spruce_sign
323 ; 2 ; Birch Sign ; birch_sign
323 ; 3 ; Jungle Sign ; jungle_sign
323 ; 4 ; Acacia Sign ; acacia_sign
323 ; 5 ; Dark Oak Sign ; dark_oak_sign
323 ; 6 ; Mangrove Sign ; mangrove_sign
323 ; 7 ; Cherry Sign ; cherry_sign
323 ; 8 ; Pale Oak Sign ; pale_oak_sign
323 ; 9 ; Bamboo Sign ; bamboo_sign
323 ; 10 ; Crimson Sign ; crimson_sign
323 ; 11 ; Warped Sign ; warped_sign
324 ; 0 ; Oak Door ; oak_door
324 ; 1 ; Spruce Door ; spruce_door
324 ; 2 ; Birch Door ; birch_door
324 ; 3 ; Jungle Door ; jungle_door
324 ; 4 ; Acacia Door ; acacia_door
324 ; 5 ; Dark Oak Door ; dark_oak_door
324 ; 6 ; Mangrove Door ; mangrove_door
324 ; 7 ; Cherry Door ; cherry_door
324 ; 8 ; Pale Oak Door ; pale_oak_door
324 ; 9 ; Bamboo Door ; bamboo_door
324 ; 10 ; Crimson Door ; crimson_door
324 ; 11 ; Warped Door ; warped_door
325 ; 0 ; Bucket ; bucket
326 ; 0 ; Water Bucket ; water_bucket
327 ; 0 ; Lava Bucket ; lava_bucket
328 ; 0 ; Minecart ; minecart
329 ; 0 ; Saddle ; saddle
330 ; 0 ; Iron Door ; iron_door
331 ; 0 ; Redstone ; redstone
332 ; 0 ; Snowball ; snowball
333 ; 0 ; Oak Boat ; boat
334 ; 0 ; Leather ; leather
335 ; 0 ; Milk Bucket ; milk_bucket
336 ; 0 ; Brick ; brick
337 ; 0 ; Clay ; clay_ball
338 ; 0 ; Sugar Canes ; sugar_cane
339 ; 0 ; Paper ; paper
340 ; 0 ; Book ; book
341 ; 0 ; Slimeball ; slime_ball
342 ; 0 ; Minecart with Chest ; chest_minecart
343 ; 0 ; Minecart with Furnace ; furnace_minecart
344 ; 0 ; Egg ; egg
345 ; 0 ; Compass ; compass
346 ; 0 ; Fishing Rod ; fishing_rod
347 ; 0 ; Clock ; clock
348 ; 0 ; Glowstone Dust ; glowstone_dust
349 ; 0 ; Raw Fish ; cod
349 ; 1 ; Raw Salmon ; salmon
349 ; 2 ; Clownfish ; tropical_fish
349 ; 3 ; Pufferfish ; pufferfish
350 ; 0 ; Cooked Fish ; cooked_fish
350 ; 1 ; Cooked Salmon ; cooked_salmon
351 ; 0 ; Ink Sack ; ink_sac
351 ; 1 ; Rose Red ; red_dye
351 ; 2 ; Cactus Green ; green_dye
351 ; 3 ; Coco Beans ; cocoa_beans
351 ; 4 ; Lapis Lazuli ; lapis_lazuli
351 ; 5 ; Purple Dye ; purple_dye
351 ; 6 ; Cyan Dye ; cyan_dye
351 ; 7 ; Light Gray Dye ; light_gray_dye
351 ; 8 ; Gray Dye ; gray_dye
351 ; 9 ; Pink Dye ; pink_dye
351 ; 10 ; Lime Dye ; lime_dye
351 ; 11 ; Dandelion Yellow ; yellow_dye
351 ; 12 ; Light Blue Dye ; light_blue_dye
351 ; 13 ; Magenta Dye ; magenta_dye
351 ; 14 ; Orange Dye ; orange_dye
351 ; 15 ; Bone Meal ; bone_meal
352 ; 0 ; Bone ; bone
353 ; 0 ; Sugar ; sugar
354 ; 0 ; Cake ; cake
355 ; 0 ; Red Bed ; red_bed
355 ; 1 ; Orange Bed ; orange_bed
355 ; 2 ; Magenta Bed ; magenta_bed
355 ; 3 ; Light Blue Bed ; light_blue_bed
355 ; 4 ; Yellow Bed ; yellow_bed
355 ; 5 ; Lime Bed ; lime_bed
355 ; 6 ; Pink Bed ; pink_bed
355 ; 7 ; Gray Bed ; gray_bed
355 ; 8 ; Light Gray Bed ; light_gray_bed
355 ; 9 ; Cyan Bed ; cyan_bed
355 ; 10 ; Purple Bed ; purple_bed
355 ; 11 ; Blue Bed ; blue_bad
355 ; 12 ; Brown Bed ; brown_bed
355 ; 13 ; Green Bed ; green_bed
355 ; 14 ; White Bed ; white_bed
355 ; 15 ; Black Bed ; black_bed
356 ; 0 ; Redstone Repeater ; repeater
357 ; 0 ; Cookie ; cookie
358 ; 0 ; Map ; map
359 ; 0 ; Shears ; shears
360 ; 0 ; Melon ; melon_slice
361 ; 0 ; Pumpkin Seeds ; pumpkin_seeds
362 ; 0 ; Melon Seeds ; melon_seeds
363 ; 0 ; Raw Beef ; beef
364 ; 0 ; Steak ; cooked_beef
365 ; 0 ; Raw Chicken ; chicken
366 ; 0 ; Cooked Chicken ; cooked_chicken
367 ; 0 ; Rotten Flesh ; rotten_flesh
368 ; 0 ; Ender Pearl ; ender_pearl
369 ; 0 ; Blaze Rod ; blaze_rod
370 ; 0 ; Ghast Tear ; ghast_tear
371 ; 0 ; Gold Nugget ; gold_nugget
372 ; 0 ; Nether Wart ; nether_wart
373 ; 0 ; Potion ; potion
374 ; 0 ; Glass Bottle ; glass_bottle
375 ; 0 ; Spider Eye ; spider_eye
376 ; 0 ; Fermented Spider Eye ; fermented_spider_eye
377 ; 0 ; Blaze Powder ; blaze_powder
378 ; 0 ; Magma Cream ; magma_cream
379 ; 0 ; Brewing Stand ; brewing_stand
380 ; 0 ; Cauldron ; cauldron
381 ; 0 ; Eye of Ender ; ender_eye
382 ; 0 ; Glistering Melon ; speckled_melon
383 ; 4 ; Spawn Elder Guardian ; elder_guardian_spawn_egg
383 ; 5 ; Spawn Wither Skeleton ; wither_skeleton_spawn_egg
383 ; 6 ; Spawn Stray ; stray_spawn_egg
383 ; 23 ; Spawn Husk ; husk_spawn_egg
383 ; 27 ; Spawn Zombie Villager ; zombie_villager_spawn_egg
383 ; 28 ; Spawn Skeleton Horse ; skeleton_horse_spawn_egg
383 ; 29 ; Spawn Zombie Horse ; zombie_horse_spawn_egg
383 ; 31 ; Spawn Donkey ; donkey_spawn_egg
383 ; 32 ; Spawn Mule ; mule_spawn_egg
383 ; 34 ; Spawn Evoker ; evoker_spawn_egg
383 ; 35 ; Spawn Vex ; vex_spawn_egg
383 ; 36 ; Spawn Vindicator ; vindicator_spawn_egg
383 ; 50 ; Spawn Creeper ; creeper_spawn_egg
383 ; 51 ; Spawn Skeleton ; skeleton_spawn_egg
383 ; 52 ; Spawn Spider ; spider_spawn_egg
383 ; 54 ; Spawn Zombie ; zombie_spawn_egg
383 ; 55 ; Spawn Slime ; slime_spawn_egg
383 ; 56 ; Spawn Ghast ; ghast_spawn_egg
383 ; 57 ; Spawn Zombie Pigman ; piglin_spawn_egg
383 ; 58 ; Spawn Enderman ; enderman_spawn_egg
383 ; 59 ; Spawn Cave Spider ; cave_spider_spawn_egg
383 ; 60 ; Spawn Silverfish ; silverfish_spawn_egg
383 ; 61 ; Spawn Blaze ; blaze_spawn_egg
383 ; 62 ; Spawn Magma Cube ; magma_cube_spawn_egg
383 ; 65 ; Spawn Bat ; bat_spawn_egg
383 ; 66 ; Spawn Witch ; witch_spawn_egg
383 ; 67 ; Spawn Endermite ; endermite_spawn_egg
383 ; 68 ; Spawn Guardian ; guardian_spawn_egg
383 ; 69 ; Spawn Shulker ; shulker_spawn_egg
383 ; 90 ; Spawn Pig ; pig_spawn_egg
383 ; 91 ; Spawn Sheep ; sheep_spawn_egg
383 ; 92 ; Spawn Cow ; cow_spawn_egg
383 ; 93 ; Spawn Chicken ; chicken_spawn_egg
383 ; 94 ; Spawn Squid ; squid_spawn_egg
383 ; 95 ; Spawn Wolf ; wolf_spawn_egg
383 ; 96 ; Spawn Mooshroom ; mooshroom_spawn_egg
383 ; 98 ; Spawn Ocelot ; ocelot_spawn_egg
383 ; 100 ; Spawn Horse ; horse_spawn_egg
383 ; 101 ; Spawn Rabbit ; rabbit_spawn_egg
383 ; 102 ; Spawn Polar Bear ; polar_bear_spawn_egg
383 ; 103 ; Spawn Llama ; llama_spawn_egg
383 ; 105 ; Spawn Parrot ; parrot_spawn_egg
383 ; 120 ; Spawn Villager ; villager_spawn_egg
384 ; 0 ; Bottle o' Enchanting ; experience_bottle
385 ; 0 ; Fire Charge ; fire_charge
386 ; 0 ; Book and Quill ; writable_book
387 ; 0 ; Written Book ; written_book
388 ; 0 ; Emerald ; emerald
389 ; 0 ; Item Frame ; item_frame
390 ; 0 ; Flower Pot ; flower_pot
391 ; 0 ; Carrot ; carrot
392 ; 0 ; Potato ; potato
393 ; 0 ; Baked Potato ; baked_potato
394 ; 0 ; Poisonous Potato ; poisonous_potato
395 ; 0 ; Empty Map ; map
396 ; 0 ; Golden Carrot ; golden_carrot
397 ; 0 ; Mob Head (Skeleton) ; skeleton_skull
397 ; 1 ; Mob Head (Wither Skeleton) ; wither_skeleton_skull
397 ; 2 ; Mob Head (Zombie) ; zombie_head
397 ; 3 ; Mob Head (Human) ; player_head
397 ; 4 ; Mob Head (Creeper) ; creeper_head
397 ; 5 ; Mob Head (Dragon) ; dragon_head
398 ; 0 ; Carrot on a Stick ; carrot_on_a_stick
399 ; 0 ; Nether Star ; nether_star
400 ; 0 ; Pumpkin Pie ; pumpkin_pie
401 ; 0 ; Firework Rocket ; firework_rocket
402 ; 0 ; Firework Star ; firework_charge
403 ; 0 ; Enchanted Book ; enchanted_book
404 ; 0 ; Redstone Comparator ; comparator
405 ; 0 ; Nether Brick ; nether_bricks
406 ; 0 ; Nether Quartz ; quartz
407 ; 0 ; Minecart with TNT ; tnt_minecart
408 ; 0 ; Minecart with Hopper ; hopper_minecart
409 ; 0 ; Prismarine Shard ; prismarine_shard
410 ; 0 ; Prismarine Crystals ; prismarine_crystal
411 ; 0 ; Raw Rabbit ; rabbit
412 ; 0 ; Cooked Rabbit ; cooked_rabbit
413 ; 0 ; Rabbit Stew ; rabbit_stew
414 ; 0 ; Rabbit's Foot ; rabbit_foot
415 ; 0 ; Rabbit Hide ; rabbit_hide
416 ; 0 ; Armor Stand ; armor_stand
417 ; 0 ; Iron Horse Armor ; iron_horse_armor
418 ; 0 ; Golden Horse Armor ; golden_horse_armor
419 ; 0 ; Diamond Horse Armor ; diamond_horse_armor
420 ; 0 ; Lead ; lead
421 ; 0 ; Name Tag ; name_tag
422 ; 0 ; Minecart with Command Block ; command_block_minecart
423 ; 0 ; Raw Mutton ; mutton
424 ; 0 ; Cooked Mutton ; cooked_mutton
425 ; 0 ; White Banner ; white_banner
425 ; 1 ; Orange Banner ; orange_banner
425 ; 2 ; Magenta Banner ; magenta_banner
425 ; 3 ; Light_blue Banner ; light_blue_banner
425 ; 4 ; Yellow Banner ; yellow_banner
425 ; 5 ; Lime Banner ; lime_banner
425 ; 6 ; Pink Banner ; pink_banner
425 ; 7 ; Gray Banner ; gray_banner
425 ; 8 ; Light_gray Banner ; light_gray_banner
425 ; 9 ; Cyan Banner ; cyan_banner
425 ; 10 ; Purple Banner ; purple_banner
425 ; 11 ; Blue Banner ; blue_banner
425 ; 12 ; Brown Banner ; brown_banner
425 ; 13 ; Green Banner ; green_banner
425 ; 14 ; Red Banner ; red_banner
425 ; 15 ; Black Banner ; black_banner
426 ; 0 ; End Crystal ; end_crystal
427 ; 0 ; Spruce Door ; spruce_door
428 ; 0 ; Birch Door ; birch_door
429 ; 0 ; Jungle Door ; jungle_door
430 ; 0 ; Acacia Door ; acacia_door
431 ; 0 ; Dark Oak Door ; dark_oak_door
432 ; 0 ; Chorus Fruit ; chorus_fruit
433 ; 0 ; Popped Chorus Fruit ; popped_chorus_fruit
434 ; 0 ; Beetroot ; beetroot
435 ; 0 ; Beetroot Seeds ; beetroot_seeds
436 ; 0 ; Beetroot Soup ; beetroot_soup
437 ; 0 ; Dragon's Breath ; dragon_breath
438 ; 0 ; Splash Potion ; splash_potion
439 ; 0 ; Spectral Arrow ; spectral_arrow
440 ; 0 ; Tipped Arrow ; tipped_arrow
441 ; 0 ; Lingering Potion ; lingering_potion
442 ; 0 ; Shield ; shield
443 ; 0 ; Elytra ; elytra
444 ; 0 ; Spruce Boat ; spruce_boat
445 ; 0 ; Birch Boat ; birch_boat
446 ; 0 ; Jungle Boat ; jungle_boat
447 ; 0 ; Acacia Boat ; acacia_boat
448 ; 0 ; Dark Oak Boat ; dark_oak_boat
449 ; 0 ; Totem of Undying ; totem_of_undying
450 ; 0 ; Shulker Shell ; shulker_shell
452 ; 0 ; Iron Nugget ; iron_nugget
453 ; 0 ; Knowledge Book ; knowledge_book
2256 ; 0 ; 13 Disc ; music_disc_13
2257 ; 0 ; Cat Disc ; music_disc_cat
2258 ; 0 ; Blocks Disc ; music_disc_blocks
2259 ; 0 ; Chirp Disc ; music_disc_chirp
2260 ; 0 ; Far Disc ; music_disc_far
2261 ; 0 ; Mall Disc ; music_disc_mall
2262 ; 0 ; Mellohi Disc ; music_disc_mellohi
2263 ; 0 ; Stal Disc ; music_disc_stal
2264 ; 0 ; Strad Disc ; music_disc_strad
2265 ; 0 ; Ward Disc ; music_disc_ward
2266 ; 0 ; 11 Disc ; music_disc_11
2267 ; 0 ; Wait Disc ; music_disc_wait

""";
}
