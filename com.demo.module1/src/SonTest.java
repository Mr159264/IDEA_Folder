/**
 * @version 1.0
 * @auther zhoutl
 * @create 2019/06/27/21:24
 */
public class SonTest {
    Integer fatherId;

    String Code;

    Integer upfatherId;

    Integer isChoose;

    public SonTest(Integer fatherId, String code, Integer upfatherId, Integer isChoose) {
        this.fatherId = fatherId;
        Code = code;
        this.upfatherId = upfatherId;
        this.isChoose = isChoose;
    }

    public SonTest() {
    }

    @Override
    public String toString() {
        return "SonTest{" +
                "fatherId=" + fatherId +
                ", Code='" + Code + '\'' +
                ", upfatherId=" + upfatherId +
                ", isChoose=" + isChoose +
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
}
