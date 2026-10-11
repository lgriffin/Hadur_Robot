# One robot, two brains, and a gate that fails closed

A duel brain and a melee brain share one core. A small gate picks which drives each tick, falls back to the duel on any doubt, and a hash test keeps the duel untouched.
