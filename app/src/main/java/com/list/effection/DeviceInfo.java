package com.list.effection;

import java.util.List;

/**
 * Created by Administrator on 2017/12/18.
 */

public class DeviceInfo {

    /**
     * image : http://picture.quanjiakan.com/quanjiakan/resources/device/20171130091947_5kk2b6kz1yhuexo8lhxh.png
     * imei : 355637052788452
     * location : 113.2410457,23.132289
     * locationTime : 2017-11-15 16:01:02.0
     * name : %E8%80%81%E5%A4%B4%E5%AD%90
     * online : 0
     * phone : 18620155897
     * relationlist : []
     * type : 0
     */

    private String image;
    private String imei;
    private String location;
    private String locationTime;
    private String name;
    private int online;
    private String phone;
    private int type;
    private List<?> relationlist;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationTime() {
        return locationTime;
    }

    public void setLocationTime(String locationTime) {
        this.locationTime = locationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<?> getRelationlist() {
        return relationlist;
    }

    public void setRelationlist(List<?> relationlist) {
        this.relationlist = relationlist;
    }
}
