package kz.aitu.sdp.ui.macos;

import kz.aitu.sdp.ui.Button;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering macOS button");
    }
}