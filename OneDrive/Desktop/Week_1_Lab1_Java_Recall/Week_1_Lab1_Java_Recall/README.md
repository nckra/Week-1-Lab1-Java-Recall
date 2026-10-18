# Lab 1 — Java Recall

**Student:** Sudenaz Çakır  
**Student ID:** 230446030  
**Course lab:** Week 1 / Lab 1

This repository contains solutions for both exercises in the provided Week 1 lab assignment:

- **Exercise 1 — Playlist Track:** constructor chaining, duration validation/formatting, getters, `toString()`, and a demo of all constructors and methods.
- **Exercise 2 — Game Shop Inventory:** `game.inventory` package, least-privilege access modifiers, stock updates, inventory display, and package-private serial-code auditing.

## Requirements

- Java JDK 17 or newer (tested with Java 21)

## Compile and run

Run these commands from the repository root.

### Exercise 1

```bash
javac Track.java PlaylistDemo.java
java PlaylistDemo
```

### Exercise 2

```bash
javac game/inventory/Item.java game/inventory/Inventory.java GameShop.java
java GameShop
```

The call to `getSerialCode()` from `GameShop` is intentionally left commented out because the method is package-private and is not accessible outside `game.inventory`.
