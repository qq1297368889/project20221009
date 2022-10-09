package gzb.db.pay_system.entity;
import gzb.db.pay_system.DataBase;
import gzb.db.pay_system.dao.BaseDao;
import gzb.tools.Tools;
import gzb.tools.ListPage;
import gzb.tools.entity.AutoSqlEntity;
import java.util.ArrayList;
import java.util.List;
public class PsUser {
    private java.lang.Long psUserId;
    private java.lang.String psUserAcc;
    private java.lang.String psUserPwd;
    private java.lang.String psUserPhone;
    private java.lang.String psUserEm;
    private java.lang.Integer psUserState;
    private java.lang.Integer psUserMaxAppNum;
    private java.lang.Integer psUserThisAppNum;
    private java.lang.Long psUserAdminId;
    private java.lang.String psUserAdminAcc;
    private java.lang.Long psUserSup;
    private java.lang.String psUserRegTime;
    private java.lang.String psUserRegIp;
    private java.lang.String psUserLoginTime;
    private java.lang.String psUserIdOperation="=";
    private java.lang.String psUserAccOperation="=";
    private java.lang.String psUserPwdOperation="=";
    private java.lang.String psUserPhoneOperation="=";
    private java.lang.String psUserEmOperation="=";
    private java.lang.String psUserStateOperation="=";
    private java.lang.String psUserMaxAppNumOperation="=";
    private java.lang.String psUserThisAppNumOperation="=";
    private java.lang.String psUserAdminIdOperation="=";
    private java.lang.String psUserAdminAccOperation="=";
    private java.lang.String psUserSupOperation="=";
    private java.lang.String psUserRegTimeOperation="=";
    private java.lang.String psUserRegIpOperation="=";
    private java.lang.String psUserLoginTimeOperation="=";
    private java.util.List<?>list;
    public List<?> getList() {
        return list;
    }
    public void setList(List<?> list) {
        this.list = list;
    }
    public PsUser() {
    }
    public PsUser(String json) {
        String tmp;
        tmp = Tools.textMid(json, "\"psUserId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserAcc\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserAcc = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserAccOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserAccOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserPwd\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserPwd = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserPwdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserPwdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserPhone\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserPhone = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserPhoneOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserPhoneOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserEm\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserEm = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserEmOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserEmOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserState\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserState = java.lang.Integer.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserStateOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserStateOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserMaxAppNum\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserMaxAppNum = java.lang.Integer.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserMaxAppNumOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserMaxAppNumOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserThisAppNum\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserThisAppNum = java.lang.Integer.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserThisAppNumOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserThisAppNumOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserAdminId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserAdminId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserAdminIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserAdminIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserAdminAcc\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserAdminAcc = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserAdminAccOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserAdminAccOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserSup\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserSup = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserSupOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserSupOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserRegTime\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserRegTime = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserRegTimeOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserRegTimeOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserRegIp\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserRegIp = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserRegIpOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserRegIpOperation = tmp;}
        tmp = Tools.textMid(json, "\"psUserLoginTime\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserLoginTime = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psUserLoginTimeOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psUserLoginTimeOperation = tmp;}
    }
    @Override
    public String toString() {
        return toJson();
    }
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (psUserId != null){sb.append("\"psUserId\":\"").append(psUserId).append("\",");}
        if (psUserAcc != null){sb.append("\"psUserAcc\":\"").append(psUserAcc).append("\",");}
        if (psUserPwd != null){sb.append("\"psUserPwd\":\"").append(psUserPwd).append("\",");}
        if (psUserPhone != null){sb.append("\"psUserPhone\":\"").append(psUserPhone).append("\",");}
        if (psUserEm != null){sb.append("\"psUserEm\":\"").append(psUserEm).append("\",");}
        if (psUserState != null){sb.append("\"psUserState\":\"").append(psUserState).append("\",");}
        if (psUserMaxAppNum != null){sb.append("\"psUserMaxAppNum\":\"").append(psUserMaxAppNum).append("\",");}
        if (psUserThisAppNum != null){sb.append("\"psUserThisAppNum\":\"").append(psUserThisAppNum).append("\",");}
        if (psUserAdminId != null){sb.append("\"psUserAdminId\":\"").append(psUserAdminId).append("\",");}
        if (psUserAdminAcc != null){sb.append("\"psUserAdminAcc\":\"").append(psUserAdminAcc).append("\",");}
        if (psUserSup != null){sb.append("\"psUserSup\":\"").append(psUserSup).append("\",");}
        if (psUserRegTime != null){sb.append("\"psUserRegTime\":\"").append(psUserRegTime).append("\",");}
        if (psUserRegIp != null){sb.append("\"psUserRegIp\":\"").append(psUserRegIp).append("\",");}
        if (psUserLoginTime != null){sb.append("\"psUserLoginTime\":\"").append(psUserLoginTime).append("\"");}
        if (list != null){sb.append(",\"data\":").append(list.toString()).append(",");}
        if (sb.substring(sb.length()-1,sb.length()).equals(","))sb.delete(sb.length()-1,sb.length()).equals(",");
        sb.append("}");
        return sb.toString();
    }
    public java.lang.Long getPsUserId() {
        return this.psUserId;
    }
    public PsUser setPsUserId(java.lang.Long psUserId) {
        this.psUserId = psUserId;
        return this;
    }
    public PsUser setPsUserId(java.lang.Long psUserId,java.lang.String psUserIdOperation) {
        this.psUserId = psUserId;
        this.psUserIdOperation = psUserIdOperation;
        return this;
    }
    public java.lang.String getPsUserAcc() {
        return this.psUserAcc;
    }
    public PsUser setPsUserAcc(java.lang.String psUserAcc) {
        this.psUserAcc = psUserAcc;
        return this;
    }
    public PsUser setPsUserAcc(java.lang.String psUserAcc,java.lang.String psUserAccOperation) {
        this.psUserAcc = psUserAcc;
        this.psUserAccOperation = psUserAccOperation;
        return this;
    }
    public java.lang.String getPsUserPwd() {
        return this.psUserPwd;
    }
    public PsUser setPsUserPwd(java.lang.String psUserPwd) {
        this.psUserPwd = psUserPwd;
        return this;
    }
    public PsUser setPsUserPwd(java.lang.String psUserPwd,java.lang.String psUserPwdOperation) {
        this.psUserPwd = psUserPwd;
        this.psUserPwdOperation = psUserPwdOperation;
        return this;
    }
    public java.lang.String getPsUserPhone() {
        return this.psUserPhone;
    }
    public PsUser setPsUserPhone(java.lang.String psUserPhone) {
        this.psUserPhone = psUserPhone;
        return this;
    }
    public PsUser setPsUserPhone(java.lang.String psUserPhone,java.lang.String psUserPhoneOperation) {
        this.psUserPhone = psUserPhone;
        this.psUserPhoneOperation = psUserPhoneOperation;
        return this;
    }
    public java.lang.String getPsUserEm() {
        return this.psUserEm;
    }
    public PsUser setPsUserEm(java.lang.String psUserEm) {
        this.psUserEm = psUserEm;
        return this;
    }
    public PsUser setPsUserEm(java.lang.String psUserEm,java.lang.String psUserEmOperation) {
        this.psUserEm = psUserEm;
        this.psUserEmOperation = psUserEmOperation;
        return this;
    }
    public java.lang.Integer getPsUserState() {
        return this.psUserState;
    }
    public PsUser setPsUserState(java.lang.Integer psUserState) {
        this.psUserState = psUserState;
        return this;
    }
    public PsUser setPsUserState(java.lang.Integer psUserState,java.lang.String psUserStateOperation) {
        this.psUserState = psUserState;
        this.psUserStateOperation = psUserStateOperation;
        return this;
    }
    public java.lang.Integer getPsUserMaxAppNum() {
        return this.psUserMaxAppNum;
    }
    public PsUser setPsUserMaxAppNum(java.lang.Integer psUserMaxAppNum) {
        this.psUserMaxAppNum = psUserMaxAppNum;
        return this;
    }
    public PsUser setPsUserMaxAppNum(java.lang.Integer psUserMaxAppNum,java.lang.String psUserMaxAppNumOperation) {
        this.psUserMaxAppNum = psUserMaxAppNum;
        this.psUserMaxAppNumOperation = psUserMaxAppNumOperation;
        return this;
    }
    public java.lang.Integer getPsUserThisAppNum() {
        return this.psUserThisAppNum;
    }
    public PsUser setPsUserThisAppNum(java.lang.Integer psUserThisAppNum) {
        this.psUserThisAppNum = psUserThisAppNum;
        return this;
    }
    public PsUser setPsUserThisAppNum(java.lang.Integer psUserThisAppNum,java.lang.String psUserThisAppNumOperation) {
        this.psUserThisAppNum = psUserThisAppNum;
        this.psUserThisAppNumOperation = psUserThisAppNumOperation;
        return this;
    }
    public java.lang.Long getPsUserAdminId() {
        return this.psUserAdminId;
    }
    public PsUser setPsUserAdminId(java.lang.Long psUserAdminId) {
        this.psUserAdminId = psUserAdminId;
        return this;
    }
    public PsUser setPsUserAdminId(java.lang.Long psUserAdminId,java.lang.String psUserAdminIdOperation) {
        this.psUserAdminId = psUserAdminId;
        this.psUserAdminIdOperation = psUserAdminIdOperation;
        return this;
    }
    public java.lang.String getPsUserAdminAcc() {
        return this.psUserAdminAcc;
    }
    public PsUser setPsUserAdminAcc(java.lang.String psUserAdminAcc) {
        this.psUserAdminAcc = psUserAdminAcc;
        return this;
    }
    public PsUser setPsUserAdminAcc(java.lang.String psUserAdminAcc,java.lang.String psUserAdminAccOperation) {
        this.psUserAdminAcc = psUserAdminAcc;
        this.psUserAdminAccOperation = psUserAdminAccOperation;
        return this;
    }
    public java.lang.Long getPsUserSup() {
        return this.psUserSup;
    }
    public PsUser setPsUserSup(java.lang.Long psUserSup) {
        this.psUserSup = psUserSup;
        return this;
    }
    public PsUser setPsUserSup(java.lang.Long psUserSup,java.lang.String psUserSupOperation) {
        this.psUserSup = psUserSup;
        this.psUserSupOperation = psUserSupOperation;
        return this;
    }
    public java.lang.String getPsUserRegTime() {
        return this.psUserRegTime;
    }
    public PsUser setPsUserRegTime(java.lang.String psUserRegTime) {
        this.psUserRegTime = psUserRegTime;
        return this;
    }
    public PsUser setPsUserRegTime(java.lang.String psUserRegTime,java.lang.String psUserRegTimeOperation) {
        this.psUserRegTime = psUserRegTime;
        this.psUserRegTimeOperation = psUserRegTimeOperation;
        return this;
    }
    public java.lang.String getPsUserRegIp() {
        return this.psUserRegIp;
    }
    public PsUser setPsUserRegIp(java.lang.String psUserRegIp) {
        this.psUserRegIp = psUserRegIp;
        return this;
    }
    public PsUser setPsUserRegIp(java.lang.String psUserRegIp,java.lang.String psUserRegIpOperation) {
        this.psUserRegIp = psUserRegIp;
        this.psUserRegIpOperation = psUserRegIpOperation;
        return this;
    }
    public java.lang.String getPsUserLoginTime() {
        return this.psUserLoginTime;
    }
    public PsUser setPsUserLoginTime(java.lang.String psUserLoginTime) {
        this.psUserLoginTime = psUserLoginTime;
        return this;
    }
    public PsUser setPsUserLoginTime(java.lang.String psUserLoginTime,java.lang.String psUserLoginTimeOperation) {
        this.psUserLoginTime = psUserLoginTime;
        this.psUserLoginTimeOperation = psUserLoginTimeOperation;
        return this;
    }
    public AutoSqlEntity toWhere(String sql){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append(sql+" where ");
        if (this.psUserId !=null){sb.append("ps_user_id ").append(psUserIdOperation).append(" ? and ");list.add(this.psUserId);}
        if (this.psUserAcc !=null){sb.append("ps_user_acc ").append(psUserAccOperation).append(" ? and ");list.add(this.psUserAcc);}
        if (this.psUserPwd !=null){sb.append("ps_user_pwd ").append(psUserPwdOperation).append(" ? and ");list.add(this.psUserPwd);}
        if (this.psUserPhone !=null){sb.append("ps_user_phone ").append(psUserPhoneOperation).append(" ? and ");list.add(this.psUserPhone);}
        if (this.psUserEm !=null){sb.append("ps_user_em ").append(psUserEmOperation).append(" ? and ");list.add(this.psUserEm);}
        if (this.psUserState !=null){sb.append("ps_user_state ").append(psUserStateOperation).append(" ? and ");list.add(this.psUserState);}
        if (this.psUserMaxAppNum !=null){sb.append("ps_user_max_app_num ").append(psUserMaxAppNumOperation).append(" ? and ");list.add(this.psUserMaxAppNum);}
        if (this.psUserThisAppNum !=null){sb.append("ps_user_this_app_num ").append(psUserThisAppNumOperation).append(" ? and ");list.add(this.psUserThisAppNum);}
        if (this.psUserAdminId !=null){sb.append("ps_user_admin_id ").append(psUserAdminIdOperation).append(" ? and ");list.add(this.psUserAdminId);}
        if (this.psUserAdminAcc !=null){sb.append("ps_user_admin_acc ").append(psUserAdminAccOperation).append(" ? and ");list.add(this.psUserAdminAcc);}
        if (this.psUserSup !=null){sb.append("ps_user_sup ").append(psUserSupOperation).append(" ? and ");list.add(this.psUserSup);}
        if (this.psUserRegTime !=null){sb.append("ps_user_reg_time ").append(psUserRegTimeOperation).append(" ? and ");list.add(this.psUserRegTime);}
        if (this.psUserRegIp !=null){sb.append("ps_user_reg_ip ").append(psUserRegIpOperation).append(" ? and ");list.add(this.psUserRegIp);}
        if (this.psUserLoginTime !=null){sb.append("ps_user_login_time ").append(psUserLoginTimeOperation).append(" ? and ");list.add(this.psUserLoginTime);}
        if (sb.substring(sb.length()-5,sb.length()).equals(" and "))sb.delete(sb.length()-5,sb.length());
        if (sb.substring(sb.length()-6,sb.length()).equals("where "))sb.delete(sb.length()-6,sb.length());
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public AutoSqlEntity toSelect(){
        return toWhere("select * from "+DataBase.psUserName);
    }
    public AutoSqlEntity toDelete(){
        return toWhere("delete from "+DataBase.psUserName);
    }
    public AutoSqlEntity toUpdate(){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append("update "+DataBase.psUserName+" set ");
        if (this.psUserId !=null){sb.append("ps_user_id=?, ");list.add(this.psUserId);}
        if (this.psUserAcc !=null){sb.append("ps_user_acc=?, ");list.add(this.psUserAcc);}
        if (this.psUserPwd !=null){sb.append("ps_user_pwd=?, ");list.add(this.psUserPwd);}
        if (this.psUserPhone !=null){sb.append("ps_user_phone=?, ");list.add(this.psUserPhone);}
        if (this.psUserEm !=null){sb.append("ps_user_em=?, ");list.add(this.psUserEm);}
        if (this.psUserState !=null){sb.append("ps_user_state=?, ");list.add(this.psUserState);}
        if (this.psUserMaxAppNum !=null){sb.append("ps_user_max_app_num=?, ");list.add(this.psUserMaxAppNum);}
        if (this.psUserThisAppNum !=null){sb.append("ps_user_this_app_num=?, ");list.add(this.psUserThisAppNum);}
        if (this.psUserAdminId !=null){sb.append("ps_user_admin_id=?, ");list.add(this.psUserAdminId);}
        if (this.psUserAdminAcc !=null){sb.append("ps_user_admin_acc=?, ");list.add(this.psUserAdminAcc);}
        if (this.psUserSup !=null){sb.append("ps_user_sup=?, ");list.add(this.psUserSup);}
        if (this.psUserRegTime !=null){sb.append("ps_user_reg_time=?, ");list.add(this.psUserRegTime);}
        if (this.psUserRegIp !=null){sb.append("ps_user_reg_ip=?, ");list.add(this.psUserRegIp);}
        if (this.psUserLoginTime !=null){sb.append("ps_user_login_time=?, ");list.add(this.psUserLoginTime);}
        if (sb.substring(sb.length()-2,sb.length()).equals(", "))sb.delete(sb.length()-2,sb.length()-1);
        if (sb.substring(sb.length()-4,sb.length()).equals("set "))sb.delete(sb.length()-4,sb.length());
        sb.append("where ps_user_id=?");list.add(this.psUserId);
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public AutoSqlEntity toInsert(){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append("insert into "+DataBase.psUserName+"(ps_user_id,ps_user_acc,ps_user_pwd,ps_user_phone,ps_user_em,ps_user_state,ps_user_max_app_num,ps_user_this_app_num,ps_user_admin_id,ps_user_admin_acc,ps_user_sup,ps_user_reg_time,ps_user_reg_ip,ps_user_login_time) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        list.add(this.psUserId);
        list.add(this.psUserAcc);
        list.add(this.psUserPwd);
        list.add(this.psUserPhone);
        list.add(this.psUserEm);
        list.add(this.psUserState);
        list.add(this.psUserMaxAppNum);
        list.add(this.psUserThisAppNum);
        list.add(this.psUserAdminId);
        list.add(this.psUserAdminAcc);
        list.add(this.psUserSup);
        list.add(this.psUserRegTime);
        list.add(this.psUserRegIp);
        list.add(this.psUserLoginTime);
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public PsUser find(BaseDao dao) {
        return dao.psUserFind(this);
    }

    public PsUser findCache(BaseDao dao, int mm) {
        return dao.psUserFindCache(this, mm);
    }

    public List<PsUser> query(BaseDao dao) {
        return dao.psUserQuery(this);
    }

    public List<PsUser> queryCache(BaseDao dao, int mm) {
        return dao.psUserQueryCache(this, mm);
    }

    public ListPage query(BaseDao dao, int page, int limit, int maxPage, int maxLimit) {
        return dao.psUserQuery(this, page, limit, maxPage, maxLimit);
    }

    public ListPage queryCache(BaseDao dao, int page, int limit, int maxPage, int maxLimit, int mm) {
        return dao.psUserQueryCache(this, page, limit, maxPage, maxLimit, mm);
    }

    public int save(BaseDao dao) {
        return dao.psUserInsert(this);
    }

    public int update(BaseDao dao) {
        return dao.psUserUpdate(this);
    }

    public int delete(BaseDao dao) {
        return dao.psUserDelete(this);
    }

    public int saveAsy(BaseDao dao) {
        return dao.psUserInsertAsy(this);
    }

    public int updateAsy(BaseDao dao) {
        return dao.psUserUpdateAsy(this);
    }

    public int deleteAsy(BaseDao dao) {
        return dao.psUserDeleteAsy(this);
    }
}