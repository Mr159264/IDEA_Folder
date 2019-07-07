import java.util.Arrays;

/**
 * @version 1.0
 * @auther zhoutl
 * @create 2019/06/27/20:41
 */
public class Father {
    Integer fatherId;

    String Code;

    Integer upfatherId;

    Son[] lowInfo;

    public Father(Integer fatherId, String code, Integer upfatherId, Son[] lowInfo) {
        this.fatherId = fatherId;
        Code = code;
        this.upfatherId = upfatherId;
        this.lowInfo = lowInfo;
    }

    public Father() {
    }

    @Override
    public String toString() {
        return "Father{" +
                "fatherId=" + fatherId +
                ", Code='" + Code + '\'' +
                ", upfatherId=" + upfatherId +
                ", lowInfo=" + Arrays.toString(lowInfo) +
                '}';
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public Integer getUpfatherId() {
        return upfatherId;
    }

    public void setUpfatherId(Integer upfatherId) {
        this.upfatherId = upfatherId;
    }

    public Son[] getLowInfo() {
        return lowInfo;
    }

    public void setLowInfo(Son[] lowInfo) {
        this.lowInfo = lowInfo;
    }
}
