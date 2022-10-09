package gzb.db.pay_system.entity;
import gzb.db.pay_system.DataBase;
import gzb.db.pay_system.dao.BaseDao;
import gzb.tools.Tools;
import gzb.tools.ListPage;
import gzb.tools.entity.AutoSqlEntity;
import java.util.ArrayList;
import java.util.List;
public class PsApp {
    private java.lang.Long psAppId;
    private java.lang.String psAppName;
    private java.lang.String psAppAesPwd;
    private java.lang.String psAppAesIv;
    private java.lang.String psAppRetUrl;
    private java.lang.Integer psAppState;
    private java.lang.Long psAppUserId;
    private java.lang.Long psAppAdminId;
    private java.lang.String psAppUserAcc;
    private java.lang.String psAppAdminAcc;
    private java.lang.String psAppIdOperation="=";
    private java.lang.String psAppNameOperation="=";
    private java.lang.String psAppAesPwdOperation="=";
    private java.lang.String psAppAesIvOperation="=";
    private java.lang.String psAppRetUrlOperation="=";
    private java.lang.String psAppStateOperation="=";
    private java.lang.String psAppUserIdOperation="=";
    private java.lang.String psAppAdminIdOperation="=";
    private java.lang.String psAppUserAccOperation="=";
    private java.lang.String psAppAdminAccOperation="=";
    private java.util.List<?>list;
    public List<?> getList() {
        return list;
    }
    public void setList(List<?> list) {
        this.list = list;
    }
    public PsApp() {
    }
    public PsApp(String json) {
        String tmp;
        tmp = Tools.textMid(json, "\"psAppId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAppIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAppName\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppName = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAppNameOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppNameOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAppAesPwd\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppAesPwd = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAppAesPwdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppAesPwdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAppAesIv\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppAesIv = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAppAesIvOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppAesIvOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAppRetUrl\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppRetUrl = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAppRetUrlOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppRetUrlOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAppState\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppState = java.lang.Integer.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAppStateOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppStateOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAppUserId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppUserId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAppUserIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppUserIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAppAdminId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppAdminId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAppAdminIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppAdminIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAppUserAcc\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppUserAcc = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAppUserAccOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppUserAccOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAppAdminAcc\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppAdminAcc = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAppAdminAccOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAppAdminAccOperation = tmp;}
    }
    @Override
    public String toString() {
        return toJson();
    }
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (psAppId != null){sb.append("\"psAppId\":\"").append(psAppId).append("\",");}
        if (psAppName != null){sb.append("\"psAppName\":\"").append(psAppName).append("\",");}
        if (psAppAesPwd != null){sb.append("\"psAppAesPwd\":\"").append(psAppAesPwd).append("\",");}
        if (psAppAesIv != null){sb.append("\"psAppAesIv\":\"").append(psAppAesIv).append("\",");}
        if (psAppRetUrl != null){sb.append("\"psAppRetUrl\":\"").append(psAppRetUrl).append("\",");}
        if (psAppState != null){sb.append("\"psAppState\":\"").append(psAppState).append("\",");}
        if (psAppUserId != null){sb.append("\"psAppUserId\":\"").append(psAppUserId).append("\",");}
        if (psAppAdminId != null){sb.append("\"psAppAdminId\":\"").append(psAppAdminId).append("\",");}
        if (psAppUserAcc != null){sb.append("\"psAppUserAcc\":\"").append(psAppUserAcc).append("\",");}
        if (psAppAdminAcc != null){sb.append("\"psAppAdminAcc\":\"").append(psAppAdminAcc).append("\"");}
        if (list != null){sb.append(",\"data\":").append(list.toString()).append(",");}
        if (sb.substring(sb.length()-1,sb.length()).equals(","))sb.delete(sb.length()-1,sb.length()).equals(",");
        sb.append("}");
        return sb.toString();
    }
    public java.lang.Long getPsAppId() {
        return this.psAppId;
    }
    public PsApp setPsAppId(java.lang.Long psAppId) {
        this.psAppId = psAppId;
        return this;
    }
    public PsApp setPsAppId(java.lang.Long psAppId,java.lang.String psAppIdOperation) {
        this.psAppId = psAppId;
        this.psAppIdOperation = psAppIdOperation;
        return this;
    }
    public java.lang.String getPsAppName() {
        return this.psAppName;
    }
    public PsApp setPsAppName(java.lang.String psAppName) {
        this.psAppName = psAppName;
        return this;
    }
    public PsApp setPsAppName(java.lang.String psAppName,java.lang.String psAppNameOperation) {
        this.psAppName = psAppName;
        this.psAppNameOperation = psAppNameOperation;
        return this;
    }
    public java.lang.String getPsAppAesPwd() {
        return this.psAppAesPwd;
    }
    public PsApp setPsAppAesPwd(java.lang.String psAppAesPwd) {
        this.psAppAesPwd = psAppAesPwd;
        return this;
    }
    public PsApp setPsAppAesPwd(java.lang.String psAppAesPwd,java.lang.String psAppAesPwdOperation) {
        this.psAppAesPwd = psAppAesPwd;
        this.psAppAesPwdOperation = psAppAesPwdOperation;
        return this;
    }
    public java.lang.String getPsAppAesIv() {
        return this.psAppAesIv;
    }
    public PsApp setPsAppAesIv(java.lang.String psAppAesIv) {
        this.psAppAesIv = psAppAesIv;
        return this;
    }
    public PsApp setPsAppAesIv(java.lang.String psAppAesIv,java.lang.String psAppAesIvOperation) {
        this.psAppAesIv = psAppAesIv;
        this.psAppAesIvOperation = psAppAesIvOperation;
        return this;
    }
    public java.lang.String getPsAppRetUrl() {
        return this.psAppRetUrl;
    }
    public PsApp setPsAppRetUrl(java.lang.String psAppRetUrl) {
        this.psAppRetUrl = psAppRetUrl;
        return this;
    }
    public PsApp setPsAppRetUrl(java.lang.String psAppRetUrl,java.lang.String psAppRetUrlOperation) {
        this.psAppRetUrl = psAppRetUrl;
        this.psAppRetUrlOperation = psAppRetUrlOperation;
        return this;
    }
    public java.lang.Integer getPsAppState() {
        return this.psAppState;
    }
    public PsApp setPsAppState(java.lang.Integer psAppState) {
        this.psAppState = psAppState;
        return this;
    }
    public PsApp setPsAppState(java.lang.Integer psAppState,java.lang.String psAppStateOperation) {
        this.psAppState = psAppState;
        this.psAppStateOperation = psAppStateOperation;
        return this;
    }
    public java.lang.Long getPsAppUserId() {
        return this.psAppUserId;
    }
    public PsApp setPsAppUserId(java.lang.Long psAppUserId) {
        this.psAppUserId = psAppUserId;
        return this;
    }
    public PsApp setPsAppUserId(java.lang.Long psAppUserId,java.lang.String psAppUserIdOperation) {
        this.psAppUserId = psAppUserId;
        this.psAppUserIdOperation = psAppUserIdOperation;
        return this;
    }
    public java.lang.Long getPsAppAdminId() {
        return this.psAppAdminId;
    }
    public PsApp setPsAppAdminId(java.lang.Long psAppAdminId) {
        this.psAppAdminId = psAppAdminId;
        return this;
    }
    public PsApp setPsAppAdminId(java.lang.Long psAppAdminId,java.lang.String psAppAdminIdOperation) {
        this.psAppAdminId = psAppAdminId;
        this.psAppAdminIdOperation = psAppAdminIdOperation;
        return this;
    }
    public java.lang.String getPsAppUserAcc() {
        return this.psAppUserAcc;
    }
    public PsApp setPsAppUserAcc(java.lang.String psAppUserAcc) {
        this.psAppUserAcc = psAppUserAcc;
        return this;
    }
    public PsApp setPsAppUserAcc(java.lang.String psAppUserAcc,java.lang.String psAppUserAccOperation) {
        this.psAppUserAcc = psAppUserAcc;
        this.psAppUserAccOperation = psAppUserAccOperation;
        return this;
    }
    public java.lang.String getPsAppAdminAcc() {
        return this.psAppAdminAcc;
    }
    public PsApp setPsAppAdminAcc(java.lang.String psAppAdminAcc) {
        this.psAppAdminAcc = psAppAdminAcc;
        return this;
    }
    public PsApp setPsAppAdminAcc(java.lang.String psAppAdminAcc,java.lang.String psAppAdminAccOperation) {
        this.psAppAdminAcc = psAppAdminAcc;
        this.psAppAdminAccOperation = psAppAdminAccOperation;
        return this;
    }
    public AutoSqlEntity toWhere(String sql){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append(sql+" where ");
        if (this.psAppId !=null){sb.append("ps_app_id ").append(psAppIdOperation).append(" ? and ");list.add(this.psAppId);}
        if (this.psAppName !=null){sb.append("ps_app_name ").append(psAppNameOperation).append(" ? and ");list.add(this.psAppName);}
        if (this.psAppAesPwd !=null){sb.append("ps_app_aes_pwd ").append(psAppAesPwdOperation).append(" ? and ");list.add(this.psAppAesPwd);}
        if (this.psAppAesIv !=null){sb.append("ps_app_aes_iv ").append(psAppAesIvOperation).append(" ? and ");list.add(this.psAppAesIv);}
        if (this.psAppRetUrl !=null){sb.append("ps_app_ret_url ").append(psAppRetUrlOperation).append(" ? and ");list.add(this.psAppRetUrl);}
        if (this.psAppState !=null){sb.append("ps_app_state ").append(psAppStateOperation).append(" ? and ");list.add(this.psAppState);}
        if (this.psAppUserId !=null){sb.append("ps_app_user_id ").append(psAppUserIdOperation).append(" ? and ");list.add(this.psAppUserId);}
        if (this.psAppAdminId !=null){sb.append("ps_app_admin_id ").append(psAppAdminIdOperation).append(" ? and ");list.add(this.psAppAdminId);}
        if (this.psAppUserAcc !=null){sb.append("ps_app_user_acc ").append(psAppUserAccOperation).append(" ? and ");list.add(this.psAppUserAcc);}
        if (this.psAppAdminAcc !=null){sb.append("ps_app_admin_acc ").append(psAppAdminAccOperation).append(" ? and ");list.add(this.psAppAdminAcc);}
        if (sb.substring(sb.length()-5,sb.length()).equals(" and "))sb.delete(sb.length()-5,sb.length());
        if (sb.substring(sb.length()-6,sb.length()).equals("where "))sb.delete(sb.length()-6,sb.length());
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public AutoSqlEntity toSelect(){
        return toWhere("select * from "+DataBase.psAppName);
    }
    public AutoSqlEntity toDelete(){
        return toWhere("delete from "+DataBase.psAppName);
    }
    public AutoSqlEntity toUpdate(){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append("update "+DataBase.psAppName+" set ");
        if (this.psAppId !=null){sb.append("ps_app_id=?, ");list.add(this.psAppId);}
        if (this.psAppName !=null){sb.append("ps_app_name=?, ");list.add(this.psAppName);}
        if (this.psAppAesPwd !=null){sb.append("ps_app_aes_pwd=?, ");list.add(this.psAppAesPwd);}
        if (this.psAppAesIv !=null){sb.append("ps_app_aes_iv=?, ");list.add(this.psAppAesIv);}
        if (this.psAppRetUrl !=null){sb.append("ps_app_ret_url=?, ");list.add(this.psAppRetUrl);}
        if (this.psAppState !=null){sb.append("ps_app_state=?, ");list.add(this.psAppState);}
        if (this.psAppUserId !=null){sb.append("ps_app_user_id=?, ");list.add(this.psAppUserId);}
        if (this.psAppAdminId !=null){sb.append("ps_app_admin_id=?, ");list.add(this.psAppAdminId);}
        if (this.psAppUserAcc !=null){sb.append("ps_app_user_acc=?, ");list.add(this.psAppUserAcc);}
        if (this.psAppAdminAcc !=null){sb.append("ps_app_admin_acc=?, ");list.add(this.psAppAdminAcc);}
        if (sb.substring(sb.length()-2,sb.length()).equals(", "))sb.delete(sb.length()-2,sb.length()-1);
        if (sb.substring(sb.length()-4,sb.length()).equals("set "))sb.delete(sb.length()-4,sb.length());
        sb.append("where ps_app_id=?");list.add(this.psAppId);
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public AutoSqlEntity toInsert(){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append("insert into "+DataBase.psAppName+"(ps_app_id,ps_app_name,ps_app_aes_pwd,ps_app_aes_iv,ps_app_ret_url,ps_app_state,ps_app_user_id,ps_app_admin_id,ps_app_user_acc,ps_app_admin_acc) values(?,?,?,?,?,?,?,?,?,?)");
        list.add(this.psAppId);
        list.add(this.psAppName);
        list.add(this.psAppAesPwd);
        list.add(this.psAppAesIv);
        list.add(this.psAppRetUrl);
        list.add(this.psAppState);
        list.add(this.psAppUserId);
        list.add(this.psAppAdminId);
        list.add(this.psAppUserAcc);
        list.add(this.psAppAdminAcc);
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public PsApp find(BaseDao dao) {
        return dao.psAppFind(this);
    }

    public PsApp findCache(BaseDao dao, int mm) {
        return dao.psAppFindCache(this, mm);
    }

    public List<PsApp> query(BaseDao dao) {
        return dao.psAppQuery(this);
    }

    public List<PsApp> queryCache(BaseDao dao, int mm) {
        return dao.psAppQueryCache(this, mm);
    }

    public ListPage query(BaseDao dao, int page, int limit, int maxPage, int maxLimit) {
        return dao.psAppQuery(this, page, limit, maxPage, maxLimit);
    }

    public ListPage queryCache(BaseDao dao, int page, int limit, int maxPage, int maxLimit, int mm) {
        return dao.psAppQueryCache(this, page, limit, maxPage, maxLimit, mm);
    }

    public int save(BaseDao dao) {
        return dao.psAppInsert(this);
    }

    public int update(BaseDao dao) {
        return dao.psAppUpdate(this);
    }

    public int delete(BaseDao dao) {
        return dao.psAppDelete(this);
    }

    public int saveAsy(BaseDao dao) {
        return dao.psAppInsertAsy(this);
    }

    public int updateAsy(BaseDao dao) {
        return dao.psAppUpdateAsy(this);
    }

    public int deleteAsy(BaseDao dao) {
        return dao.psAppDeleteAsy(this);
    }
}