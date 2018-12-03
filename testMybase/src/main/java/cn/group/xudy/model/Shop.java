package cn.group.xudy.model;


public class Shop {


    Integer id;
    float totalPrice; //商品价格
    float free_price; //商品优惠金额
    float price; //实际价格
    int commission_rate;//佣金比率(%)
    int coupon_total_count;//优惠券总量
    int coupon_info;//优惠券面额
    int coupon_remain_count;//优惠券剩余量
    String coupon_click_url;//商品跳转地址
    String photo_url;//图片地址
    String shop_title;//店铺名称
    String shop_nick;//店铺昵称
    String item_description;//宝贝描述(推荐理由)
    String shop_id;//店铺id
    String title;//商户品标题
    String shop_from;//商品所在的平台
    int free_start_time;//优惠开始时间
    int free_end_time;//优惠结束时间
    int goods_sum;//商品数量
    int shop_type;//商店类型:0表示集市，1表示商城
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getFree_price() {
        return free_price;
    }

    public void setFree_price(float free_price) {
        this.free_price = free_price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(int commission_rate) {
        this.commission_rate = commission_rate;
    }

    public int getCoupon_total_count() {
        return coupon_total_count;
    }

    public void setCoupon_total_count(int coupon_total_count) {
        this.coupon_total_count = coupon_total_count;
    }

    public int getCoupon_info() {
        return coupon_info;
    }

    public void setCoupon_info(int coupon_info) {
        this.coupon_info = coupon_info;
    }

    public int getCoupon_remain_count() {
        return coupon_remain_count;
    }

    public void setCoupon_remain_count(int coupon_remain_count) {
        this.coupon_remain_count = coupon_remain_count;
    }

    public String getCoupon_click_url() {
        return coupon_click_url;
    }

    public void setCoupon_click_url(String coupon_click_url) {
        this.coupon_click_url = coupon_click_url;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public String getShop_title() {
        return shop_title;
    }

    public void setShop_title(String shop_title) {
        this.shop_title = shop_title;
    }

    public String getShop_nick() {
        return shop_nick;
    }

    public void setShop_nick(String shop_nick) {
        this.shop_nick = shop_nick;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public String getShop_id() {
        return shop_id;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShop_from() {
        return shop_from;
    }

    public void setShop_from(String shop_from) {
        this.shop_from = shop_from;
    }

    public int getFree_start_time() {
        return free_start_time;
    }

    public void setFree_start_time(int free_start_time) {
        this.free_start_time = free_start_time;
    }

    public int getFree_end_time() {
        return free_end_time;
    }

    public void setFree_end_time(int free_end_time) {
        this.free_end_time = free_end_time;
    }

    public int getGoods_sum() {
        return goods_sum;
    }

    public void setGoods_sum(int goods_sum) {
        this.goods_sum = goods_sum;
    }

    public int getShop_type() {
        return shop_type;
    }

    public void setShop_type(int shop_type) {
        this.shop_type = shop_type;
    }
}
