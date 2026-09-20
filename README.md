# Assignment 2 — Factory Method and Abstract Factory

Course: ShP-2216 Software Design Patterns, Astana IT University
Author: Yusupov Nurlan, group SE-2526

## Purpose

Console logistics application that combines two creational patterns.
Factory Method creates the transport for the selected delivery mode
(road or sea). Abstract Factory creates a matching pair of UI components
for the selected platform (Windows or macOS). Both patterns run together
in a single program: the two choices are independent and all four
combinations work without editing the code.

## Package structure

- `kz.aitu.sdp.logistics` — Factory Method: `Transport`, `Truck`, `Ship`, `Logistics`, `RoadLogistics`, `SeaLogistics`
- `kz.aitu.sdp.ui` — Abstract Factory contracts: `Button`, `Checkbox`, `GUIFactory`
- `kz.aitu.sdp.ui.windows` — Windows family: `WindowsButton`, `WindowsCheckbox`, `WindowsFactory`
- `kz.aitu.sdp.ui.macos` — macOS family: `MacOSButton`, `MacOSCheckbox`, `MacOSFactory`
- `kz.aitu.sdp.app` — `DeliveryApplication`, the client that