/**
 * @version 1.0
 * @auther zhoutl
 * @create 2019/03/29/21:25
 */
public class Score {
    private String id;
    private Integer math;
    private Integer chanse;
    private Integer englist;

    public Score() {

    }

    public Score(String id, Integer math, Integer chanse, Integer englist) {
        this.id = id;
        this.math = math;
        this.chanse = chanse;
        this.englist = englist;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public void setChanse(Integer chanse) {
        this.chanse = chanse;
    }

    public void setEnglist(Integer englist) {
        this.englist = englist;
    }

    public String getId() {
        return id;
    }

    public Integer getMath() {
        return math;
    }

    public Integer getChanse() {
        return chanse;
    }

    public Integer getEnglist() {
        return englist;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id='" + id + '\'' +
                ", math=" + math +
                ", chanse=" + chanse +
                ", englist=" + englist +
                '}';
    }
}
