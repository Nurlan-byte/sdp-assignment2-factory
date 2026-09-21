package kz.aitu.sdp;

import java.util.Scanner;
import kz.aitu.sdp.app.DeliveryApplication;
import kz.aitu.sdp.logistics.Logistics;
import kz.aitu.sdp.logistics.RoadLogistics;
import kz.aitu.sdp.logistics.SeaLogistics;
import kz.aitu.sdp.ui.GUIFactory;
import kz.aitu.sdp.ui.macos.MacOSFactory;
import kz.aitu.sdp.ui.windows.WindowsFactory;

public class Main {

    private static final String CARGO = "laboratory equipment";
    private static final String DESTINATION = "Tokyo warehouse";

    public static void main(String[] args) {
        String deliveryMode;
        String uiPlatform;

        if (args.length == 2) {
            deliveryMode = normalize(args[0]);
            uiPlatform = normalize(args[1]);
        } else {
            Scanner scanner = new Scanner(System.in);
            deliveryMode = ask(scanner, "Delivery mode (ROAD or SEA): ");
            uiPlatform = ask(scanner, "UI platform (WINDOWS or MACOS): ");
        }

        Logistics logistics = selectLogistics(deliveryMode);
        if (logistics == null) {
            System.out.println("Unsupported or missing delivery mode: \"" + deliveryMode
                    + "\". Supported values: ROAD, SEA. Stopping without delivery.");
            return;
        }

        GUIFactory guiFactory = selectGuiFactory(uiPlatform);
        if (guiFactory == null) {
            System.out.println("Unsupported or missing UI platform: \"" + uiPlatform
                    + "\". Supported values: WINDOWS, MACOS. Stopping without UI construction.");
            return;
        }

        System.out.println("Delivery mode: " + deliveryMode);
        System.out.println("UI platform: " + uiPlatform);

        DeliveryApplication application = new DeliveryApplication(guiFactory, logistics);
        application.run(CARGO, DESTINATION);
    }

    private static String ask(Scanner scanner, String prompt) {
        System.out.print(prompt);
        if (!scanner.hasNextLine()) {
            return "";
        }
        return normalize(scanner.nextLine());
    }

    private static String normalize(String value) {
        return value == null ? "" : value.trim().toUpperCase();
    }

    private static Logistics selectLogistics(String deliveryMode) {
        return switch (deliveryMode) {
            case "ROAD" -> new RoadLogistics();
            case "SEA" -> new SeaLogistics();
            default -> null;
        };
    }

    private static GUIFactory selectGuiFactory(String uiPlatform) {
        return switch (uiPlatform) {
            case "WINDOWS" -> new WindowsFactory();
            case "MACOS" -> new MacOSFactory();
            default -> null;
        };
    }
}