package clone;

import java.io.Serializable;

/**
 * @author wangqianlong
 * @create 2019-09-03 9:56
 */

public class AnimalHome implements Cloneable, Serializable {
    private String locate;
/*
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/


    public AnimalHome(String locate) {
        this.locate = locate;
    }


    @Override
    public String toString() {
        return "AnimalHome{" +
                "locate='" + locate + '\'' +
                '}';
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }
}
