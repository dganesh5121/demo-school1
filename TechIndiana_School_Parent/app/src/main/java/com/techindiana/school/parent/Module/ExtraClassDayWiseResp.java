
package com.techindiana.school.parent.Module;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExtraClassDayWiseResp {

    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<ExtraClassDayWiseInfo> extraClassDayWiseInfo = null;
    @SerializedName("command")
    @Expose
    private String command;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ExtraClassDayWiseInfo> getExtraClassDayWiseInfo() {
        return extraClassDayWiseInfo;
    }

    public void setExtraClassDayWiseInfo(List<ExtraClassDayWiseInfo> extraClassDayWiseInfo) {
        this.extraClassDayWiseInfo = extraClassDayWiseInfo;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

}
