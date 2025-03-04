package chstone12.quick_commands;

public class entits extends quick_commands {
    public static String entity_list = """
파일이름이 왜 뭐 어때서
50 ; 0 ; Creeper ; creeper
51 ; 0 ; Skeleton ; skeleton
54 ; 0 ; Zombie ; zombie
1 ; 0 ; Dropped Item ; item
2 ; 0 ; Experience Orb ; xp_orb
3 ; 0 ; Area Effect Cloud ; area_effect_cloud
4 ; 0 ; Elder Guardian ; elder_guardian
5 ; 0 ; Wither Skeleton ; wither_skeleton
6 ; 0 ; Stray ; stray
7 ; 0 ; Egg ; egg
8 ; 0 ; Lead Knot ; leash_knot
9 ; 0 ; Painting ; painting
10 ; 0 ; Arrow ; arrow
11 ; 0 ; Snowball ; snowball
12 ; 0 ; Ghast Fireball ; fireball
13 ; 0 ; Blaze Fireball ; small_fireball
14 ; 0 ; Ender Pearl ; ender_pearl
15 ; 0 ; Eye of Ender ; eye_of_ender
16 ; 0 ; Splash Potion ; potion
17 ; 0 ; Bottle o' Enchanting ; experience_bottle
18 ; 0 ; Item Frame ; item_frame
19 ; 0 ; Wither Skull ; wither_skull
20 ; 0 ; Primed TNT ; tnt
21 ; 0 ; Falling Block ; falling_block
22 ; 0 ; Firework Rocket ; firework_rocket
23 ; 0 ; Husk ; husk
24 ; 0 ; Spectral Arrow ; spectral_arrow
25 ; 0 ; Shulker Bullet ; shulker_bullet
26 ; 0 ; Dragon Fireball ; dragon_fireball
27 ; 0 ; Zombie Villager ; zombie_villager
28 ; 0 ; Skeleton Horse ; skeleton_horse
29 ; 0 ; Zombie Horse ; zombie_horse
30 ; 0 ; Armor Stand ; armor_stand
31 ; 0 ; Donkey ; donkey
32 ; 0 ; Mule ; mule
33 ; 0 ; Evocation Fangs ; evoker_fangs
34 ; 0 ; Evoker ; evoker
35 ; 0 ; Vex ; vex
36 ; 0 ; Vindicator ; vindicator
37 ; 0 ; Illusioner ; illusioner
40 ; 0 ; Minecart with Command Block ; command_block_minecart
41 ; 0 ; Boat ; oak_boat
42 ; 0 ; Minecart ; minecart
43 ; 0 ; Storage Minecart ; chest_minecart
44 ; 0 ; Powered Minecart ; furnace_minecart
45 ; 0 ; Minecart with TNT ; tnt_minecart
46 ; 0 ; Minecart with Hopper ; hopper_minecart
47 ; 0 ; Minecart with Spawner ; spawner_minecart
52 ; 0 ; Spider ; spider
53 ; 0 ; Giant Zombie ; giant
55 ; 0 ; Slime ; slime
56 ; 0 ; Ghast ; ghast
57 ; 0 ; Zombie Pigman ; zombie_pigman
57 ; 1 ; Piglin ; piglin
58 ; 0 ; Enderman ; enderman
59 ; 0 ; Cave Spider ; cave_spider
60 ; 0 ; Silverfish ; silverfish
61 ; 0 ; Blaze ; blaze
62 ; 0 ; Magma Cube ; magma_cube
63 ; 0 ; Ender Dragon ; ender_dragon
64 ; 0 ; Wither ; wither
65 ; 0 ; Bat ; bat
66 ; 0 ; Witch ; witch
67 ; 0 ; Endermite ; endermite
68 ; 0 ; Guardian ; guardian
69 ; 0 ; Shulker ; shulker
90 ; 0 ; Pig ; pig
91 ; 0 ; Sheep ; sheep
92 ; 0 ; Cow ; cow
93 ; 0 ; Chicken ; chicken
94 ; 0 ; Squid ; squid
95 ; 0 ; Wolf ; wolf
96 ; 0 ; Mooshroom ; mooshroom
97 ; 0 ; Snow Golem ; snowman
98 ; 0 ; Ocelot ; ocelot
99 ; 0 ; Iron Golem ; villager_golem
100 ; 0 ; Horse ; horse
101 ; 0 ; Rabbit ; rabiit
102 ; 0 ; Polar Bear ; polar_bear
103 ; 0 ; Llama ; llama
104 ; 0 ; Llama Spit ; llama_spit
105 ; 0 ; Parrot ; parrot
120 ; 0 ; Villager ; villager
200 ; 0 ; Ender Crystal ; ender_crystal
201 ; 0 ; Interaction ; interaction
202 ; 0 ; Acacia Boat ; acacia_boat
203 ; 0 ; Birch Boat ; birch_boat
204 ; 0 ; Cherry Boat ; cherry_boat
205 ; 0 ; Dark Oak Boat ; dark_oak_boat
206 ; 0 ; Jungle Boat ; jungle_boat
207 ; 0 ; Mangrove Boat ; mangrove_boat
208 ; 0 ; Oak Boat ; oak_boat
209 ; 0 ; Pale Oak Boat ; pale_oak_boat
210 ; 0 ; Spruce Boat ; spruce_boat
211 ; 0 ; Acacia Chest Boat ; acacia_chest_boat
212 ; 0 ; Birch Chest Boat ; birch_chest_boat
213 ; 0 ; Cherry Chest Boat ; cherry_chest_boat
214 ; 0 ; Dark Oak Chest Boat ; dark_oak_chest_boat
215 ; 0 ; Jungle Chest Boat ; jungle_chest_boat
216 ; 0 ; Mangrove Chest Boat ; mangrove_chest_boat
217 ; 0 ; Oak Chest Boat ; oak_chest_boat
218 ; 0 ; Pale Oak Chest Boat ; pale_oak_chest_boat
219 ; 0 ; Spruce Chest Boat ; spruce_chest_boat
220 ; 0 ; Allay ; allay
221 ; 0 ; Armadillo ; armadillo
222 ; 0 ; Axolotl ; axolotl
223 ; 0 ; Bamboo Raft ; bamboo_raft
224 ; 0 ; Bamboo Chest Raft ; bamboo_chest_raft
225 ; 0 ; Bee ; bee
226 ; 0 ; Bogged ; bogged
227 ; 0 ; Breeze ; breeze
228 ; 0 ; Breeze Wind Charge ; breeze_wind_charge
229 ; 0 ; Camel ; camel
230 ; 0 ; Cat ; cat
231 ; 0 ; Cod ; cod
232 ; 0 ; Creaking ; creaking
233 ; 0 ; Dolphin ; dolphin
234 ; 0 ; Drowned ; drowned
235 ; 0 ; Fox ; fox
236 ; 0 ; Frog ; frog
237 ; 0 ; Glowing Item Frame ; glow_item_frame
238 ; 0 ; Glowing Squid ; glow_squid
239 ; 0 ; Messi ; goat
240 ; 0 ; Hoglin ; hoglin
241 ; 0 ; Marker ; marker
242 ; 0 ; Ominous Item Spawner ; ominous_item_spawner
243 ; 0 ; Panda ; panda
244 ; 0 ; Phantom ; phantom
245 ; 0 ; Piglin Brute ; piglin_brute
246 ; 0 ; Pillager ; pillager
247 ; 0 ; Pufferfish ; pufferfish
248 ; 0 ; Ravager ; ravager
249 ; 0 ; Salmon ; salmon
250 ; 0 ; Sniffer ; sniffer
251 ; 0 ; Strider ; strider
252 ; 0 ; Tadpole ; tadpole
253 ; 0 ; Trader_llama ; trader_llama
254 ; 0 ; Trident ; trident
255 ; 0 ; Tropical Fish ; tropical_fish
256 ; 0 ; Turtle ; turtle
257 ; 0 ; Wandering Trader ; wandering_trader
258 ; 0 ; Warden ; warden
259 ; 0 ; Wind Charge ; wind_charge
260 ; 0 ; Zoglin ; zoglin
261 ; 0 ; Zombified Piglin ; zombified_piglin
""";
}
