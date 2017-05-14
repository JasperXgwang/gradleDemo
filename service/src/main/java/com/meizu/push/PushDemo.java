package com.meizu.push;

import com.meizu.push.sdk.server.IFlymePush;
import com.meizu.push.sdk.server.constant.ResultPack;
import com.meizu.push.sdk.server.model.push.PushResult;
import com.meizu.push.sdk.server.model.push.VarnishedMessage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PushDemo {

    public void flymePush() {
        IFlymePush push = new IFlymePush("secret");
        VarnishedMessage message = new VarnishedMessage.Builder().appId(123L).build();
        List<String> targets = new ArrayList<>();
        targets.add("t1");
        try {
            ResultPack<PushResult> resultPack = push.pushMessage(message, targets);
            System.out.println(resultPack);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
