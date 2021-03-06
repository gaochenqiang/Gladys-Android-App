package com.gladysinc.gladys.Utils;


import android.view.View;

public interface AdapterCallback {

    interface AdapterCallbackAlarm{
        void onClickCallbackAlarm(Long id);
    }

    interface AdapterCallbackRoom{
        void onClickCallbackRoom(Long id, String roomName);
    }

    interface AdapterCallbackDevicetype{
        void onClickCallbackDevicetype(Long id, boolean active);
    }

    interface AdapterCallbackDevicestate{
        void onClickCallbackDevicestate(Long id, Float value);
    }

    interface AdapterCallbackBrainSentences{
        void onPopupMenuClickBrainSentences(View view, int pos, Long id, String status, String label);
    }
}
