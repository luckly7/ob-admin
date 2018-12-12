package zyrs.xyz.obadmin.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 左侧菜单
 */
public class Menu  implements Serializable {
    //序列化ID
    private static final long serialVersionUID = 1;


    private Integer id;
    private String name;
    private String menuLogo;

    private List<MenuSecond> menuSecondList;


    class MenuSecond{

        private Integer id;
        private String name;
        private String url;

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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

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

    public String getMenuLogo() {
        return menuLogo;
    }

    public void setMenuLogo(String menuLogo) {
        this.menuLogo = menuLogo;
    }

    public List<MenuSecond> getMenuSecondList() {
        return menuSecondList;
    }

    public void setMenuSecondList(List<MenuSecond> menuSecondList) {
        this.menuSecondList = menuSecondList;
    }

}