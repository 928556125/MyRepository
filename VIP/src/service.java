import java.util.List;
import java.util.ArrayList;
public class service {
    //vips集合
    private List<info> vips = new ArrayList<info>(); 
    //留言板
    private List<message> mes = new ArrayList<message>();
   
    //初始数据
    public service(){
        //List<info> vips = new ArrayList<info>(); 
        //List<message> mes = new ArrayList<message>();
        vips.add(new info(1,"user","01","555","13395028227","厦门","管理员"));
        vips.add(new info(2,"123","02","666","110","宁德","用户"));
       
      
    }
    //根据账号查找会员
    public info findV(String zh){
        for(info vip:vips){
            if(vip.getzh().equals(zh))
                return vip;
        }
        return null;
    }
    //根据zh删除会员
    public void delV(String zh){
        //先查找再删除
        info findV = findV(zh);
        if(findV!=null)
            vips.remove(findV);
    }
    //显示所有会员
    public List<info> queryByzh(String zh){
        if(zh == null)
            return this.vips;
    List<info> vipByzh = new ArrayList<info>();
    for(info vip:vips){
    if(vip.getzh().equals(zh)){
        vipByzh.add(vip);
    }
    }
    return vipByzh;
    }
    public List<info> queryByname(String name){
    List<info> vipByname = new ArrayList<info>();
    for(info vip:vips){
    if(vip.getname().equals(name)){
        vipByname.add(vip);
    }
    }
    return vipByname;
    }
}
