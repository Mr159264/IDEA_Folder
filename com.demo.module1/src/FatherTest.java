import java.util.Arrays;

/**
 * @version 1.0
 * @auther zhoutl
 * @create 2019/06/27/21:22
 */
public class FatherTest {
    Integer fatherId;

    String Code;

    Integer upfatherId;

    Integer isChoose;

    SonTest[] lowInfo;

    public FatherTest(Integer fatherId, String code, Integer upfatherId, Integer isChoose, SonTest[] lowInfo) {
        this.fatherId = fatherId;
        Code = code;
        this.upfatherId = upfatherId;
        this.isChoose = isChoose;
        this.lowInfo = lowInfo;
    }

    public FatherTest() {
    }

    @Override
    public String toString() {
        return "FatherTest{" +
                "fatherId=" + fatherId +
                ", Code='" + Code + '\'' +
                ", upfatherId=" + upfatherId +
                ", isChoose=" + isChoose +
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

    public Integer getIsChoose() {
        return isChoose;
    }

    public void setIsChoose(Integer isChoose) {
        this.isChoose = isChoose;
    }

    public SonTest[] getLowInfo() {
        return lowInfo;
    }

    public void setLowInfo(SonTest[] lowInfo) {
        this.lowInfo = lowInfo;
    }
}
