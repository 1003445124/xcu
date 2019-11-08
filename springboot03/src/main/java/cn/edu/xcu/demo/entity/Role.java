package cn.edu.xcu.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 3072 kB
 * </p>
 *
 * @author nydegang
 * @since 2019-11-02
 */
@TableName("t_role")
public class Role implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private String descri;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    @Override
    public String toString() {
        return "Role{" +
        "id=" + id +
        ", name=" + name +
        ", descri=" + descri +
        "}";
    }
}
