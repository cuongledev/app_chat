package com.hstc.lengoccuong.chatapp.Notifications;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;

public class MyNotification extends ContextWrapper {
    private static final  String CHANEL_ID = "com.hstc.lengoccuong.chatapp";
    private static final  String CHANEL_NAME = "chatapp";
    private NotificationManager notificationManager;

    public MyNotification(Context base) {
        super(base);
        
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            createChanel();
        }
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void createChanel() {

        NotificationChannel channel = new NotificationChannel(CHANEL_ID,CHANEL_NAME,NotificationManager.IMPORTANCE_DEFAULT);
        channel.enableLights(false);
        channel.enableVibration(true);
        channel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);

        getManage().createNotificationChannel(channel);
    }

    public NotificationManager getManage(){
        if (notificationManager == null){
            notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }

        return notificationManager;
    }

    @TargetApi(Build.VERSION_CODES.O)
    public Notification.Builder getMyNotification(String title, String body, PendingIntent pendingIntent, Uri soundUri,String icon){
        return  new Notification.Builder(getApplicationContext(),CHANEL_ID)
                .setContentIntent(pendingIntent)
                .setContentTitle(title)
                .setContentText(body)
                .setSmallIcon(Integer.parseInt(icon))
                .setSound(soundUri)
                .setAutoCancel(true);
    }
}
