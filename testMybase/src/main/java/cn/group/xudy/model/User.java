package cn.group.xudy.model;

/**
 * 用户信息实体类
 */
public class User {

    Integer id;
    String username;
    String password;
    String phone;
    String weixin;
    String father;//推荐该用户的人
    String sun;//该用户推荐的人
    float price;//实际收入
    float totalPrice;//生产收入,即所有商品价格的综合
    float allprice;//总的收入记录
    int createTime;//加入时间
    String referralLink;//推广链接
    int userGrade;//用户等级
    String userNick;//用户昵称
    String userPhoto;//用户头像
    int lastLogin;//用户最后登录时间
    int userIp;//登录的IP地址
    int dervice;//登录的设备：1pc,2安卓,3苹果


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getSun() {
        return sun;
    }

    public void setSun(String sun) {
        this.sun = sun;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getAllprice() {
        return allprice;
    }

    public void setAllprice(float allprice) {
        this.allprice = allprice;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public String getReferralLink() {
        return referralLink;
    }

    public void setReferralLink(String referralLink) {
        this.referralLink = referralLink;
    }

    public int getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(int userGrade) {
        this.userGrade = userGrade;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public int getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(int lastLogin) {
        this.lastLogin = lastLogin;
    }

    public int getUserIp() {
        return userIp;
    }

    public void setUserIp(int userIp) {
        this.userIp = userIp;
    }

    public int getDervice() {
        return dervice;
    }

    public void setDervice(int dervice) {
        this.dervice = dervice;
    }
}
