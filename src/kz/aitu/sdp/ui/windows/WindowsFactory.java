package kz.aitu.sdp.ui.windows;

import kz.aitu.sdp.ui.Button;
import kz.aitu.sdp.ui.Checkbox;
import kz.aitu.sdp.ui.GUIFactory;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}