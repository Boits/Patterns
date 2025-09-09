package org.example.g2_structural.p7_Bridge;

import org.example.g2_structural.p7_Bridge.way1.abstraction.AbstractNotification;
import org.example.g2_structural.p7_Bridge.way1.abstraction.HtmlNotification;
import org.example.g2_structural.p7_Bridge.way1.abstraction.TextNotification;
import org.example.g2_structural.p7_Bridge.way1.implementor.EmailSender;
import org.example.g2_structural.p7_Bridge.way1.implementor.SmsSender;
import org.example.g2_structural.p7_Bridge.way2.abstraction.RemoteControl;
import org.example.g2_structural.p7_Bridge.way2.abstraction.SmartRemoteControl;
import org.example.g2_structural.p7_Bridge.way2.abstraction.VoiceRemoteControl;
import org.example.g2_structural.p7_Bridge.way2.implementor.Device;
import org.example.g2_structural.p7_Bridge.way2.implementor.Radio;
import org.example.g2_structural.p7_Bridge.way2.implementor.TV;

public class BridgeApp {

    public static void call() {
        //Типы уведомлений и способы доставки
//        way1();

        //Разные устройства и разные типы пультов
        way2();
    }

    private static void way2() {
        Device tv = new TV();
        RemoteControl smartRemoteControl = new SmartRemoteControl(tv);
        smartRemoteControl.manage(); // TV is ON и TV volume set to 30

        Device radio = new Radio();
        RemoteControl voiceControlledRemote = new VoiceRemoteControl(radio);
        voiceControlledRemote.manage(); // Radio is ON и Radio volume set to 50
    }

    private static void way1() {
        AbstractNotification emailText = new TextNotification(new EmailSender());
        AbstractNotification smsHtml = new HtmlNotification(new SmsSender());

        emailText.notifyUser("Hello via Email!"); // Sending email notification: Hello via Email!
        smsHtml.notifyUser("Hello via SMS!"); // Sending SMS notification: Hello via SMS!
    }
}

