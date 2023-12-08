public class info {
    int id;//编号
    String zh;//账号
    String name;//名字
    String tel;//电话
    String city;//城市
    String pass;//密码
    String qx;//权限
    info(int id,String name,String zh,String pass,String tel,String city,String qx){
        this.id=id;
        this.zh=zh;
        this.name=name;
        this.tel=tel;
        this.city=city;
        this.pass=pass;
        this.qx=qx;
    }
    public int getid(){
    return id;
}
    public void setid(int id){
        this.id=id;
    }
    public String getzh(){
    return zh;
}
    public void setzh(String zh){
        this.zh=zh;
    }
    public String getname(){
    return name;
}
    public void setname(String name){
        this.name=name;
    }
    public String getpass(){
    return pass;
}
    public void setpass(String pass){
        this.pass=pass;
    }
 public String gettel(){
    return tel;
}
    public void settel(String tel){
        this.tel=tel;
    }
     public String getcity(){
    return city;
}
    public void setcity(String city){
        this.city=city;
    }
     public String getqx(){
    return qx;
}
    public void setqx(String qx){
        this.qx=qx;
    }
}
class message{
    String mess;
    int like;
    message(String mess,int like){
    this.mess=mess;
    this.like=like;      
    }
    
    
    
}