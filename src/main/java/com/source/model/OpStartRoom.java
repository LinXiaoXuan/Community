package com.source.model;

import java.util.Date;

public class OpStartRoom {
    private Integer id;

    private String hotelId;

    private String roomNum;

    private String deviceType;

    private String deviceTypeCode;

    private String deviceId;

    private String deviceName;

    private String nickNames;

    private String cmdNames;

    private String remark;

    private String roomZone;

    private String providerId;

    private String version;

    private String mqttProviderId;

    private String sort;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId == null ? null : hotelId.trim();
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum == null ? null : roomNum.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getDeviceTypeCode() {
        return deviceTypeCode;
    }

    public void setDeviceTypeCode(String deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode == null ? null : deviceTypeCode.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getNickNames() {
        return nickNames;
    }

    public void setNickNames(String nickNames) {
        this.nickNames = nickNames == null ? null : nickNames.trim();
    }

    public String getCmdNames() {
        return cmdNames;
    }

    public void setCmdNames(String cmdNames) {
        this.cmdNames = cmdNames == null ? null : cmdNames.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRoomZone() {
        return roomZone;
    }

    public void setRoomZone(String roomZone) {
        this.roomZone = roomZone == null ? null : roomZone.trim();
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId == null ? null : providerId.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getMqttProviderId() {
        return mqttProviderId;
    }

    public void setMqttProviderId(String mqttProviderId) {
        this.mqttProviderId = mqttProviderId == null ? null : mqttProviderId.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}