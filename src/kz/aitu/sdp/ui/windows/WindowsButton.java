package kz.aitu.sdp.ui.windows;

import kz.aitu.sdp.ui.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering Windows button");
    }
}