package com.rch.testorangepi;

import com.secureflashcard.wormapi.WormStore;

import java.util.Map;

import fi.iki.elonen.NanoHTTPD;

public class LocalStreamingServer extends NanoHTTPD {

    public LocalStreamingServer(int port){
        super(port);
    }

    @Override
    public Response serve(IHTTPSession session){
        String msg = "<html><body><h1>TSE  Info</h1>\n";
        WormStore wormStore = null;

        StringBuilder builder= new StringBuilder();
        try {
            wormStore= new WormStore("/mnt/usbhost/Storage");
            TSEInfo tseInfo = TSE.getInstance().getTseInfo(wormStore);

            for (Map.Entry<String, String> entry : tseInfo.toMap().entrySet()) {
                builder.append("<p>");
                builder.append(entry.getKey());
                builder.append("=");
                builder.append(entry.getValue());
                builder.append("</p>");

            }
            msg+= builder.toString();
        } catch (Exception e)
        {
            builder.append("<p>");
            builder.append("TSE not reachable");
            builder.append("</p>");

            builder.append("<p>");
            builder.append(e.getLocalizedMessage());
            builder.append("</p>");
            msg+= builder.toString();
        }

        return newFixedLengthResponse(msg + "</body></html>\n");
    }
}

