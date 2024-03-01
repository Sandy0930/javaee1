package com.sandy;

import java.sql.Date;

public class Title {
    private int id;
    private String pId;
     private String no;
        private String name;
        private String sex;
 private Date birthdat;
    public int getId() {
                return id;
            }
            public void setId(int id) { this.id = id;
    }
     public String getpId() {
                return pId;
            }
     public void setpId(String pId) {
        this.pId=pId;
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
     public Date getBirthdat() {
                return birthdat;
            }
     public void setBirthdat(Date birthdat) {
                this.birthdat = birthdat;
           }
     public Title(int id, String pId,String no,String name, String sex, Date birthdat) {
                super();
               this.id = id;
               this.pId = pId;
               this.no = no;
               this.name = name;
         this.sex = sex;
         this.birthdat=birthdat;
            }
}
