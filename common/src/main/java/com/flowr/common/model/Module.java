package com.flowr.common.model;

import com.flowr.common.model.enums.Status;

import java.util.List;

public class Module {
    private String flowId;
    private String flowToken;
    private int flowVersion;
    private String no;
    private String name;
    private String desc;
    private String handlerId;
    private List<String> subModuleNos;
    private Status status;
    private boolean isStart;
    private boolean isEnd;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getFlowToken() {
        return flowToken;
    }

    public void setFlowToken(String flowToken) {
        this.flowToken = flowToken;
    }

    public int getFlowVersion() {
        return flowVersion;
    }

    public void setFlowVersion(int flowVersion) {
        this.flowVersion = flowVersion;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(String handlerId) {
        this.handlerId = handlerId;
    }

    public List<String> getSubModuleNos() {
        return subModuleNos;
    }

    public void setSubModuleNos(List<String> subModuleNos) {
        this.subModuleNos = subModuleNos;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isStart() {
        return isStart;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}
