package zyrs.xyz.obadmin.bean;

import org.apache.commons.codec.binary.Base64;
import org.springframework.format.annotation.DateTimeFormat;
import zyrs.xyz.obadmin.utils.CalculateUtil;

import javax.xml.crypto.Data;

/**
 * Created by Administrator on 2019/2/11.
 * 小程序用户表
 */
public class WxappMember {

    private Integer id;//用户ID
    private String openid;//小程序openid
    private String wxopenid;//公众号openid
    private Integer gender;//性别 1 男 2女
    private String sex;//性别 1 男 2女
    private String avatars;//微信头像
    private String nickname;//
    private String nicknameDecodeBase64;//base64编码之后的
    private String province;//所在省
    private String city;//所在市

    private Double balance;//余额

    private Integer oid;//项目id
    private String unionid;//开放平台唯一

    private Integer identity;//身份  【1普通默认 2患者 3 医生  全v健康】

    private String createTime;//注册时间
    private String realname;//真实姓名
    private String realavatars;//真实头像
    private String contact;//联系方式
    private String birthday;//出生年月

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~医生专属字段~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    private String education;//教育资料
    private String goodField;//擅长领域
    private String hospital;//坐诊医院
    private String level;//医生等级 v1>
    private String cardFace;//省份证正面
    private String cardBack;//身份证反面
    private String certificateDoctor;//医师资格证
    private String certificatePractice;//执业资格证
    private Integer patientNum;//病人数量

    private int isaudit;//医生状态 1待审核 2通过 3 不通过
    private String message;//信息 可能是审核失败原因

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getWxopenid() {
        return wxopenid;
    }

    public void setWxopenid(String wxopenid) {
        this.wxopenid = wxopenid;
    }

    public String getSex() {
        if(gender!=null){
            return gender==1?"男":"女";
        }
        return null;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAvatars() {
        return avatars;
    }

    public void setAvatars(String avarars) {
        this.avatars = avarars;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNicknameDecodeBase64() {
        //base64转码
        if(nickname!=null){
            return new String(Base64.decodeBase64(nickname));
        }else{
            return nickname;
        }

    }
    public void setNicknameEncodeBase64() {
        //base64转码
        if(nickname!=null){
            this.nickname=Base64.encodeBase64String(nickname.getBytes());
        }
    }


    public void setNickname(String nickname) {
        //base64编码过的
        this.nickname = nickname;

    }

    public Double getBalance() {
        balance = balance==null?0.00:balance;
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        //去掉timestamp后面的0
        this.createTime = createTime.substring(0,createTime.lastIndexOf(":"));
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRealavatars() {
        return realavatars;
    }

    public void setRealavatars(String realavatars) {
        this.realavatars = realavatars;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    //年龄 ——————根据出生日期计算
    public Integer getAge() {
        if(birthday!=null){
            return CalculateUtil.getAge(birthday);
        }
        return null;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGoodField() {
        return goodField;
    }

    public void setGoodField(String goodField) {
        this.goodField = goodField;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCardFace() {
        return cardFace;
    }

    public void setCardFace(String cardFace) {
        this.cardFace = cardFace;
    }

    public String getCardBack() {
        return cardBack;
    }

    public void setCardBack(String cardBack) {
        this.cardBack = cardBack;
    }

    public String getCertificateDoctor() {
        return certificateDoctor;
    }

    public void setCertificateDoctor(String certificateDoctor) {
        this.certificateDoctor = certificateDoctor;
    }

    public String getCertificatePractice() {
        return certificatePractice;
    }

    public void setCertificatePractice(String certificate) {
        this.certificatePractice = certificate;
    }

    public Integer getIsaudit() {
        return isaudit;
    }

    public void setIsaudit(int isaudit) {
        this.isaudit = isaudit;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getPatientNum() {
        return patientNum;
    }

    public void setPatientNum(Integer patientNum) {
        this.patientNum = patientNum;
    }

    @Override
    public String toString() {
        return "WxappMember{" +
                "id=" + id +
                ", openid='" + openid + '\'' +
                ", wxopenid='" + wxopenid + '\'' +
                ", gender=" + gender +
                ", sex='" + sex + '\'' +
                ", avatars='" + avatars + '\'' +
                ", nickname='" + nickname + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", oid=" + oid +
                ", unionid='" + unionid + '\'' +
                ", identity=" + identity +
                ", createTime='" + createTime + '\'' +
                ", realname='" + realname + '\'' +
                ", realavatars='" + realavatars + '\'' +
                ", contact='" + contact + '\'' +
                ", birthday='" + birthday + '\'' +
                ", education='" + education + '\'' +
                ", goodField='" + goodField + '\'' +
                ", hospital='" + hospital + '\'' +
                ", level='" + level + '\'' +
                ", cardFace='" + cardFace + '\'' +
                ", cardBack='" + cardBack + '\'' +
                ", certificateDoctor='" + certificateDoctor + '\'' +
                ", certificatePractice='" + certificatePractice + '\'' +
                ", patientNum=" + patientNum +
                ", isaudit=" + isaudit +
                ", message='" + message + '\'' +
                '}';
    }
}
