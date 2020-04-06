# gloom-init-ahf
 Design assignmet 1 for CS 220- Gloomhaven Initiative Tracker

Writeup:
 While the problem itself did not specify much, my experience with the game Gloomhaven itself informed my design decisions. The problem did not specify whether combatant objects should stick around after a round, or whether the initiatives will change each round. From my experience with the game, I know that initiatives do change every round. In this simpler inplementation, the combatants must be re-defined every round, and stats like health must be kept separately. However, a more complex implementation with more features wouldn't simply be an initiative tracker, and the tracker for it would require some other infrastructure. This version is simple and will order the combatants it is given, and could act as a base for a more complex Gloomhaven helper program. 
