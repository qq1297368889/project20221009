package gzb.db.pay_system.entity;
import gzb.db.pay_system.DataBase;
import gzb.db.pay_system.dao.BaseDao;
import gzb.tools.Tools;
import gzb.tools.ListPage;
import gzb.tools.entity.AutoSqlEntity;
import java.util.ArrayList;
import java.util.List;
public class PsDev {
    private java.lang.Long psDevId;
    private java.lang.Long psDevUserId;
    private java.lang.String psDevUserAcc;
    private java.lang.Long psDevAdminId;
    private java.lang.String psDevAdminAcc;
    private java.lang.Long psDevAppId;
    private java.lang.String psDevAppName;
    private java.lang.String psDevName;
    private java.lang.Integer psDevState;
    private java.lang.String psDevIdOperation="=";
    private java.lang.String psDevUserIdOperation="=";
    private java.lang.String psDevUserAccOperation="=";
    private java.lang.String psDevAdminIdOperation="=";
    private java.lang.String psDevAdminAccOperation="=";
    private java.lang.String psDevAppIdOperation="=";
    private java.lang.String psDevAppNameOperation="=";
    private java.lang.String psDevNameOperation="=";
    private java.lang.String psDevStateOperation="=";
    private java.util.List<?>list;
    public List<?> getList() {
        return list;
    }
    public void setList(List<?> list) {
        this.list = list;
    }
    public PsDev() {
    }
    public PsDev(String json) {
        String tmp;
        tmp = Tools.textMid(json, "\"psDevId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psDevIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psDevUserId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevUserId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psDevUserIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevUserIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psDevUserAcc\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevUserAcc = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psDevUserAccOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevUserAccOperation = tmp;}
        tmp = Tools.textMid(json, "\"psDevAdminId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevAdminId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psDevAdminIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevAdminIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psDevAdminAcc\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevAdminAcc = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psDevAdminAccOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevAdminAccOperation = tmp;}
        tmp = Tools.textMid(json, "\"psDevAppId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevAppId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psDevAppIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevAppIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psDevAppName\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevAppName = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psDevAppNameOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevAppNameOperation = tmp;}
        tmp = Tools.textMid(json, "\"psDevName\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevName = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psDevNameOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevNameOperation = tmp;}
        tmp = Tools.textMid(json, "\"psDevState\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevState = java.lang.Integer.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psDevStateOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psDevStateOperation = tmp;}
    }
    @Override
    public String toString() {
        return toJson();
    }
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (psDevId != null){sb.append("\"psDevId\":\"").append(psDevId).append("\",");}
        if (psDevUserId != null){sb.append("\"psDevUserId\":\"").append(psDevUserId).append("\",");}
        if (psDevUserAcc != null){sb.append("\"psDevUserAcc\":\"").append(psDevUserAcc).append("\",");}
        if (psDevAdminId != null){sb.append("\"psDevAdminId\":\"").append(psDevAdminId).append("\",");}
        if (psDevAdminAcc != null){sb.append("\"psDevAdminAcc\":\"").append(psDevAdminAcc).append("\",");}
        if (psDevAppId != null){sb.append("\"psDevAppId\":\"").append(psDevAppId).append("\",");}
        if (psDevAppName != null){sb.append("\"psDevAppName\":\"").append(psDevAppName).append("\",");}
        if (psDevName != null){sb.append("\"psDevName\":\"").append(psDevName).append("\",");}
        if (psDevState != null){sb.append("\"psDevState\":\"").append(psDevState).append("\"");}
        if (list != null){sb.append(",\"data\":").append(list.toString()).append(",");}
        if (sb.substring(sb.length()-1,sb.length()).equals(","))sb.delete(sb.length()-1,sb.length()).equals(",");
        sb.append("}");
        return sb.toString();
    }
    public java.lang.Long getPsDevId() {
        return this.psDevId;
    }
    public PsDev setPsDevId(java.lang.Long psDevId) {
        this.psDevId = psDevId;
        return this;
    }
    public PsDev setPsDevId(java.lang.Long psDevId,java.lang.String psDevIdOperation) {
        this.psDevId = psDevId;
        this.psDevIdOperation = psDevIdOperation;
        return this;
    }
    public java.lang.Long getPsDevUserId() {
        return this.psDevUserId;
    }
    public PsDev setPsDevUserId(java.lang.Long psDevUserId) {
        this.psDevUserId = psDevUserId;
        return this;
    }
    public PsDev setPsDevUserId(java.lang.Long psDevUserId,java.lang.String psDevUserIdOperation) {
        this.psDevUserId = psDevUserId;
        this.psDevUserIdOperation = psDevUserIdOperation;
        return this;
    }
    public java.lang.String getPsDevUserAcc() {
        return this.psDevUserAcc;
    }
    public PsDev setPsDevUserAcc(java.lang.String psDevUserAcc) {
        this.psDevUserAcc = psDevUserAcc;
        return this;
    }
    public PsDev setPsDevUserAcc(java.lang.String psDevUserAcc,java.lang.String psDevUserAccOperation) {
        this.psDevUserAcc = psDevUserAcc;
        this.psDevUserAccOperation = psDevUserAccOperation;
        return this;
    }
    public java.lang.Long getPsDevAdminId() {
        return this.psDevAdminId;
    }
    public PsDev setPsDevAdminId(java.lang.Long psDevAdminId) {
        this.psDevAdminId = psDevAdminId;
        return this;
    }
    public PsDev setPsDevAdminId(java.lang.Long psDevAdminId,java.lang.String psDevAdminIdOperation) {
        this.psDevAdminId = psDevAdminId;
        this.psDevAdminIdOperation = psDevAdminIdOperation;
        return this;
    }
    public java.lang.String getPsDevAdminAcc() {
        return this.psDevAdminAcc;
    }
    public PsDev setPsDevAdminAcc(java.lang.String psDevAdminAcc) {
        this.psDevAdminAcc = psDevAdminAcc;
        return this;
    }
    public PsDev setPsDevAdminAcc(java.lang.String psDevAdminAcc,java.lang.String psDevAdminAccOperation) {
        this.psDevAdminAcc = psDevAdminAcc;
        this.psDevAdminAccOperation = psDevAdminAccOperation;
        return this;
    }
    public java.lang.Long getPsDevAppId() {
        return this.psDevAppId;
    }
    public PsDev setPsDevAppId(java.lang.Long psDevAppId) {
        this.psDevAppId = psDevAppId;
        return this;
    }
    public PsDev setPsDevAppId(java.lang.Long psDevAppId,java.lang.String psDevAppIdOperation) {
        this.psDevAppId = psDevAppId;
        this.psDevAppIdOperation = psDevAppIdOperation;
        return this;
    }
    public java.lang.String getPsDevAppName() {
        return this.psDevAppName;
    }
    public PsDev setPsDevAppName(java.lang.String psDevAppName) {
        this.psDevAppName = psDevAppName;
        return this;
    }
    public PsDev setPsDevAppName(java.lang.String psDevAppName,java.lang.String psDevAppNameOperation) {
        this.psDevAppName = psDevAppName;
        this.psDevAppNameOperation = psDevAppNameOperation;
        return this;
    }
    public java.lang.String getPsDevName() {
        return this.psDevName;
    }
    public PsDev setPsDevName(java.lang.String psDevName) {
        this.psDevName = psDevName;
        return this;
    }
    public PsDev setPsDevName(java.lang.String psDevName,java.lang.String psDevNameOperation) {
        this.psDevName = psDevName;
        this.psDevNameOperation = psDevNameOperation;
        return this;
    }
    public java.lang.Integer getPsDevState() {
        return this.psDevState;
    }
    public PsDev setPsDevState(java.lang.Integer psDevState) {
        this.psDevState = psDevState;
        return this;
    }
    public PsDev setPsDevState(java.lang.Integer psDevState,java.lang.String psDevStateOperation) {
        this.psDevState = psDevState;
        this.psDevStateOperation = psDevStateOperation;
        return this;
    }
    public AutoSqlEntity toWhere(String sql){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append(sql+" where ");
        if (this.psDevId !=null){sb.append("ps_dev_id ").append(psDevIdOperation).append(" ? and ");list.add(this.psDevId);}
        if (this.psDevUserId !=null){sb.append("ps_dev_user_id ").append(psDevUserIdOperation).append(" ? and ");list.add(this.psDevUserId);}
        if (this.psDevUserAcc !=null){sb.append("ps_dev_user_acc ").append(psDevUserAccOperation).append(" ? and ");list.add(this.psDevUserAcc);}
        if (this.psDevAdminId !=null){sb.append("ps_dev_admin_id ").append(psDevAdminIdOperation).append(" ? and ");list.add(this.psDevAdminId);}
        if (this.psDevAdminAcc !=null){sb.append("ps_dev_admin_acc ").append(psDevAdminAccOperation).append(" ? and ");list.add(this.psDevAdminAcc);}
        if (this.psDevAppId !=null){sb.append("ps_dev_app_id ").append(psDevAppIdOperation).append(" ? and ");list.add(this.psDevAppId);}
        if (this.psDevAppName !=null){sb.append("ps_dev_app_name ").append(psDevAppNameOperation).append(" ? and ");list.add(this.psDevAppName);}
        if (this.psDevName !=null){sb.append("ps_dev_name ").append(psDevNameOperation).append(" ? and ");list.add(this.psDevName);}
        if (this.psDevState !=null){sb.append("ps_dev_state ").append(psDevStateOperation).append(" ? and ");list.add(this.psDevState);}
        if (sb.substring(sb.length()-5,sb.length()).equals(" and "))sb.delete(sb.length()-5,sb.length());
        if (sb.substring(sb.length()-6,sb.length()).equals("where "))sb.delete(sb.length()-6,sb.length());
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public AutoSqlEntity toSelect(){
        return toWhere("select * from "+DataBase.psDevName);
    }
    public AutoSqlEntity toDelete(){
        return toWhere("delete from "+DataBase.psDevName);
    }
    public AutoSqlEntity toUpdate(){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append("update "+DataBase.psDevName+" set ");
        if (this.psDevId !=null){sb.append("ps_dev_id=?, ");list.add(this.psDevId);}
        if (this.psDevUserId !=null){sb.append("ps_dev_user_id=?, ");list.add(this.psDevUserId);}
        if (this.psDevUserAcc !=null){sb.append("ps_dev_user_acc=?, ");list.add(this.psDevUserAcc);}
        if (this.psDevAdminId !=null){sb.append("ps_dev_admin_id=?, ");list.add(this.psDevAdminId);}
        if (this.psDevAdminAcc !=null){sb.append("ps_dev_admin_acc=?, ");list.add(this.psDevAdminAcc);}
        if (this.psDevAppId !=null){sb.append("ps_dev_app_id=?, ");list.add(this.psDevAppId);}
        if (this.psDevAppName !=null){sb.append("ps_dev_app_name=?, ");list.add(this.psDevAppName);}
        if (this.psDevName !=null){sb.append("ps_dev_name=?, ");list.add(this.psDevName);}
        if (this.psDevState !=null){sb.append("ps_dev_state=?, ");list.add(this.psDevState);}
        if (sb.substring(sb.length()-2,sb.length()).equals(", "))sb.delete(sb.length()-2,sb.length()-1);
        if (sb.substring(sb.length()-4,sb.length()).equals("set "))sb.delete(sb.length()-4,sb.length());
        sb.append("where ps_dev_id=?");list.add(this.psDevId);
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public AutoSqlEntity toInsert(){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append("insert into "+DataBase.psDevName+"(ps_dev_id,ps_dev_user_id,ps_dev_user_acc,ps_dev_admin_id,ps_dev_admin_acc,ps_dev_app_id,ps_dev_app_name,ps_dev_name,ps_dev_state) values(?,?,?,?,?,?,?,?,?)");
        list.add(this.psDevId);
        list.add(this.psDevUserId);
        list.add(this.psDevUserAcc);
        list.add(this.psDevAdminId);
        list.add(this.psDevAdminAcc);
        list.add(this.psDevAppId);
        list.add(this.psDevAppName);
        list.add(this.psDevName);
        list.add(this.psDevState);
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public PsDev find(BaseDao dao) {
        return dao.psDevFind(this);
    }

    public PsDev findCache(BaseDao dao, int mm) {
        return dao.psDevFindCache(this, mm);
    }

    public List<PsDev> query(BaseDao dao) {
        return dao.psDevQuery(this);
    }

    public List<PsDev> queryCache(BaseDao dao, int mm) {
        return dao.psDevQueryCache(this, mm);
    }

    public ListPage query(BaseDao dao, int page, int limit, int maxPage, int maxLimit) {
        return dao.psDevQuery(this, page, limit, maxPage, maxLimit);
    }

    public ListPage queryCache(BaseDao dao, int page, int limit, int maxPage, int maxLimit, int mm) {
        return dao.psDevQueryCache(this, page, limit, maxPage, maxLimit, mm);
    }

    public int save(BaseDao dao) {
        return dao.psDevInsert(this);
    }

    public int update(BaseDao dao) {
        return dao.psDevUpdate(this);
    }

    public int delete(BaseDao dao) {
        return dao.psDevDelete(this);
    }

    public int saveAsy(BaseDao dao) {
        return dao.psDevInsertAsy(this);
    }

    public int updateAsy(BaseDao dao) {
        return dao.psDevUpdateAsy(this);
    }

    public int deleteAsy(BaseDao dao) {
        return dao.psDevDeleteAsy(this);
    }
}