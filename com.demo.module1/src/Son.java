import java.util.Objects;

/**
 * @version 1.0
 * @auther zhoutl
 * @create 2019/06/27/20:45
 */
public class Son {
    Integer fatherId;

    String Code;

    Integer upfatherId;

    public Son() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Son son = (Son) o;
        return Objects.equals(fatherId, son.fatherId) &&
                Objects.equals(Code, son.Code) &&
                Objects.equals(upfatherId, son.upfatherId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fatherId, Code, upfatherId);
    }

    @Override
    public String toString() {
        return "Son{" +
                "fatherId=" + fatherId +
                ", Code='" + Code + '\'' +
                ", upfatherId=" + upfatherId +
                '}';
    }

    public Son(Integer fatherId, String code, Integer upfatherId) {
        this.fatherId = fatherId;
        Code = code;
        this.upfatherId = upfatherId;
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
}
