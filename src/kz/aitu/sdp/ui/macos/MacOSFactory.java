package kz.aitu.sdp.ui.macos;

import kz.aitu.sdp.ui.Button;
import kz.aitu.sdp.ui.Checkbox;
import kz.aitu.sdp.ui.GUIFactory;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}