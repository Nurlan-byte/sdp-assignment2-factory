# Assignment 2 — Factory Method and Abstract Factory

Course: ShP-2216 Software Design Patterns, Astana IT University
Author: Yusupov Nurlan, group SE-2526

## Purpose

Console logistics application that combines two creational patterns. Factory Method
creates the transport for the selected delivery mode (road or sea). Abstract Factory
creates a matching pair of UI components for the selected platform (Windows or macOS).
Both patterns run together in a single program: the two choices are independent and all
four combinations work without editing the code.

## Package structure

- `kz.aitu.sdp.logistics` — Factory Method: `Transport`, `Truck`, `Ship`, `Logistics`, `RoadLogistics`, `SeaLogistics`
- `kz.aitu.sdp.ui` — Abstract Factory contracts: `Button`, `Checkbox`, `GUIFactory`
- `kz.aitu.sdp.ui.windows` — Windows family: `WindowsButton`, `WindowsCheckbox`, `WindowsFactory`
- `kz.aitu.sdp.ui.macos` — macOS family: `MacOSButton`, `MacOSCheckbox`, `MacOSFactory`
- `kz.aitu.sdp.app` — `DeliveryApplication`, the client that receives a factory and a creator through its constructor
- `kz.aitu.sdp.Main` — startup: input reading, validation and selection
- `docs` — UML class diagrams

## Prerequisites

JDK 17

## Build and run

Windows PowerShell:

    javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName })
    java -cp out kz.aitu.sdp.Main ROAD WINDOWS

Without arguments the program asks for both values interactively:

    java -cp out kz.aitu.sdp.Main

## Supported input

Delivery mode: `ROAD`, `SEA`. UI platform: `WINDOWS`, `MACOS`.
Input is trimmed and case-insensitive. An unsupported or missing value produces a clear
message and the program stops without performing the delivery or creating UI components.
No default value is applied.

## Sample run

    > java -cp out kz.aitu.sdp.Main ROAD WINDOWS
    Delivery mode: ROAD
    UI platform: WINDOWS
    Rendering Windows button
    Rendering Windows checkbox
    Planning delivery of laboratory equipment to Aktau warehouse
    Truck delivers laboratory equipment to Aktau warehouse by road route (container on wheels)

## UML diagrams

- `docs/factory-method.png`
- `docs/abstract-factory.png`
